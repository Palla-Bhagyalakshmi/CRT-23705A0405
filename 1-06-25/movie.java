class Movie {
    String name;
    String category;
    String duration;
    float rating;
    void details() {
        System.out.println("String name:"+name);
        System.out.println("String category:"+category);
        System.out.println("float rating:"+rating);
        if(rating>9){
            System.out.println("movie is hit");
        }
        else{
            System.out.println("movie is flop");
        }
    }
    
    Movie(String name, String category, String duration, float rating) {
        this.name = name;
        this.category = category;
        this.duration = duration;
        this.rating = rating;
    }
}
 public class Main{
        public static void main(String[] args){
           Movie s1=new Movie("dj","lovestory","o1h50m",5f);
            s1.details();
            
        }
    }
  