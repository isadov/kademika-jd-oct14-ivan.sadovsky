package magazine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shop {

	private List<Transaction> register;
	Customer customer;
	Date dateRef;
	Stock stock;

	public Shop(Date dateRef, Stock stock) {
		this.stock = stock;
		this.dateRef = dateRef;
		register = new ArrayList<>();
	}

	public void buy(Customer customer, int indexOfGoods, int quantityToBuy) {
		String goodsName = stock.getName(indexOfGoods);
		int price = stock.getPrice(indexOfGoods);

		if (stock.remove(indexOfGoods, quantityToBuy)) {
			register.add(new Transaction(dateRef.currentData, customer
					.getName(), goodsName, price, quantityToBuy));
			System.out.println(register.get(register.size() - 1).toString());
		} else {
			System.err.println("Not enought goods on storage");
		}
	}

	public void setCurrentData(String currentData) {
		this.dateRef.currentData = currentData;
	}
}
