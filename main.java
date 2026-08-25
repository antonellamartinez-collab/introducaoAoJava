// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double raio;
//         double volume;

//         System.out.print("Digite o raio da esfera: ");
//         raio = teclado.nextDouble();

//         volume = (4.0 / 3.0) * 3.14 * raio * raio * raio;

//         System.out.println("O volume da esfera e: " + volume);
//     }
// }

// exercicio 2 

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double n1, n2, n3;
//         double p1, p2, p3;
//         double media;

//         System.out.print("Digite o primeiro numero: ");
//         n1 = teclado.nextDouble();

//         System.out.print("Digite o peso do primeiro numero: ");
//         p1 = teclado.nextDouble();

//         System.out.print("Digite o segundo numero: ");
//         n2 = teclado.nextDouble();

//         System.out.print("Digite o peso do segundo numero: ");
//         p2 = teclado.nextDouble();

//         System.out.print("Digite o terceiro numero: ");
//         n3 = teclado.nextDouble();

//         System.out.print("Digite o peso do terceiro numero: ");
//         p3 = teclado.nextDouble();

//         media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

//         System.out.println("A media ponderada e: " + media);
//     }
// }

// exercicio 3

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double homicidios;
//         double habitantes;
//         double taxa;

//         System.out.print("Digite a quantidade de homicidios: ");
//         homicidios = teclado.nextDouble();

//         System.out.print("Digite o numero de habitantes: ");
//         habitantes = teclado.nextDouble();

//         taxa = (homicidios / habitantes) * 100000;

//         System.out.println("A taxa de homicidios e: " + taxa);
//     }
// }

// exercicio 4

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int primeiro;
//         int quantidade;
//         int razao;
//         int termo;

//         System.out.print("Digite o primeiro termo: ");
//         primeiro = teclado.nextInt();

//         System.out.print("Digite a quantidade de termos: ");
//         quantidade = teclado.nextInt();

//         System.out.print("Digite a razao: ");
//         razao = teclado.nextInt();

//         termo = primeiro + (quantidade - 1) * razao;

//         System.out.println("O termo e: " + termo);
//     }
// }

// exercicio 5

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int horaInicial;
//         int minutoInicial;
//         int horaFinal;
//         int minutoFinal;
//         int inicio;
//         int fim;
//         int duracao;

//         System.out.print("Digite a hora inicial: ");
//         horaInicial = teclado.nextInt();

//         System.out.print("Digite o minuto inicial: ");
//         minutoInicial = teclado.nextInt();

//         System.out.print("Digite a hora final: ");
//         horaFinal = teclado.nextInt();

//         System.out.print("Digite o minuto final: ");
//         minutoFinal = teclado.nextInt();

//         inicio = horaInicial * 60 + minutoInicial;
//         fim = horaFinal * 60 + minutoFinal;

//         if (fim < inicio) {
//             fim = fim + 1440;
//         }

//         duracao = fim - inicio;

//         System.out.println("A duracao do evento e: " + duracao + " minutos");
//     }
// }

// exercicio 6

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double base;
//         double altura;
//         double area;

//         System.out.print("Digite a base: ");
//         base = teclado.nextDouble();

//         System.out.print("Digite a altura: ");
//         altura = teclado.nextDouble();

//         area = (base * altura) / 2;

//         System.out.println("A area do triangulo e: " + area);
//     }
// }

// exercicio 7

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double celsius;
//         double fahrenheit;

//         System.out.print("Digite a temperatura em Celsius: ");
//         celsius = teclado.nextDouble();

//         fahrenheit = (celsius * 9.0 / 5.0) + 32;

//         System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);
//     }
// }

// exercicio 8

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double preco;
//         double desconto;
//         double precoFinal;

//         System.out.print("Digite o preco do produto: ");
//         preco = teclado.nextDouble();

//         System.out.print("Digite a porcentagem de desconto: ");
//         desconto = teclado.nextDouble();

//         precoFinal = preco - (preco * desconto / 100);

//         System.out.println("O preco final e: R$ " + precoFinal);
//     }
// }

// exercicio 9

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         double capital;
//         double taxa;
//         int meses;
//         double simples;
//         double composto;

//         System.out.print("Digite o capital: ");
//         capital = teclado.nextDouble();

//         System.out.print("Digite a taxa de juros mensal: ");
//         taxa = teclado.nextDouble();

//         System.out.print("Digite o tempo em meses: ");
//         meses = teclado.nextInt();

//         taxa = taxa / 100;

//         simples = capital * (1 + taxa * meses);
//         composto = capital * Math.pow(1 + taxa, meses);

//         System.out.println("Montante com juros simples: R$ " + simples);
//         System.out.println("Montante com juros compostos: R$ " + composto);
//     }
// }

// exercicio 10

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner teclado = new Scanner(System.in);

//         int numero;

//         System.out.print("Digite um numero: ");
//         numero = teclado.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(numero + " x " + i + " = " + numero * i);
//         }
//     }
// }