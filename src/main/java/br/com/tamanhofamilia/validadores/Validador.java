package br.com.tamanhofamilia.validadores;

public interface Validador {
	boolean validaDocumentoCompleto(String documentoCompleto);
	String digitosVerificadores(String numeroRG);
}
