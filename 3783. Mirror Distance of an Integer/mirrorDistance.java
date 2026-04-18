public class MirrorDistance {

    public int mirrorDistance(int n) {

        String reversedStr = new StringBuilder(String.valueOf(n)).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);

        System.out.println("||" + n + " - " + reversedNum + "||");
        return Math.abs(n - reversedNum);
    }

    public static void main(String[] args) {

        MirrorDistance md = new MirrorDistance();

        System.out.println("Mirror Distance: " + md.mirrorDistance(25)); // example 1
    }
}
