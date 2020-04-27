package com.nina.hometask3.compression;

public class Main {
    public static void main(String[] args) {
        DataEncoder encoder = new DataEncoder();
        DataDecoder decoder = new DataDecoder();
        System.out.println(encoder.encode("AAAAaaaBBBBBB\\12"));
        System.out.println(decoder.decode(encoder.encode("AAAAaaaBBBBBB\\12")));
    }
}
