package oracle.training.TextDateTimeNumericObjects;

import java.text.MessageFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateAndTimeFormat {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		Locale locale = Locale.ENGLISH;

		// Get this day of next year
		today.plusYears(1).getDayOfYear();
		System.out.println("This day next year = " + today.plusYears(1).getDayOfWeek());

		// get the timeGap between now and teaTime
		LocalTime teaTime = LocalTime.of(17, 30);
		Duration timeGap = Duration.between(LocalTime.now(), teaTime);

		// get the time in min
		System.out.println("Minutes to tea = " + timeGap.toMinutes());
		// get the time in hours
		System.out.println("Hours to tea = " + timeGap.toHours());
		// get the time in hours
		System.out.println(timeGap.toMinutesPart());
		System.out.println(timeGap);

		// Get tea time of other days.
		LocalDateTime tomorrowTeaTime = LocalDateTime.of(LocalDate.now().plusDays(1), teaTime);
		System.out.println("Tomorrow tea time = " + tomorrowTeaTime);

		
		ZoneId katmandu = ZoneId.of("Asia/Katmandu");
		ZoneId london = ZoneId.of("Europe/London");

		ZonedDateTime katmanduTime = ZonedDateTime.of(tomorrowTeaTime, katmandu);
		System.out.println("Tomorrow tea time in Katmandu = " + katmanduTime);

		//formatting date 
		String datePattern = "EE', 'd' of 'MMM yyyy' at 'HH:mm z";
		DateTimeFormatter dateFormatt = DateTimeFormatter.ofPattern(datePattern, locale);
		
		String timeTxt = dateFormatt.format(katmanduTime); 
		System.out.println("Katmandu time formated = " + timeTxt);
		
		// Fecthing bundle from Message.properties file
		ResourceBundle msg = ResourceBundle.getBundle("messages", locale);
		String product = "cafe";
		double price = 10.0;
		double discount = 6.5;
		LocalDate valid = today.plusYears(1);
		
		String offerPattern = msg.getString("offer");
		MessageFormat.format(offerPattern, price, discount, today);
		System.out.println(MessageFormat.format(offerPattern, product, price, discount, today, valid));
	}
}