package practica3.pr3;

import java.math.BigInteger;

public class Principal {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        long time1 = System.currentTimeMillis();
        BigInteger rusa = funciones.multiplicacionRusa(new BigInteger("10"), new BigInteger("4"));
        BigInteger sucesivas = funciones.sumasSucesivas(new BigInteger("10"), new BigInteger("10"));
        BigInteger egipcia = funciones.multiplicacionEgipcia(new BigInteger("25"), new BigInteger("10"));
        long time2 = System.currentTimeMillis();
        long total = time2 - time1;
        System.out.println(egipcia);
    }
}
