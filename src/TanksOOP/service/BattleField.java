package TanksOOP.service;

import java.awt.Graphics;
import java.util.Random;

import TanksOOP.interfaces.Drawable;

public class BattleField implements Drawable {

	private int bfWidth = 576;
	private int bfHeight = 576;

	private String[][] battleField = {
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" },
			{ "B", "B", "B", " ", "B", " ", "B", "B", "B" },
			{ "B", "B", " ", " ", "B", " ", " ", "B", "B" },
			{ "B", " ", " ", " ", "B", " ", " ", " ", "B" },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" }

	};

	public BattleField() {
	}

	public BattleField(String[][] battleField) {
		this.battleField = battleField;
	}

	public void updateQuadrant(int v, int h, String object) {
		battleField[v][h] = object;
	}

	public String scanQuadrant(int v, int h) {
		return battleField[v][h];
	}

	public int getBfWidth() {
		return bfWidth;
	}

	public int getBfHeight() {
		return bfHeight;
	}

	public int getDimentionX() {
		return battleField.length;
	}

	public int getDimentionY() {
		return battleField.length;
	}

	public String getAggressorLocation() {
		Random r = new Random();
		int i = r.nextInt(3);
		String aggressorLocation;
		if (i == 1) {
			aggressorLocation = "64_128";
		} else if (i == 2) {
			aggressorLocation = "256_256";
		} else {
			aggressorLocation = "64_64";
		}
		return aggressorLocation;
	}

	@Override
	public void draw(Graphics g) {
		for (int j = 0; j < battleField.length; j++) {
			for (int k = 0; k < battleField.length; k++) {
				battleField[j][k].draw(g);

			}
		}
	}
}
