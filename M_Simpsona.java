public class M_Simpsona extends  Thread {
    double granicaDolna, granicaGorna, n=10, wynik_Simpsona , wynik_Simpsona_FINAL = 0;

    M_Simpsona(double aGranicaDolna, double aGranicaGorna) {
        granicaDolna = aGranicaDolna;
        granicaGorna = aGranicaGorna;
    }


    @Override
    public void run() {
        Funkcja obiekt1 = new Funkcja();
        double dlugosc = (granicaGorna - granicaDolna) / n;
        double pom = 0, x;
        for (int i = 1; i < n + 1; i++) {
            x = granicaDolna + (i * dlugosc);
            pom += obiekt1.MojaFunkcja(x - dlugosc / 2);
            if (i < n) {
                wynik_Simpsona += obiekt1.MojaFunkcja(x);
            }
        }
        wynik_Simpsona = dlugosc / 6 * (obiekt1.MojaFunkcja(granicaDolna) + obiekt1.MojaFunkcja(granicaGorna) + (2 * wynik_Simpsona) + (4 * pom));
        System.out.println("M.Simspona: " + wynik_Simpsona);
        wynik_Simpsona_FINAL += wynik_Simpsona;
    }
    public String toString()
    {
        return wynik_Simpsona_FINAL + "";
    }
}
