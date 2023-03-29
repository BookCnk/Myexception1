package Exception1;

public class LAB2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
//          System.out.println(list[10]);
            throw new Exception();
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException e){
            System.out.println("RuntimeException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
