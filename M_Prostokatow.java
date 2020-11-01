public class M_Prostokatow extends Thread {
    double granicaDolna, granicaGorna, n=10, wynik_Prostokatow, wynik_Prostokatow_FINAL = 0;

    M_Prostokatow(double aGranicaDolna, double aGranicaGorna) {
        granicaDolna = aGranicaDolna;
        granicaGorna = aGranicaGorna;
    }
    @Override
    public void run()
    {
        Funkcja obiekt3 = new Funkcja();
        double h = (granicaGorna - granicaDolna) / n;
        double calka = 0;
        for (int i=1; i<=n; i++) {
            calka += obiekt3.MojaFunkcja(granicaDolna + i * h);
        }
        calka *= h;
        System.out.println("M.Prostokatow: " + calka);
        wynik_Prostokatow_FINAL += calka;
    }
    public String toString()
    {
        return wynik_Prostokatow_FINAL + "";
    }
}
