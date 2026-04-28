package LLD.PubSubModel;
import LLD.PubSubModel.Events.CricketEvent;
import LLD.PubSubModel.Publishers.*;
import LLD.PubSubModel.Subscribers.*;
import java.util.*;

class Main{
    public static void main(String args[]){
        CricketData p1 = new CricketData(new CricketEvent());
        CommentaryBoard commentaryBoard = new CommentaryBoard(List.of(p1)); 
        HighlightsBoard highlightsBoard = new HighlightsBoard(List.of(p1));   
        p1.notification();
    }

}