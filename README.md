# quotes

## Lab08

This app shows random popular book quotes with the author name,
It chooses one quote each time it is run.
And I used GSON to parse the .json file. 

## Lab09
Rather than using a hardcoded file of JSON data with quotes as in Lab08,
the quotes will be grabbed from an API and display those to the user.

I have a class called **QuoteAPI**, That includes the API's data
and in the main,
When we run the code it will fetch a quote from the API and display its text, and its author to the user,
So, If there is any problem with the connection a local quote will be fetched.

![Source](https://stackoverflow.com/questions/3869372/java-io-ioexception-server-returned-http-response-code-403-for-url)


### Documentation
To Install dependencies follow this [Link](https://search.maven.org/artifact/com.google.code.gson/gson/2.8.7/jar)
and Copy what inside `Gradle Groovy DSL` to paste it in build.gradle under dependencies.
