

public class Park extends Attraction implements IReviewed {

    public Park(String name, int Rating) {
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
