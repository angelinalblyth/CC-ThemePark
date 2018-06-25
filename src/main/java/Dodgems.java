public class Dodgems extends Attractions{

    public Dodgems(String name, Double heightRestriction) {
        super(name, heightRestriction);
    }

    public boolean visitorCanRide(Visitor visitors, Dodgems dodgems){
        return visitors.getHeight() >= dodgems.getHeightRestriciton();
    }

}