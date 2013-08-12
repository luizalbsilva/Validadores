package br.com.tamanhofamilia.validadores;

public interface Validador {
	/**
	 * Valida se o número do documento bate com seus dígitos verificadores
	 * @param documentoCompleto Número completo do documento, acrescido de dígitos verificadores
	 * @return Se é válido
	 */
	boolean validaDocumentoCompleto(String documentoCompleto);
	
	/**
	 * Calcula os dígitos verificadores
	 * @param numeroDocumento número do documento
	 * @return dígitos verificadores
	 */
	String digitosVerificadores(String numeroDocumento);
}
