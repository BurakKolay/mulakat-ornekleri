package trycatch;

public class TryCatch {
    public static void main(String[] args) {


//        ArithmeticException();
//        ArithmeticExceptionWithFinally();
//        ArrayIndexOutOfBoundsException();
//        NullPointerException();
//        NullPointerWithBaseException();
        SystemExit();
    }



    private void sagaPattern(){
        //feign
        try{
            // order service'e gittim
            // discount service'e gittim
            //
            //
            //
        } catch(Exception e){
//            orderService.rollBack()
            // order service'e rollback attım
            // discount service'e rollback attım
        }
    }

    private static void NullPointerException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }
    }

    private static void SystemExit() {
        try {
            System.out.println("Try");
            System.exit(0);
        } finally {
            System.out.println("Finally");
        }
    }

    private static void ArithmeticException() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic Exception");
        }
    }

    private static void ArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic Exception");
        }
    }

    private static void ArithmeticExceptionWithFinally() {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally");
        }
    }
    private static void NullPointerWithBaseException() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
// SAGA Pattern
/*
order
discount
fatura
shipping
envanter
 */
