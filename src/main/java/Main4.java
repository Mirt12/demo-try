public class Main4 {
    public static void main(String[] args) {
        String str3 = "schoenmoeder, 2, 3, 4, 5";
        String[] arr = str3.split(" ");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
