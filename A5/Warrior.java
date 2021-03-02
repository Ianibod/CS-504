public abstract class Warrior {

	int level, attack, defense;

	public int getLevel() {

		return level;

	}

	public int getAttack() {

		return attack;

	}

	public int getDefense() {

		return defense;

	}

	public static abstract class WarriorBuilder {

		Warrior warrior;

		public WarriorBuilder attack(int attack) {

			warrior.attack = attack;
			return this;

		}

		public WarriorBuilder defense(int defense) {

			warrior.defense = defense;
			return this;

		}

		public Warrior build() {

			validate(warrior);
			return warrior;

		}

		void validate(Warrior warrior) {

			boolean errorOccurred = false;
			String levelErrorMessage = "", attackErrorMessage = "", defenseErrorMessage = "";

			if (warrior.level < 0) {
				levelErrorMessage = "Level must be greater than 0. ";
				errorOccurred = true;
			}

			if (warrior.attack < 0) {
				attackErrorMessage = "Attack must be greater than 0. ";
				errorOccurred = true;
			}

			if (warrior.defense < 0) {
				defenseErrorMessage = "Defense must be greater than 0. ";
				errorOccurred = true;
			}

			if (errorOccurred) {

				throw new IllegalStateException(levelErrorMessage + attackErrorMessage + defenseErrorMessage);

			}

		}

	}

}
