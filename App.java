package app;

import java.util.Scanner;


public class App {

    public static double calcularAcumuladoPorMeses(int cantidadMeses, Item[] items){
        double acumulado = 0.0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            acumulado = acumulado + (item.getCantidadPromedioUnidades()*item.getPrecioUnitario()*cantidadMeses);
        }
        return acumulado;
    }
    
    public static double calcularPorcentajeDeVentaProyectadaPorMeses(int cantidadMeses, Item[] items, double porcentaje){
        return porcentaje * calcularAcumuladoPorMeses(cantidadMeses, items);
    }

    public static void main(String[] args) throws Exception {
        
        VentasMensuales calculo = new VentasMensuales(200, 50, 230, 65);
        System.out.println("Se vendieron :$"+calculo.getCapacitores()+" Capacitores");
        System.out.println("Se vendieron :$"+calculo.getLeds()+" leds");
        System.out.println("Se vendieron :$"+calculo.getBoton()+" botones de relé");
        System.out.println("Se vendieron :$"+calculo.getParlante()+" parlantes \n");

        Porcentajes estimacion = new Porcentajes(0.5d, 1.2d, 3.5d);
        System.out.println("------------Ventas al 50%------------");
        System.out.println("El 50% de las ventas de Capacitores equivale a: $" + calculo.getCapacitores()*estimacion.getCincuenta());
        System.out.println("El 50% de las ventas de Leds equivale a: $" + calculo.getLeds()*estimacion.getCincuenta());
        System.out.println("El 50% de las ventas de Botones de relé equivale a: $" + calculo.getBoton()*estimacion.getCincuenta());
        System.out.println("El 50% de las ventas de Parlantes equivale a: $" + calculo.getParlante()*estimacion.getCincuenta()+"\n");
    
        System.out.println("------------Ventas al 120%------------");
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getCapacitores()*estimacion.getCientoVeinte());
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getLeds()*estimacion.getCientoVeinte());
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getBoton()*estimacion.getCientoVeinte());
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getParlante()*estimacion.getCientoVeinte()+"\n");

        System.out.println("------------Ventas al 350%------------");
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getCapacitores()*estimacion.getTrescientosCincuenta());
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getLeds()*estimacion.getTrescientosCincuenta());
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getBoton()*estimacion.getTrescientosCincuenta());
        System.out.println("Las ventas de Capacitores equivale a: $" + calculo.getParlante()*estimacion.getTrescientosCincuenta()+"\n");


        Scanner scanner = new Scanner(System.in);
        int meses = scanner.nextInt();

        Meses meses2 = new Meses(meses);

        System.out.println("Meses: "+meses2.getMeses());

        int cantidadMeses = meses2.getMeses();


        Item[] items = {new Item("Capacitores", 200, 135.0), 
                        new Item("LEDS", 50, 25.0), 
                        new Item("Botones", 150, 180.0), 
                        new Item("Paralantes", 65, 380.0)};

        
        System.out.println(calcularAcumuladoPorMeses(cantidadMeses, items));

        System.out.println(calcularPorcentajeDeVentaProyectadaPorMeses(cantidadMeses, items, 0.5));
    }
}