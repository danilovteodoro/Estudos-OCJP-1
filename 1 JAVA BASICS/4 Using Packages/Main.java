/*
   #################  Item 4: Import other Java packages to make them accessible in your code.  #################
*  PAKAGES - São usados para facilitar o uso de clases e evitar conflitos de nomes.
             Pode-se dizer que é um agrupamento de tipos.
   
   Porque usar -
        É usado para determidar que as classes do mesmo pacotes estão relaciodas.
             ex: no pacote com.graphics possuem classes que reresentam formas geométricas como Retângulo e Círculo.
        * Prover acesso restrito para as classes que fazem parte do mesmo pacote.
    
   Defindo um pacote - um pacote é a primeira instrução de codigo feita no arquivo .java.
                     ele é definido pela palavra package ex:

                     package com.meudominio.pacote;
                     public class MinhaClasse{ 
                         //implementações
                     }

    
   Usando classes de outros pacotes - 
       1 - Pode-se referenciar à classe através do seu nome totalmente qualificado. Ex:
             com.graphics.Rectangle rec2 = new com.graphics.Rectangle()
       
       2 - Pode-se importar o tipo (Classe \ Interface).
            import com.graphics.Rectangle;
            Rectangle rec = new Rectangle()
       
       3 - Pode-se importar o pacote inteiro com o uso do *. Neste caso todos os tipos do pacote serão importados. Ex:
            import com.graphics.*;
            Rectangle rec = new Rectangle();
            Circle circle = new Circle();
       
       4 - Classes internas podem ser instanciadas invocandó-as através da classe externa. Ex.
            Rectangle.Square square2 = new Rectangle.Square();
       
       5 - Pode-se o também importar uma classe interna ou todas as classes internas de um tipo.
           Neste caso a classe externa não será importada. Ex.
            import com.graphics.Rectangle.* ou import com.graphics.Rectangle.Square
            
             Importando o tipo e todos os tipos internos. Ex
             import com.graphics.Rectangle;
             import com.graphics.Rectangle.*;

       6 - Classes do mesmo pacote não precisam serem importadas.


   Restrições - 
      1 - Não é possível importar um sub-grupo de tipos de um pacote,
          o * importará todos os tipos. (Não é possível fazer import java.awt.A*, para importar todos que começam com a letra A).
      2 - Pacotes não possuem hierarquia. Por exempo, quando importar java.awt, não importará java.awt.graphics porque
          são pacotes diferentes.
      3 - Quando existem tipos importados com o mesmo nome, é preciso referêciá-los pelo nome totalmente qualificado.
          Ex: 
            import java.awt.*;
            import com.graphics.*;
            com.graphics.Rectangle rec2 = new com.graphics.Rectangle();
         Tanto o pacote com.graphics quanto o pacote java.awt, possuem um membro com o nome de Rectangle.

  Import Static - 
        Pode-se usar os métodos estáticos de uma de outra classe utilizando o import statc. Ex:
         import static com.graphics.Constantes.*;
         agora pode usar diretamente a constante EXEMPLO e o método exemplo().
         ao invés de: Constantes.EXEMPLO e Constantes.exmplo();


  Obs: houver um import para pacotes que tenham tipos com o mesmo 
       nome e no código não haja uma instancia desse tipo,
       o código irá compilar. Ex:
          se houver :
          import com.graphics.*;
          import java.awt.*;             
          e não tenha:
          new Rectangle();
        o código irá compilar. Só precisará no coso de criar uma
        instancia de Rectangle, informar o caminho completo do tipo.
         com.graphics.Rectangle rec = new com.graphics.Rectangle();
         java.awt.Rectangle rec2 = new java.awt.Rectangle();
       
       E caso haja mais de uma importação para tipos de mesmo nome,
       o programa não compilará.Ex:
       import java.awt.Rectangle;
       import com.graphics.Rectangle;
       NAO COMPILARÁ !

*/
//import com.graphics.Rectangle; //Importa a classe Rectangle.
import com.graphics.*; //Importa todos os membros do pacote com.graphics.
//import java.awt.*; //O pacatote java.awt também contém Rectangle.
import com.graphics.Rectangle.*;                           
import static com.graphics.Constantes.*; //import static.

class Main{
 public static void main(String[] args){
  System.out.println("Usando pacotes");
 
  /*A linha abaixo funcionará caso o primeiro ou o segundo import esteja presente no código e o 3 import não esteja no código*/
  Rectangle rec = new Rectangle(); //Intancia o objeto Rectangle.

  /*A linha de abaixo sempre funcionará idependentimente dos imports declarados.*/
  com.graphics.Rectangle rec2 = new com.graphics.Rectangle(); //importa Rectangle usando seu nome totalmente qualificado. (Caminho absoluto. Package + Name).
  
  //A linha abaixo só funcionará caso o segundo import esteja presente no código.
  Circle circle = new Circle(); //Instancia do objeto Circle
   
   //A linha abaixo só funcionará caso o quarto importe esteja presente no código.
   Square square = new Square();
   
  /*A linha abaixo funcionará caso o primeiro ou o segundo import esteja presente no código e o 3 import não esteja no código*/
   Rectangle.Square square2 = new Rectangle.Square();
   
   System.out.println("Constante estática importada : "+EXEMPLO);
   System.out.println("Invocando método estático");
   exemplo();

 }
}
