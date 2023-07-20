package hw_6.h_w_6_2.obstracals.participants;

public class Robot extends BaseParticipant{
     int capacityRun=5000;
     int capacityJump=3;
    public Robot(String name) {
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
