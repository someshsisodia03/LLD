package LLD.BuilderPattern.ItineraryAssignment;

import java.time.LocalDate;
import java.util.*;

public class Itinerary{
    private final String travelerName;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String origin;
    private final String destination;
    // Optional
    private final List<Segment> segments;
    // private final List<String> tags;
    private final double amount;
    private final boolean travelInsurance;

    private Itinerary(Builder builder) {
        this.travelerName = builder.travelerName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.origin = builder.origin;
        this.destination = builder.destination;
        //Optional
        this.segments = new ArrayList<>(builder.segments);
        // this.tags = builder.tags;
        this.amount = builder.amount;
        this.travelInsurance = builder.travelInsurance;
    }

    public static class Builder{
        private String travelerName;
        private LocalDate startDate;
        private LocalDate endDate;
        private String origin;
        private String destination;
        private List<Segment> segments = new ArrayList<>();
        // private List<String> tags;
        private double amount;
        private boolean travelInsurance;

        public Builder TravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }

        public Builder StartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder EndDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder Origin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder Destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder addSegment(Segment segment) {
            this.segments.add(segment);
            return this;
        }

        // public Builder addTag(String tag) {
        //     this.tags.add(tag);
        //     return this;
        // }

        public Builder Amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder TravelInsurance(boolean travelInsurance) {
            this.travelInsurance = travelInsurance;
            return this;
        }

        public Itinerary build(){
            if(travelerName==null || travelerName.length()==0){
                throw new IllegalStateException("Traveler name is required");
            }
            if(startDate==null || endDate==null){
                throw new IllegalStateException("Start date and end date are required");
            }
            if(startDate.isAfter(endDate)){
                throw new IllegalStateException("Start date cannot be after end date");
            }
            if(origin==null || origin.length()!=3){
                throw new IllegalStateException("Origin is required and should be a 3 letter code");
            }
            if(destination==null || destination.length()!=3){
                throw new IllegalStateException("Destination is required and should be a 3 letter code");
            }
            for(int i=1;i<segments.size();i++){
                if(segments.get(i).getDepartureAt().isBefore(segments.get(i-1).getDepartureAt())){
                    throw new IllegalStateException("Segments should be in chronological order");
                }
                if(!(segments.get(i).getFrom().equals(segments.get(i-1).getTo()))||segments.get(i).getDepartureAt().isBefore(segments.get(i-1).getArriveAt())){
                    throw new IllegalStateException("Segments should be connected");
                }
            }
            if(!(segments.get(0).getFrom().equals(origin)) || !(segments.get(segments.size()-1).getTo().equals(destination))){
                throw new IllegalStateException("Segments should start from origin and end at destination");
            }
            return new Itinerary(this);
        }

    }

}