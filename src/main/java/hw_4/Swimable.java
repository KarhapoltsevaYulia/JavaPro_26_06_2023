package hw_4;

public interface Swimable {
      void swimableInt(int lengthObstacle);
      default int сapacityСheckSwimInt(int lengthObstacles,int maxSwimLenght,Object nameObject){
            if (lengthObstacles<=maxSwimLenght){
                  return lengthObstacles;
            }
            else {
                  System.out.println("Учасник " + nameObject +" не може " +  lengthObstacles + " метрів пропливти");
                  return lengthObstacles=0;
            }
      }
}
