public class Main {
    public static void main(String[] args) {
        int n=13;
      int count = 0;
      for(int i=1;i<=n;i++){
          if(n%i==0){
              count=count+1;
          }
      }
      if(count==2){
          System.out.println("it is a prime number"+n);
          
      }
      else{
        System.out.println("it is not a prime number"+n);
    }
}
}