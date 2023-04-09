package mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DiceRollerTest {
    private Random random = mock(Random.class);
    private DiceRoller diceRoller = new DiceRoller(random);

    @Test
    @DisplayName("Testing rolling dice")
    void minimumDiceValueTest() {
        int dice = 6;
        when(random.nextInt(dice)).thenReturn(0);
        int result = diceRoller.roll(dice);
        assertEquals(1, result);
    }
}