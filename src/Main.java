public class Main
{
    public static void main(String[] args) {
        System.out.println("Самостоятельное задание до сессии с экспертом");
        byte a = 10;
        float b = 8.50f;
        float c = 9.45f;
        boolean delta = (a - b) > (a - c);
        if(delta) {
            System.out.println(c + " ближе к " + a);
        }
        else {
            System.out.println(b + " ближе к " + a);
        }
    }
}