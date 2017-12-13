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

    Os campos declarados não são obrigatórios serem inicializados, caso não inicializados, o compilador irá atribuir um valor padrão.
    os valores padrão são: 0 para tipos inteiros, 0.0 para decimais, false para boolean, null para objetos, e '\u0000' para char.
  
    Essa regra não se aplica a variáveis locais, devendo ser inicializadas antes de usá-las, caso contrario irá
    ocorrer um erro de compilação.

    Literais.
    
    São chamdos de litérias os tipos que são atribuídos literalmente no código pelo programador,
    sem a necessidade de usar u new.
    
    Literais Inteiros
    os valores de byte, short e int podem ser atribuído de um valor inteiro.
    o long é usados para receber valores inteiros longos que ultrapassam o range do int.
    por padrão a jvm trata um número literal inteiro int. Ex:
     20 + 20 .A JVM irá considerar uma soma de dois números inteiros int.
    para informar que o numero é long, usa-se a letra L depis do número.
    Pode usar a letra minúscula támbem, embora seja recomendado user maiúscula.
    Ex: 10L
   
    Bases Númericas.
    Os números inteiros podem ser representados em outras bases sem ser a decimal.
  
    base octal: basta colocar o 0 antes do numero.
                Os números aceitos devem estar entre 0 e 7.
              ex: 
                int numOctal = 0754;

 
*/
class Main{
   static int NUMERO; //Variável de classe.
   int numero;  //Variável de instancia.

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
    
    int i = 10;
    System.out.println("Numero Inteiro "+i);
    long l = 10000000000000L; //Se retirar o L no final não compila.
    System.out.println("Numero Long "+l);
    System.out.println(1050);//imprime um número inteiro.
   
    char c = 'A';
    System.out.println("Valor do char : "+c);
    c = 68; //O char também é um valor numérico. Representa um caractere unicode.
    System.out.println("Valor do char : "+c);
   
   //As campos de instancia e de classe assumem o valor padrão
   System.out.println("Default new Main().numero : "+new Main().numero+
                      " Default Main.NUMERO : "+Main.NUMERO); 

   //Variáveis locais não serão inicializadas com o valor padrão.
   //int numero;
   //System.out.println("numero : "+numero); //Erro de compilação.

   int numOctal = 0754; //Número na base octal.
   //int numOctal = 08; //A compilação falha.
   System.out.println("Numero 0754. BASE OCTAL  "+numOctal);
   int numHexadecimal = 0xf1; //Número na base hexadecimal.
   System.out.println("Numero 0754. BASE HEXADECIMAL  "+numHexadecimal);
   int numBinario = 0b0010; //Número na base binária.
   System.out.println("Numero 0754. BASE BINÁRIA  "+numBinario);
   
  }
}
