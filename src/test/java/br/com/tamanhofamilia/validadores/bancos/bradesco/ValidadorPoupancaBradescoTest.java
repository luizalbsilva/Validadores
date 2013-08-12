package br.com.tamanhofamilia.validadores.bancos.bradesco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadorPoupancaBradescoTest {
	private Validador validador;
	
	@Before
	public void init() {
		validador = new ValidadoPoupancaBradesco();
	}
	
	@Test
	public void Testa_Validacao_() {
		assertTrue(validador.validaDocumentoCompleto("0325.620-0"));
		assertTrue(validador.validaDocumentoCompleto("0238.069-2"));
		assertTrue(validador.validaDocumentoCompleto("0301.357-P"));
	}
	
	@Test
	public void Teste_geracao_digito_verificador(){
		assertEquals("P", validador.digitosVerificadores("0301.357"));
		assertEquals("0", validador.digitosVerificadores("0325.620"));
	}
}
