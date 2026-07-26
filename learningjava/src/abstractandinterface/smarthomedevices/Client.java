package abstractandinterface.smarthomedevices;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartLight sl = new SmartLight();
		sl.turnOn();
		sl.connectWifi();
		sl.disconnectWifi();
		sl.turnOff();
		
		SmartTv tv = new SmartTv();
		tv.turnOn();
		tv.connectWifi();
		tv.disconnectWifi();
		tv.turnOff();
		
		SmartSpeaker sp = new SmartSpeaker();
		sp.turnOn();
		sp.connectWifi();
		sp.disconnectWifi();
		sp.turnOff();
		
	}

}
