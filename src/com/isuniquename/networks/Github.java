package com.isuniquename.networks;

/**
 * Created by shifar on 1/2/16.
 */
public class Github extends BaseNetwork {


    private static final String GITHUB = "Github";
    private static final String GITHUB_NETWORK_URL_FORMAT = "https://github.com/%s";

    public Github(String name) {
        super(GITHUB, GITHUB_NETWORK_URL_FORMAT, name);
    }
}
