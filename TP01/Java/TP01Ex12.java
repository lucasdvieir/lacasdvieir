import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex12{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor do raio da base do cone em metros:");
double r = scan.nextInt();
System.out.println("Digite o valor da altura do cone em metros:");
double h = scan.nextInt();
double pi = 3.1416;
double v =  (Math.pow(r,2) * pi * h)/3;

System.out.println("O volume do cone é " + v + " m³");
}
}
