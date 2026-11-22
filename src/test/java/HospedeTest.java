import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospedeTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Hospede hospede = new Hospede(123, "Hospede Original", new Endereco("Rua A", 1), "hospede@gmail.com");

        Hospede hospedeClone = hospede.clone();
        hospedeClone.setCodigo(456);
        hospedeClone.setNome("Hospede Clonado");
        hospedeClone.getEndereco().setNumero(2);

        assertEquals("Hospede{Codigo=123, nome='Hospede Original', endereco=Endereco{logradouro='Rua A', numero=1}, email='hospede@gmail.com'}", hospede.toString());
        assertEquals("Hospede{Codigo=456, nome='Hospede Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, email='hospede@gmail.com'}", hospedeClone.toString());
    }
}
