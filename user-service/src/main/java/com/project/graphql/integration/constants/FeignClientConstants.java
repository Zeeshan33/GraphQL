package com.project.graphql.integration.constants;

public final class FeignClientConstants {

    private FeignClientConstants() {
    }

    public static final String SLASH = "/";
    public static final String PARAM_BRACE_OPEN = "{";
    public static final String PARAM_BRACE_CLOSE = "}";
    public static final String USER_ID_PARAM = "userId";
    public static final String USER_ID_URI = PARAM_BRACE_OPEN + USER_ID_PARAM + PARAM_BRACE_CLOSE;
}
