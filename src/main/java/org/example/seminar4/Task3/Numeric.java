package org.example.seminar4.Task3;

/**
 * Numeric
 */
public class Numeric<T extends Number> {

    T Tnum;

    Numeric(T n) {
        Tnum = n;
    }

    double getRec() {
        return 1 / Tnum.doubleValue();
    }

    double getFrac() {
        return Tnum.doubleValue() - Tnum.intValue();
    }

    /**
     * проверить равенство абсолютного значения, ? - метасимфол, который
     * соотвествует любому значению из класса Numeric
     * 
     * @param ob
     * @return
     */
    boolean absEqual(Numeric<?> ob) {
        if (Math.abs(Tnum.doubleValue()) == Math.abs(ob.Tnum.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }
}

class Gen3 {
    public static void main(String[] args) {
        Numeric<Integer> iob;
        iob = new Numeric<Integer>(5);

        Numeric<Double> dob;
        dob = new Numeric<Double>(5.25);

        Numeric<Long> lob;
        lob = new Numeric<Long>(5l);

        System.out.println("iob and dob: " + iob.absEqual(dob));
        System.out.println("iob and lob: " + iob.absEqual(lob));
    }
}
