package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculatorMonths implements AgeCalculator {
	public AgeCalculatorMonths() {
		super();
	}
	
	public Long age(Song song) {
		return ChronoUnit.MONTHS.between(song.getReleaseDate(), LocalDate.now());
	}
}
