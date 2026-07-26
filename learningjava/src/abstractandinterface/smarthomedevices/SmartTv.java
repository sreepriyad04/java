package abstractandinterface.smarthomedevices;

public class SmartTv implements Switchable, Connectable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart TV ON");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart TV OFF");
	}

	@Override
	public void connectWifi() {
		// TODO Auto-generated method stub
		System.out.println("Smart TV - Connected wifi");
	}

	@Override
	public void disconnectWifi() {
		// TODO Auto-generated method stub
		System.out.println("Smart TV - disconnected wifi");
	}

}
