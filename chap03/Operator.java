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