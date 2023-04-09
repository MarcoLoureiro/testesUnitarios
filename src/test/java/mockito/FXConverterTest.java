package mockito;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

//@ExtendWith(MockitoExtension.class)
class FXConverterTest {
    private RemoteFXRateService service = mock(RemoteFXRateService.class);
    // Mocka a classe RemoteFXRateService
    private FXConverter converter = new FXConverter(service);
    // Instancia a classe principal (alvo dos testes), com a classe mockada
    @Test
    @DisplayName("Given 100.00 USD, when convert to USD, then return 100.00")
    void test1() {
        when(service.getRate("USD", "USD")).thenReturn("1.20000");

        BigDecimal result = converter.convert("USD", "USD", "100.00");

        assertEquals("120.00", result.toString());
    }
}