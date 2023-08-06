package hw_8.Participant;

import hw_8.Obstracl.BaseObstracl;
import hw_8.Obstracl.RunningTrack;
import hw_8.Obstracl.Wall;

public abstract class BaseParticipant {
    public String name;
    public  int abilityParticipantRun;
    public  int abilityParticipantJump;
    public static int abilityParticipant;


    public BaseParticipant(String name,int abilityParticipantRun, int abilityParticipantJump) {
        this.name = name;
        this.abilityParticipantRun =abilityParticipantRun;
        this.abilityParticipantJump =abilityParticipantJump;
    }
    public abstract void printParticipant(BaseParticipant baseParticipant, BaseObstracl baseObstracl);
    public int participantObstracl(BaseParticipant baseParticipant, BaseObstracl baseObstracl){

        if (baseObstracl instanceof Wall){
            abilityParticipant = abilityParticipantJump;
          return  abilityParticipant;
        } else{
        if (baseObstracl instanceof RunningTrack){
            abilityParticipant = abilityParticipantRun;
            return   abilityParticipant;
        }
        }
       return -1;
    }

    public String getName() {
        return name;
    }

    public int getAbilityParticipantRun() {
        return abilityParticipantRun;
    }

    public int getAbilityParticipantJump() {
        return abilityParticipantJump;
    }
}
