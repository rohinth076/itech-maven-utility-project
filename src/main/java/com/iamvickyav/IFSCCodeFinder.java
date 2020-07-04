package com.iamvickyav;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.Scanner;

public class IFSCCodeFinder {

    String findDetails(String ifscCode) throws IOException {

        String url = "https://ifsc.razorpay.com/"+ ifscCode;

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet(url);
        HttpResponse httpresponse = httpclient.execute(httpget);

        Scanner sc = new Scanner(httpresponse.getEntity().getContent());

        //Printing the status line
        System.out.println(httpresponse.getStatusLine());
        String result = "";
        while(sc.hasNext()) {
            result = result + sc.nextLine();
        }
        return result;
    }
}
