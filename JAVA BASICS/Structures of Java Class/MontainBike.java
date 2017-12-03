/*
 A classe MontainBike herda todos os campos e métodos de Bicycle e
 adiciona o campo seatHeight e o método setHeight
*/
public class MontainBike extends Bicycle {
 
 //A subclasse MontainBike possui um campo.
 public int seatHeight;
 
//A subclass MontainBike possui 1 contrutor.
 public MontainBike(int startHeight, int startCadence, int startSpeed,  int startGear){
   super(startCadence, startSpeed, startGear);  
   seatHeight = startHeight;   
 }
 
// A subclasse MontainBike possui 1 método.
 public void setHeight(int newValue){
   seatHeight = newValue;
 }
}
