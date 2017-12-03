/*
  #################  Item 2:Define the structure of a Java class.  #################
  Neste tópico é cobrado apenas uma visão geral de definição de estrutura de uma classe.
  Uma classe pussui campos (Atributos), métodos (açoes) e construtores. (Um tipo de método 
  que é executado sempre quando uma instancia do objeto é construída.
  
  Neste exemplo a classe Bicycle possui campos e métodos.
  A classe MontainBike é uma subclasse de Bicycle, então ela herda seus campos e métodos 
  e acrescenta seus proprios campos e métodos específicos.
  
  OBS.: A subclasse pode acessar os campos da classe pai.
        porém a classe filha não pode acessar os campos da classe filha.

 Uma estrutura mínima de classe é representada da seguinte forma:
   class NomeDaClasse{
     //atributos
   }
  Uma classe pode conter modificadores de acesso como public, private etc. ex
  public class NomeDaClasse{
    //atributos.
  }
 
  Para uma subclasse herdar de uma classe usa-se o a palavra extends seguido 
  do nome da clase Pai (ou super classe).
  OBS. Uma subclasse só pode herdar de uma classe.
  ex:
  public class SubClasse extends Classe{
    //atributos
  }
 
  Para uma classe implementar uma interface, usa-se a palavra implements 
  seguido do nome da interface. Caso a classe implemente mais de uma 
  interface, é necessário separar os nome por virgula.
  
   class NomeDaClasse implements Interface1, Interface2 {
     //atributos
     //implementações
   }

 *** Por convenção todo nome de classe deve começãr com Letra maiúscula.


*/
class TestBicycle {

 public static void main(String[] args){
   //Criando uma nova instancia de Bycycle
   Bicycle bike = new Bicycle(1,1,1);

   //Acessando os métodos de Bicycle
   bike.setCadence(2);
   bike.setGear(3);
   bike.applyBike(1);
   bike.speedUp(3);
   
   //Acessando atributos da classe Bicyle.
   System.out.println("Exibindo atributos da classe Bicycle !");
   System.out.println("Speed Bike : "+bike.speed+" Cacence bike : "+bike.cadence+" Gear Bike : "+bike.gear);

 //Criando uma nova instancia de MontainBike
   MontainBike motainBike = new MontainBike(1,1,1,1);

   //Acessando os métodos de MotainBike
   motainBike.setCadence(2);
   motainBike.setGear(3);
   motainBike.applyBike(1);
   motainBike.speedUp(3);
   motainBike.setHeight(2);
   
   //Acessando atributos da classe MotainBike.
   System.out.println("");
   System.out.println("Exibindo atributos da classe MotainBike !");
   System.out.println("Speed Bike : "+motainBike.speed+" Cacence bike : "+motainBike.cadence+" Gear Bike : "+motainBike.gear+
                     " Height bike : "+motainBike.seatHeight);
 }	
}
