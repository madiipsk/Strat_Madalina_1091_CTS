package clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected Integer varsta;
	protected Integer punctaj;
	protected Integer nrProiecte;
	protected String[] denumireProiect;

	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public void setDenumiriProiecte(int nrProiecte,String[] denumiri) {
		this.nrProiecte = nrProiecte;
		denumireProiect=new String[nrProiecte];
		for(int i=0;i<nrProiecte;i++) {
			denumireProiect[i]=denumiri[i];
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Aplicant{");
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nrProiecte=").append(nrProiecte);
		sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
		return sb.toString();
	}


}