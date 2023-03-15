import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex07{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o primeiro valor da media:");
int a = scan.nextInt();

System.out.println("Digite o segundo valor da media:");
int b = scan.nextInt();

double media = Math.pow((a*b),0.5);

System.out.println("A media geometrica dos valores é " + media);
}
}
