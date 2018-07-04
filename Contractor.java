// Klasa Contractor
public abstract class Contractor
{
	private String name;
	private Address address;
	
	/**
	 * 
	 * @param name nazwa kontrahenta
	 */
	public Contractor(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param name j.w
	 * @param address adres
	 */
	public Contractor(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	/**
	 * 
	 * @return nazwa kontrahenta
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name nazwa kontrahenta
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return adres
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * 
	 * @param address adres
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public abstract String toString();
	
}
