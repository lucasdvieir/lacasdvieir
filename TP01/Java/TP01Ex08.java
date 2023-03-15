import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex08{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor de milhas:");
int milhas = scan.nextInt();

double km = milhas * 1.852;

System.out.println(milhas + " milhas é equivalente a " + km + " km");
}
}
