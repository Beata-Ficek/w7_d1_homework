public class CandyFlossStall extends Stall implements IReviewed  {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int rating) {

        super(name, ownerName, parkingSpot, rating);
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }
}
