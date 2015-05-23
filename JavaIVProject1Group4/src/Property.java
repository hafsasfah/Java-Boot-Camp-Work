
public class Property implements iProperty {
	String title;
	int rent;
	int owner;
	int price;
	
	
	public Property(){
		//TODO:
		
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
		return "this is a property";
	}
	
	public String toString(){
		return "Property : "+ title;
	}
	
}
