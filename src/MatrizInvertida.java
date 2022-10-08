public class MatrizInvertida {
 public static void main(String[] args) {
    int numeros = 64;
    int MatrizInvertida [][] = new int [8][8];
    boolean ruta = true;

    for (int i = 0; i < MatrizInvertida.length; i++) {

        if (ruta) {
            for (int j = MatrizInvertida[i].length-1; j >= 0; j--) {
                MatrizInvertida[i][j] = numeros;
                numeros--;
            }
            ruta = false;
        }
        else {
            for (int j = 0; j < MatrizInvertida[i].length; j++) {
                MatrizInvertida[i][j] = numeros;
                numeros--;

            }
            ruta = true;
        }
    }

    //imprimir

    for (int i = 0; i < MatrizInvertida.length; i++) {
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < MatrizInvertida[i].length; j++) {
            if (MatrizInvertida[i][j]>= 10) {
                System.out.print("|   "+MatrizInvertida[i][j]);
            } else {
                System.out.print("|    "+MatrizInvertida[i][j]);
            }
        }
         System.out.print("|");
        System.out.println("");
    }
 }
}
