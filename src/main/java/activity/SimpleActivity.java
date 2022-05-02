package activity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class SimpleActivity extends Activity {

    private String place;

    public SimpleActivity() {
    }

    public SimpleActivity(LocalDateTime startTime, String description, String place) {
        super(startTime, description);
        this.place = place;
    }

    public SimpleActivity(long id, LocalDateTime startTime, String description, String place) {
        super(id, startTime, description);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
