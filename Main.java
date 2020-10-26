import java.io.Console;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double GranicaDolna = 0.2, GranicaGorna = 1.2;
        double h, odpowiedzSimspona = 0,odpowiedzTrapezy = 0,odpowiedzProstokaty=0;
        System.out.print("Podaj ilość n-ów, które bedziesz wczytywał: ");
        Scanner scanner = new Scanner(System.in);
        int liczbaN = scanner.nextInt();


        for (int j = 0; j < liczbaN; j++) {


            System.out.print("Podaj wartosc n: ");
            int n = scanner.nextInt();
            h = (GranicaGorna - GranicaDolna) / n;
            //Metoda Simpsona
            for (int i = 1; i < n; i++) {
                odpowiedzSimspona = odpowiedzSimspona + 2 * Simpsonaa.MojaFunkcja(Simpsonaa.st(GranicaDolna, GranicaGorna, n, i))
                        + 4 * Simpsonaa.MojaFunkcja(Simpsonaa.pom(Simpsonaa.st(GranicaDolna, GranicaGorna, n, i - 1), Simpsonaa.st(GranicaDolna,
                        GranicaGorna, n, i)));
            }

            odpowiedzSimspona = odpowiedzSimspona + Simpsonaa.MojaFunkcja(GranicaDolna) + Simpsonaa.MojaFunkcja(GranicaGorna)
                    + 4 * Simpsonaa.MojaFunkcja(Simpsonaa.pom(Simpsonaa.st(GranicaDolna, GranicaGorna, n, n - 1), Simpsonaa.st(GranicaDolna,
                    GranicaGorna, n, n)));
            odpowiedzSimspona = odpowiedzSimspona * h / 6;
            System.out.println("|METODA SIMSPONA| Wynik dla n = " + n + " wynosi " + odpowiedzSimspona);
            System.out.println();

            //Metoda Trapezow


            for (double i = 1; i < liczbaN; i++) {
                odpowiedzTrapezy = odpowiedzTrapezy + Trapezy.MojaFunkcja(Trapezy.st(GranicaDolna, GranicaGorna, liczbaN, i));
            }
            odpowiedzTrapezy = odpowiedzTrapezy + (Trapezy.MojaFunkcja(GranicaDolna) / 2) + (Trapezy.MojaFunkcja(GranicaGorna) / 2);
            odpowiedzTrapezy = odpowiedzTrapezy * h;
            System.out.println("|METODA TRAPEZOW| Wynik dla n = " + n + " wynosi " + odpowiedzTrapezy);
            System.out.println();

            //Metoda Prostokatow
            double dx;


            dx = (GranicaGorna - GranicaDolna) / n;

            odpowiedzProstokaty = 0;
            for (int i = 1; i <= n; i++) {
                odpowiedzProstokaty += Prostokaty.MojaFunkcja(GranicaDolna + i * dx);
            }
            odpowiedzProstokaty *= dx;

            System.out.println("|METODA PROSTOKATOW| Wynik dla n = " + n + " wynosi " + odpowiedzProstokaty);
            System.out.println();
        }




    }




}



