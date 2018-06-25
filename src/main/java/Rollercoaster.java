import java.util.ArrayList;

public class Rollercoaster extends Attractions implements ISecurity{

    private String name;


    public Rollercoaster(String name, Double heightRestriction) {
        super(name, heightRestriction);

    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getHeight() >= rollercoaster.getHeightRestriciton();
    }


}
