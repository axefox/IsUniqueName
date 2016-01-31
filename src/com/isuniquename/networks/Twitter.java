package com.isuniquename.networks;

/**
 * Created by shifar on 1/2/16.
 */
public class Twitter extends BaseNetwork {
    private static final String TWITTER = "Twitter";
    private static final String TWITTER_NETWORK_URL_FORMAT = "https://twitter.com/%s";

    public Twitter(String name) {
        super(TWITTER, TWITTER_NETWORK_URL_FORMAT, name);
    }
}
