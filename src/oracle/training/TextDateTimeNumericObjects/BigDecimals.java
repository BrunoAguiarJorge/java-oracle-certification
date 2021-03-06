package oracle.training.TextDateTimeNumericObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimals {
	public static void main(String[] args) {
		double price = 1.85;
		double rate = 0.065;
		price = price - price * rate;
		System.out.println(price);
		
		price = Math.round(price*100)/100.0;
		System.out.println("Primitive way of calculating = " + price);
		
		BigDecimal priceBigDecimals = BigDecimal.valueOf(1.85);
		BigDecimal rateBigDecimals = BigDecimal.valueOf(0.065);
		
		//setScale round up the decimals
		priceBigDecimals = priceBigDecimals.subtract(priceBigDecimals.multiply(rateBigDecimals))
		.setScale(2,RoundingMode.HALF_UP);
		System.out.println("Big Decimals = " + priceBigDecimals);
	}
}
