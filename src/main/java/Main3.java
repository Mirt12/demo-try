public class Main3 {
    public static void main(String[] args) {
        String str = "content= Samsung =Galaxy S22= Ultra 12GB/512GB =/ SM-S908B = description\"";
        String[] str1 = str.split("=");
        for (String st: str1) {
            System.out.println(st);
        }
    }
}
