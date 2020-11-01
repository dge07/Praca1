public class M_Trapezow extends Thread {
    double granicaDolna, granicaGorna, n=10, wynik_Trapezow, wynik_Trapezow_FINAL = 0;

    M_Trapezow(double aGranicaDolna, double aGranicaGorna) {
        granicaDolna = aGranicaDolna;
        granicaGorna = aGranicaGorna;
    }
    @Override
    public void run() {
        Funkcja obiekt2 = new Funkcja();

        double h = (granicaGorna - granicaDolna) / n;
        double[] tab = new double[100000];
        for (int i = 0; i < n; i++) {
            tab[i] = granicaDolna + (i * h);
        }
        for (int i = 0; i < n - 1; i++) {
            wynik_Trapezow += (obiekt2.MojaFunkcja(tab[i]) + obiekt2.MojaFunkcja(tab[i + 1]));
        }
        wynik_Trapezow *= h / 2;
        System.out.println("M.Trapezow: " + wynik_Trapezow);
        wynik_Trapezow_FINAL+=wynik_Trapezow;
    }
    public String toString()
    {
        return wynik_Trapezow_FINAL+"";
    }
}
