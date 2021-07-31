package quotes.lab09Tests;

import org.junit.Test;
import quotes.bookQuote.QuoteAPI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class testQuoteAPI {
    @Test
    public void testQuoteAPI() {
        QuoteAPI quote = new QuoteAPI("www.", "Noor", "Sara", "Hello World", ".com");
        assertNotNull(quote);
        assertEquals("www.", quote.getSenderLink());
        assertEquals("Noor", quote.getAuthor());
        assertEquals("Sara", quote.getSenderName());
        assertEquals("Hello World", quote.getText());
        assertEquals(".com", quote.getQuoteLink());
        QuoteAPI quote2 = new QuoteAPI("Hello World");
        assertEquals("Hello World", quote2.getText());
    }
}
