import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> mp;

    public IOU() {
        this.mp = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        double amt = this.mp.getOrDefault(toWhom, 0.0);
        this.mp.put(toWhom, amt + amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.mp.getOrDefault(toWhom, 0.0);
    }
}
