package TargetObject;

public interface PowerOutlet {
    public String plugIn();

    default Integer standardVoltage(){
        return 220;
    }
    default Integer standardAmpere(){
        return 30;
    }
}
