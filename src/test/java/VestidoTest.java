import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class VestidoTest {

    @Test
    void deveArmazenarEstados() {
        Vestido vestido = new Vestido();
        vestido.setEstado(VestidoEstadoManutencao.getInstance());
        vestido.setEstado(VestidoEstadoDisponivel.getInstance());
        assertEquals(2, vestido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Vestido vestido = new Vestido();
        vestido.setEstado(VestidoEstadoVendido.getInstance());
        vestido.setEstado(VestidoEstadoReservado.getInstance());
        vestido.restauraEstado(0);
        assertEquals(VestidoEstadoVendido.getInstance(), vestido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Vestido vestido = new Vestido();
        vestido.setEstado(VestidoEstadoAlugado.getInstance());
        vestido.setEstado(VestidoEstadoVendido.getInstance());
        vestido.setEstado(VestidoEstadoAlugado.getInstance());
        vestido.setEstado(VestidoEstadoReservado.getInstance());
        vestido.restauraEstado(2);
        assertEquals(VestidoEstadoAlugado.getInstance(), vestido.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Vestido vestido = new Vestido();
            vestido.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
