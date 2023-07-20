package hw_6.participant;

public abstract class BaseParticipant {
    String name;
    private int capacityRun;
    private int capacityJump;

    public BaseParticipant(String name, int capacityJump, int capacityRun) {
        this.name = name;
        this.capacityJump = capacityJump;
        this.capacityRun = capacityRun;
    }
}
