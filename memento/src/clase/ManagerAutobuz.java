package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    List<AutobuzMemento> autobuze;

    public ManagerAutobuz() {
        autobuze = new ArrayList<>();
    }

    public void adaugaMemento(AutobuzMemento autobuzMemento) {
        autobuze.add(autobuzMemento);
    }

    public AutobuzMemento getMemento(Integer index) {
        return autobuze.get(index);
    }
}
