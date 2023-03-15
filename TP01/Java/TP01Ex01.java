import java.util.Scanner;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex01{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite a base do retangulo usando um número inteiro:");
int base = scan.nextInt();

System.out.println("Digite a altura do retangulo usando um número inteiro:");
int alt = scan.nextInt();

int area = base * alt;

System.out.println("A area do retangulo é de " + area + " m²");
}
}
