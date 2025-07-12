package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInMonths implements AgeCalculator {
	public AgeInMonths() {
		super();
	}
	
	public Long age(Song song) {
		return ChronoUnit.MONTHS.between(song.getReleaseDate(), LocalDate.now());
	}
}
