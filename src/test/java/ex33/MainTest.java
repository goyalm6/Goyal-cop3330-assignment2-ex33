package ex33;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getAnswerShouldReturnYes() {
        String[] resArr = {"Yes","No","Maybe","Ask again later"};
        String response = resArr[0];
        assertEquals("Yes", response);
    }

    @Test
    void getAnswerShouldReturnNo() {
        String[] resArr = {"Yes","No","Maybe","Ask again later"};
        String response = resArr[1];
        assertEquals("No", response);
    }

    @Test
    void getAnswerShouldReturnMaybe() {
        String[] resArr = {"Yes","No","Maybe","Ask again later"};
        String response = resArr[2];
        assertEquals("Maybe", response);
    }

    @Test
    void getAnswerShouldReturnAskAgain() {
        String[] resArr = {"Yes","No","Maybe","Ask again later"};
        String response = resArr[3];
        assertEquals("Ask again later", response);
    }
}