package activity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu");

        ActivityDao activityDao = new ActivityDao(entityManagerFactory);

        Activity activity = new Activity(
                LocalDateTime.of(2022, 4,5,14,12,11), "jogging");
        SimpleActivity simpleActivity = new SimpleActivity(
                LocalDateTime.of(2022, 4,5,14,12,11), "jogging", "forest");
        ActivityWithTrack activityWithTrack = new ActivityWithTrack(
                LocalDateTime.of(2022, 4,5,14,12,11), "jogging", 2.4, 12);

        activityDao.saveActivity(activity);
        activityDao.saveSimpleActivity(simpleActivity);
        activityDao.saveActivityWithTrack(activityWithTrack);
    }
}
