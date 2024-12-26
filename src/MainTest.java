import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void EmptyString() {
        Assertions.assertEquals(Main.CountNumebrs(""),0);
    }
    @org.junit.jupiter.api.Test
    void FullNumberString() {
        Assertions.assertEquals(Main.CountNumebrs("1234567890"),10);
    }

    @org.junit.jupiter.api.Test
    void NullNumber() {
        Assertions.assertEquals(Main.CountNumebrs("qwerty"),0);
    }

    @org.junit.jupiter.api.Test
    void OneNumberChar() {
        Assertions.assertEquals(Main.CountNumebrs("1"),1);
    }

    @org.junit.jupiter.api.Test
    void OneNumber() {
        Assertions.assertEquals(Main.CountNumebrs("qwe1rty"),1);
    }


}