package practica3.pr3;

import java.math.BigInteger;

public class Funciones {

    BigInteger a;
   
    public BigInteger sumasSucesivas(BigInteger a, BigInteger b){
      if(b.compareTo(BigInteger.ZERO) == 0 ) return(BigInteger.ZERO);
      return(a.add(sumasSucesivas(a, b.subtract(BigInteger.ONE))));
    }

    public BigInteger multiplicacionRusa(BigInteger A, BigInteger B){ 
        if(A.compareTo(BigInteger.ONE) == 0)return (B);
        BigInteger dos = new BigInteger("2");
        if(A.mod(dos).compareTo(BigInteger.ZERO) != 0) return(B.add(multiplicacionRusa( A.divide(new BigInteger("2")) , B.multiply(new BigInteger("2")))));
        return(multiplicacionRusa(A.divide(new BigInteger("2")) , B.multiply(new BigInteger("2"))));
    }

    public BigInteger[] multiplicacionEgipcia(BigInteger n, BigInteger m, BigInteger doble1) {

        BigInteger[] ps = new BigInteger[2];

        if (doble1.compareTo(m) == 1) {
            ps[0] = BigInteger.ZERO;
            ps[1] = BigInteger.ZERO;
            return ps;
        }

        if (doble1.compareTo(m) != 1) {
            ps = multiplicacionEgipcia(n, m, doble1.multiply(new BigInteger("2")));
            if (ps[1].add(doble1).compareTo(m) != 1) {
                BigInteger[] aux = {(ps[0].add((n.multiply(doble1)))), ps[1].add(doble1)};
                return aux;
            } else {
                return ps;
            }
        }
        return ps;
    }

    public BigInteger multiplicacionEgipcia(BigInteger n, BigInteger m) {
        BigInteger[] ps = multiplicacionEgipcia(n, m, BigInteger.ONE);
        return ps[0];
    }
    
}
