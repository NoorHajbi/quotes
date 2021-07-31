package quotes.lab09Tests;

import com.google.gson.Gson;
import org.junit.Test;
import quotes.bookQuote.QuoteAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class testMain {
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
