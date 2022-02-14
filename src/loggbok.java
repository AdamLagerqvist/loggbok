import java.io.*;
import java.util.ArrayList;

public class loggbok {

    ArrayList<Logg> logg = new ArrayList<Logg>();

    public loggbok() {
        logg.add(new Logg("Adam","testing"));
        Save();
        Load();
        System.out.println(logg);
    }

    private void Save() {
        try {
            ObjectOutputStream ObjOut = new ObjectOutputStream(new FileOutputStream(new File("bogus/test")));
            ObjOut.writeObject(logg);
            ObjOut.flush();
            ObjOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Load() {
        try {
            ObjectInputStream ins = new ObjectInputStream(new FileInputStream(new File("bogus/test")));
            logg = (ArrayList<Logg>) ins.readObject();
            ins.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
