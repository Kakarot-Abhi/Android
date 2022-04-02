package com.imdb.csvparser.util;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LambdaUtils {

    public Function<String, String> trimPrefSuffix = str -> str.substring(1, str.length() - 1);
}
