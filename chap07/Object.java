//  객체지향②
// #1. 상속
// 조상클래스
class Tv {
    // 멤버(인스턴스)변수
    boolean power;
    int channel;

    // 멤버메서드
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

// 자손클래스
class SmartTv extends Tv {
    // 멤버(인스턴스)변수
    boolean caption;

    // 멤버메서드
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

class Object1 {
    public static void main(String[] args) {
        // 객체생성
        SmartTv smartTv = new SmartTv();

        // 객체멤버초기화
        smartTv.channel = 10; // 조상클래스로부터 상속받은 멤버
        smartTv.channelUp(); // 조상클래스로부터 상속받은 메서드 실행
        System.out.println(smartTv.channel);

        smartTv.caption = true;
        smartTv.displayCaption("Hello, mallang!");
    }
}

// #2. 오버라이딩
// 조상클래스
class Point {
    // 멤버(인스턴스)변수
    int x, y;

    // 멤버메서드
    String getLocation() {
        return "x : " + x + ", y : " + y; // 2차원
    }
}