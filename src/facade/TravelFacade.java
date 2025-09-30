package facade;

public class TravelFacade {
    public enum BookingType {
        FLIGHT, TRAIN, HOTEL, FLIGHT_AND_HOTEL, TRAIN_AND_HOTEL
    }

    private final FlightBooking flightBooking;
    private final TrainBooking trainBooking;
    private final HotelBooking hotelBooking;

    // Default wiring (can add DI-friendly constructor overload)
    public TravelFacade() {
        this(new FlightBooking(), new TrainBooking(), new HotelBooking());
    }

    public TravelFacade(FlightBooking flightBooking, TrainBooking trainBooking, HotelBooking hotelBooking) {
        this.flightBooking = flightBooking;
        this.trainBooking = trainBooking;
        this.hotelBooking = hotelBooking;
    }

    public void book(BookingType type, String name) {
        if (type == null || name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid booking request");
        }
        switch (type) {
            case HOTEL -> hotelBooking.bookHotel(name);
            case TRAIN -> trainBooking.bookTrain(name);
            case FLIGHT -> flightBooking.bookFlight(name);
            case FLIGHT_AND_HOTEL -> {
                flightBooking.bookFlight(name);
                hotelBooking.bookHotel(name);
            }
            case TRAIN_AND_HOTEL -> {
                trainBooking.bookTrain(name);
                hotelBooking.bookHotel(name);
            }
            default -> throw new UnsupportedOperationException("Unsupported booking type: " + type);
        }

    }

}
