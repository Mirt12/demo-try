public class Main2 {
    public static void main(String[] args) {
        int[] arr = {10, 0, 37, 44};
        for (int i = 0; i < 10; i++) {
//            try {
//                System.out.println(arr[1/i]);
//            } catch (ArrayIndexOutOfBoundsException e1) {
//                System.out.println("index is more then array length");
//            } catch (ArithmeticException e2){
//                System.out.println("There is division on 'null'");
//            }
//            System.out.println(i);
//        }
//        System.out.println("Code still works");

            try{
                System.out.println(arr[1/i]);
            } catch (Exception e3){
                System.out.println("Code still works");
            }
        }
    }
}
