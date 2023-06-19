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

// 2. 중첩 for문
class Iteration4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 3. while문
class Iteration5 {
    public static void main(String[] args) {
        int i = 5; // 초기화

        while (i-- != 0) { // 조건식 (후위형)
            // 조건식에서 평가된 후 -> 1감소하여 i 출력됨
            System.out.println(i + " - I can do it!");
        }
    }
}