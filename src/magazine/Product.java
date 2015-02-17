package magazine;

public class Product extends Goods { // Book
	String name;
	TypeOfProducts type;
	String brand;
	
	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeOfProducts getType() {
		return type;
	}

	public void setType(TypeOfProducts type) {
		this.type = type;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (name != null && name.equals(p.name) && type != null
					&& type.equals(p.type)) {
				return true;
			}
		}
		return false;
	}
}
