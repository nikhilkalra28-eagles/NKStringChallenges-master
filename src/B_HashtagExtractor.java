/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        int start = post.indexOf("#");
        int end = post.indexOf(" ", start);
        String hashtag = post.substring(start, end);
        int start2 = post.indexOf(" ", end );
        int end2 = post.indexOf(" ", start2 );
        String hashtag2 = post.substring(start2, end2);
        System.out.println("Hashtag:" + hashtag );
        System.out.println("Hashtag:" + hashtag2);



    }

}
