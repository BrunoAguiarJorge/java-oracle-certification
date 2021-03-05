package oracle.training.TextDateTimeNumericObjects;

import java.time.LocalDate;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("localdata " + currentDate);
		
		ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
		System.out.println("localdata " + losAngeles);
		

	}

}
