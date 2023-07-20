package hw_6.h_w_6_2.obstracals;
import hw_6.h_w_6_2.obstracals.participants.BaseParticipant;

public abstract class BaseObstracl {
    int lenghtObstracl;
    boolean could=true;
    public BaseObstracl(int lenghtObstracl) {
        this.lenghtObstracl = lenghtObstracl;
    }
    public abstract void start(BaseParticipant baseParticipant);
}
