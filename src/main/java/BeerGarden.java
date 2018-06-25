public class BeerGarden  extends Stall implements ISecurity{

    private String name;
    private String ownerName;
    private String parkingSpot;

    public BeerGarden(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() >= 18;
    }
}
