package vehicle;

public class Automobile extends Vehicle {
	private boolean Trunk;
	private boolean Ac;
	private boolean Tint;
	private String Owner;
	private String Title;
	public makerVehicle AutoMake;
	public model AutoModel;
	
	public boolean isTrunk() 
	{
		return Trunk;
	}
	public void setTrunk(boolean newTrunk)
	{
		Trunk = newTrunk;
	}
	public boolean isAc() 
	{
		return Ac;
	}
	public void setAc(boolean newAc)
	{
		newAc= Ac;
	}
	public boolean isTint() 
	{
		return Tint;
	}
	public void setTint(boolean newTint) 
	{
		 Tint = newTint;
	}
	public String getOwner() 
	{
		return Owner;	
	}
	public void setOwner(String newOwner) 
	{
		Owner = newOwner;
	}

	public int getNumWheels() 
	{
		String[] trimPackage = AutoModel.getPackageType();
		int wheelCount = 0;
		try 
		{
			wheelCount = Integer.parseInt(trimPackage[1]);
		}
		catch(Exception e) 
		{
			System.out.println("Bad Package Type");
		}
		return wheelCount;
	}
	
	int getdNumDoors()
	{
		return super.doors;
	}
	@Override
	String getMakeandModel(String ModelName, String company) {
		return MakeandModel;
		
	}
	String setMakeandModel(String newMakeandModel)
		MakeandModel = newMakeandModel
	
	

}
