package activity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class ActivityDao {

    private EntityManagerFactory entityManagerFactory;

    public ActivityDao(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void saveActivity(Activity activity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(activity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void saveSimpleActivity(SimpleActivity simpleActivity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(simpleActivity);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void saveActivityWithTrack(ActivityWithTrack activityWithTrack) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(activityWithTrack);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Activity findActivityById(long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Activity result = entityManager.find(Activity.class, id);
        entityManager.close();
        return result;
    }

    public SimpleActivity findSimpleActivityById(long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        SimpleActivity result = entityManager.find(SimpleActivity.class, id);
        entityManager.close();
        return result;
    }

    public ActivityWithTrack findActivityWithTrackById(long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ActivityWithTrack result = entityManager.find(ActivityWithTrack.class, id);
        entityManager.close();
        return result;
    }

    public List<Activity> findAllActivities() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Activity> result = entityManager.createQuery(
                        "select a from Activity a",
                        Activity.class)
                .getResultList();
        entityManager.close();
        return result;
    }

    public List<SimpleActivity> findAllSimpleActivities() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<SimpleActivity> result = entityManager.createQuery(
                        "select a from Activity a",
                        SimpleActivity.class)
                .getResultList();
        entityManager.close();
        return result;
    }

    public List<ActivityWithTrack> findAllActivitiesWithTrack() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<ActivityWithTrack> result = entityManager.createQuery(
                        "select a from Activity a",
                        ActivityWithTrack.class)
                .getResultList();
        entityManager.close();
        return result;
    }
}
