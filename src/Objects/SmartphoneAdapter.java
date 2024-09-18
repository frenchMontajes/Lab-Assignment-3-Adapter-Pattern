package Objects;

import TargetObject.PowerOutlet;

public class SmartphoneAdapter implements PowerOutlet {
    private final SmartphoneCharger smartphoneCharger;

    public SmartphoneAdapter (SmartphoneCharger smartphoneCharger){
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugIn() {
        if (smartphoneCharger.getVoltage() <= standardVoltage() && smartphoneCharger.getAmpere() <= standardAmpere()){
            return smartphoneCharger.chargePhone();
        } else {
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
