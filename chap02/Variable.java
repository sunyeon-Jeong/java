import java.util.Scanner;

// 1. 입출력
class Variable1 {
    public static void main(String[] args) {
        System.out.print("Hello, Mallang!");
        System.out.print("It's Java world.");
    }
}

class Variable2 {
    public static void main(String[] args) {
        System.out.println("Hello, Mallang!");
        System.out.println("It's Java world.");
    }
}

class Variable3 {
    public static void main(String[] args) {
        // Scanner 클래스 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 자리 정수를 입력하라 : ");

        // 입력내용 -> input 변수에 저장 (string type)
        String input = scanner.nextLine();
        // string type input변수 -> int type으로 변환
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}