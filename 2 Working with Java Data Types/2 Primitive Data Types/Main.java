/*
  #### Item 1: Declare and initialize variables (including casting of primitive data types). ####
  
  Tipos Primitovos.

   Java é uma linguagem explicitamente tipada, o que significa que precisamos declarar
   as variáveis antes de usá-las.
    ex: int guear=1;

   Os tipos primitivos são tipos pré-definidos pela linguagem que não compartilham seus estados.
   os tipos primitivos não são como objetos que precisam ser construídos antes de serem utilizados.
   Java possui 8 tipos primitovos:

    *byte: 8 bits -128 à 127. Ela pode ser usada em casos em que haja a necessidade de econômia de memória.
                             ela pode manter um valor inteiro que esteja dentro de seu tamanho suportado.

    *short -16 bits -32768 à  32767 //Aplicase o mesmo guideline do byte.

    *int -por padrão 32 bits -2³¹ à 32³¹ -1 . Usado para armazenar valores inteiros. É o valor padrão de
                                              números inteiros utilizdo pela linguagem.
   
    *long - 64 bits -2^-63 à 2^63-1. Utilizado para manter números grantes não suportados pelo tipo inteiro.
    
    *float - 32-bit IEEE 754. Utiliazado para valores de ponto flutuantes (valores com decímais).
                              É recomendado utilizar o float para casos de econômia de memória.
                              para trabalhar com valores exatos como moéda, é recomendado utilizar o java.math.BigDecimal.

    *double - 64-bit IEEE 754. Utilizado para armazenar valores de ponto flutuante. É o valor padrão de
                                números decímais utilizado pela linguagem. Assim como o float, não é recomendado
                                 ser utilizados par válores exatos como moéda. Utilize java.math.BigDecimal.
   
    *boolean - representa um valor boleano sendo true ou false.
   
    *char - 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
    

 
*/
class Main{

  public static void main(String args[]){
    byte b = -128; //Valor Mínimo de bayte
    System.out.println("Valor mínimo de byte : "+b);
    b = 127; //Valor Máximo de byte
    System.out.println("Valor máximo de byte : "+b);
    
    //Estoura o valor mínimo de byte.
    // b = -130;
    //Estoura o valor mínimo de byte.
    // b = 128;

    short s = 32700;
    System.out.println("Este é um short : "+s);
   
    char c = 'A';
    System.out.println("Valor do char : "+c);
    c = 68; //O char também é um valor numérico. Representa um caractere unicode.
    System.out.println("Valor do char : "+c);
  }
}
