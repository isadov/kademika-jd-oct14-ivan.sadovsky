package day6.magazinecoffe;

public class Recipes {
	Americano americano = new Americano();
	Espresso espresso = new Espresso();
	Capuchino capuchino = new Capuchino();
	Mokachino mokachino = new Mokachino();
	TeaBlack teaBlack = new TeaBlack();
	TeaGreen teaGreen = new TeaGreen();
	TeaWithBergamot teaBergamot = new TeaWithBergamot();
	Latte latte = new Latte();

	public Recipes() {

	}

	public void recipeAmericano(double price) {
		americano.setCoffee("coffee 7 gr -- ");
		americano.setSugar("sugar 1 steak -- ");
		americano.setWater("water 120 ml -- ");
		if (price != 0) {
			System.out.println("Americano: " + americano.getCoffee()
					+ americano.getSugar() + americano.getWater() + price
					+ " grn.");
		}
		System.out.println("Americano: " + americano.getCoffee()
				+ americano.getSugar() + americano.getWater());
	}

	public void recipeCapuchino(double price) {
		capuchino.setCoffee("espresso 30 ml -- ");
		capuchino.setMilk("milk 70 ml -- ");
		capuchino.setSugar("sugar 1 steak -- ");
		capuchino.setWater("water 150 ml -- ");
		if (price != 0) {
			System.out.println("Capuchino: " + capuchino.getCoffee()
					+ capuchino.getMilk() + capuchino.getSugar()
					+ capuchino.getWater() + price + " grn.");
		}
		System.out.println("Capuchino: " + capuchino.getCoffee()
				+ capuchino.getMilk() + capuchino.getSugar()
				+ capuchino.getWater());
	}

	public void recipeEspresso(double price) {
		espresso.setCoffee("coffee 7 gr -- ");
		espresso.setWater("water 30 ml -- ");
		espresso.setSugar("sugar 1 steak -- ");
		if (price != 0) {
			System.out.println("Espresso: " + espresso.getCoffee()
					+ espresso.getSugar() + espresso.getWater() + price
					+ " grn.");
		}
		System.out.println("Espresso: " + espresso.getCoffee()
				+ espresso.getSugar() + espresso.getWater());
	}

	public void recipeLatte(double price) {
		latte.setCoffee("espresso 50 ml -- ");
		latte.setWater("water 180 ml -- ");
		latte.setSugar("2 steak -- ");
		latte.setMilk("milk 140 ml -- ");
		if (price != 0) {
			System.out.println("Latte: " + latte.getCoffee() + latte.getSugar()
					+ latte.getWater() + latte.getMilk() + price + " grn.");
		}
		System.out.println("Latte: " + latte.getCoffee() + latte.getSugar()
				+ latte.getWater() + latte.getMilk());
	}

	public void recipeMokachino(double price) {
		mokachino.setCoffee("espresso 30 ml -- ");
		mokachino.setMilk("milk 15 gr -- ");
		mokachino.setSugar("2 steak -- ");
		mokachino.setWater("water 200 ml -- ");
		if (price != 0) {
			System.out.println("Mokachino: " + mokachino.getCoffee()
					+ mokachino.getSugar() + mokachino.getWater()
					+ mokachino.getMilk() + price + " grn.");
		}
		System.out.println("Mokachino: " + mokachino.getCoffee()
				+ mokachino.getSugar() + mokachino.getWater()
				+ mokachino.getMilk());
	}

	public void recipeTeaBlack(double price) {
		teaBlack.setWater("water 200 ml -- ");
		teaBlack.setTeaBlack("tea black 10 gr -- ");
		teaBlack.setSugar("sugar 2 steak -- ");
		if (price != 0) {
			System.out.println("Tea Black: " + teaBlack.getWater()
					+ teaBlack.getTeaBlack() + teaBlack.getSugar() + price
					+ " grn.");
		}
		System.out.println("Tea Black: " + teaBlack.getWater()
				+ teaBlack.getTeaBlack() + teaBlack.getSugar());
	}

	public void recipeTeaGreen(double price) {
		teaGreen.setWater("water 200 ml --");
		teaGreen.setTeaGreen("tea green 10 gr -- ");
		teaGreen.setSugar("sugar 2 steak -- ");
		if (price != 0) {
			System.out.println("Tea Green: " + teaGreen.getWater()
					+ teaGreen.getTeaGreen() + teaGreen.getSugar() + price
					+ " grn.");
		}
		System.out.println("Tea Green: " + teaGreen.getWater()
				+ teaGreen.getTeaGreen() + teaGreen.getSugar());
	}

	public void recipeTeaWithBergamot(double price) {
		teaBergamot.setWater("water 200 ml -- ");
		teaBergamot.setSugar("sugar 2 steak -- ");
		teaBergamot.setTeaBergamot("tea bergamot 15 gr --");
		if (price != 0) {
			System.out.println("Tea With Bergamot: " + teaBergamot.getWater()
					+ teaBergamot.getSugar() + teaBergamot.getTeaBergamot()
					+ price + " grn.");
		}
		System.out.println("Tea With Bergamot: " + teaBergamot.getWater()
				+ teaBergamot.getSugar() + teaBergamot.getTeaBergamot());
	}

	public void allRecipes() {
		recipeAmericano(0);
		recipeCapuchino(0);
		recipeEspresso(0);
		recipeLatte(0);
		recipeMokachino(0);
		recipeTeaBlack(0);
		recipeTeaGreen(0);
		recipeTeaWithBergamot(0);
	}
}
