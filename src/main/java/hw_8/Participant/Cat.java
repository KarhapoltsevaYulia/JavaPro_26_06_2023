package hw_8.Participant;

import hw_8.Obstracl.BaseObstracl;

public class Cat extends BaseParticipant {

    public Cat(String name, int abilityParticipantRun, int abilityParticipantJump) {
        super(name, abilityParticipantRun, abilityParticipantJump);
    }

    @Override
    public void printParticipant(BaseParticipant baseParticipant,BaseObstracl baseObstracl) {
        System.out.print("   ~('') "+participantObstracl(baseParticipant,baseObstracl));
    }

}
