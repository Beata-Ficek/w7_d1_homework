public class TobaccoStall extends Stall implements ISecurity, IReviewed{

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {

        super(name, ownerName, parkingSpot, rating);
    }


    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

    public boolean isAllowedTo(Visitor visitor) {
        visitor.getAge();
        if (visitor.getAge > 18) {

        }
        return true;
    }






}


