public class Battery{
    public String manufacturer;
    public String model;
    public double voltage;
    public double ampHours;
    public double weightKg;
    public double[] dimensionMm;

    public Battery(String manufacturer, String model, double voltage, double ampHours, double weightKg, double wMm, double hMm, double dMm){
        this.manufacturer = manufacturer;
        this.model = model;
        this.voltage = voltage;
        this.ampHours = ampHours;
        this.weightKg = weightKg;
        this.dimensionMm = new double[]{wMm, hMm, dMm};
    }

    public String toString(){
        // このオブジェクトの参照を取得します。
        String referenceHash = Integer.toHexString(this.hashCode());

        return this.manufacturer + " " + this.model + ": " + this.getPowerCapacity() + "Wh (" + this.voltage + "V/" + this.ampHours + "Ah) - " + this.dimensionMm[0] + "(W)x" + this.dimensionMm[1] + "(H)x" + this.dimensionMm[2] + "(D) " + this.weightKg + "kg .... Instance Reference:" + referenceHash;
    }

    public double getPowerCapacity(){
        return this.voltage * this.ampHours;
    }

    public boolean isEquals(Battery battery) {
        if (battery.voltage == this.voltage ) return true;
        return false;
    }

    public boolean isBigger(Battery battery) {
        double thisSize = this.dimensionMm[0] * this.dimensionMm[1] * this.dimensionMm[2];
        double batterySize = battery.dimensionMm[0] * battery.dimensionMm[1] * battery.dimensionMm[2];
        return thisSize > batterySize ? true: false;
    }

    public boolean isBiggerOrEqual(Battery battery) {
        return isBigger(battery) || isEquals(battery);
    }

    public boolean isSmaller(Battery battery) {
        return !isBigger(battery);
    }

    public boolean isSmallerOrEqual(Battery battery) {
        return isSmaller(battery) || isEquals(battery);
    }
}