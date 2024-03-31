//클래스 단위로 코딩을 한다
// 시작, 메인 클래스 -> main 메서드 가지고 있어야 함 (main(){})
// main 가지고 있는 클래스 부터 시작 -> JavaSE 프로그램

public class Calculator {
    public static void main(String[] args) {
        // Q. 두 개의 정수를 더하여 출력하는 자바 프로그램을 만들어 보자
        int a, b, sum;
        a = 8;
        b = 2;
        sum = a + b;
        // 출력 : sout(단축어)
        System.out.println(sum);
    }
}
