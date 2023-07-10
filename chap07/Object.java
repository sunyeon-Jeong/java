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

// 자손클래스
class Point3D extends Point {
    // 자손 멤버(인스턴스)변수
    int z;

    // 메서드 오버라이딩
    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z; // 3차원 (자손에 맞게 변경)
    }
}

class Object2 {
    public static void main(String[] args) {
        // 객체생성
        Point3D point3D = new Point3D();

        // 객체멤버초기화
        point3D.x = 10;
        point3D.y = 20;
        point3D.z = 30;

        // 오버라이딩메서드 실행
        System.out.println(point3D.getLocation());
    }
}

// #3. 오버로딩과 오버라이딩
class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    void parentMethod() {} // 오버라이딩

    void parentMethod(int i) {} // 오버로딩 (매개변수 type)

    void childMethod() {}

    void childMethod(int i) {} // 오버로딩 (매개변수 type)
}

// #4. 참조변수-super
class Parent2 {
    // 조상클래스 -> 멤버(인스턴스)변수
    int x = 10;
}

class Child2 extends Parent2 {
    // 자손클래스 -> 멤버(인스턴스)변수
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x); // class내 자기자신
        System.out.println("super.x = " + super.x); // 조상class 멤버변수
    }
}

class Object3 {
    public static void main(String[] args) {
        // 객체생성
        Child2 child2 = new Child2();
        // 메서드실행
        child2.method();
    }
}

// #5. 조상클래스 생성자-super()
class Point2 {
    // 조상클래스 -> 멤버(인스턴스)변수
    int x, y;

    // 생성자
    Point2 (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point2 {
    // 자손클래스 -> 멤버(인스턴스)변수
    int z;

    // 생성자
    Point3D2 (int x, int y, int z) {
        super(x, y); // 조상생성자 호출 Point2(int x, int y) {}
        this.z = z;
    }
}

class Object4 {
    public static void main(String[] args) {
        // 객체생성
        Point3D2 point3D2 = new Point3D2(1, 2, 3);
        System.out.println("x = " + point3D2.x + ", y = " + point3D2.y + ", z = " + point3D2.z);
    }
}