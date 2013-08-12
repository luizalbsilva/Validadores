package br.com.tamanhofamilia.validadores.bancos.bradesco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import br.com.tamanhofamilia.validadores.Validador;
import br.com.tamanhofamilia.validadores.bancos.bradesco.ValidadoAgenciaBradesco;

public class ValidadorAgenciaBradescoTest {
	private Validador validador;
	
	@Before
	public void init() {
		validador = new ValidadoAgenciaBradesco();
	}
	
	@Test
	public void Testa_Validacao_() {
		assertTrue(validador.validaDocumentoCompleto("0412-0"));
		assertTrue(validador.validaDocumentoCompleto("2878-9"));
	}
	
	@Test
	public void Teste_geracao_digito_verificador(){
		assertEquals("0", validador.digitosVerificadores("0412"));
		assertEquals("9", validador.digitosVerificadores("2878"));
	}
}
