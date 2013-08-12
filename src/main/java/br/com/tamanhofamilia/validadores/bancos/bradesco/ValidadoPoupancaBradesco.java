package br.com.tamanhofamilia.validadores.bancos.bradesco;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadoPoupancaBradesco implements Validador {

	public boolean validaDocumentoCompleto(String documentoCompleto) {
		documentoCompleto = documentoCompleto.trim();
		return digitosVerificadores(documentoCompleto.substring(0, documentoCompleto.length()-1)).equals(""+documentoCompleto.charAt(documentoCompleto.length()-1));
	}

	public String digitosVerificadores(String documento) {
		String all = documento.replaceAll("\\D", "");
		int acum = 0;
		for(int x=0; x<all.length(); x++)
			acum += ((int)(all.charAt(x)-'0')) * ((all.length()-1-x)%6+2);
		int retorno = 11 - (acum%11);
		return "" + (retorno==10?"P":retorno > 9? "0": retorno);
	}

}
