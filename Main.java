

class Main {
    public static void main(String[] args) {
        Battery mc96 = new Battery("VTec", "MC96", 14.4, 6.6, 0.55, 72, 97, 51.5);
        Battery mc60 = new Battery("VTec", "MC60", 14.4, 4.2, 0.35, 52, 77, 40.5);
        Battery mdPL140 = new Battery("BowserPower", "MD-PL140", 14.4, 9.9, 1.18, 89, 119, 85);
        Battery zlD72 = new Battery("MT-Dell Tech", "ZL-D72", 7.2, 9.9, 1.18, 38, 80, 70);

        // オブジェクト参照をプリントアウトし、その文字列のバージョンを表示します。
        // デフォルトでは、toString()が定義されていない場合、javaはオブジェクト参照を出力します。今回私たちはすでに定義しているので、Javaのすべてのオブジェクトが持っているhashCode()メソッドを使います。これは、オブジェクトの参照を整数として返し、それを16進数に変換します。
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
