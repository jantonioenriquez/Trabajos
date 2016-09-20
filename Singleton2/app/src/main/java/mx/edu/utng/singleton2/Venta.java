package mx.edu.utng.singleton2;

/**
 * Created by Jose Antonio Enrique on 13/09/2016.
 */
public class Venta  {
    private int numVenta;
    private String fechaVenta;
    private float totalVenta;
    private static Venta venta;


    private Venta(){
        this.numVenta = 0;
        this.fechaVenta = "";
        this.totalVenta = 0;

    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public static Venta getVenta(){
        if (venta == null) {
            venta = new Venta();
        }
        return venta;
    }

}
