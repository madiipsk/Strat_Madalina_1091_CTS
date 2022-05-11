package clase;

import java.util.ArrayList;
import java.util.List;

public class Matematica {

    public int suma(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public double raport(int numarator, int numitor) {
        if(numitor!=0){
            return numarator / (float)numitor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean estePar(int numar) {
        return numar % 2 == 0;
    }

    public List<Integer> nNumerePare(int n) {
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            lista.add(i * 2);
        return lista;
    }
}