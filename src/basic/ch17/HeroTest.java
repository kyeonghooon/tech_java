package basic.ch17;

public class HeroTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("워리어", 500);
		Archer archer = new Archer("아처", 400);
		Wizard wizard = new Wizard("위자드", 400);
		warrior.attack();
		archer.attack();
		wizard.attack();
		warrior.comboAttack();
		archer.fireArrow();
		wizard.freezing();
	}

}
