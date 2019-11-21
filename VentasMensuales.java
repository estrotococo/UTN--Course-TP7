package app;

public class VentasMensuales {


  private int capacitores;
  private int leds;
  private int boton;
  private int parlante;

    public VentasMensuales(int capacitores, int leds, int boton, int parlante) {
        this.capacitores = capacitores;
        this.leds = leds;
        this.boton = boton;
        this.parlante = parlante;
    }

    public int getCapacitores() {
        return capacitores * 135;
    }

    public void setCapacitores(int capacitores) {
        this.capacitores = capacitores;
    }

    public int getLeds() {
        return leds * 25;
    }

    public void setLeds(int leds) {
        this.leds = leds;
    }

    public int getBoton() {
        return boton * 187;
    }

    public void setBoton(int boton) {
        this.boton = boton;
    }

    public int getParlante() {
        return parlante * 380;
    }

    public void setParlante(int parlante) {
        this.parlante = parlante;
    }

  
    /*void calculoMensual() {
        System.out.println("200 Capacitores vendidos: $"+ capacitores*135);
        System.out.println("50 Leds Amarillos vendidos: $" + leds * 25);;
        System.out.println("230 Botones de relé vendidos: $" + boton * 187);
        System.out.println("65 Parlantes vendidos: $" + parlante * 380);
    }*/
}