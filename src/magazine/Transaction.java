package magazine;

public class Transaction {

	private String date;
	private String client;
	private String elementName;
	private int price;
	private int quantity;

	public Transaction(String date, String client,
			String elementName, int price, int quantity) {
		super();
		this.date = date;
		this.client = client;
		this.elementName = elementName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getCurrentDate() {
		return date;
	}

	public void setCurrentDate(String currentData) {
		this.date = currentData;
	}

	public String getClientLogin() {
		return client;
	}

	public void setClientLogin(String clientLogin) {
		this.client = clientLogin;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {

		return "Date: " + this.getCurrentDate() + " " + this.client + " "
				+ this.elementName + " " + " Price: " + this.getPrice() + " USD"
				+ " Goods: " + this.getQuantity();
	}

}
