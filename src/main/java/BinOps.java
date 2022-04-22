public class BinOps {
    public String sum(String a, String b) {
        int a0 = Integer.parseInt(a, 2);
        int b0 = Integer.parseInt(b, 2);
        int result = a0 + b0;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int a0 = Integer.parseInt(a, 2);
        int b0 = Integer.parseInt(b, 2);
        int result = a0 * b0;
        return Integer.toBinaryString(result);
    }
}