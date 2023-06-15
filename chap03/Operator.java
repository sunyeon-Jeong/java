// 1. 연산자결합규칙
class Operator1 {
    public static void main(String[] args) {
        int x, y;

        // (대입)연산순서 : 오른쪽 -> 왼쪽
        x = y = 3;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// 2. 증감연산자
class Operator2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        // 후위형
        j = i++;
        System.out.println("j = i++; 실행 후, i = " + i + " j = " + j);

        // 값 초기화
        i = 5;
        j = 0;

        // 전위형
        j = ++i;
        System.out.println("j = ++i; 실행 후, i = " + i + " j = " + j);
    }
}

class Operator3 {
    public static void main(String[] args) {
        int i = 5, j = 5;

        // 후위형 : i값 출력 -> 1증가
        System.out.println(i++);

        // 전위형 : j값 1 증가 -> 출력
        System.out.println(++j);

        // 한번 출력 후 -> i값 증가됨
        System.out.println("i = " + i + " j = " + j);
    }
}

class Operator4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // + 연산자 하는일 없음
        System.out.println(i);

        i = -10;
        i = -i; // - 연산자 -> 부호변경
        System.out.println(i);
    }
}