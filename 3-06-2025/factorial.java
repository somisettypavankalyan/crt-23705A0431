class Main {
    public static void main(String[] args) {
       System.out.println(fact(10));
    }
   public static int fact(int n){
       if (n==1){
       return 1;
   } 
    int value=n*fact(n-1);
    return value;
    
         
    }
}