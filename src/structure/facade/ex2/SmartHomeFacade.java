package structure.facade.ex2;

public class SmartHomeFacade {

    private CoffeeMaker coffeeMaker;
    private Lights lights;
    private Thermostat thermostat;

    public SmartHomeFacade(CoffeeMaker coffeeMaker, Lights lights, Thermostat thermostat) {
        this.coffeeMaker = coffeeMaker;
        this.lights = lights;
        this.thermostat = thermostat;
    }

    public void wakeup(){
        System.out.println("Waking up..");
        thermostat.setTemperature(22);
        lights.on();
        coffeeMaker.brewCoffee();
    }

    public void leaveHome(){
        System.out.println("Leaving home...");
        thermostat.setTemperature(18);
        lights.off();
    }
}
