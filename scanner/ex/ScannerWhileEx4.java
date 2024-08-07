package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    scanner.nextLine(); // 이전에 입력된 개행문자(\n) 제거

                    System.out.print("상품명을 입력하세요: ");
                    String product = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = scanner.nextInt();

                    System.out.println("상품명: " + product + " 가격: " + price + " 합계: " + price * quantity);
                    sumPrice += price * quantity;
                    break;
                case 2:
                    System.out.println("총 비용: " + sumPrice);
                    sumPrice = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
            if (option == 3) {
                break;
            }
        }
    }
}