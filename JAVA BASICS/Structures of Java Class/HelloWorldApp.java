/*
  #################  Item 2:Define the structure of a Java class.  #################
  
  Este exemplo trata-se de uma HelloWorld Application.
  Esta classe descreve uma classe que deve ser compilada e executada.	
  
   Uma class HelloWorld é composta de 3 components:
   -Comentários.
   -Definição da classe.
   -Método principal.

  Os Tipos de comentários são:
*/
/* Blocos de comentários */
/** Documentation - estes comentários são usados pelas ferramentas de javadoc*/
// Comentários de uma linha.
	
/*
 Definição da classe.
 a estrutura básica para criar uma classe é:
 class nome{
 }
 a palavra class seguida do nome da classe e o escopo da classe delimitado entre chaves {}.
*/
class HelloWorldApp{

/*
 Definição do método principál.
 Toda classe java para ser executada, deve conter um método princial
 chamado main.
 O método dever conter os modificadores de acesso public e static.
 (OBs.: o método poderá ser assinado como public static ou static public,
 porém por convenção é assinado como public static.).
 O método deverá possuir um vetor de Strings como parâmeto.
 Esse array recebe os parâmetros passados por linha de comando via console.
 Obs: declarar o método principal de forma errada não provoca erro de compilação 
 e sim erro de execução.
*/

 public static void main(String[] args){
  System.out.println("Hello World"); //Exibe uma String.
  
 //Exibe os parâmetros passados por console. ex: java HelloWorldAdd -parametro1
  for(String arg :args){
   System.out.println("Parâmetro : "+arg);
  }
 }

 /*
  //Método declarado com static void. Assinatura fora de convenção, porém funciona.
  static public void main(String[] args){
  System.out.println("Hello World"); //Exibe uma String.
 }*/
}
