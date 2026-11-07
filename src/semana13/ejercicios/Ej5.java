package semana13.ejercicios;

public class Ej5 {
    public static void main(String[] args) {
        try {
            System.out.println(7 / 0);
        } catch (Exception e) {
            System.out.println("a) " + e.getClass().getSimpleName());
        }

        try {
            Integer.parseInt("3.5");
        } catch (Exception e) {
            System.out.println("b) " + e.getClass().getSimpleName());
        }

        try {
            int[] a = new int[2];
            a[2] = 1;
        } catch (Exception e) {
            System.out.println("c) " + e.getClass().getSimpleName());
        }

        try {
            String s = null;
            s.toUpperCase();
        } catch (Exception e) {
            System.out.println("d) " + e.getClass().getSimpleName());
        }

        try {
            Object o = 10;
            String t = (String) o;
        } catch (Exception e) {
            System.out.println("e) " + e.getClass().getSimpleName());
        }

        try {
            System.out.println("f) " + (7.0 / 0));
        } catch (Exception e) {
            System.out.println("f) " + e.getClass().getSimpleName());
        }
    }
}
