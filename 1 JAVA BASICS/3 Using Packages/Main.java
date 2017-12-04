//import com.graphics.Rectangle; //Importa a classe Rectangle.
import com.graphics.*; //Importa todos os membros do pacote com.graphics.
//import java.awt.*; //O pacatote java.awt também contém Rectangle.


class Main{
 public static void main(String[] args){
  System.out.println("Usando pacotes");
 
  /*A linha abaixo funcionará caso o primeiro ou o segundo import esteja presente no código e o 3 import não esteja no código*/
  Rectangle rec = new Rectangle(); //Intancia o objeto Rectangle.

  /*A linha de abaixo sempre funcionará idependentimente dos imports declarados.*/
  com.graphics.Rectangle rec2 = new com.graphics.Rectangle(); //importa Rectangle usando seu nome totalmente qualificado. (Caminho absoluto. Package + Name).
  
  //A linha abaixo só funcionará caso o segunto import esteja presente no código.
  Circle circle = new Circle(); //Instancia do objeto Circle
 }
}
