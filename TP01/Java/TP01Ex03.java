import java.util.Scanner;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex03{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite a diagonal do quadrado usando um número inteiro:");
int diag = scan.nextInt();
double raiz2 = 1.4142; // Valor aproximado da raíz de 2
double aresta = diag / raiz2;
System.out.println(aresta);
double area = aresta * aresta;

System.out.println("A area do quadrado e de " + area + " m²");
}
}
