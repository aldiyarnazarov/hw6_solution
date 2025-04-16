public class SmartHome {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("A", lightOn);
        remote.setCommand("B", setTemp);

        remote.pressButton("A"); // Light ON
        remote.pressButton("B"); // Thermostat set to 22°C
        remote.pressUndo();      // Undo thermostat
        remote.pressUndo();      // Undo light
    }
}
