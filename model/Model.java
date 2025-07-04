package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model {
	
	private static Model model = new Model();
	
	private Model( ) {}
	
	public static Model getModel( ) {
		return model;
	}

	// 모든 종목 출력 쿼리 파라미터는 없음
	public static Stock[] searchAll() {
		Stock[] stockList = Database.StockData;
		return stockList;

//		System.out.println("모든 주식 정보는 아래와 같습니다.");

//		for(int i = 0; i < stockList.length;i++) {
//			Stock findingStock = stockList[i];

//			System.out.println("\n##### " + (i + 1) + "번째 주식 정보 #####" + findingStock.companyName);
//			System.out.println("  * 주식이름: " + findingStock.companyName);
//			System.out.println("  * 주가: " + findingStock.price);
//			System.out.println("  * 상장된 시장: " + findingStock.market);
//			System.out.println("  * 종목 코드는: " + findingStock.code);
//			System.out.println("  * : " + findingStock.diffPrice);
//		}

	}

	// 종목코드로 조회할 때 사용할 메서드, 파라미터는 종목코드 하나
	public static Stock searchByCode(int stockCode) throws Exception {
		Stock[] stockList = Database.StockData;

		Stock findingStock = null;
		for (int i = 0; i < stockList.length; i++) {
			if (stockList[i].code == stockCode) {
				findingStock = stockList[i];
				return findingStock;
			}
		}
		throw new Exception("일치하는 주식이 없습니다.");
	}
//		if(findingStock != null) {
//			System.out.println("입력한 종목코드는> " + stockCode + "입니다.");
//			System.out.println("찾으시는 주식 정보는 아래와 같습니다.");
//			System.out.println("  * 주식이름: " + findingStock.companyName);
//			System.out.println("  * 주가: " + findingStock.price);
//			System.out.println("  * 상장된 시장: " + findingStock.market);
//			System.out.println("  * 종목 코드는: " + findingStock.code);
//			System.out.println("  * : " + findingStock.diffPrice);
//		}
//		else {
//			System.out.println("찾으시려는 주식 정보가 없습니다.");
//			// fail뷰로 넘기는 메서드 추가되면 입력.
//		}

	

	// 종목명으로 조회할 때 사용할 메서드, 파라미터는 종목명 하나
	public static Stock searchByName(String stockName) throws Exception{
		Stock[] stockList = Database.StockData;
		
		Stock findingStock = null;
		for(int i = 0; i < stockList.length;i++) {
			
			if(stockList[i].companyName.equals(stockName)) {
				findingStock = stockList[i];
				return findingStock;
			} 
		}
		throw new Exception ("일치하는 주식이 없습니다.");
	}

	
//		if(findingStock != null) {
//			System.out.println("입력한 종목명은> " + stockName + "입니다.");
//			System.out.println("찾으시는 주식 정보는 아래와 같습니다.");
//			System.out.println("  * 주식이름: " + findingStock.companyName);
//			System.out.println("  * 주가: " + findingStock.price);
//			System.out.println("  * 상장된 시장: " + findingStock.market);
//			System.out.println("  * 종목 코드는: " + findingStock.code);
//			System.out.println("  * : " + findingStock.diffPrice);
//		}
//		else {
//			System.out.println("찾으시려는 주식 정보가 없습니다.");
//			// fail뷰로 넘기는 메서드 추가되면 입력.
//		}



}