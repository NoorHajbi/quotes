package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.junit.Test;
import quotes.bookQuote.QuoteAPI;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.*;

public class Lab09Test {
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

    @Test
    public void testConnection() throws IOException {
        String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        assertTrue(connection.getResponseCode() != 200);
    }

    @Test
    public void testMain() throws IOException {
        String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.setRequestProperty("User-Agent", "Mozilla 5.0 (Windows; U; "
                + "Windows NT 5.1; en-US; rv:1.8.0.11) ");
        connection.connect();

        //Test1
        assertEquals("sun.net.www.protocol.http.HttpURLConnection:http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en",
                connection.toString());


        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String data = bufferedReader.readLine();
        Gson gson = new Gson();
        QuoteAPI quoteData = gson.fromJson(data, QuoteAPI.class);
        bufferedReader.close();

        //Test2
        assertNotNull(quoteData.getAuthor());
        assertNotNull(quoteData.getText());
    }
}
