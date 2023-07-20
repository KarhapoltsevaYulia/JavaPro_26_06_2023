package hw_6.h_w_6_2.obstracals.participants;

public class Man extends BaseParticipant{
    public   int capacityRun=2000;
    public int capacityJump=2;
    public Man(String name) {
        super(name);
        this.capacityJump = capacityJump;
        this.capacityRun = capacityRun;
    }

    @Override
    public int startRun() {
        return capacityRun;
    }

    @Override
    public int startJump() {
        return capacityJump;
    }
}
