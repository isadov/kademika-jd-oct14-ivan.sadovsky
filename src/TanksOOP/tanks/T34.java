package TanksOOP.tanks;

import java.awt.Color;

import TanksOOP.service.AbstractTank;
import TanksOOP.service.ActionField;
import TanksOOP.service.BattleField;
import TanksOOP.service.Direction;

public class T34 extends AbstractTank {
	
	public T34(ActionField af, BattleField bf) {
		super (af, bf, 128, 512, true, Direction.UP);
		tankColor = new Color(0, 255, 0);
		towerColor = new Color(255, 0, 0);
	}
	
	public T34(ActionField af, BattleField bf, int x, int y, boolean tankType, Direction direction) {
		super (af, bf, x, y, tankType, direction);
		tankColor = new Color(0, 255, 0);
		towerColor = new Color(255, 0, 0);
		
	}
}