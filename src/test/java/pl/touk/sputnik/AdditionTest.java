package pl.touk.sputnik;

import org.junit.jupiter.api.Test;
import pl.touk.sputnik.connector.Addition;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    private Addition addition = new Addition(2,3);

    @Test
    void shouldAdd(){
        int result = addition.add();
        assertEquals(5, result, "The addition result should be 5");
    }
}
