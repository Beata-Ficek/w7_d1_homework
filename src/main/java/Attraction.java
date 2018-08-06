public abstract class Attraction implements IReviewed {

    public String name;
    public int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

}
