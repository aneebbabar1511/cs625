// Read a character from the keyboard.
class Kbln {
  public static void main(String args[])
    throws java.io.IOException {
    char ch;
    System.out.print("Press a key followed by ENTER:");
    ch  = (char) System.in.read(); // get a char
    System.out.println("Your key is:" + ch);
   }
}