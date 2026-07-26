package abstractandinterface.smarthomedevices;

public class SmartLight implements Switchable, Connectable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart light ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart light OFF");
	}

	@Override
	public void connectWifi() {
		// TODO Auto-generated method stub
		System.out.println("Smart light- Connected wifi");
	}

	@Override
	public void disconnectWifi() {
		// TODO Auto-generated method stub
		System.out.println("Smart light - disconnected wifi");
	}

}
