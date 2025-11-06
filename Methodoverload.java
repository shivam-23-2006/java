public class Methodoverload {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Methodoverload j = new Methodoverload();
        j.add(120, 230);
        j.add(2340, 520);
        j.add(120, 12.350);
    }
}
