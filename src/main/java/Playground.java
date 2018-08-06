public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAllowedTo(Visitor visitor) {
        visitor.getAge();
        if (visitor.getAge() <= 15) {

        }
        return true;
    }

    public int getRating(){
        return this.rating;
    }


}

