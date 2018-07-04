// Klasa Company
public class Company extends Contractor
{
	private String nip;
	
	/**
	 * 
	 * @param name nazwa firmy
	 * @param address adres
	 * @param nip NIP
	 */
	public Company(String name, Address address, String nip) {
		super(name, address);
		this.nip = nip;
	}
	
	/**
	 * 
	 * @return NIP
	 */
	public String getNip() {
		return nip;
	}
	
	/**
	 * 
	 * @param nip NIP
	 */
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String toString(){
		return "";
	}
}
