public abstract class Stall implements IReviewed  {

    public String name;
    public String ownerName;
    public int parkingSpot;
    public int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }


        public int getParkingSpot() {
            return parkingSpot;
        }


        public void setParkingSpot(int parkingSpot) {
            this.parkingSpot = parkingSpot;
        }

        public int getRating(){
        return this.rating;
        }
}
