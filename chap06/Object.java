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