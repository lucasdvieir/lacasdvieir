import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex09{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor da resistencia do circuito:");
int r = scan.nextInt();

System.out.println("Digite o valor da corrente eletrica do circuito:");
int i = scan.nextInt();

double v = r * i;

System.out.println("A tensão do circuito elétrico é de " + v + " volt");
}
}
