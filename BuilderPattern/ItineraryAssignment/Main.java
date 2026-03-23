package LLD.BuilderPattern.ItineraryAssignment;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Segment segment1 = new Segment("NYC", "LON", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 2), "Delta");
        Segment segment2 = new Segment("LON", "PAR", LocalDate.of(2024, 7, 3), LocalDate.of(2024, 7, 4), "British Airways");
        Itinerary itinerary = new Itinerary.Builder()
                .TravelerName("John Doe")
                .StartDate(LocalDate.of(2024, 7, 1))
                .EndDate(LocalDate.of(2024, 7, 15))
                .Origin("NYC")
                .Destination("PAR")
                .addSegment(segment1)
                .addSegment(segment2)
                .Amount(700)
                .TravelInsurance(true)
                .build();
    }
}