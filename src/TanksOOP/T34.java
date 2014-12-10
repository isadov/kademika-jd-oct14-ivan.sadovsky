package TanksOOP;

public class T34 extends Tank {
	
	public T34(ActionField af, BattleField bf) {
		super (af, bf);
		speed = 5;
		
	}
	
	public T34(ActionField af, BattleField bf, int x, int y, boolean tankType, Direction direction) {
		super (af, bf, x, y, tankType, direction);
		speed = 5;
		
	}
}