// 1. if문
class ConditionalStatement1 {
    public static void main(String[] args) {
        int score = 80;

        if (score > 60) {
            System.out.println("합격");
        }
    }
}

// 2. 다양한조건식
class ConditionalStatement2 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x = %d일때, 참인 것은%n", x);

        if (x == 0) System.out.println("x == 0");
        if (x != 0) System.out.println("x != 0");
        if (! (x == 0)) System.out.println("! (x == 0)");
        if (! (x != 0)) System.out.println("! (x != 0)");

        x = 1;
        System.out.printf("x = %d일때, 참인 것은%n", x);

        if (x == 0) System.out.println("x == 0");
        if (x != 0) System.out.println("x != 0");
        if (! (x == 0)) System.out.println("! (x == 0)");
        if (! (x != 0)) System.out.println("! (x != 0)");
    }
}