package com.nina.hometask3.compression;

public class DataDecoder {

    public String decode(String data) {
        if (data == null || data.isEmpty()) {
            return data;
        }

        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < data.length(); i += 2) {
            char curr = data.charAt(i);
            if (curr != '\\' && !Character.isDigit(curr) || i + 1 == data.length()) {
                throw new IllegalArgumentException("Invalid encoded string");
            }

            if (Character.isDigit(curr)) {
                int count = curr - '0';
                decoded.append(String.valueOf(data.charAt(i + 1)).repeat(count));
            } else {
                decoded.append(data.charAt(i + 1));
            }
        }
        return decoded.toString();
    }
}
