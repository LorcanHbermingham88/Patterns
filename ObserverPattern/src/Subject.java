import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState(){
        return state;
    }
    

}
