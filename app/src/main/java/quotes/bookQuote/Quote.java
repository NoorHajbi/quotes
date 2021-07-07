package quotes.bookQuote;

public class Quote {
    private String tags;
    private String author;
    private String likes;
    private final String text;

    public Quote(String text) {
        this.text = text;
    }

    public Quote(String tags, String author, String likes, String text, String password, int age) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;

    }

//    public void attendClass(String asacClass) {
//        System.out.println("I am attending -> " + asacClass);
//    }

    public String getTags() {
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


//    @Override
//    public String toString() {
//        return String.format("I am %s %s and I am %d years old", firstName, lastName, age);
//    }
}
