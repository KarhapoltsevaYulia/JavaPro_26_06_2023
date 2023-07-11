package hw_4;

public interface Runnable  {

   void runningInt(int lengthObstacle);
   default int сapacityСheckRunInt(int lengthObstacles,int maxRunLenght,Object nameObjectc){
        if (lengthObstacles<=maxRunLenght){
            return lengthObstacles;
        }
        else {
            System.out.println("Учасник " + nameObjectc +" не може " +  lengthObstacles + " метрів пробігти");
            return lengthObstacles=0;
        }
    }
}
