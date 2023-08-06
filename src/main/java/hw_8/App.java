package hw_8;

import hw_8.Obstracl.BaseObstracl;
import hw_8.Obstracl.RunningTrack;
import hw_8.Obstracl.Wall;
import hw_8.Participant.BaseParticipant;
import hw_8.Participant.Cat;
import hw_8.Participant.Robot;

public class App {
    public static void main(String[] args) {
        BaseParticipant[] baseParticipant = {
                new Cat("Tom",1200,110),
                new Cat("Tommy",100,10),
                new Robot("Jekki",5000,500),
        };

        BaseObstracl[] baseObstracl = {
                new RunningTrack(1000),
                new RunningTrack(200),
                new Wall(20),
        };

        for (BaseObstracl baseObstracl1:baseObstracl){
            for (BaseParticipant baseParticipant1: baseParticipant)
           baseObstracl1.start(baseParticipant1,baseObstracl1);
        }
    }
}
