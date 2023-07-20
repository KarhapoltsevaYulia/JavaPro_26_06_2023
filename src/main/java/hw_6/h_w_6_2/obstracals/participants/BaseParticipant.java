package hw_6.h_w_6_2.obstracals.participants;

public abstract class BaseParticipant {
    public  String name;
    public int capacityRun;
    public int capacityJump;

    public BaseParticipant(String name) {
        this.name = name;
    }
    public abstract int startRun();
    public abstract int startJump();
}
