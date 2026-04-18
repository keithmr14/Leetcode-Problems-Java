public class MirrorDistance {

    public static void mirrorDistance(int n) {

        String reversedStr = new StringBuilder(String.valueOf(n)).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);

        int result = Math.abs(n - reversedNum);

        System.out.println("||" + n + " - " + reversedNum + "||");
        System.out.println("Mirror Distance: " + result + "\n");
    }

    public static void main(String[] args) {

        System.out.println("3783. Mirror Distance of an Integer\n");

        mirrorDistance(25); // example 1

        mirrorDistance(10); // example 2
    }
}
