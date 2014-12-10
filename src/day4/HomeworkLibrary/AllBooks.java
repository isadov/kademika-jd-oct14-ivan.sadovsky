package day4.HomeworkLibrary;

public class AllBooks {

	static Library library;

	public AllBooks() throws Exception {

	}

	public static void addingBooks() throws Exception {

		library.addToLibrary(new Book("Just Mary", "Angelina Martynova",
				Category.DRAMA));
		library.addToLibrary(new Book("My second mother", "Abel Santa Crus",
				Category.DRAMA));
		library.addToLibrary(new Book("Sarmat", "Alexander Zvyagintsev",
				Category.DRAMA));
		library.addToLibrary(new Book("Last permission", "Albertas Kazevich",
				Category.DRAMA));
		library.addToLibrary(new Book("Twins", "Andrey Anisimov",
				Category.DRAMA));
		library.addToLibrary(new Book("Master and Margaryte",
				"Mikhail Bulgakov", Category.MYTHS));
		library.addToLibrary(new Book("Hero should be only one",
				"Henry Layon Oldy", Category.MYTHS));
		library.addToLibrary(new Book("Siddharta", "Herman Hesse",
				Category.MYTHS));
		library.addToLibrary(new Book("Quitters, Inc", "Stiven King",
				Category.THRILLER));
		library.addToLibrary(new Book("The Long Walk", "Stiven King",
				Category.THRILLER));
		library.addToLibrary(new Book("The Silence of the Lambs",
				"Tomas Harris", Category.THRILLER));
		library.addToLibrary(new Book("Psysho", "Robert Bloh",
				Category.THRILLER));
		library.addToLibrary(new Book("Fight Club", "Chuk Palanik",
				Category.THRILLER));
		library.addToLibrary(new Book("Sherlock Holmes", "Artur Konan Doel",
				Category.ADVENTURE));
		library.addToLibrary(new Book("A Storm of Swords",
				"George R.R. Martyn", Category.ADVENTURE));
		library.addToLibrary(new Book(
				"Treasure Island, or the Mutiny of the Hispaniola",
				"Robert Luis Stivenson", Category.ADVENTURE));
		library.addToLibrary(new Book(
				"Through the Looking Glass and What Alice Found There",
				"Luis Kerrol", Category.ADVENTURE));
		library.addToLibrary(new Book("White Fang", "Jack London",
				Category.ADVENTURE));
		library.addToLibrary(new Book("Flowers for Algernon", "Daniel Kiz",
				Category.FANTASY));
		library.addToLibrary(new Book("There Will Come Soft Rains",
				"Rei Bredbary", Category.FANTASY));
		library.addToLibrary(new Book("Capitaine Nemo", "Jul Verne",
				Category.FANTASY));
		library.addToLibrary(new Book("Something for Nothing", "Robert Shekli",
				Category.FANTASY));
		library.addToLibrary(new Book("Hyperion", "Den Simmons",
				Category.FANTASY));
		library.addToLibrary(new Book("The Terror", "Den Simmons",
				Category.HORROR));
		library.addToLibrary(new Book("The Sandman", "Neil Gayman",
				Category.HORROR));
		library.addToLibrary(new Book("It", "Styphen King", Category.HORROR));
		library.addToLibrary(new Book("Shining", "Styphen King",
				Category.HORROR));
		library.addToLibrary(new Book("Misery", "Styphen King", Category.HORROR));
		library.addToLibrary(new Book("Myths of ancients",
				"Alexander Nemyrovsky", Category.MYTHS));

	}
}
