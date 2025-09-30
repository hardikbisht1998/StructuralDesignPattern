package facade;

public class FacadeTester {
    public void check() {

        TravelFacade travelFacade = new TravelFacade();
        travelFacade.book(TravelFacade.BookingType.TRAIN_AND_HOTEL, "Hardik Bisht");
    }
}
