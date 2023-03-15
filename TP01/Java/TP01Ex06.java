import java.util.Scanner;

//Dupla: Anderson Rodrigues Ramos e Lucas Vieira

public class TP01Ex06{
public static void main(String args[]){

Scanner scan= new Scanner(System.in); // Para entrada do teclado

double media = 0;

for (int i = 1; i < 5; i++) {
  	System.out.println("Digite o " + i + " º valor da media:");
	media = media + scan.nextInt();
}

media = media / 4;

System.out.println("A media dos valores é " + media);
}
}
