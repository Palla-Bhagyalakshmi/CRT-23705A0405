class App{
    String name;
    String category;
    int download;
    String[] reviews;
    void details(){
        System.out.println("String name:"+name);
        System.out.println("String category:"+category);
        System.out.println("String download:"+download);
        System.out.println("reviews");
           for(String reviews:reviews){
                System.out.println(reviews+",");
           }
           if(download>50){
                System.out.println("app is more popular");
           }
           else{
                System.out.println("app is less popular");           }
    }
    App(String name,String category,int download,String[] reviews){
        this.name=name;
        this.category=category;
        this.download=download;
        this.reviews=reviews;
    }
}
   public class Main{
        public static void main(String[] args){
            String[] reviews={"more useful","less useful","good","bad"};
            App r1=new App("instagram","entertainment",50,reviews);
            r1.details();
        }
    }
 