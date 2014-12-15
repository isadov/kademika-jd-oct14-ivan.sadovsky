package day6.magazinecoffe;

public class Menu extends Recipes {

	Americano americano = new Americano();
	Espresso espresso = new Espresso();
	Capuchino capuchino = new Capuchino();
	Mokachino mokachino = new Mokachino();
	TeaBlack teaBlack = new TeaBlack();
	TeaGreen teaGreen = new TeaGreen();
	TeaWithBergamot teaBergamot = new TeaWithBergamot();
	Latte latte = new Latte();
	private Recipes recipes;
	
	public Menu() {
		
	}
	
	public void showMenu() {
		recipes.recipeAmericano(13);
		recipes.recipeCapuchino(12.5);
		recipes.recipeEspresso(12.3);
		recipes.recipeLatte(15);
		recipes.recipeMokachino(13.5);
		recipes.recipeTeaBlack(10);
		recipes.recipeTeaGreen(11);
		recipes.recipeTeaWithBergamot(20);
	}
}