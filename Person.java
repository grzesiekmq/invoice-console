// Klasa Person 
public class Person extends Contractor
{
	private String pesel;
	private String phone;
	
	/**
	 * 
	 * @param name nazwa
	 * @param address adres
	 * @param pesel pesel
	 * @param  
	 */
	public Person(String name, Address address, String phone, String pesel) {
		super(name, address);
		this.pesel = pesel;
		this.phone = phone;
	}
	
	/**
	 * 
	 * @return pesel
	 */
	public String getPesel() {
		return pesel;
	}
	
	/**
	 * 
	 * @param pesel pesel
	 */
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "";
		
	}

}
