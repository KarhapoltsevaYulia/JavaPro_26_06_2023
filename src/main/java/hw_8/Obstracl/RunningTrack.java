package hw_8.Obstracl;

import hw_8.Obstracl.BaseObstracl;
import hw_8.Participant.BaseParticipant;

public class RunningTrack extends BaseObstracl {

    public RunningTrack(int lenght) {
        super(lenght);
        this.nameObstracl="RunningTrack";
    }

    @Override
    public boolean ability(BaseParticipant baseParticipant) {
        return  lenght < BaseParticipant.abilityParticipant;
    }

    @Override
    public void printObstracl() {

        String run = "_____";
        for (int i = 1; i <= this.lenght; i=i+50) {
            System.out.print(run);
            if (i==1){
                System.out.print(this.lenght);
            }
        }
    }
    @Override
    public void start(BaseParticipant baseParticipant,BaseObstracl baseObstracl) {
        startPrint(baseParticipant,baseObstracl);
    }
}
