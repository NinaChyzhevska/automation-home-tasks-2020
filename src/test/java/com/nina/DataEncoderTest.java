package com.nina;

import com.nina.hometask3.compression.DataEncoder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataEncoderTest {

    public static String[][] data() {
        return new String[][] {
                {null, null},
                {"AAAA", "4A"},
                {"aaa", "3a"},
                {"Abb", "1A2b"},
                {"1", "\\1"},
                {"\\", "\\\\"},
                {"AAAAaaaBBBBBB\\12", "4A3a6B\\\\\\1\\2"}};
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testDataDecoder(String value, String expected) {
        assertEquals(expected, new DataEncoder().encode(value));
    }
}
