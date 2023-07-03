// 객체지향(1)

// #1. 객체의 생성과 사용
// TV 클래스
class Tv {
    // 멤버변수 (속성)
    String color; // null 초기화
    boolean power; // false 초기화
    int channel; // 0 초기화

    // method(기능)
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class Object1 {
    public static void main(String[] args) {
        // 객체생성
        Tv t = new Tv();

        // 객체사용
        t.channel = 7; // Tv 객체 t -> 멤버변수 초기화
        t.channelDown(); // Tv 객체 t -> 메서드 사용

        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

class Object2 {
    public static void main(String[] args) {
        // 객체생성
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        // 객체 생성 후 -> 기본 초기화
        System.out.println("t1의 channel 값 : " + t1.channel);
        System.out.println("t2의 channel 값 : " + t2.channel);

        // 객체 멤버변수 재초기화
        // 객체 멤버변수 : 서로 다른 값 유지가능
        t1.channel = 10;
        t2.channelUp();

        System.out.println("t1의 현재 channel 값 : " + t1.channel);
        System.out.println("t2의 현재 channel 값 : " + t2.channel);
    }
}

// #2. 클래스변수와 인스턴스변수
// Card 클래스
class Card {
    String kind; // 멤버변수_인스턴스변수 (카드무늬)
    int number; // 멤버변수_인스턴스변수 (숫자)

    static int width = 100; // 멤버변수_클래스변수
    static int height = 250; // 멤버변수_클래스변수
}

class Object3 {
    public static void main(String[] args) {
        // 클래스변수 -> 객체생성없이 바로 사용가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        // 인스턴스변수 -> 선 객체 생성 후, 멤버변수 사용가능
        // 객체생성 후, 인스턴스변수 값저장
        Card card1 = new Card();
        card1.kind = "Heart";
        card1.number = 7;

        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 4;

        System.out.println("card1은 " + card1.kind + ", " + card1.number + "이며, 크기는 ("
                + card1.width + ", " + card1.height + ")");
        System.out.println("card2는 " + card2.kind + ", " + card2.number + "이며, 크기는 ("
                + card2.width + ", " + card2.height + ")");

        System.out.println("card1의 width와 height를 각각 50, 80으로 변경합니다.");
        card1.width = 50;
        card1.height = 80;

        System.out.println("card1은 " + card1.kind + ", " + card1.number + "이며, 크기는 ("
                + card1.width + ", " + card1.height + ")");
        System.out.println("card2는 " + card2.kind + ", " + card2.number + "이며, 크기는 ("
                + card2.width + ", " + card2.height + ")");
    }
}

// #3. 메서드실행흐름
// #3_1. 메서드를 정의한 클래스
class MyMath {
    // 덧셈
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    // 뺄셈
    long subtract(long a, long b) {
        long result = a - b;
        return result;
    }

    // 곱셈
    long multiply(long a, long b) {
        long result = a * b;
        return result;
    }

    // 나눗셈
    double divide(double a, double b) {
        double result = a / b;
        return result;
    }
}

class Object4 {
    public static void main(String[] args) {
        // 객체생성
        MyMath myMath = new MyMath();

        // 객체 메서드 호출
        long result1 = myMath.add(5L, 3L);
        long result2 = myMath.subtract(5L, 3L);
        long result3 = myMath.multiply(5L, 3L);
        double result4 = myMath.divide(5, 3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

// #4. 호출스택
class Object5 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
// main 메서드 -(위에)-> println 메서드
// println 메서드 종료 -> main 메서드 종료 -> 스택 Empty

// #5. 기본형매개변수
class Data {
    int x; // 멤버변수(인스턴스)
}

class Object6 {
    public static void main(String[] args) {
        // 객체생성
        Data data = new Data();

        // 인스턴스변수 초기화
        data.x = 10;
        System.out.println("main() : x = " + data.x);

        change(data.x); // 인스턴스변수 값 10 자치게 복사되어 전달됨

        System.out.println("After change(data.x)");
        System.out.println("main() : x = " + data.x);
    }

    // 메서드정의
    static void change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}

// #6. 참조형매개변수
class Data2 {
    int x; // 멤버변수(인스턴스변수)
}
