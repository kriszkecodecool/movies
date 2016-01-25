package movies;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Movie {
	private String title;
	private enum Genre {
		ROMANTIC,
		DRAMA,
		SCI_FI,
		THRILLER,
		HORROR,
		ACTION,
		COMEDY
	}
	private Genre genre;
	private long duration;
	private double rate;
	private List<Person> person = new ArrayList<Person>();
	public static final String file = "movies.xml";
	private List<Person> cast = new ArrayList<Person>();
	
	public Movie(String title, Genre genre, long duration, List person, List cast)
	{
		title = getTitle();
		genre = getGenre();
		duration = getDuration();
		person = getPerson();
		cast = getCast();
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public static String toXmlString(){
		return null;
	}
}
