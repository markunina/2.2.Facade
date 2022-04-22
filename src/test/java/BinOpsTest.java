import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinOpsTest {

        BinOps sut = new BinOps();

        @BeforeAll
        public static void initSuite() {
            System.out.println("Running BinOpsTest");
        }

        @AfterAll
        public static void completeSuite() {
            System.out.println("BinOpsTest complete");
        }

        @BeforeEach
        public void initTest() {
            System.out.println("Test start");
        }

        @AfterEach
        public void finalizeTest() {
            System.out.println("Test complete");
        }

    @Test
    public void sumTest() {
        //given
        String original = "1001";

        //when
        String result = sut.sum("110","11");

        //then
        assertEquals(original, result);
    }

    @Test
    public void multTest() {
        //given
        String original = "10010";

        //when
        String result = sut.mult("110","11");

        //then
        assertEquals(original, result);
    }

}
