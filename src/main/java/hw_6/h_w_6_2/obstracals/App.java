package hw_6.h_w_6_2.obstracals;

import hw_6.h_w_6_2.obstracals.participants.BaseParticipant;
import hw_6.h_w_6_2.obstracals.participants.Cat;
import hw_6.h_w_6_2.obstracals.participants.Man;
import hw_6.h_w_6_2.obstracals.participants.Robot;

public class App {
    public static void main(String[] args) {
        BaseObstracl[] baseObstracls = {
                new Wall(2),
                new RunningTrack(100)

        };
        BaseParticipant[] baseParticipants ={
                new Cat("Tommi"),
                new Man("Kolya"),
                new Robot("Fred")
        };
        for (BaseObstracl baseObstracl:baseObstracls){
            for(BaseParticipant baseParticipant:baseParticipants){
                baseObstracl.start(baseParticipant);
            }
        }
    }
}
