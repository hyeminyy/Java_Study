package classTest3;

public class Electronics extends Item{
	private int warranty;
	
	public Electronics(String name, double price, int stockQuantity, int warranty) {
		super(name, price, stockQuantity);
		this.warranty=warranty;
		
	}
	@Override
	public void show() {
		
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
