public class Playground extends Attractions implements ISecurity{

    public Playground(String name, Double heightRestriction) {
        super(name, heightRestriction);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() <= 15;
    }

}
