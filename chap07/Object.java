// import static java.lang.System.out;
// import static java.lang.Math.*;

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

// #6. static import문
class Object5 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        // out.println(random());

        // System.out.println("Math.PI : " + Math.PI);
        // out.println("Math.PI : " + PI);
    }
}

// #7. 캡슐화
class Capsule {
    // 멤버(인스턴스)변수 -> private 선언
    private int age;
    private String name;

    // 접근제한없는 메서드 -> 멤버(인스턴스)변수 간접적접근 유도
    public int getAge() { // 값 읽는 getter
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) { // 값 변경하는 setter
        this.age = age;
    }

    // 공백확인(조건, 유효성검사)메서드
    // Capsule 클래스 내에서만 사용 -> private 선언
    private boolean checkName(String name) {
        return name.length() > 0; // 만족하면 True 반환
    }

    public void setName(String name) {
        this.name = checkName(name) ? name : "Null";
    }
}

class Object6 {
    public static void main(String[] args) {
        // 객체생성
        Capsule capsule = new Capsule();
        // capsule.age; -> private라서 접근불가
        // capsule.name; -> private라서 접근불가
        // 직접접근이 아닌, 간접접근으로 해결 "메서드를 통한 접근"

        capsule.setAge(22);
        capsule.setName("mallang");

        System.out.println("capsule.getName() = " + capsule.getName());
        System.out.println("capsule.getAge() = " + capsule.getAge());

        // 유효성검사 예외
        capsule.setName("");
        System.out.println("capsule.getName() = " + capsule.getName());
    }
}

// #8. 다형성
class Mammalia {
    // 포유류는 새끼를 낳고 수유를 한다
    public void giveFeed() {
        System.out.println("모유수유를 합니다");
    }

    public void giveBirth() {
        System.out.println("새끼를 낳습니다");
    }
}

class Whale extends Mammalia {
    // 고래는 포유류이면서 바다에 살며 수영이 가능하다

    // 자손클래스 메서드
    public void swimming() {
        System.out.println("수영을 합니다");
    }

    // 조상클래스(상속받은) 메서드 오버라이딩
    @Override
    public void giveFeed() {
        System.out.println("고래는 모유수유를 합니다");
    }

    @Override
    public void giveBirth() {
        System.out.println("고래는 새끼를 낳습니다");
    }
}

class Object7 {
    public static void main(String[] args) {
        // 조상타입 참조변수 -> 자손타입 인스턴스참조 가능
        Mammalia mammalia = new Whale();

        // 조상클래스로부터 상속받은 멤버만 사용가능
        mammalia.giveFeed();
        mammalia.giveBirth();
    }
}