package classTest3;

public class Clothing extends Item{
	private String size;
	private String color;
	
	

	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Clothing(String name, double price, int stockQuantity, String size, String color) {
		super(name, price, stockQuantity);
		this.size = size;
		this.color = color;
	}
	
	
	@Override
	public void show() {
		
	}

	@Override
	public String toString() {
		 return ", size = " + size + ", color : " + color;
	}
	
	
}
