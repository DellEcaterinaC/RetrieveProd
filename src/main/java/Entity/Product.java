package Entity;

public class Product {
	
	public int ID;
	public String productName;
	
	public Product(int id, String name) {
		this.ID = id;
		this.productName = name;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.productName;
	}
	
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public void setName(String name) {
		this.productName = name;
	}

}
