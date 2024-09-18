package Objects;

public class SmartphoneCharger {
    private Integer voltage;
    private Integer ampere;
    private char plugType;
    public SmartphoneCharger(Integer voltage, Integer ampere,char plugType){
        this.voltage = voltage;
        this.ampere = ampere;
        this.plugType = plugType;
    }
    public String chargePhone(){
     return  "The phone is being charged.\n";
    }
    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getAmpere() {
        return ampere;
    }

    public void setAmpere(Integer ampere) {
        this.ampere = ampere;
    }

    public char getPlugType() {
        return plugType;
    }

    public void setPlugType(char plugType) {
        this.plugType = plugType;
    }
}
