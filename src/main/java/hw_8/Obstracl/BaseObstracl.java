package hw_8.Obstracl;

import hw_8.Participant.BaseParticipant;

public abstract class BaseObstracl {
    public static final String red = "\u001B[31m";
    public static final String black = "\u001B[30m";
    public static final String blue = "\u001B[34m";

    int lenght;
    String nameObstracl;

    public BaseObstracl(int lenght) {
        this.lenght = lenght;
        this.nameObstracl=nameObstracl;
    }

    public abstract  boolean ability(BaseParticipant baseParticipant);
    public abstract void printObstracl();
    public abstract void start(BaseParticipant baseParticipant,BaseObstracl baseObstracl);

     void startPrint(BaseParticipant baseParticipant, BaseObstracl baseObstracl){
        baseParticipant.participantObstracl(baseParticipant,baseObstracl);
        if (BaseParticipant.abilityParticipant==0){
            System.out.println();
            System.out.println(baseParticipant.name+red+"  Вибув з перегонів!"+black);
        } else {
            System.out.println("     " + baseParticipant.name +
                    "                       " + obstraclParticipant(baseObstracl)+baseObstracl.lenght);
            baseParticipant.printParticipant(baseParticipant,baseObstracl);
            System.out.print("                 ");
            printObstracl();
            if (!ability(baseParticipant)) {
                System.out.print("\033[H\033[2J");
                System.out.println(red + "    Lost " + baseParticipant.name + "(((" + black);
                baseParticipant.abilityParticipant = 0;
                baseParticipant.abilityParticipantJump=0;
                baseParticipant.abilityParticipantRun=0;
                System.out.println();
            } else {
                System.out.println();
                System.out.println();
                System.out.println("   " + obstraclParticipant(baseObstracl)+" "
                        + baseObstracl.lenght+ "            " + baseParticipant.name);
                printObstracl();
                System.out.print("     ");
                baseParticipant.printParticipant(baseParticipant,baseObstracl);
                System.out.print("                 ");
                System.out.println(blue + "      Win!!!" + baseParticipant.name + black);
                System.out.println();
            }
        }
    }
    String obstraclParticipant(BaseObstracl baseObstracl){

        if (baseObstracl instanceof Wall){
            this.nameObstracl= nameObstracl;
            return  nameObstracl;
        }
        if (baseObstracl instanceof RunningTrack){
            this.nameObstracl=nameObstracl;
            return   nameObstracl;
        }
        return null;
    }

    public int getLenght() {
        return lenght;
    }

    public String getNameObstracl() {
        return nameObstracl;
    }
}
