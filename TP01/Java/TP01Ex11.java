import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex11{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor do di�metro do c�rculo:");
double r = scan.nextInt()/2;
double pi = 3.1416;
double a =  Math.pow(r,2) * pi;

System.out.println("A �rea do c�rculo � de " + a + " m�");
}
}
