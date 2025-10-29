public class ternary4 {
    public static void main(String[] args) {
        int a = 15, b = 20, c = 10;
        int largest = (a>b)?((a>c)? a:c):((b>c)?b:c);
        System.out.println("largest number is: "+largest);
    }
}
