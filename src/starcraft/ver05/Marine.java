package starcraft.ver05;

public class Marine extends Unit implements AirAttack, GroundAttack{

	public Marine(String name) {
		super(name);
		super.name = name;
		super.power = 4;
		super.hp = 70;
	}

	@Override
	public void groundAttack(Unit unit) {
		super.attack(unit);
	}

	@Override
	public void airAttack(Unit unit) {
		super.attack(unit);
	}

}
