import java.util.ArrayList;

public class Funkcja {
    double MojaFunkcja(double x) {

        return (0.3 * x + 0.2) / (1.4 - Math.cos(Math.pow(x, 2) + 0.3));

    }

    public static void main(String[] args) {
        ArrayList<Thread> lista_watkow = new ArrayList<Thread>();
        //przedzial calkowania <a,b> = <0,2;1,2>
        lista_watkow.add(new M_Simpsona(0.2,0.4));
        lista_watkow.add(new M_Simpsona(0.4,0.6));
        lista_watkow.add(new M_Simpsona(0.6,0.8));
        lista_watkow.add(new M_Simpsona(1.0,1.2));
        lista_watkow.add(new M_Trapezow(0.2,0.4));
        lista_watkow.add(new M_Trapezow(0.4,0.6));
        lista_watkow.add(new M_Trapezow(0.6,0.8));
        lista_watkow.add(new M_Trapezow(1.0,1.2));
        lista_watkow.add(new M_Prostokatow(0.2,0.4));
        lista_watkow.add(new M_Prostokatow(0.4,0.6));
        lista_watkow.add(new M_Prostokatow(0.6,0.8));
        lista_watkow.add(new M_Prostokatow(1.0,1.2));

        //obsluga bledow
        for (Thread thread : lista_watkow) {
            thread.start();
        }
        try {
            for (Thread thread : lista_watkow) {
                thread.join();
            }
        } catch (InterruptedException e) {

            System.out.println("" + e);
        }
        System.out.println();
    }



}

