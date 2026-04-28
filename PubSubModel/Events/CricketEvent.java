package LLD.PubSubModel.Events;
public class CricketEvent implements Event{
    @Override
    public void getCommentaryData(){
        System.out.println("Their is some kind of dew over the pitch");
        System.out.println("Players are looking fresh");

    }
    @Override
    public void getScoreData(){
        System.out.println("Score is 8 runs with a loss of 6 wickets");

    }
    @Override
    public void getWeatherData(){
        System.out.println("Their is moisty weather");
    }
    @Override
    public void getAudienceData(){
        System.out.println("Their is full support of RCB");
        System.out.println("Whole the stadium is full of red colors. As the fans are wearing rcb jersey");
    }
    @Override
    public void getHighlightsData(){
        System.out.println("Cricket HighLists Data....");
    }
}