package controller;
import lombok.Getter;
import model.Model;
import model.Stock;
import view.FailView;
import view.SuccessView;

@Getter
public class Controller {
	
	//사용자 입력 수신
	public static void printAllStocks() {
		Stock[] stocks = Model.searchAll();
		if(stocks.length != 0) {
			SuccessView.printStocks(stocks);
		}else {
			//?
		}
	}
	
	//코드 데이터 수신
	public static void getStockInfoByCode(int code) {
		Stock stock = null;
		try {
			stock = Model.searchByCode(code);
			SuccessView.printStock(stock);
		} catch (Exception e){
			e.printStackTrace();
			FailView.print(e.getMessage());
		}
	}
	//이름 데이터 수신
	public static void getStockInfoByName(String name) {
		Stock stock = null;
		try {
			stock = Model.searchByName(name);
			SuccessView.printStock(stock);
		} catch (Exception e){
			e.printStackTrace();
			FailView.print(e.getMessage());
		}
	}
}