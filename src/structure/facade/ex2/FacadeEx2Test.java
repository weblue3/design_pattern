package structure.facade.ex2;

public class FacadeEx2Test {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Lights lights = new Lights();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(coffeeMaker, lights, thermostat);

        smartHomeFacade.wakeup();
        smartHomeFacade.leaveHome();

    }
}
