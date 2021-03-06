package oracle.training.TextDateTimeNumericObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class BigDecimalFormattingNumber {
	public static void main(String[] args) {
		// FORMATTING NUMBERS currency and percentage
		Locale locale = Locale.ITALY;

		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);

		percentFormat.setMaximumFractionDigits(2);

		double price = 1.85;
		System.out.println("Print the price BEFORE discount = " + price);

		double rate = 0.065;
		System.out.println("Print the RATE for discount = " + rate);
		price = price - price * rate;
		System.out.println("Print the price AFTER discount = " + price);

		price = Math.round(price * 100) / 100.0;
		System.out.println("Primitive way of calculating = " + price);

		BigDecimal price1 = BigDecimal.valueOf(1.85);
		BigDecimal rate1 = BigDecimal.valueOf(0.065);

		// setScale round up the decimals
		price1 = price1.subtract(price1.multiply(rate1)).setScale(2, RoundingMode.HALF_UP);
		System.out.println("Big Decimals = " + price1);

		System.out.println("Currency formatted = " + currencyFormat.format(price));
		System.out.println("Percentage formatted = " + percentFormat.format(rate));

	}
}
