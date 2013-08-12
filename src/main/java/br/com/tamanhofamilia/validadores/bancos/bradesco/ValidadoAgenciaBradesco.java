package br.com.tamanhofamilia.validadores.bancos.bradesco;

import br.com.tamanhofamilia.validadores.Validador;

public class ValidadoAgenciaBradesco implements Validador {

	public boolean validaDocumentoCompleto(String agenciaCompleta) {
		agenciaCompleta = agenciaCompleta.trim();
		return digitosVerificadores(agenciaCompleta.substring(0, agenciaCompleta.length()-1)).equals(""+agenciaCompleta.charAt(agenciaCompleta.length()-1));
	}

	public String digitosVerificadores(String agencia) {
		String all = agencia.replaceAll("\\D", "");
		int acum = 0;
		for(int x=0; x<all.length(); x++)
			acum += ((int)(all.charAt(x)-'0')) * (all.length()+1-x);
		int retorno = 11 - (acum%11);
		return "" + (retorno > 9? 0: retorno);
	}

}
