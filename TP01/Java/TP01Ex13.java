import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex13{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor da velocidade inicial em m/s:");
double v0 = scan.nextInt();
System.out.println("Digite o valor da aceleração em m/s²:");
double a = scan.nextInt();
System.out.println("Digite o valor do tempo de percurso em segundos:");
double t = scan.nextInt();
double v =  (v0 + a * t) * 3.6;

System.out.println("A velocidade final é " + v + " km/h");
}
}
