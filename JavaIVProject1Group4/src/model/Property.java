package model;

public class Property implements iProperty {
	String title;
	int rent;
	int owner;
	int price;
	
	
	public Property(String title){
	 this.title = title;
	 rent = 10;
	 owner = -1; // owner none
	 price = 100;
			 
		
	}
	public Property(String title,int rent, int owner,int price){
		 this.title = title;
		 this.rent = rent;
		 this.owner = owner; // owner none
		 this.price = price;
				 
			
		}
	
	
	
	@Override
	public int getRent() {
		return rent;
	}

	@Override
	public int getOwner() {
		
		return owner;
	}

	@Override
	public int getPurchasePrice() {
		
		return price;
	}

	@Override
	public void newOwner(int owner) {
		this.owner = owner ;
		
	}

	@Override
	public String getTitle() {
		return title;
	}
	
	public String toString(){
		return "Property : "+ title;
	}
	
}
