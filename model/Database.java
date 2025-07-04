package model;

import model.domain.StockInfo;

public class Database {
	
	private static StockInfo [] stock;
	
	static  {
		
		stock = new StockInfo []  {
				new StockInfo(001,"삼성전자","kosdaq",500,60000),
				new StockInfo(002,"LG전자","kosdaq",1000,90000),
				new StockInfo(0010,"SK하이닉스","kosdaq",2800,200000)
		};
		
	}
	StockInfo [] getStockInfo() {
		return stock;
	}
	
	
}
