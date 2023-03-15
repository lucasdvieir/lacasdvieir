import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex10{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor da temperatura em Celsius:");
int c = scan.nextInt();

double f = c * 1.8 + 32;

System.out.println(c + " celsius é equivalente a " + f + " farenheit");
}
}
