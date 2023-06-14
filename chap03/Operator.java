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