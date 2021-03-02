
public abstract class Warrior {
	private int level;
	private int attack;
	private int defense;

	Warrior(int level, int attack, int defense) {
		this.level = level;
		this.attack = attack;
		this.defense = defense;
	}

	public int getLevel() {
		return level;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	public static abstract class Builder<T> {
		int level;
		int attack;
		int defense;

		private boolean _isLevelInitialized = false;

		public Builder(int defaultAttack, int defaultDefense) {
			this.attack = defaultAttack;
			this.defense = defaultDefense;
		}

		public Builder level(int level) {
			this.level = level;
			return this;
		}

		public Builder attack(int attack) {
			this.attack = attack;
			return this;
		}

		public Builder defense(int defense) {
			this.defense = defense;
			return this;
		}

		public abstract T build();

		void validate() {
			boolean errorOccurred = false;
			String levelErrorMessage = "", attackErrorMessage = "", defenseErrorMessage = "";

			if (!this._isLevelInitialized) {
				levelErrorMessage = "Level is a required field. ";
				errorOccurred = true;
			}

			if (defensiveWarrior.level < 0) {
				levelErrorMessage = "Level must be greater than 0. ";
				errorOccurred = true;
			}

			if (defensiveWarrior.attack < 0) {
				attackErrorMessage = "Attack must be greater than 0. ";
				errorOccurred = true;
			}

			if (defensiveWarrior.defense < 0) {
				defenseErrorMessage = "Defense must be greater than 0. ";
				errorOccurred = true;
			}

			if (errorOccurred) {
				throw new IllegalStateException(levelErrorMessage + attackErrorMessage + defenseErrorMessage);
			}
		}

	}

}
