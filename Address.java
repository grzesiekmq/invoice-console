// Klasa Address
public class Address
{
	private String address;
	private String email;
	
	/**
	 * @param address
	 * @param email
	 */
	public Address(String address, String email) {
		this.address = address;
		this.email = email;
	}
	
	/**
	 * 
	 * @return adres
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 
	 * @param address adres
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 
	 * @param email email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return String.format("");
		
	}

}
