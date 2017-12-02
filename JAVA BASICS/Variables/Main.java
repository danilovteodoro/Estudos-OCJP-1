/*
   #################  Item 1: Define the Scope of Variable  #################

 1) Variáveis de Intaicia - São variáveis da instancia do objeto. Existem enquanto a instancia do objeto existir.
    Também são comunmente chamadas de campos.

 2) Variáveis de classe - É qualquer campo declarado com statico. As variáves de classe não precisa ser acessada através
    de uma instancia, porém pode ser acessada por elas. Quando uma variável de classe muda, reflitirá em todas suas instancias.

 3) Parametros - São argumentos recebidos por um método ou construtor. Os paramentos são tratados como variáveis locais
     e possui o scopo do método.

 Nomes de variáveis e convensões

Nome de variáveis são CASE-SENSITIVE e podem ser uma sequencia ilimitada de letras e digitos ou 'pelos caracteres $' e '_'.
Variáveis devem começar com letras ou com  '$' ou '_', no entando a convenção diz que variáveis devem começar com letras 
(e não '$' e '_'). Também é convenção que não se deve usar o simbulo '$' em nenhuma parte da variável.


*/

class Main {
 int indice = 1; //Variável de instancia ou campo.
 static int i =  1; //Variável de classe.
  
 public static void main(String[] args){
  
 }

public static void nomesVariáveis(){
//Algumas sequencias de variáveis que podem ser declaradas porém estão fora da convenção padrão:
  int b__$$vc=1;
  int $cc=2;
  int $_c_$=3;
  int nome$=1;
  int _nome=1;
}
}
