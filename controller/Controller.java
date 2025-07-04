package controller;
import lombok.Getter;
import model.Model;
import model.Stock;
import view.FailView;
import view.SuccessView;
@Getter
public class Controller {
	private static final Model model = Model.getModel();
	//사용자 입력 수신
	public static void printAllStocks() {
		Stock[] stocks = null;
		stocks = model.searchAll();
		SuccessView.printStocks(stocks);
	}
	
	//코드 데이터 수신
	public static void getStockInfoByCode(int code) {
		Stock stock = null;
		try {
			stock = model.searchByCode(code);
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
			stock = model.searchByName(name);
			SuccessView.printStock(stock);
		} catch (Exception e){
			e.printStackTrace();
			FailView.print(e.getMessage());
		}
	}
}