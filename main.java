import java.util.Scanner;

public class main{
  public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Bem-vindo ao meu primeiro progrma Java!");
    System.out.println("meu nome é antonella e eu estudo no colégio costa e silva");

    Integer idade = Integer.valueOf(25);
    System.out.println("eu tenho " + idade + "anos de idade");

    Integer num1 = Integer.valueOf(10);
    Integer num2 = Integer.valueOf(25);
    System.out.printf("%d = %d = %d\n", num1, num2, num1 + num2);

    Double preco = Double.valueOf(59.90);
    Double peso = Double.valueOf(85.50);
    System.out.printf("Preço: R$%.2f | Peso: %.2f\n" , preco, peso);

    System.out.println("Me diga o seu nome: ");
    String nomeUsuario = 
  String.valueOf(teclado.nextLine());
    System.out.printf("que bom te conhecer %s\n", nomeUsuario);
    
  }
}