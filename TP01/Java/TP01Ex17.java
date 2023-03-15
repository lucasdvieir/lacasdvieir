import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex17{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado


System.out.println("Digite a base: ");
double base = scan.nextDouble();
System.out.print("Digite o expoente: ");
int expoente = scan.nextInt();
double resultado = 1;

if (expoente > 0) {
for (int i = 0; i < expoente; i++) {
resultado *= base;
}
} else if (expoente < 0) {
for (int i = 0; i > expoente; i--) {
resultado /= base;
}
}
System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
}
}
