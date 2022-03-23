package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    public List<Aplicant> readAplicants() throws FileNotFoundException;
}