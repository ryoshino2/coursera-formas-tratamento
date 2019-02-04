import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteFormatoNome {

	@Test
	void testeInformal() {
		FormatadorNome fn = new Informal();
		Autoridade autoridade = new Autoridade ("Rafael", "Yoshino", fn);
		assertEquals(autoridade.getTratamento(), "Rafael");
	}
	
	@Test
	void testeRespeitosoMasculino() {
		FormatadorNome fn = new Respeitoso("masculino");
		Autoridade autoridade = new Autoridade ("Rafael", "Yoshino", fn);
		assertEquals(autoridade.getTratamento(), "Sr. Yoshino");
	}
	
	@Test
	void testeRespeitosoFeminino() {
		FormatadorNome fn = new Respeitoso("feminino");
		Autoridade autoridade = new Autoridade ("Rafaela", "Yoshino", fn);
		assertEquals(autoridade.getTratamento(), "Sra. Yoshino");
	}
	
	@Test
	void testeComTitulo() {
		FormatadorNome fn = new ComTitulo("Magnifico");
		Autoridade autoridade = new Autoridade ("Rafael", "Yoshino", fn);
		assertEquals(autoridade.getTratamento(), "Magnifico Rafael Yoshino");
	}
}
