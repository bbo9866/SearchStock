package view;

import model.Stock;

public class SuccessView {
    public static void printStock(Stock stock) {
        System.out.println("\n** 주식 정보 **");
        System.out.println(stock);
    }

    public static void printStocks(Stock[] stocks) {
        System.out.println("\n** 전체 주식 목록 **");
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }
}