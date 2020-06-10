package com.nina;

import com.nina.hometask3.compression.DataDecoder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DataDecoderTest {
    private DataDecoder dataDecoder;

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

    @BeforeEach
    public void setUp() {
        dataDecoder = new DataDecoder();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testDataDecoder(String expected, String value) {
        assertEquals(expected, dataDecoder.decode(value));
    }

    @Test
    public void testIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> dataDecoder.decode("invalid"));
    }
}
