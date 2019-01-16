package entities;

import behaviours.IFixedComponent;

public class Transmission extends Component implements IFixedComponent {

	private TransmissionType type;

	public Transmission(TransmissionType type) {
		this.type = type;
	}

	public TransmissionType getType() {
		return type;
	}

	@Override
	public void repair() {

	}
}
