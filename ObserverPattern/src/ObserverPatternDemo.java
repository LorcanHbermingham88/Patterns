

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.print("\nFirst state change: 15\n");
        subject.setState(15);
        System.out.print("\nSecond state change 10\n");
        subject.setState(10);
    }
}
