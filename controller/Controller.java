package controller;


public class Controller {
	private static final Model model = Model.getModel();
	//사용자 입력 수신
	public static void printAllStocks() {
		Stock[] stocks = null;
		stocks = model.searchAll();
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
