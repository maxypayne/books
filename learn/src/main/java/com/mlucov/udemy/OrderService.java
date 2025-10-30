package com.mlucov.udemy;

public class OrderService {
    private final StockService stockService;

    public OrderService(StockService stockService) {
        this.stockService = stockService;
    }

    public void processOrder(Order order) {

        // 1. Valider la commande
        if (!order.isValid()) {
            throw new IllegalArgumentException("Commande invalide");
        }

        // 2. Vérifier le stock
        for (OrderItem item : order.getItems()) {
            if (!StockService.isAvailable(item.getProductId(), item.getQuantity())) {
                throw new RuntimeException("Stock insuffisant pour le produit " + item.getProductId());
            }
        }

        // 3. Déduire le stock
        order.getItems().forEach(item ->
            StockService.decrementStock(item.getProductId(), item.getQuantity())
        );

        // 4. Sauvegarder la commande
        OrderRepository.save(order);

        // 5. Envoyer un e-mail de confirmation
        EmailService.sendConfirmation(order);

        // 6. Créer une tâche de livraison
        DeliveryTask task = DeliveryService.createTask(order);

        // 7. Notifier le livreur
        NotificationService.notifyDeliverer(task);

        // 8. Mettre à jour le statut
        order.setStatus(OrderStatus.PROCESSED);
        OrderRepository.update(order);

        System.out.println("Commande traitée avec succès !");
    }
}