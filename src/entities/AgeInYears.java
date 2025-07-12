package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInYears implements AgeCalculator {
	public AgeInYears() {
		super();
	}
	
	public Long age(Song song) {
		return ChronoUnit.YEARS.between(song.getReleaseDate(), LocalDate.now());
	}
}
