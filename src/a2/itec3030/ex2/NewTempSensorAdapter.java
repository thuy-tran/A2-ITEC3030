package a2.itec3030.ex2;

import itec3030.smarthome.standards.ControllerInterface;
import newtemp.NewTempSensor.NewTempSensorDriver;

/**
 * Adapter for the NewTempSensorDriver class. It observes the driver object for temperature readings and prints them on the standard output.  
 * @author Group Two
 */
public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter {
	
	private NewTempSensorDriver driver;
	
	private int temperature ;
	private String ID;
	
	/**
	 * Constructor that creates a NewTempSensorDriver object. This object will be adapted to the client.
	 * Registers an observer for the Observer class.
	 * @author Group 2
	 */
	public NewTempSensorAdapter() {
		
		driver = new NewTempSensorDriver();
		driver.registerObserver(this);
	}
	
	/**
	 * Returns the adaptee of this adapter. Useful for passing it to the device.
	 * @return driver A reference to the adaptee (a NewTempSensorDriver object).
	 * @author Group 2
	 */
	@Override
	public NewTempSensorDriver getAdatptee() {
		return this.driver;
	}

	/**
	 * Disables the sensor adapter.
	 * @author Group Two
	 */
	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Enables the sensor adapter.
	 * @author Group Two
	 */
	@Override
	public void enable() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Tells if the temperature sensor adapter is enabled or not.
	 * @return false Shows if the adapter is not enabled.
	 * @author Group Two
	 */
	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Gets the ID of the temperature sensor adapter.
	 * @author Group Two
	 */
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * Sets the new ID of the adapter.
	 * @param arg0 The new id for the adapter. Set to ID variable.
	 * @author Group Two
	 */
	@Override
	public void setID(String arg0) {
		this.ID = arg0;
	}

	/**
	 * Gets the reading of the adapter.
	 * @return temperature The temperature read by the adapter.
	 * @author Group Two
	 */
	@Override
	public int getReading() {
		// TODO Auto-generated method stub
		return this.temperature;
		
	}

	/**
	 * Sets the new temperature.
	 * @author Group Two
	 */
	@Override
	public void newTemperature(int arg0) {
		this.driver.newTemperature(arg0);
		
	}

	/**
	 * Updates the temperature and print out the update
	 * @param arg0 The new temperature.
	 * @author Group Two
	 */
	@Override
	public void update(int arg0) {
		System.out.println("Sensor " + this.ID +" receiving new temperature: "
	+ arg0);
		this.temperature = arg0;
		
	}
	
	/**
	 * Gets the controller.
	 * @author Group Two
	 */
	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Sets the controller.
	 * @param arg0 An object of ControllerInterface.
	 * @author Group Two
	 */
	@Override
	public void setController(ControllerInterface arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}