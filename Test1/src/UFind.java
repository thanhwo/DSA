public class UFind {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java UFind <number>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        System.out.println("n = " + n);
    }

}
