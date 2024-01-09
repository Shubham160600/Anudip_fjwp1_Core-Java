/* Tokenizing. */

package shubham;

import java.util.StringTokenizer;

public class TokenizingExample {
    public static void main(String[] args) {
        String sentence = "Java is a popular programming language.";
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
