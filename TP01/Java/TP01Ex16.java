import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex16{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

System.out.println("Digite o valor do ângulo em graus: ");
double angulo = scan.nextDouble();
double pi = 3.1416;
       
double rad = angulo * pi / 180; // Converte os graus para radianos

double seno = 0;
for (int i = 0; i < 10; i++) {
seno += Math.pow(-1, i) * Math.pow(rad, 2 * i + 1) / fatorial(2 * i + 1);
} // Calcula o seno

double cosseno = 0;
for (int i = 0; i < 10; i++) {
cosseno += Math.pow(-1, i) * Math.pow(rad, 2 * i) / fatorial(2 * i);
} // Calcula o cosseno

// Calculaando tangente e secante
double tangente = seno / cosseno;
double secante = 1 / cosseno;

System.out.println("Seno de " + angulo +"º é igual " + seno);
System.out.println("Cosseno de " + angulo +"º é igual " + cosseno);
System.out.println("Tangente de " + angulo +"º é igual " + tangente);
System.out.println("Secante de " + angulo +"º é igual " + secante);

}
public static double fatorial(int n) {
        double fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    } // método para calcular fatorial
}
