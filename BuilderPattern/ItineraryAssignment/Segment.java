package LLD.BuilderPattern.ItineraryAssignment;

import java.time.LocalDate;
class Segment{
    private final String from;    
    private final String to;
    private final LocalDate departureAt;
    private final LocalDate arriveAt;
    private final String carrier;
    public Segment(String from, String to, LocalDate departureAt, LocalDate arriveAt, String carrier) {
        if(departureAt.isAfter(arriveAt)){
            throw new IllegalStateException("Segment departure date cannot be after arrival date");
        }
        if(from.length()!=3 || to.length()!=3){
            throw new IllegalStateException("Segment origin and destination should be 3 letter codes");
        }
        this.from = from;
        this.to = to;
        this.departureAt = departureAt;
        this.arriveAt = arriveAt;
        this.carrier = carrier;
    }

    //Getters
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getDepartureAt() {
        return departureAt;
    }

    public LocalDate getArriveAt() {
        return arriveAt;
    }

    public String getCarrier() {
        return carrier;
    }

}