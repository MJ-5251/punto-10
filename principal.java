import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos o = new metodos();

        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();

        datos[][] m = new datos[n][n];

        m = o.llenarMatriz(m);
        o.contarOfertas(m);
    }
}