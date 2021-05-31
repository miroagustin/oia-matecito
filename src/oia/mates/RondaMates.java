package oia.mates;

import java.util.LinkedList;
import java.util.List;

public class RondaMates {

	private int[] arrayAis;
	List<Integer> noCebanMate = new LinkedList<Integer>();
	List<Integer> listaOIAS = new LinkedList<Integer>();
	int cebadorMate;

	public RondaMates(int nroOIAs, int[] arrayAis) {
		this.arrayAis = arrayAis;
		for (int i = 0; i < nroOIAs; i++) {
			listaOIAS.add(i+1);
		}
		
	}
	public void resolver() {
		int indiceAnterior = 0;
		for (int i = 0; i < arrayAis.length; i++) {
			int indiceActual = (indiceAnterior + arrayAis[i]) % listaOIAS.size();
			noCebanMate.add(listaOIAS.remove(indiceActual));
			indiceAnterior = indiceActual;
		}
		cebadorMate = listaOIAS.get(0);
	}
	public String getResultado() {
		return ""+ noCebanMate + "\n" + cebadorMate;
	}
}
