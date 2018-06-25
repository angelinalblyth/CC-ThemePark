public class Waterslide extends Attractions {

    public Waterslide(String name, Double heightRestriction) {
        super(name, heightRestriction);
    }

    public boolean visitorCanRide(Visitor visitors, Waterslide waterslide) {
        return visitors.getHeight() >= waterslide.getHeightRestriciton();
    }
}

