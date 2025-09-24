import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero por favor");
        Double numero_teclado = teclado.nextDouble();
        
    int numero = 2;
    switch (numero){
        case 1:
            System.out.println("o numero e 1");
            break;
        
        case 2:
            System.out.println("o numero e 2");
            break;

        case 10:
            System.out.println("o numero e 3");
            break;

        default:
            System.out.println("Não sei qual e o numero");
            break;



    }
}
}
