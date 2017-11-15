public class SingleObject {
    //create an object of single object
    private static SingleObject instance = new SingleObject();
    //constructor class cannot be instantiated
    private SingleObject(){}
    // get the only object available
    public static  SingleObject getInstance(){
        return instance;
    }

    public static void showMessage(){
        System.out.print("Hello");
    }
}
