package quotes.bookQuote;

public class QuoteAPI {
    private String quoteAuthor;
    private String senderName;
    private final String quoteText;
    private String senderLink;
    private String quoteLink;

    public QuoteAPI(String quoteText) {
        this.quoteText = quoteText;
    }

    public QuoteAPI(String senderLink, String quoteAuthor, String senderName, String quoteText, String quoteLink) {
        this.senderLink = senderLink;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.quoteText = quoteText;
        this.quoteLink = quoteLink;

    }


    public String getSenderLink() {
        return senderLink;
    }

    public String getAuthor() {
        return quoteAuthor;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getText() {
        return quoteText;
    }

    public String getQuoteLink() {
        return quoteLink;
    }

    @Override
    public String toString() {
        return "Quote{" +
                ", author='" + quoteAuthor + '\'' +
                ", text='" + quoteText + '\'' +
                '}';
    }
}
