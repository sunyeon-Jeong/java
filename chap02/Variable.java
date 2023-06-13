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

// 2. 변수선언
class Variable4 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        // 기존 x 값 지워짐
        x = 10;
        System.out.println(x);
    }
}

// 3. 변수타입
class Variable5 {
    public static void main(String[] args) {
        int x = 100;
        double pi = 3.14;
        char ch = 'a';
        String str = "abc";

        System.out.println(x);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(str);
    }
}

// 4. 문자열결합
class Variable6 {
    public static void main(String[] args) {
        String name = "Ja" + "va"; // Java
        String str = name + 19; // Java19

        System.out.println(name);
        System.out.println(str);

        // 숫자형 + 문자열 -> 문자열
        System.out.println(22 + " ");
        System.out.println(22 + "");

        // 덧셈 순서에 따라 다른 결과값
        System.out.println(20 + 2 + ""); // String 22
        System.out.println("" + 2 + 2); // String 22
    }
}

// 5. 두 변수 값 바꾸기
class Variable7 {
    public static void main(String[] args) {
        int x = 10, y = 5;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // 1. x -> trans
        int trans = x;
        // 2. y -> x
        x = y;
        // 3. trans -> y
        y = trans;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// 6. 타입간변환
class Variable8 {
    public static void main(String[] args) {
        String str = "3";

        // 문자열 -> 문자 -> 숫자
        System.out.println(str.charAt(0));
        // 문자 -> 숫자
        System.out.println('3' - '0'+ 1);
        // 문자열 -> 숫자
        System.out.println(Integer.parseInt("3") + 1);
        // 문자열 + 문자열
        System.out.println("3" + 1);
        // 숫자 -> 문자
        System.out.println((char) (3 + '0'));
    }
}