package hw_8.Obstracl;

import hw_8.Obstracl.BaseObstracl;
import hw_8.Participant.BaseParticipant;

public class Wall extends BaseObstracl {

    public Wall(int lenght) {
        super(lenght);
        this.nameObstracl="WAll";
    }

    @Override
    public boolean ability(BaseParticipant baseParticipant) {
        return lenght < BaseParticipant.abilityParticipant;
    }

    @Override
    public void printObstracl() {
        for (int i = 0; i < lenght; i=i+50) {
            System.out.print("|-|-|-|-|-|-|");
        }
    }

    @Override
    public void start(BaseParticipant baseParticipant, BaseObstracl baseObstracl) {
        startPrint(baseParticipant,baseObstracl);
    }

}
