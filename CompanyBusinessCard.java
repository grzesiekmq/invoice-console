import java.applet.*;
import java.awt.*;

public class CompanyBusinessCard extends Applet {

	
	public void init(){
	}
	public void start(){	
	}
	public void stop(){
	}
	public void destroy(){
	}

	public void paint(Graphics g){
		String name = getParameter("name");
		String address = getParameter("address");
		String nip = getParameter("nip");
		String email = getParameter("email");
		
		Address adres = new Address(address, email);
		Company company = new Company(name, adres, nip);
		g.drawString(company.getName(), 100, 100);
		g.drawString(company.getAddress().getAddress(), 50, 115);
		g.drawString(company.getAddress().getNip(), 100, 100);
		
		
		
	
	
	}



}
