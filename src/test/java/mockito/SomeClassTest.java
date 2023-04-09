package mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SomeClassTest {
    private SomeClass someMock = mock(SomeClass.class);
    @Test
    void test(){
        when(someMock.getValue(anyInt())).thenReturn(8);
        when(someMock.getValue(0)).thenReturn(2);

        int arg1 = someMock.getValue(10);
        int arg2 = someMock.getValue(3);
        int arg3 = someMock.getValue(0);

        int result = arg1 + arg2 + arg3;
        System.out.println(result);
    }
}