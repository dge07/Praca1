public class Trapezy {
    public static double MojaFunkcja(double x) {
        return (0.3*x + 0.2)/(1.4-Math.cos(Math.pow(x,2) + 0.3));
    }
    public static double st(double x, double y, double n, double z) {
        return x + (z / n) * (y - x);
    }

}
