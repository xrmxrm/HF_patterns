public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Nowhere");
		GarageDoor garageDoor = new GarageDoor("Nowhere");

		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}