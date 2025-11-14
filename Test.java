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
        System.out.println("Ingrese el rango minimo para el 2do descuento:");
        double rangominimodescuento2 = lector.nextDouble();

        //Se muestran los resultados.
        System.out.println("La cantidad de pedido es: " + cantidadpedido(k, d, h));
        System.out.println("Duración del ciclo" + duracionciclo + (cantidadpedido(k, d, h), d));
        System.out.println(":" + N(l,duracionciclo(cantidadpedido(d, d, h), d)));
        System.out.println("Le:" + Le(l, N(l, duracionciclo(cantidadpedido(k, d, h), d)), duracionciclo(cantidadpedido(k, d, h), d)));
        System.out.println("Punto de reorden" + puntodereorden(Le(l, N(l, DuracionCiclo(cantidadpedido(k, d, h), d)), duracionciclo(cantidadpedido(k, d, h), d)), d));

        //Calculo para inventarios con desceunto.
        double qoptima = cantidadpedido ( k, d, h);
        double costototalnormal = calcularcostototal(qoptima, k, d, h, precionormal);
        double qdescuento1 = cantidadpedido (k, d, h, preciodescuento1);
        double costototaldescuento1 = 0;
        if (qdescuento1 >= rangominimodescuento1){
            costototaldescuento1 = calcularcostototal(qdescuento1, k, d, h, preciodescuento1);
        } else {
            costototaldescuento1 = calcularcostototal(rangominimodescuento1, k, d, h, preciodescuento1);
        }
        double qdescuento2 = cantidadpedidocondescuento (k, d, h, preciodescuento2);
        double costototaldescuento2 = 0;
        if(qdescuento2 >= rangominimodescuento2){
            costototaldescuento2 = calcularcostototal(qdescuento2, k, d, h, preciodescuento2);
        } else {
            costototaldescuento2 = calcularcostototal(rangominimodescuento2, k, d, h, preciodescuento2)
        }
        //se muestran los costos totales y evaluamos cual nos conviene más. (Empezo a sonar mi mas personal de Taylor swift!!!!!!!!!!!!)
        double mejorcosto = costototalnormal();
        double qmejor = qoptima;
        String mejoropcion = "Precio normal";
        if(costototaldescuento1 < mejorcosto){
            mejorcosto = costototaldescuento1;
            qmejor = qdescuento1 >= rangominimodescuento1 ? qdescuento1 : rangominimodescuento1;
            mejoropcion = "Descuento No. 1";
        }
        if (costototaldescuento2 < mejorcosto){
            mejorcosto = costototaldescuento2;
            qmejor = qdescuento2 >= rangominimodescuento2 ? qdescuento2 : rangominimodescuento2;
            mejoropcion = "Descuento No. 2";
        }
        System.out.println("Mejor cantidad de pedido: " + qmejor );
        System.out.println("Mejor costo total: " + mejorcosto);
        System.out.println("Mejor opcion de descuento: " + mejoropcion);
        
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
