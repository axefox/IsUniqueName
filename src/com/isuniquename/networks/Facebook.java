package com.isuniquename.networks;

/**
 * Created by shifar on 1/2/16.
 */
public class Facebook extends BaseNetwork {

    private static final String FACEBOOK = "Facebook";
    private static final String FACEBOOK_NETWORK_URL_FORMAT = "https://facebook.com/%s";

    public Facebook(String name) {
        super(FACEBOOK, FACEBOOK_NETWORK_URL_FORMAT,name);
    }
}
