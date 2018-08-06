
public class Rollercoaster extends Attraction implements IReviewed  {


    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

   public String getName(){
        return this.name;
   }

   public void setName(String name){
        this.name = name;
    }

    public int getRating(){
        return this.rating;
    }
}
