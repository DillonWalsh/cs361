public class Most{


    public static int function(int a, int b){
        if (a == 0){
            return 0;
        } else{
            return function(a-1, function(a,b));
        }
    }

    public static void main(String[] args) {
        System.out.println(function(1,1)); 


    }
}