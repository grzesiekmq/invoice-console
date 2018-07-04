import java.applet.*;
import java.awt.*;

public class PersonBusinessCard extends Applet {
	
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
		String phone = getParameter("phone");
		String email = getParameter("email");
		String pesel = getParameter("pesel");
		
		Address adres = new Address(address, email);
		Person person = new Person(name, adres, phone, pesel);
		g.drawString(person.getName(), 300, 100);
		g.drawString(person.getAddress().getAddress(), 300, 115);
		
	}
}
