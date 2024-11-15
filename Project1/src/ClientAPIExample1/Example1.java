package ClientAPIExample1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Example1 {

	public Example1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String  request =  "https://api.dictionaryapi.dev/api/v2/entries/en/Happy";
		HttpRequest http_request = HttpRequest
												.newBuilder()
												.GET()
												.uri(URI.create(request))
												.build();
		HttpClient http_client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> responce = http_client.send(http_request, BodyHandlers.ofString());
			System.out.println(responce.body());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
