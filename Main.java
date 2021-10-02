

class Main {
    public static void main(String[] args) {
        Battery mc96 = new Battery("VTec", "MC96", 14.4, 6.6, 0.55, 72, 97, 51.5);
        Battery mc60 = new Battery("VTec", "MC60", 14.4, 4.2, 0.35, 52, 77, 40.5);
        Battery mdPL140 = new Battery("BowserPower", "MD-PL140", 14.4, 9.9, 1.18, 89, 119, 85);
        Battery zlD72 = new Battery("MT-Dell Tech", "ZL-D72", 7.2, 9.9, 1.18, 38, 80, 70);
        Battery mdLs95 = new Battery("Stomic Units", "MD-LS95", 14.4, 6.6, 0.55, 72, 97, 51.5);
        Battery powerCub95 = new Battery("RedGreen", "Powercub 95", 14.4, 6.6, 0.60, 80, 95, 55);

        System.out.println(mc60.isBigger(mdLs95));
        System.out.println(mc60.isEquals(zlD72));
        System.out.println(powerCub95.isSmaller(mdLs95));

        System.out.println("Instance Reference: " + Integer.toHexString(mc96.hashCode()));
        System.out.println(mc96);

        System.out.println();
        // メンバ変数(アンペア時)を出力します。
        System.out.println(mc96.ampHours + " are its amps");

        System.out.println();
        System.out.println(mc60);
        System.out.println();
        System.out.println(mdPL140);
        System.out.println();
        System.out.println(zlD72);
    }
}
