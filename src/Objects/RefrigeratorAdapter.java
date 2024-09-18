package Objects;

import TargetObject.PowerOutlet;

public class RefrigeratorAdapter implements PowerOutlet {

    private final Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator){
        this.refrigerator = refrigerator;
    }

    @Override
    public String plugIn() {
        if (refrigerator.getVoltage() <= standardVoltage() && refrigerator.getAmpere() <= standardAmpere()){
            return refrigerator.startCooling();
        } else {
            return "There is too much power, and it's not compatible with the outlet.\n";
        }
    }

    @Override
    public Integer standardVoltage() {
        return PowerOutlet.super.standardVoltage();
    }

    @Override
    public Integer standardAmpere() {
        return PowerOutlet.super.standardAmpere();
    }
}
