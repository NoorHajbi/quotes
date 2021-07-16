package quotes.bookQuote;

import java.util.Arrays;

public class Quote {
    private String[] tags;
    private String author;
    private String likes;
    private final String text;

    public Quote(String text) {
        this.text = text;
    }

    public Quote(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;

    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "tags=" + Arrays.toString(tags) +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
