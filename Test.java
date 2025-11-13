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
        //Se muestran los resultados.
        System.out.println("La cantidad de pedido es: " + cantidadpedido(k, d, h));
        System.out.println("Duración del ciclo" + duracionciclo + (cantidadpedido(k, d, h), d));
        System.out.println(":" + N(l,duracionciclo(cantidadpedido(d, d, h), d)));
        System.out.println("Le:" + Le(l, N(l, duracionciclo(cantidadpedido(k, d, h), d)), duracionciclo(cantidadpedido(k, d, h), d)));
        System.out.println("Punto de reorden" + puntodereorden(Le(l, N(l, DuracionCiclo(cantidadpedido(k, d, h), d)), duracionciclo(cantidadpedido(k, d, h), d)), d));
     }
}
