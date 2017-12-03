/*
   #################  Item 1: Define the Scope of Variable  #################

 1) Variáveis de Intaicia - São variáveis da instancia do objeto. Existem enquanto a instancia do objeto existir.
    Também são comunmente chamadas de campos.

 2) Variáveis de classe - É qualquer campo declarado como statico. As variáves de classe não precisa ser acessada através
    de uma instancia, porém pode ser acessada por elas. Quando uma variável de classe mudar, reflitirá em todas suas instancias.

 3) Parametros - São argumentos recebidos por um método ou construtor. Os paramentos são tratados como variáveis locais
     e possui o scopo do método.

 Nomes de variáveis e convensões

Nome de variáveis são CASE-SENSITIVE e podem ser uma sequencia ilimitada de letras e digitos ou 'pelos caracteres $' e '_'.
Variáveis devem começar com letras ou com  '$' ou '_'. No entando a convenção diz que variáveis devem começar com letras 
(e não '$' e '_'). Também é convenção que não se deve usar o simbulo '$' em nenhuma parte do nome da variável.


*/

class Main {
 int indice = 2; //Variável de instancia ou campo.
 static int i =  1; //Variável de classe.
  
 public static void main(String[] args){
     System.out.println("\n==TESTANDO NOMES DE VARIÁVEIS==");
     nomesDeVariaveis();
     System.out.println("\n==TESTANDO ESCOPO DE VARIÁVEIS==");
     escopoDeVariaveis();
       
 }
 
 //Todos os métodos do objeto podem acessar as variáveis de instancia do objeto.
 public void printIndice(){
   System.out.println("O valor do índice é :"+indice);
 }
 public int somaIndice(int indice){
  //é necessário usar o this para se referir ao indice da instancia do objeto.
  System.out.println("variável indice do parâmetro : "+indice+" Variável indice da instancia : "+this.indice);
  return this.indice + indice;
 }


/*
 -- MÉTODOS DE TESTES --
  os métodos a seguir são usados para testes.
  por isso são estáticos e não fazem parte da instancia do objeto Main

*/

public static void nomesDeVariaveis(){
//Algumas sequencias de variáveis que podem ser declaradas porém estão fora da convenção padrão:
  int b__$$vc=1;
  int $cc=2;
  int $_c_$=3;
  int nome$=1;
  int _nome=1;

//A seguir temos alguns nomes de variáveis que são inválidos. Qualquer linha embaixo que for descomentada,
//o código não compilará

//int 1var = 0;
//int var@1 = 0
//int v?ar1 = 0;
//int va riavel = 0;

  System.out.println(" ");
  System.out.println("Nomes de varáveis válidos que estão forda de convenção: ");
  System.out.println(" b__$$vc, $cc, $_c_$, nome$, _nome");
  System.out.println(" ");
  System.out.println("Nomes de varáveis inválidos: ");
  System.out.println(" 1var, var@1, v?ar1, va riavel");
  System.out.println(" ");


 }

public static void escopoDeVariaveis(){
  System.out.println("");
  // A variável de classe i pode ser acessada de quanquer lugar da classe.
  System.out.println("Variável de Classe i : "+i);

  //No entanto se declararmos uma variavel local com o mesmo nome, não teremos mais acesso direto a variável de classe.
  //quando invocarmos i taremos invocando a variável local;
  int i = 5; //Variável local i.
  System.out.println("Variável de Local i : "+i);
  
  //Para nos referirmos a variavél de classe, neste caso devemos invocá-la através da class
    System.out.println("Variável de classe i : "+Main.i+" Variável local i :"+i);
  
  //Variáveis de instancia não podem ser acessadas fora da instancia do objeto da classe.
  // System.out.print(indice); //Não compila !!

  //Não é possível acessar variáveis de instancia diretamente da classe, como por exemplo Main.indice.
  //System.out.print(Main.indice); //Não compila !!

  System.out.println("");
  //Para acessar a variável de instancia incice, é necessario criar uma nova instancia do objeto Main.
  Main main = new Main();
  System.out.println("Váriavel de instancia indice do Objeto Main : "+main.indice);
  main.printIndice(); //Método do objeto que acessa a variável de instancia indice.
  
  System.out.println("");
  //Cada instancia do objeto possui um valor idenpendente de suas variáveis de instancia.
  Main main2 = new Main();
  main2.indice = 10;
  System.out.println("Indice instancia main : "+main.indice+" Indice instancia main2 : "+main2.indice);
  
  System.out.println("");
  //No caso das variáveis de classe o valor será compartilhado com todas as suas instancias
  Main main3 = new Main();
  Main.i = 15;
  System.out.println("Main.i : "+Main.i);
  System.out.println("main.i : "+main.i);
  System.out.println("main2.i : "+main2.i);
  System.out.println("main3.i : "+main3.i);
  System.out.println("new Main().i : "+new Main().i);

  System.out.println("");
  //Testando escopo dos parâmetros.
  System.out.println("Soma de main.indice + 3 = "+main.somaIndice(3));

  /*
    As variáveis locais possuem o seu escopo delimitado ao bloco de código declarado.
    Um bloco de código pode ser um método, uma estrutura condicional como if e else ou
    pode ser uma estrutura de repetição etc.
    Resumindo, o escopo da variável local está demilitado pelo bloco de chaves {} que
    elas está contida
  */
  
  if(2<3){
    boolean menor = true;
    System.out.println("2 é menor que 3 : "+menor);
  }
  //System.out.println("2 é menor que 3 : "+menor);//Não compila.

 }
}
