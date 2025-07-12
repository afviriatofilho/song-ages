package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculatorYears implements AgeCalculator {
	public AgeCalculatorYears() {
		super();
	}
	
	public Long age(Song song) {
		return ChronoUnit.YEARS.between(song.getReleaseDate(), LocalDate.now());
	}
}
