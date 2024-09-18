package Objects;

public class Refrigerator {
    private Integer voltage;
    private Integer ampere;
    private char plugType;
    public Refrigerator(Integer voltage, Integer ampere,char plugType){
        this.voltage = voltage;
        this.ampere = ampere;
        this.plugType = plugType;
    }
    public String startCooling(){
     return "The refrigerator has started to cool\n";
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
