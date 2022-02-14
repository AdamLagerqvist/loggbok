import java.io.Serializable;
import java.util.Date;

public class Logg implements Serializable {
    private String message;
    private Date writtenAt;
    private Date lastEdited;
    private String writtenBy;

    public Logg(String writtenBy, String message) {
        this.writtenBy = writtenBy;
        this.message = message;
        writtenAt = new Date();
        lastEdited = writtenAt;
    }

    @Override
    public String toString() {
        return "Logg{" + "written at: " + writtenAt + "\nwritten by: " + writtenBy + '\n' + message +
                "\nlastEdited: " + lastEdited + '}';
    }
}
