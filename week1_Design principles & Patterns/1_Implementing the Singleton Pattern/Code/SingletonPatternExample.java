// Main class for testing
class SingletonPatternExample{
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        l1.log("Hello world.");
        Logger l2=Logger.getInstance();
        l2.setType("email");
        l1.log("Payment successful with id 1002.");
        //checking if both the object is same
        System.out.println(l1==l2);
    }
}
