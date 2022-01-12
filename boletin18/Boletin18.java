package boletin18;

import java.io.IOException;

/**
 *
 * @author dam1
 */
public class Boletin18 {

    public static void main(String[] args) throws IOException {

        ConversorTemperaturas ct = new ConversorTemperaturas();

        try {

            float auxTemp = ct.pedirTemperatura(0);
            if (auxTemp < ct.tempLim) {

                throw new TemperaturaErradaExcepcion(1);
            }
            System.out.println(ct.centigradosAFharenheit(auxTemp));
            ct.centigradosAReamur(auxTemp);

        } catch (TemperaturaErradaExcepcion tee) {
            System.out.println(tee.getMessage());

        }

    }

}
