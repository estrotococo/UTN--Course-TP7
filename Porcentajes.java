package app;
import app.VentasMensuales;

public class Porcentajes{

    private double cincuenta;
    private double  cientoVeinte;
    private double trescientosCincuenta;

    public Porcentajes(double d, double e, double f) {
        this.cincuenta = d;
        this.cientoVeinte = e;
        this.trescientosCincuenta = f;
    }

    public double getCincuenta() {
        return cincuenta;
    }

    public void setCincuenta(float cincuenta) {
        this.cincuenta = cincuenta;
    }

    public double getCientoVeinte() {
        return cientoVeinte;
    }

    public void setCientoVeinte(float cientoVeinte) {
        this.cientoVeinte = cientoVeinte;
    }

    public double getTrescientosCincuenta() {
        return trescientosCincuenta;
    }

    public void setTrescientosCincuenta(float trescientosCincuenta) {
        this.trescientosCincuenta = trescientosCincuenta;
    }


}
