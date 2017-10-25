/**
 * Created by zhazha on 10/25/17.
 */
public class EfficientRegistrar extends RegistrarSubclassable {
    public EfficientRegistrar() {}

    public static synchronized EfficientRegistrar getInstance() {
        return (EfficientRegistrar) SingletonRegistry.REGISTRY.getInstance(
                EfficientRegistrar.class.getSimpleName()
        );
    }

    public void unregister(Student student, String courseId){
        Course course = this.coursePool.get(courseId);
        if (course == null){
            throw new RuntimeException("Course not found.");
        }
        course.removeStudent(student);
        if (course.hasNoStudents()){
            coursePool.remove(courseId);
        }
    }

}
