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