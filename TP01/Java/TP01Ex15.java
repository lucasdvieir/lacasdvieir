import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex15{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite a cota��o do d�lar de hoje:");
double cot = scan.nextDouble();

System.out.println("Digite o valor em d�lares a ser convertido:");
double dolar = scan.nextDouble();

double real = dolar * cot;

System.out.println("$" + dolar + " � equivalente a R$ " + real);

}
}
