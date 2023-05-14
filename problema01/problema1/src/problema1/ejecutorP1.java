package problema1;
import java.util.Scanner;

public class ejecutorP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VENTA DE PRODUCTOS");
        System.out.println("INGRESE EL PRECIO DEL PRODUCTO, \nINGRESE LA CANTIDAD DE PRODUCTOS ");
        Producto producto1 = new Producto(sc.nextDouble(),sc.nextInt());
        producto1.calcularDescuento();
        producto1.calcularPrecioFinal();
        System.out.println(producto1);
    }
    
}
