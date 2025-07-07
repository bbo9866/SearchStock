package model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model {
	
	private static Model model = new Model();
	
	private Model() {}
	
	public static Model getModel( ) {
		return model;
	}
	
	// 모든 종목 출력 쿼리 파라미터는 없음
	public static Stock[] searchAll() {
		return Database.stockData;
	}
	
	// 종목코드로 조회할 때 사용할 메서드, 파라미터는 종목코드 하나
	public static Stock searchByCode(int stockCode) throws Exception {
		Stock[] stockList = Database.stockData;
		
		for (int i = 0; i < stockList.length; i++) {
			if (stockList[i].code == stockCode) {
				return stockList[i];
			}
		}
		
		throw new Exception("일치하는 주식이 없습니다.");
	}
	
	// 종목명으로 조회할 때 사용할 메서드, 파라미터는 종목명 하나
	public static Stock searchByName(String stockName) throws Exception{
		Stock[] stockList = Database.stockData;
		
		Stock findingStock = null;
		for(int i = 0; i < stockList.length;i++) {
			
			if(stockList[i].companyName.equals(stockName)) {
				findingStock = stockList[i];
				return findingStock;
			}
		}
		
		throw new Exception ("일치하는 주식이 없습니다.");
	}
	
}