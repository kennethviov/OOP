interface Appliance {
    void turnOn();
    void turnOff();
}

class Refrigerator implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator turned off.");

    }
}

class WashingMachine implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine turned off.");
    }
}