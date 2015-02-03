package day5.magazinefruits.service;

import day5.magazinefruits.fruits.Denomination;
import day5.magazinefruits.fruits.Fruit;
import day5.magazinefruits.workwithshop.Shop;

public class AddingFruitToStorage {
    Shop shop;
    public AddingFruitToStorage(Shop shop){
    	
        this.shop = shop;
        
        Fruit fruit = new Fruit();
        
        shop.insertFruit(new Fruit(Denomination.APPLE, 5));
        shop.insertFruit(new Fruit(Denomination.APPLE, 5));
        shop.insertFruit(new Fruit(Denomination.APPLE, 5));
        shop.insertFruit(new Fruit(Denomination.APPLE, 5));
        shop.insertFruit(new Fruit(Denomination.APPLE, 5));
        
        
        shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
        shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
        shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
        shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
        shop.insertFruit(new Fruit(Denomination.MANDARIN, 6));
        
        
        shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
        shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
        shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
        shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
        shop.insertFruit(new Fruit(Denomination.ORANGE, 7));
        
        
        shop.insertFruit(new Fruit(Denomination.PEAR, 3));
        shop.insertFruit(new Fruit(Denomination.PEAR, 3));
        shop.insertFruit(new Fruit(Denomination.PEAR, 3));
        shop.insertFruit(new Fruit(Denomination.PEAR, 3));
        shop.insertFruit(new Fruit(Denomination.PEAR, 3));

        
    }
}
