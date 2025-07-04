package controller;
<<<<<<< HEAD
import lombok.Getter;
import model.Model;
import model.Stock;
import view.FailView;
import view.SuccessView;
@Getter
=======


>>>>>>> 475a0c2c587601275df6b514e123a789e2243c4f
public class Controller {
	private static final Model model = Model.getModel();
	//사용자 입력 수신
	public static void printAllStocks() {
		Stock[] stocks = null;
		stocks = model.searchAll();
<<<<<<< HEAD
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
=======
		successView.printStocks(stocks);
	}
	
	//코드 데이터 수신
	public static getStockInfoByCode(int code) {
		Stock stock = null;
		try {
			stock = model.searchByCode(code);
			SuccessView.print(stocks);
		} catch (Exception e){
			e.printStackTrace();
			FailView.print(e.getMassage());
		}
	}
	//이름 데이터 수신
	public static getStockInfoByName(String name) {
		Stock stock = null;
		try {
			stocks = model.searchByName(name);
			SuccessView.print(stocks);
		} catch (Exception e){
			e.printStackTrace();
			FailView.print(e.getMassage());
		}
	}
}
>>>>>>> 475a0c2c587601275df6b514e123a789e2243c4f
