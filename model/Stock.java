package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Stock {
		int code;
		String companyName;
		double price;
		double diffPrice;
		String market;
		
}