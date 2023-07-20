package hw_6.h_w_6_2.obstracals.participants;

public class Cat extends BaseParticipant{
   public int capacityRun = 500;
   public int capacityJump = 1;
   public Cat(String name) {
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
