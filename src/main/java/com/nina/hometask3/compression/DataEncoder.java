package com.nina.hometask3.compression;

public class DataEncoder {

    public String encode(String data) {
        if (data == null || data.isEmpty()) {
            return data;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < data.length(); i++) {
            char curr = data.charAt(i);
            if (curr == '\\' || Character.isDigit(curr)) {
                result.append('\\').append(curr);
                continue;
            }

            if (i + 1 == data.length() || curr != data.charAt(i + 1)) {
                result.append(count).append(curr);
                count = 1;
            } else {
                count++;
            }
        }

        return result.toString();
    }
}
