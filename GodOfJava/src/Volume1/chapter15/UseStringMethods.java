package Volume1.chapter15;

public class UseStringMethods {

    public static void main(String[] args) {
        UseStringMethods practice = new UseStringMethods();
        String str = "The String class represents character strings.";
        // practice.printWords(str);
        // practice.findString(str, "string");
        // practice.findAnyCaseString(str, "string");
        // practice.countChar(str, 's');
        practice.printContainWords(str, "ss");
    }

    public void printWords(String str) {
        String[] splitArr = str.split(" ");
        for (String s : splitArr) {
            System.out.println(s);
        }
    }

    public void findString(String str, String findStr) {
        int indexOfFindStr = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + indexOfFindStr);
    }

    public void findAnyCaseString(String str, String findStr) {
        int indexOfFindStr = str.toLowerCase().indexOf(findStr);
        System.out.println(findStr + " is appeared at " + indexOfFindStr);
    }

    public void countChar(String str, char c) {
        char[] chArr = str.toCharArray();
        int count = 0;
        for (char ch : chArr) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println("char " + "'" + c + "'" + " count is " + count);
    }

    public void printContainWords(String str, String findStr) {
        String[] splitArr = str.split(" ");
        for (String s : splitArr) {
            if (s.contains(findStr)) {
                System.out.println(s + " contains " + findStr);
            }
        }
    }
}
