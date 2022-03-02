package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}