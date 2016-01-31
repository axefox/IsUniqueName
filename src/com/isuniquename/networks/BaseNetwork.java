package com.isuniquename.networks;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by shifar on 1/2/16.
 */
public class BaseNetwork {
    private static final String UTF8 = "UTF-8";
    private final String networkName, name;
    private String networkUrl;

    public BaseNetwork(String networkName, String networkUrlFormat, String name) {
        this.networkName = networkName;
        try {
            this.networkUrl = String.format(networkUrlFormat, URLEncoder.encode(name, UTF8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    public String getNetworkName() {
        return networkName;
    }

    public String getNetworkUrl() {
        return networkUrl;
    }

    public String getName() {
        return name;
    }
}
