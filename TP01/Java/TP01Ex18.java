import java.util.Scanner;
import java.lang.Math;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex18{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

double produto = 0;
for (int i = 1; i <= 5; i++) {
System.out.println("Digite o valor do " + i + "º produto:");
produto += scan.nextDouble();
}
System.out.println("O valor total dos produtos é R$ " + produto);
boolean quitado = false;
double pagamento = 0;
while(quitado == false){
System.out.println("Digite um valor de pagamento:");
pagamento = scan.nextDouble();
double troco = pagamento - produto;
if(troco >= 0){
System.out.println("O seu troco é R$ " + troco);
quitado = true;
}
else{
System.out.println("Valor insuficiente!");
}
} 
}
}
