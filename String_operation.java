public class String_operation {
    String sentence;

    public static void main(String[] args) {
        String_operation obj1 = new String_operation();
        obj1.sentence = "The sun is shining";
        String[] words = obj1.sentence.split(" ");
        String newstring = obj1.sentence.replaceAll("\\s+", "");

        for (String string : words) {
            System.out.println(string);// print words of string
        }

        System.err.println("Total words are:" + newstring.length());// find the length of sentence

        System.out.print("is replaced by is'nt:");
        String replace = obj1.sentence.replaceAll("is", "is'nt");// replace the word
        System.out.println(replace);

        String uppercase = obj1.sentence.toUpperCase();// convert into uppeercase
        System.out.println(uppercase);

    }
}
