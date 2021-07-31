package quotes.lab09Tests;

import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertTrue;

public class testConnection {
    @Test
    public void testConnection() throws IOException {
        String url = "http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        assertTrue(connection.getResponseCode() != 200);
    }
}
