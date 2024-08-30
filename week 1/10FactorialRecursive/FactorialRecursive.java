class FactorialRecursive {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        long result = factorial(num);

        System.out.println("The factorial of " + num + " is: " + result);
    }
}
