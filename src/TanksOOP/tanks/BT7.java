package TanksOOP.tanks;

import java.awt.Color;

import TanksOOP.service.AbstractTank;
import TanksOOP.service.ActionField;
import TanksOOP.service.BattleField;
import TanksOOP.service.Direction;

public class BT7 extends AbstractTank {

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
	
	public BT7(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction) {
		super(af, bf, x, y, tankType, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
}