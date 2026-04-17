import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CaixaEletronicoTest {

    @Test
    void deveRetornarNotasCorretasQuandoValorFor380() {
        // Arrange
        Logger loggerMock = mock(Logger.class);
        CaixaEletronico caixa = new CaixaEletronico(loggerMock);

        // Act
        String resultado = caixa.sacar(380);

        // Assert
        assertEquals("3x100 1x50 1x20 1x10", resultado);
        verify(loggerMock).log("Saque realizado: 3x100 1x50 1x20 1x10 ");
    }

    @Test
    void deveRetornarNotasCorretasQuandoValorFor30() {
        // Arrange
        Logger loggerMock = mock(Logger.class);
        CaixaEletronico caixa = new CaixaEletronico(loggerMock);

        // Act
        String resultado = caixa.sacar(30);

        // Assert
        assertEquals("1x20 1x10", resultado);
        verify(loggerMock).log("Saque realizado: 1x20 1x10 ");
    }

    @Test
    void deveRetornarUmaNotaQuandoValorFor10() {
        // Arrange
        Logger loggerMock = mock(Logger.class);
        CaixaEletronico caixa = new CaixaEletronico(loggerMock);

        // Act
        String resultado = caixa.sacar(10);

        // Assert
        assertEquals("1x10", resultado);
        verify(loggerMock).log("Saque realizado: 1x10 ");
    }

    @Test
    void deveLancarExcecaoQuandoValorNaoForMultiploDe10() {
        // Arrange
        Logger loggerMock = mock(Logger.class);
        CaixaEletronico caixa = new CaixaEletronico(loggerMock);

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            caixa.sacar(35);
        });

        verify(loggerMock).log("Valor inválido: 35");
    }
}