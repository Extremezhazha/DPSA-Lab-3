import java.util.HashMap;

/**
 * Created by zhazha on 10/20/17.
 */
public class RegistrarSubclassable {
    protected HashMap<String, Course> coursePool;

    public RegistrarSubclassable() {
        this.coursePool = new HashMap<>();
    }

    private static RegistrarSubclassable instance = null;

    public static synchronized RegistrarSubclassable getInstance(){
        return (RegistrarSubclassable) SingletonRegistry.REGISTRY.getInstance(
                RegistrarSubclassable.class.getSimpleName()
        );
    }

    public void register(Student student, String courseId){
        Course course = coursePool.get(courseId);
        if (course == null)
            throw new RuntimeException("Course not found.");
        try {
            course.addStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void register(Student student, String courseId, String name, String lecturer, int seats){
        Course course = coursePool.get(courseId);
        if (course == null){
            course = new Course(courseId, name, lecturer, seats);
            coursePool.put(courseId, course);
        }
        try {
            course.addStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
