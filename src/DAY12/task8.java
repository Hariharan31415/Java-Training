package DAY12;
enum Traffic2 {
    RED("stop"),
    GREEN("go"),
    YELLOW("ready");

    private String action;

    // Constructor
    Traffic2(String action) {
        this.action = action;
    }

    // Getter method to access action
    public String actionTaken() {
        return action;
    }
}

public class task8 {
public static void main(String args[])
{
	//System.out.println(traffic2.RED.actionTaken());   // we cant able to access using red
	

for(Traffic2 light:Traffic2.values())    //we can accees it using variable
{
	System.out.println("light "+light.actionTaken());
}
}
}