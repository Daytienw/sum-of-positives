public class SumOfPositivesCLI {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num > 0) {
                sum += num;
            }
        }
        System.out.print("# => prints " + sum);
    }
}