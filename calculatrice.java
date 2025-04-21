public class calculatrice {
    int multiplication(int x, int y) {
        return x * y;
    }

    int addition(int x, int y) {
        return x + y;
    }

    float division(int x, int y) {
        return x / y;
    }

    int soustraction(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        calculatrice r = new calculatrice();
        int a = r.multiplication(2, 4);
        float b = r.division(5, 2);
        int c = r.addition(100, 200);
        int d = r.soustraction(38, 90);
        System.out.println("x fois y = " + a);
        System.out.println("x divise par y = " + b);
        System.out.println("x plus y = " + c);
        System.out.println("x moins y = " + d);

    }
}