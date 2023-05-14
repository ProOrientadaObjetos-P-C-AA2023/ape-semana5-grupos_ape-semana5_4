package problema1;
public class Producto {
    private double precioProducto;
    private int nProducto;
    private double pDescuento;
    private double precioFinal;

    public Producto(double precioProducto, int nProducto) {
        this.precioProducto = precioProducto;
        this.nProducto = nProducto;
    }

    public void setnProducto(int nProducto) {
        this.nProducto = nProducto;
    }
    public int getnProducto() {
        return nProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public double getpDescuento() {
        return pDescuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    } 
    public double calcularDescuento(){      
        if(precioProducto >= 1000 && nProducto >= 10){
            return 0.10;
        } else 
           {
                return 0.05;
            }
    }
    public void calcularPrecioFinal(){
        double c;
        c = precioProducto * nProducto;
        this.pDescuento = c * calcularDescuento();
        this.precioFinal = c -(c * calcularDescuento());
    }
    @Override
    public String toString(){
        return String.format("VENTA DE PRODUCTOS"
                +"\nNumero de productos a comprar:%d"
                +"\nPrecio del producto p/u:%.2f"
                +"\nDescuento a aplicar:%.2f"
                +"\nPRECIO FINAL:%.2f"
                , getnProducto()
                ,getPrecioProducto()
                ,getpDescuento()
                ,getPrecioFinal());
    }
}
