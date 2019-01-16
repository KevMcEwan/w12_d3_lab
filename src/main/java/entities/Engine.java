package entities;

public class Engine extends Component {
	private EngineType type;
	private int powerHP;

	public Engine(EngineType type, int powerHP) {
		this.type = type;
		this.powerHP = powerHP;
	}

	public EngineType getType() {
		return type;
	}

	public int getPowerHP() {
		return powerHP;
	}


}
