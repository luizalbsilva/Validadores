package br.com.tamanhofamilia.validadores.bancos;

import br.com.tamanhofamilia.validadores.Validador;

public abstract class Mod11Validador implements Validador{
	private int limiteSup;
	private int limiteInf;
	private String d10;
	private String d11;

	public Mod11Validador(int limiteInf, int limiteSup, String d10, String d11) {
		this.limiteInf = limiteInf;
		this.limiteSup = limiteSup-limiteInf+1;
		this.d10 = d10;
		this.d11 = d11;
	}
	
	public boolean validaDocumentoCompleto(String numCompleto) {
		numCompleto = numCompleto.trim();
		return digitosVerificadores(numCompleto.substring(0, numCompleto.length()-1)).equals(""+numCompleto.charAt(numCompleto.length()-1));
	}

	public String digitosVerificadores(String numPoupanca) {
		String all = numPoupanca.replaceAll("\\D", "");
		int acum = 0;
		for(int x=0; x<all.length(); x++)
			acum += ((int)(all.charAt(x)-'0')) * ((all.length()-1-x)%limiteSup+limiteInf);
		int retorno = 11 - (acum%11);
		return "" + (retorno==10?d10:retorno > 9? d11: retorno);
	}
}
