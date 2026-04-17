import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CaixaEletronicoTest {

    @Test
    void testeSaqueComSucesso() {
        Logger loggerMock = mock(Logger.class);

        CaixaEletronico caixa = new CaixaEletronico(loggerMock);

        String resultado = caixa.sacar(100);

        assertEquals("1x100", resultado);

        verify(loggerMock).log("Saque realizado: 1x100 ");
    }

    @Test
    void testeErroValorInvalido() {
        Logger loggerMock = mock(Logger.class);

        CaixaEletronico caixa = new CaixaEletronico(loggerMock);

        assertThrows(IllegalArgumentException.class, () -> {
            caixa.sacar(35);
        });

        verify(loggerMock).log("Valor inválido: 35");
    }
}