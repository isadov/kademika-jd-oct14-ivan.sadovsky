package TanksOOP.tanks;

import java.awt.Color;

import TanksOOP.service.AbstractTank;
import TanksOOP.service.ActionField;
import TanksOOP.service.BattleField;
import TanksOOP.service.Direction;

public class Tiger extends AbstractTank {

	private int armor;
	
	public Tiger(ActionField af, BattleField bf) {
		super(af, bf);
		armor = 1;
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
	
	public Tiger(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction){
		super(af, bf, x, y, tankType, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		if (armor > 0){
			armor = 0;
		}else{
			super.destroy();
			
		}
	}
	
}