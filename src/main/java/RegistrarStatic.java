import java.util.HashMap;

/**
 * Created by zhazha on 10/20/17.
 */
public final class RegistrarStatic {
    private HashMap<String, Course> coursePool;

    private RegistrarStatic() {
        this.coursePool = new HashMap<>();
    }

    private static final RegistrarStatic instance = new RegistrarStatic();

    public static RegistrarStatic getInstance(){
        return instance;
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
