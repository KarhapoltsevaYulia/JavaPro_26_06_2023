package hw_8.Participant;

import hw_8.Obstracl.BaseObstracl;

public  class Robot extends BaseParticipant {
    public Robot(String name, int abilityParticipantRun, int abilityParticipantJump) {
        super(name, abilityParticipantRun, abilityParticipantJump);
    }
    @Override
    public void printParticipant(BaseParticipant baseParticipant, BaseObstracl baseObstracl){
        System.out.print(" -|OO|- "+participantObstracl(baseParticipant,baseObstracl));

    }
}
