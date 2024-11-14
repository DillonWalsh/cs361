public class Problem{

    public int Fib(int n){
        if (n <= 1){
            return 1;
        } else {
            return Fib(n-1) + Fib(n-2);
        }
    }

    public static void main(String[] args) {
        Problem f = new Problem();
        System.out.println(f.Fib(15));

    }
}