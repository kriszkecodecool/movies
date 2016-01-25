package movies;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	List<String> Cast = new ArrayList<String>();
	public List<String> getCast() {
		return Cast;
	}
	public void setCast(List<String> cast) {
		Cast = cast;
	}
	public static final String file = "movies.xml";
	public static void main(String[] args) {

	}

}
