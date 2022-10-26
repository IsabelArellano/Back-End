package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the aboutus database table.
 * 
 */
@Entity
@NamedQuery(name="Aboutus.findAll", query="SELECT a FROM Aboutus a")
public class Aboutus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_AboutUs;

	private String aletheia_generalInformation;

	public Aboutus() {
	}

	public int getId_AboutUs() {
		return this.id_AboutUs;
	}

	public void setId_AboutUs(int id_AboutUs) {
		this.id_AboutUs = id_AboutUs;
	}

	public String getAletheia_generalInformation() {
		return this.aletheia_generalInformation;
	}

	public void setAletheia_generalInformation(String aletheia_generalInformation) {
		this.aletheia_generalInformation = aletheia_generalInformation;
	}

}