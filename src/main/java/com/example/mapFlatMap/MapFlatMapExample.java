package com.example.mapFlatMap;

import java.util.function.Function;
import java.util.stream.Stream;

public class MapFlatMapExample {
    public static void main(String[] args) {
      Stream<String>  stream = Stream.of("Venkt","Anjana","Pardhu","Rao","Anil");
        Function<String,String> function = val-> val+"   "+val.length() ;
        stream.flatMap(function).forEach(System.out::println);
        stream.flatMap(function).forEach(System.out::println);
    }
}
