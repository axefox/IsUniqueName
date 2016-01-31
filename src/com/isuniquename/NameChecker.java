package com.isuniquename;

import com.isuniquename.networks.BaseNetwork;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shifar on 31/1/16.
 */
public class NameChecker {


    public static final String TWITTER = "https://twitter.com/%s";
    public static final String GITHUB = "https://github.com/%s";
    public static final String FACEBOOK = "https://facebook.com/%s";
    private final String name;
    private final List<BaseNetwork> checkList;

    public NameChecker(String name) throws UnsupportedEncodingException {
        this.name = URLEncoder.encode(name, "UTF-8");
        this.checkList = new ArrayList<>();
    }


    public NameChecker checkOn(BaseNetwork network) throws UnsupportedEncodingException {
        checkList.add(network);
        return this;
    }

    public void check() {
        for (final BaseNetwork network : checkList) {
            try {
                final URL networkUrl = new URL(network.getNetworkUrl());
                final HttpURLConnection con = (HttpURLConnection) networkUrl.openConnection();
                con.connect();

                if (con.getResponseCode() == 200) {
                    System.out.println("Name not available on " + network.getNetworkName());
                } else {
                    System.out.println("YES!!! Name available on " + network.getNetworkName());
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished!");
    }
}
