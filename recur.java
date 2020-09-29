public class recur{
    public static void main(String[] args) {
        int p;
        
        
        System.out.println(fun(5));
    }
    public static int fun(int a){
        
        
        
        if(a<=0)
            return 0;
        
        return a +fun(a-1);
    }
}