import java.util.Scanner;

public class metodos {

    public datos[][] llenarMatriz(datos[][] m) {
        Scanner sc = new Scanner(System.in);

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    datos o = new datos();

                    System.out.println("Ingrese el nombre del producto: ");
                    o.setNombre(sc.next());

                    System.out.println("Ingrese el precio del producto: ");
                    o.setPrecio(sc.nextDouble());

                    System.out.println("¿El producto esta en oferta? (si/no): ");
                    o.setOferta(sc.next().toLowerCase());
                    m[i][j] = o;
                }
            }
        return m;
    }

    public void contarOfertas(datos[][] m) {
        int t = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j].getOferta().equalsIgnoreCase("si")) {
                        t = t + 1;
                    }
                }
            }
            System.out.println("-----------------------------");
            System.out.println("Total de productos en oferta: " + t);
            System.out.println("-----------------------------");
    }
}

//import java.util.Scanner;

//public class metodos {

    //public datos[][] llenarMatriz(datos[][] m) {
        //Scanner sc = new Scanner(System.in);

        //for (int i = 0; i < m.length; i++) {
            //for (int j = 0; j < m[i].length; j++) {
                //datos o = new datos();

                //System.out.println("Ingrese el nombre del producto: ");
                //o.setNombre(sc.next());

                //System.out.println("Ingrese el precio del producto: ");
                //o.setPrecio(sc.nextDouble());
                
                //System.out.println("¿El producto esta en oferta? (si/no): ");
                //o.setOferta(sc.next().toLowerCase());
                //m[i][j] = o;
            //}
        //}
        //return m;
    //}

    //public void contarOfertas(datos[][] m) {
        //int t = 0;
        //for (int i = 0; i < m.length; i++) {
            //for (int j = 0; j < m[i].length; j++) {
                //if (m[i][j].getOferta().equalsIgnoreCase("si")) {
                    //t = t + 1;
                //}
            //}
        //}
        //System.out.println("Total de productos en oferta: " + t);
        //System.out.println("-----------------------------");
    //}
//}