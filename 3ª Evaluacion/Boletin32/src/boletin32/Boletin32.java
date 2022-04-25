package boletin32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Boletin32 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Barco> listaBarco;
        listaBarco = new ArrayList<>();
        int o = 0;
         Velero vl = new Velero(2, 6, "1111");
         Deportivas dp = new Deportivas(175, 5, 6, "2222");
         Yates yt = new Yates(230, 2, 5, 16, "3333");
         listaBarco.add(vl);
         listaBarco.add(dp);
         listaBarco.add(yt);

        do {
            
            System.out.println("-----Alquilar Barco----- \n"
                    + "1- Velero \n"
                    + "2- Deportivo \n"
                    + "3- Yate \n"
                    + "4- SALIR");
            o = Integer.parseInt(br.readLine());
            switch (o) {

                case 1:
                   vl.calcularPrecio();
                    break;

                case 2:
                    dp.calcularPrecio();
                    break;

                case 3:
                    yt.calcularPrecio();
                    break;
                    

            }
        } while (o>=1 && o<=3);
    }

}
