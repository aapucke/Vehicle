package vehicle;

import java.awt.Image;
import java.util.Date;

class makerVehicle 
{
	 String company;
	 String plantLocation;
	 Date mintDate;	
	 String phoneNumber;
	 String website;
	 Image logo;
	
	 
		makerVehicle()
	{
		company = "Ford";
		plantLocation = "Detroit";
		phoneNumber = "4798999844";
		website = "www.ford.com";
		mintDate = new Date(); 
		
	}
		makerVehicle(String s, String pl, Date md, String pn, String ws)
	{
			company = s;
			plantLocation = pl;
			mintDate = md;
			phoneNumber = pn;
			website = ws;
			
	}
	
	

	
	
	
	
	
}