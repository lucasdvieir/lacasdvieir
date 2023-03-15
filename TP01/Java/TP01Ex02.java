import java.util.Scanner;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex02{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite a aresta do quadrado usando um número inteiro:");
int aresta = scan.nextInt();

int area = aresta * aresta;

System.out.println("A area do quadrado é de " + area + " m²");
}
}
