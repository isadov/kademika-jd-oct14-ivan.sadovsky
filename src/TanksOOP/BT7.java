package TanksOOP;

public class BT7 extends Tank {

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);
		speed = 5;
		
	}
	
	public BT7(ActionField af, BattleField bf, int x, int y, Boolean tankType, Direction direction) {
		super(af, bf, x, y, tankType, direction);
		speed = 5;
	}
	
}