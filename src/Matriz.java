import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matriz [][] = new int[3][5];
        int numero;

        //Pidiendo numeros:
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("Ingrese numero en posicion ["+i+"]"+",["+j+"]: ");
                numero = sc.nextInt();
                Matriz[i][j]= numero;
            }
        }
        sc.close();

      System.out.println();
        //Imprimiendo numeros
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("\n-----------------------------------------");
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("|  "+Matriz[i][j]+"\t");
            }
            System.out.print("|");
        }
        System.out.println("\n-----------------------------------------");

    }
}
