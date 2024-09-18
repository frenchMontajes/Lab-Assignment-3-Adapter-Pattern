package Objects;

import TargetObject.PowerOutlet;

public class LaptopAdapter implements PowerOutlet {
    private final Laptop laptop;

    public LaptopAdapter(Laptop laptop){
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        if(laptop.getVoltage() <= standardVoltage() && laptop.getAmpere() <= standardAmpere()){
            return  laptop.charge();
        }else {
            return "The charger is not compatible with the outlet.\n";
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
