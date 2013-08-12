package br.com.tamanhofamilia.validadores.bancos.bradesco;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadoPoupancaBradesco implements Validador {

	public boolean validaDocumentoCompleto(String numPoupancaCompleto) {
		numPoupancaCompleto = numPoupancaCompleto.trim();
		return digitosVerificadores(numPoupancaCompleto.substring(0, numPoupancaCompleto.length()-1)).equals(""+numPoupancaCompleto.charAt(numPoupancaCompleto.length()-1));
	}

	public String digitosVerificadores(String numPoupanca) {
		String all = numPoupanca.replaceAll("\\D", "");
		int acum = 0;
		for(int x=0; x<all.length(); x++)
			acum += ((int)(all.charAt(x)-'0')) * ((all.length()-1-x)%6+2);
		int retorno = 11 - (acum%11);
		return "" + (retorno==10?"P":retorno > 9? "0": retorno);
	}

}
