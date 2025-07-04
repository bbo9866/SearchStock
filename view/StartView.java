package view;

import controller.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartView {

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n==== 주식 검색 프로그램 ====");
                System.out.println("1. 주식 전체 검색");
                System.out.println("2. 종목 코드로 검색");
                System.out.println("3. 회사 이름으로 검색");
                System.out.println("4. 끝");
                System.out.print("번호를 입력하세요: ");
                int choice = sc.nextInt();
                sc.nextLine(); // buffer clear

                switch (choice) {
                    case 1 -> Controller.printAllStocks();
                    case 2 -> {
                        System.out.print("종목 코드를 입력하세요: ");
                        int code = sc.nextInt();
                        sc.nextLine(); // buffer clear
                        Controller.getStockInfoByCode(code);
                    }
                    case 3 -> {
                        System.out.print("회사 이름을 입력하세요: ");
                        String name = sc.nextLine();
                        Controller.getStockInfoByName(name);
                    }
                    case 4 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("입력 형식 오류. 숫자나 문자열 형식을 확인해주세요.");
                sc.nextLine(); // buffer clear
            }
        }
    }
}
