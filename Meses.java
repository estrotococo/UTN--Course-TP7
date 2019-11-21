package app;

import java.util.Scanner;

public class Meses {

    private int meses = 0;

    public Meses(int meses) {
        this.meses = meses;
    }

    public int getMeses() {
        /*System.out.println("Ingrese la cantidad de meses que desea analizar");
        Scanner scanner = new Scanner(System.in);
        meses = scanner.nextInt();*/
        //scanner = meses;
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
        
    }
    
}