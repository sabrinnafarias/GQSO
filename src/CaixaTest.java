import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaixaTest {
    Caixa cx = new Caixa();
    @Test
    void deposito() {
        assertEquals(false, cx.deposito(-200));
    }
    @Test
    void saque() {
        assertEquals(false, cx.deposito(-200));
    }
    @Test
    void saldo() {
    }

}