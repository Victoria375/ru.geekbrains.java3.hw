package SixthHW;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class SixthHWTest {
    @ParameterizedTest
    @MethodSource("newArrAfterFourTest")
    void sliceTest(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, SixthHW.newArrAfterFour(in));
    }

    static Stream<Arguments> newArrAfterFourTest() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{3, 6, 8, 5, 4, 5, 6, 4, 5, 4, 9}, new int[]{9}));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4}, new int[]{}));
        return list.stream();
    }

    @Test
    void checkArrTest() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(SixthHW.checkArr(new int[]{4, 4, 1})),
                () -> Assertions.assertTrue(SixthHW.checkArr(new int[]{1, 4, 1, 4, 4, 4, 4, 4, 1})),
                () -> Assertions.assertTrue(SixthHW.checkArr(new int[]{1, 4, 4, 1, 4, 1})),
                () -> Assertions.assertTrue(SixthHW.checkArr(new int[]{1, 1, 1, 4, 4, 4, 1})));
    }

//    @Test
//    void newArrAfterFour() {
//    }
//
//    @Test
//    void checkArr() {
//    }

}

