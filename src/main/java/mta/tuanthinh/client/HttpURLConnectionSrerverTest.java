package mta.tuanthinh.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import mta.tuanthinh.entity.BaseEntity;

public class HttpURLConnectionSrerverTest<T extends BaseEntity> {

	
	public String sendGetRequest(String URL) throws Exception{
		URL url = new URL(URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		// By default it is GET request
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", "abc");

		int responseCode = con.getResponseCode();
		System.out.println("Sending get request : " + url);
		System.out.println("Response code : " + responseCode);

		// Reading response from input Stream
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();

		// printing result from response
//		System.out.println(response.toString());

		return response.toString();
	}
	
	public String sendPostRequest(String URL, String data) throws Exception{
		URL url = new URL(URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		// By default it is GET request
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setDoOutput(true);
		OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream(), Charset.forName("UTF-8"));
		wr.write(data);
		wr.flush();
		wr.close();
		// add request header
//		con.setRequestProperty("User-Agent", "abc");

		int responseCode = con.getResponseCode();
		System.out.println("Sending get request : " + url);
		System.out.println("Response code : " + responseCode);

		// Reading response from input Stream
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();

		// printing result from response
//		System.out.println(response.toString());

		return response.toString();
	}
	
	public String sendPutRequest(String URL, String data) throws Exception{
		URL url = new URL(URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		// By default it is GET request
		con.setRequestMethod("PUT");
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setDoOutput(true);
		OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream(), Charset.forName("UTF-8"));
		wr.write(data);
		wr.flush();
		wr.close();
		// add request header
//		con.setRequestProperty("User-Agent", "abc");

		int responseCode = con.getResponseCode();
		System.out.println("Sending get request : " + url);
		System.out.println("Response code : " + responseCode);

		// Reading response from input Stream
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();

		// printing result from response
//		System.out.println(response.toString());

		return response.toString();
	}
	
	public String sendDeleteRequest(String URL) throws Exception{
		URL url = new URL(URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		// By default it is GET request
		con.setRequestMethod("DELETE");

		// add request header
//		con.setRequestProperty("User-Agent", "abc");

		int responseCode = con.getResponseCode();
		System.out.println("Sending get request : " + url);
		System.out.println("Response code : " + responseCode);

		// Reading response from input Stream
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();

		// printing result from response
//		System.out.println(response.toString());

		return response.toString();
	}
	
	public <T> T getUniqueResult(String URL, Class<T> clazz) throws Exception {
		return (T) new ObjectMapper().readValue(sendGetRequest(URL), clazz);
	}
	
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public List<T> getListResult(String URL) throws Exception {
		return new ObjectMapper().readValue(sendGetRequest(URL), new TypeReference<List<T>>() {});
	}
	
	public <T> T PostResult(String URL, Class<T> clazz) throws Exception {
		String data = new ObjectMapper().writeValueAsString(clazz);
		System.out.println(data);
		return (T) new ObjectMapper().readValue(sendPostRequest(URL, data), clazz);
	}
	
	public <T> T PutResult(String URL, Class<T> clazz) throws Exception {
		String data = new ObjectMapper().writeValueAsString(clazz);
		return (T) new ObjectMapper().readValue(sendPostRequest(URL, data), clazz);
	}

}
