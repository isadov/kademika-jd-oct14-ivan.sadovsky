package TanksOOP.fieldObjects;

import java.awt.*;

public class Water extends SimpleBFObjects {
	private boolean isDestroyable = false;

	public Water(int x, int y) {
		super(x, y);
		color = Color.BLUE;
	}

	private void destoy() {
		isDestroyed = false;

	}
}