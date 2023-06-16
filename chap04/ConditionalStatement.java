import java.util.Scanner;

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

// 3. if-else문
class ConditionalStatement3 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하시오 >>>");

        // 사용자입력값 받기 위한 객체생성
        Scanner scanner = new Scanner(System.in);
        // 사용자입력값 -> int타입으로 변수에저장
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }
}

// 4. if-else if문
class ConditionalStatement4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하시오 >>> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}

// 5. 중첩 if문
class ConditionalStatement5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하시오 >>> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';

            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';

            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}

// 6. switch문
class ConditionalStatement6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하시오 >>> ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;

            case 6: case 7: case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;

            case 9: case 10: case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;

            default:
                System.out.println("현재 계절은 겨울입니다.");
                // default -> break문 생략가능
        }
    }
}

// 7. Math.random() 난수
class ConditionalStatement7 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 5; i++) {
            // 1이상 7이하 난수생성 -> 5번 반복
            num = (int)(Math.random() * 6) + 1;
            System.out.println(num);
        }
    }
}