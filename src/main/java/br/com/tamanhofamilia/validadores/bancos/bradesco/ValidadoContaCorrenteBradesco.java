package br.com.tamanhofamilia.validadores.bancos.bradesco;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadoContaCorrenteBradesco implements Validador {

	public boolean validaDocumentoCompleto(String numCCCompleta) {
		numCCCompleta = numCCCompleta.trim();
		return digitosVerificadores(numCCCompleta.substring(0, numCCCompleta.length()-1)).equals(""+numCCCompleta.charAt(numCCCompleta.length()-1));
	}

	public String digitosVerificadores(String numeroCC) {
		String all = numeroCC.replaceAll("\\D", "");
		int acum = 0;
		for(int x=0; x<all.length(); x++)
			acum += ((int)(all.charAt(x)-'0')) * ((all.length()-1-x)%6+2);
		int retorno = 11 - (acum%11);
		return "" + (retorno > 9? 0: retorno);
	}

}
