import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
    //Faça um programa que leia um numero inteiro e o imprima
        int numero_inteiro = 100;
        System.out.println(numero_inteiro);

    // Faça um programa que peça ao usuário para digitar três valores inteiros e imprima a soma deles.
        Scanner scanner  = new Scanner(System.in); //criar o Scanner
        System.out.println("Digite um numero:"); //le um numero inteiro
        int numero_1 = scanner.nextInt();
       
       
        System.out.println("Digite um numero"); //le o numero inteiro
        int numero_2 = scanner.nextInt();
        
       
        System.out.println("Digite um numero"); //le o numero inteiro
        int numero_3 = scanner.nextInt();

        System.out.println("A soma dos numeros digitados é:" + (numero_1+numero_2+numero_3));
        //imprime e soma os numeros fornecidos pelo usuario 

    // Faça um programa que peça ao usuário para digitar um número real e imprima o resultado do quadrado desse numero
        System.out.println("Digite um numero:");
        int numero_4 = scanner.nextInt();
        System.out.println("A raiz quadrada do numero digitado é:"+(numero_4 * numero_4));




    }
    
}
