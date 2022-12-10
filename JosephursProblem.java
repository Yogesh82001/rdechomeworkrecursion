public class JosephursProblem {
    public static void main(String[] args) {
        System.out.println(Jos(5, 3));
    }
    // JosephursProblem
    public static int Jos(int n,int k) {
        if (n==1) {
            return 1;
        }
        return (Jos(n-1,k)+k)%n;
    }
    
}
