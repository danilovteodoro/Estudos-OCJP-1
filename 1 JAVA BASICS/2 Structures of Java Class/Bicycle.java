public class Bicycle {
  //A classe Bicycle possui 3 campos.
  public int cadence;
  public int gear;
  public int speed;

  //A class Bicycle possui um construtor.
  public Bicycle(int startCadence, int startSpeed, int startGear){
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    
  }
 //A classe Bicycle possui e métodos.

  public void setCadence(int newValue){
   cadence = newValue;
  }

  public void setGear(int newValue){
   gear = newValue;
  }  
  
  public void applyBike(int decrement){
    speed -= decrement;
  }
  
 public void speedUp(int increment){
  speed += increment;
 }
  
}
