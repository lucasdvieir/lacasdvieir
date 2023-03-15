import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex14{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o raio da esfera em metros:");
double raio = scan.nextInt();

double pi = 3.1416; // Valor aproximado da constante pi

double vr= 1.34 * Math.pow(raio, 3) * pi;


System.out.println("Digite a aresta do cubo em metros:");
double a = scan.nextInt();

double vc= Math.pow(a, 3);

double v =  vc - vr;

if(v <= 0)
{
System.out.println("Não há volume livre no ambiente!");
}
else
{
System.out.println("Há " + v + " m³ de volume livre!");
}
}
}
