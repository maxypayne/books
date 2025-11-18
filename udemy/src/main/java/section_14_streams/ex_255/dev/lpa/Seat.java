package section_14_streams.ex_255.dev.lpa;

public record Seat(char rowMarker, int seatNumber, boolean isReserved) {

    public Seat(char rowMarker, int seatNumber) {
//        this(rowMarker, seatNumber, new Random().nextBoolean());
        this(rowMarker, seatNumber, false);
    }
}
