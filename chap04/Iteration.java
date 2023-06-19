// 1. for문
class Iteration1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello, Mallang!");
        }
    }
}

class Iteration2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.print(i); // 가로출력
        }

        System.out.println();
    }
}

class Iteration3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            // %2d -> 2자리 10진정수
            System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
        }
    }
}