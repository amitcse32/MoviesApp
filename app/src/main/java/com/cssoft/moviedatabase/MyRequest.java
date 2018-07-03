package com.cssoft.moviedatabase;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import retrofit2.http.Url;

public class MyRequest extends AsyncTask<String, String, String> {


    @Override
    protected String doInBackground(String... strings) {

        try {
            URL requestUrl = new URL("https://api.androidhive.info/contacts/");
            HttpURLConnection connection=(HttpURLConnection) requestUrl.openConnection();
            InputStream in = connection.getInputStream();
            InputStreamReader isw = new InputStreamReader(in);
            int data = isw.read();
            while (data != -1) {
                char current = (char) data;
                data = isw.read();
                System.out.print(current);
            }


        } catch (MalformedURLException e) {

        }
        catch (IOException e)
        {

        }

        return "";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
