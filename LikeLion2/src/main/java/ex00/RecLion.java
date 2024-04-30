package ex00;

 public class RecLion {
        public static void main(String[] args) {
            int i = 0;
            printRec(i);
        }

        public static void printRec(int i) {
            if (i > 10) {
                return;
            }
            if (i < 10) {
                System.out.println("Hello Baby Lion 0" + i);
            } else {
                System.out.println("Hello Baby Lion 10");
            }
            printRec(i + 1);
        }
 }