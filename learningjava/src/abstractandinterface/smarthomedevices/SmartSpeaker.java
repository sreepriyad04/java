package abstractandinterface.smarthomedevices;

public class SmartSpeaker implements Switchable , Connectable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart speaker ON");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Smart speaker OFF");
		
	}

	@Override
	public void connectWifi() {
		// TODO Auto-generated method stub
		System.out.println("Smart speaker-connected wifi");
		
	}

	@Override
	public void disconnectWifi() {
		// TODO Auto-generated method stub
		System.out.println("Smart speaker - disconnected wifi");
		
	}

}
