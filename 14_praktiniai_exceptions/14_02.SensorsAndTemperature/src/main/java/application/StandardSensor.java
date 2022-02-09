package application;

import java.awt.IllegalComponentStateException;

public class StandardSensor implements Sensor {
	private int param;
	private boolean sensor;

	public StandardSensor(int param) {
		this.param = param;
		this.sensor = true;
	}

	@Override
	public boolean isOn() {
		return this.sensor;
	}

	@Override
	public void setOn() {
//		this.sensor = true;

	}

	@Override
	public void setOff() {
//		this.sensor = false;

	}

	@Override
	public int read() {
		if (isOn()) {
			return param;

		} else {
			throw new IllegalComponentStateException();
		}
	}

}
