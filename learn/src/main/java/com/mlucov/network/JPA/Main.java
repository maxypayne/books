package com.mlucov.network.JPA;

import jakarta.persistence.*;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        StudentEntity student = new StudentEntity();
        student.setFirstName("Maxim");
        student.setLastName("Lucov");
        student.setEmail("maximlucov+1@gmail.com");
        em.persist(student);
        em.close();
    }
}
