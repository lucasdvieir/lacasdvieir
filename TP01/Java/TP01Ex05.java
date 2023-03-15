import java.util.Scanner;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex05{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o diametro da esfera usando um número inteiro:");
int raio = scan.nextInt()/ 2;

double pi = 3.1416; // Valor aproximado da constante pi

double volume = 1.34 * raio * raio * raio * pi;

System.out.println("O volume da esfera é de " + volume + " m³");
}
}
