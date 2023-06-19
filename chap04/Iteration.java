import java.util.Scanner;

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

// 사용자 입력숫자 각자리 합 구하기
class Iteration6 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        System.out.print("숫자를 입력하시오 (ex. 12345) >>> ");

        Scanner scanner = new Scanner(System.in);
        String userData = scanner.nextLine();

        num = Integer.parseInt(userData);

        // num % 10 -> 마지막자리 출력
        // num / 10 -> 마지막자리 제거
        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수 합 : " + sum);
    }
}

// 4. Do-while문
class Iteration7 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        // 1~100 난수 저장
        answer = (int)(Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하시오 >>> ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은수로 다시 시도하시오.");
            } else if (input < answer) {
                System.out.println("더 큰수로 다시 시도하시오.");
            }
        } while (input != answer);

        System.out.println("정답입니다!");
    }
}

// 5. break문
class Iteration8 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) { // 무한반복
            if (sum > 100) // 조건문 + break문 -> 무한반복 벗어남
                break;

            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}

// 6. continue문
class Iteration9 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) { // 무한반복문
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴 (1 ~ 3)를 선택하시오 (종료 : 0) >>> ");

            String userData = scanner.nextLine();
            menu = Integer.parseInt(userData);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (! (1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
                continue;
            }

            System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
        }
    }
}

// 7. 이름붙은반복문
class Iteration10 {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1;
                }

                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}