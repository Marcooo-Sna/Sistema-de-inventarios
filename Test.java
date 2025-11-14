import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Le pido los datos al usuario.
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor de K:"):
        double k = lector.nextDouble();
        System.out.println("Ingrese el valor de d:"):
        double d = lector.nextDouble();
        System.out.println("Ingrese el valor de h:"):
        double h = lector.nextDouble();
        System.out.println("Ingrese el valor de l:"):
        double l = lector.nextDouble();

        //Datos para inventarios con descuento
        System.out.println("Ingrese el precio normal: ");
        double precionormal = lector.nextDouble();
        System.out.println("Ingrese el precio con el 1er descuento:");
        double preciodescuento1 = lector.nextDouble();
        System.out.println("Ingrese el rango minimo para el 1er descuento: ");
        double rangominimodescuento1 = lector.nextDouble();
        System.out.println("Ingrese el precio con el 2do descuento:");
        double preciodescuento2 = lector.nextDouble();


        //Se muestran los resultados.
        System.out.println("La cantidad de pedido es: " + cantidadpedido(k, d, h));
        System.out.println("Duración del ciclo" + duracionciclo + (cantidadpedido(k, d, h), d));
        System.out.println(":" + N(l,duracionciclo(cantidadpedido(d, d, h), d)));
        System.out.println("Le:" + Le(l, N(l, duracionciclo(cantidadpedido(k, d, h), d)), duracionciclo(cantidadpedido(k, d, h), d)));
        System.out.println("Punto de reorden" + puntodereorden(Le(l, N(l, DuracionCiclo(cantidadpedido(k, d, h), d)), duracionciclo(cantidadpedido(k, d, h), d)), d));

        //metodo para calcular la cantidad de pedido.
        public static double cantidadpedido(double k, double d, double h){
            return Math.sqrt((2, k * d) / h) ;
        }
        //metodo para calcular la direccion del ciclo.
        public static double duracionciclo (double y, double d){
            return y / d;
        }
        //metodo para calcular N.
        public static double N(double l, double to){
            return l / to;
        }
        //metodo para Le.
        public static double Le(double l, double n, double to){
            return l - n * to;
        }
        //metodo para calcular el punto de reorden.
        public static double puntodereorden(double le, double d){
            return le * d;
        }
    }
}
