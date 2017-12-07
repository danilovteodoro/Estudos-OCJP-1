/*
    #################  Item 1: Declare and initialize variables (including casting of primitive data types). #################
    
    Initializing Fields.
  
     Os campos de uma instancia de um objeto, podem ser iniciados durante sua declaração ex:
      int v1 = 2;
     
     Não boa prática inicializar durante a declaração, pois algumas vezes é necessário a execução 
     de códigos complexos como loops, por exemplo.
     O recomendado seria iniciaziar o campo dentro do construtor do objeto. Ex:   
        public Main(){
         v2 = 3; 
        }
    
     Os campos de classe também podem ser inicializados durante a declaração. Ex:
         static int s1 = 0;
  
     Também podem usar o bloco satic para serem inicializados. Ex:
      static {
       s2 = 50; 
      }
     
     Os blocos estáticos podem aparecer em qualquer lugar do corpo daclasse.
     O runtime garantirá que durante a execução, ele será chamado na mesma ordem em que
     aparecer no código.
    
    Os campos de classe também podem ser iniciados atravéz de um método estático.
    A vantagem neste caso é que pode haver um maior aproveitamento de código.
      static int s3 = initializationMethod(); 
      public static int initializationMethod(){
         return 22;
      }
      

  
*/
class Main{

  int v1 = 2; //Inicia campo de instancia durante a declaração.
  int v2;
  static int s1 = 0; //Inicialização de variável de classe durante a declaração.
  static int s2;
  static int s3 = initializationMethod(); // inicializando atravéz de um método estico.
  public static int initializationMethod(){
    return 22;
  }
 
  static {
    s2 = 50; //Inicialização no bloco Static.
  }
  public Main(){
    v2 = 3; //Inicialização feita pelo construtor.
  }
  
  public static void main(String[] args){
    System.out.println(new Main().v1);
    System.out.println(new Main().v2);
    System.out.println(Main.s1);
    System.out.println(Main.s2);
    System.out.println(Main.s3);
  }



}

