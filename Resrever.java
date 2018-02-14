public class Resrever{

  public static String linreverse(String str) {
    String back = "";
    for (int i = str.length() -1; i > -1; i --) {
      back += str.substring(i, i + 1);
    }
    return back;
  }

  public static void main(String[] args) {
    System.out.println(linreverse("Hello, world"));
  }
  
}
