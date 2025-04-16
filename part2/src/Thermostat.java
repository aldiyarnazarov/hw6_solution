class Thermostat {
    private int prevTemp = 20;
    private int currentTemp = 20;

    public void setTemperature(int temp) {
        prevTemp = currentTemp;
        currentTemp = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }

    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature: " + prevTemp + "°C");
        currentTemp = prevTemp;
    }
}