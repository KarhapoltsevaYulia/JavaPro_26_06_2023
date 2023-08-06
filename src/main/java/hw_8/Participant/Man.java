package hw_8.Participant;

import hw_8.Obstracl.BaseObstracl;

public abstract class Man extends BaseParticipant {


    public Man(String name, int abilityParticipantRun, int abilityParticipantJump) {
        super(name, abilityParticipantRun, abilityParticipantJump);
    }
    @Override
    public void printParticipant(BaseParticipant baseParticipant, BaseObstracl baseObstracl){
        System.out.print(" ^^ "+participantObstracl(baseParticipant,baseObstracl));

    }
}
