package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.AgeCalculator;
import entities.AgeInMonths;
import entities.AgeInYears;
import entities.Song;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Song> songs = new ArrayList<>();
		
		System.out.println("Welcome to Song Age Calculator. Please input the data for five songs:");
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("-- Song #%d --\n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Date of release (DD/MM/YYYY): ");
			LocalDate dateOfRelease = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			songs.add(new Song(name, dateOfRelease));
			System.out.println();
		}
		
		System.out.print("Please select whether to output the songs' ages in months (m) or years (y): ");
		char unit = sc.nextLine().charAt(0);
		
		for (Song s : songs) {
			if (unit == 'm') {
				AgeCalculator calc = new AgeInMonths();
				System.out.printf("%s is %d months old.\n", s.getName(), calc.age(s));
			} else if (unit == 'y') {
				AgeCalculator calc = new AgeInYears();
				System.out.printf("%s is %d years old.\n", s.getName(), calc.age(s));
			}
		
		}
		
		sc.close();
	}

}
