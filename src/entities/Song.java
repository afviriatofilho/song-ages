package entities;

import java.time.LocalDate;

public class Song {
	private String name;
	private LocalDate releaseDate;
	
	public Song() {
	}

	public Song(String name, LocalDate releaseDate) {
		this.name = name;
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}
}
