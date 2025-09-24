import java.util.Scanner;
public class Decisao {
    
    //*Criando um programa que o usuario digita um numero e cai nas tomadas de decisão
    public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in); //*criando o scanner
            System.out.println("Digite um numero por favor :"); //*Digitando o numero na tela 
            Double numero_digitado = teclado.nextDouble();

        if (numero_digitado>100) {
                System.out.println("O numero digitado:"+numero_digitado+" é maior que 100");
                
                
            }else if (numero_digitado==100) {
                System.out.println("O numero digitado:"+numero_digitado+" é igual que 100");
                
                }else{
                    System.out.println("O numero digitado:"+numero_digitado+" é menor que 100");

                    }
            }
            
    }

