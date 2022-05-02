package activity;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class ActivityWithTrack extends Activity {

    private double distance;

    private int duration;

    public ActivityWithTrack() {
    }

    public ActivityWithTrack(LocalDateTime startTime, String description, double distance, int duration) {
        super(startTime, description);
        this.distance = distance;
        this.duration = duration;
    }

    public ActivityWithTrack(long id, LocalDateTime startTime, String description, double distance, int duration) {
        super(id, startTime, description);
        this.distance = distance;
        this.duration = duration;
    }
}
