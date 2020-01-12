package com.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;

public class HttpRequest {
    public String getcall(String urlString ) {
        URL url = null;
        HttpURLConnection con = null;
        StringBuffer content = new StringBuffer();

        try {
            url =  new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            con.disconnect();
        }
        return content.toString();

    }
}
