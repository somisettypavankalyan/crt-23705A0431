class Codechef {
    public static void main(String[] args)  {
        int[] num = {1, 5, 9, 6, 3, 2};
        
     for(int j=0;j<num.length-1;j++){
         boolean isSwapped=false;
         for(int i=0;i<num.length-j-1;i++){
             if(num[i]>num[i+1]){
                 int temp=num[i];
                 num[i]=num[i+1];
                 num[i+1]=temp;
                 isSwapped=true;
             }
         }
         if(!isSwapped)break;
     }
    for(int val:num){
        System.out.println(val); 
    }
  }
}