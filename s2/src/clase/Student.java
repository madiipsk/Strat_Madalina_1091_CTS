package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected Integer anStudii;


	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAn_studii(Integer anStudii) {
		this.anStudii = anStudii;
	}


	public Student() {
		super();

	}

	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Numar Proiecte=" + nrProiecte +  ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii ;
	}


}