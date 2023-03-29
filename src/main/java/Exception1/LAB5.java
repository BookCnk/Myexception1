package Exception1;

public class LAB5 {
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        } catch(Exception e){
            System.out.println("Main method receive exception " + e.getMessage()); //Message in Exception
        }
    }
    public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }
    public static void doThat() throws Exception {
        System.out.println(1/0);//Auto
//        throw new Exception();
    }
}
