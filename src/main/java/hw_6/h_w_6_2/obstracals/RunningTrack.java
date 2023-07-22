package hw_6.h_w_6_2.obstracals;

import hw_6.h_w_6_2.obstracals.participants.BaseParticipant;

public class RunningTrack extends BaseObstracl{
    String nameObstracl;

    public RunningTrack(int lenghtObstracl) {
        super(lenghtObstracl);
        this.nameObstracl="RunningTrack";
    }

    @Override
    public void start(BaseParticipant baseParticipant) {
       int capacityParticipant= baseParticipant.startRun();
       if ((this.lenghtObstracl>capacityParticipant)&& (super.could)){
           super.could =false;
           System.out.println(baseParticipant.name +" вибуває з перегонів не зміг пройти перешкоду ");
           System.out.println(baseParticipant.name+ "  не зміг пройти перешкоду "
                   +this.nameObstracl+" довжиною "+this.lenghtObstracl+" пройдено "+capacityParticipant);
       } else {
           System.out.println(baseParticipant.name + " зміг пройти перешкоду "
                   + this.nameObstracl + " довжиною " + this.lenghtObstracl);
       }
    }
}
