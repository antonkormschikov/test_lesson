class FunctionUtilsHexToBin {
    public static int hexToBin(String hexBase) {
     int num = (Integer.parseInt(hexBase,16));
        return num;
    }
    private FunctionUtilsHexToBin() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 17, метод должен вернуть 10111 - '"
                        + FunctionUtilsHexToBin.hexToBin("17")
                        + "'"
        );
    }
}