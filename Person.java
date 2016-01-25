package movies;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private enum Gender {
		MALE,
		FEMALE
	}
	private boolean hasOscar;
	private boolean hasGoldenGlobe;
	private Gender gender;
	public static final String file = "movies.xml";
	
	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
		firstName = getFirstName();
		lastName = getLastName();
		gender = getGender();
		hasOscar = isHasOscar();
		hasGoldenGlobe = isHasGoldenGlobe();
	}
	
	public static void main(String[] args) {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String toXmlString(){
	    StringBuilder sb = new StringBuilder();
	    sb.append("<person>");
	    sb.append(Tools.toXMLTag("firstName", getFirstName()));
	    sb.append(Tools.toXMLTag("lastName", getLastName()));
	    sb.append(Tools.toXMLTag("gender", String.valueOf(getGender())));
	    sb.append(Tools.toXMLTag("hasOscar", String.valueOf(isHasOscar())));
	    sb.append(Tools.toXMLTag("hasGoldenGlobe", String.valueOf(isHasGoldenGlobe())));
	    sb.append("</person>");
	    return sb.toString();
	}
	
}
