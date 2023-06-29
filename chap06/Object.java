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