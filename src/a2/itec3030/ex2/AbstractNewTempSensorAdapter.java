package a2.itec3030.ex2;

import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;


/**
 * Abstract interface for the adapter, NewTempSensorDriver class. Used by the Client.
 * @author Group Two
 */

public interface AbstractNewTempSensorAdapter extends TemperatureSensor, Observer {

	/**
	 * Returns the adaptee of this adapter. Useful for passing it to the device.
	 * @return A reference to the adaptee (a NewTempSensorDriver object).
	 * @author Group Two
	 */
	 NewTempSensorDriver getAdatptee();

}
