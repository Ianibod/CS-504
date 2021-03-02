
public class DefensiveWarrior extends Warrior {

	private static final int DEFAULT_ATTACK = 2;
	private static final int DEFAULT_DEFENSE = 3;

	public DefensiveWarrior(int level, int attack, int defense) {
		super(level, attack, defense);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder extends Warrior.Builder<DefensiveWarrior>{

		public Builder() {
			super(DEFAULT_ATTACK, DEFAULT_DEFENSE);
		}

		@Override
		public DefensiveWarrior build() {
			validate();
			return new DefensiveWarrior(super.level, super.attack, super.defense);
		}
	}

}
