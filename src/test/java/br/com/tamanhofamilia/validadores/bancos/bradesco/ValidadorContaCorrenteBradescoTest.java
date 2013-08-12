package br.com.tamanhofamilia.validadores.bancos.bradesco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadorContaCorrenteBradescoTest {
	private Validador validador;
	
	@Before
	public void init() {
		validador = new ValidadoContaCorrenteBradesco();
	}
	
	@Test
	public void Testa_Validacao_() {
		assertTrue(validador.validaDocumentoCompleto("262-3"));
		assertTrue(validador.validaDocumentoCompleto("0284.025-1"));
		assertTrue(validador.validaDocumentoCompleto("0325.620-0"));
	}
	
	@Test
	public void Teste_geracao_digito_verificador(){
		assertEquals("1", validador.digitosVerificadores("00284.025"));
		assertEquals("0", validador.digitosVerificadores("0325.620"));
	}
}
