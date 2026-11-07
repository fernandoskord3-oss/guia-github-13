package semana13.ejercicios;
public class PromedioMal {
    static int promedio(int[] notas) {
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    public static void main(String[] args) {
        int[][] grupos = { {8, 6, 10}, {}, {7} };
        for (int[] g : grupos) {
            System.out.println("Promedio: " + promedio(g));
        }
    }
}
