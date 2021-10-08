package exam_1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mon;
        System.out.print("값을 입력해주세요.(숫자 1~12) : ");
        mon = scanner.nextInt();
        switch (mon) {
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case  3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘 못 입력");
        }

    }
}
