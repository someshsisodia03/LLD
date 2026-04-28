package LLD.PubSubModel.Events;
public class HockeyEvent implements Event{
    @Override
    public void getCommentaryData(){
        System.out.println("Their is some kind of greenery over the ground");
        System.out.println("Players are looking fresh");

    }
    @Override
    public void getScoreData(){
        System.out.println("Score is 2 goals for India and 1 goal for Indonesia with a 21 minutes remaing");

    }
    @Override
    public void getWeatherData(){
        System.out.println("Their is sunny weather");
    }
    @Override
    public void getAudienceData(){
        System.out.println("Their is full support of Indian team");
        System.out.println("Whole the stadium is full of blue colors. As the fans are wearing Indian jersey");
    }
    @Override
    public void getHighlightsData(){
        System.out.println("HighLights Data of Hockey....");
    }
}