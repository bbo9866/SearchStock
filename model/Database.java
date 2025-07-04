package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter


public class Database {

	public static Stock[] StockData;

	static {
			StockData  = new Stock[] {
				new Stock(100, "삼성전자", 10000, 5.00, "Kospi"),
				new Stock(200, "LG전자", 20000, 10.00, "Kospi"),
				new Stock(300, "쿠팡", 30000, 20.00, "Nasdaq"),
				new Stock(400, "네이버", 15000, -3.50, "Kosdaq"),
				new Stock(500, "테슬라", 80000, 12.75, "Nasdaq")
		};
	}
	
	Stock [] getStock() {
		return StockData;
	}
}
