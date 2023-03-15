import java.util.Scanner;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex04{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite a altura do triangulo usando um número inteiro:");
int alt = scan.nextInt();

System.out.println("Digite a base do triangulo usando um número inteiro:");
int base = scan.nextInt();

int area = (base * alt) / 2;

System.out.println("A area do triangulo é de " + area + " m²");
}
}
