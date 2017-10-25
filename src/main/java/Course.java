import java.util.HashMap;

/**
 * Created by zhazha on 10/20/17.
 */
public class Course {
    private String id;
    private String name;
    private String lecturer;
    private int seats;
    HashMap<String, Student> studentHashMap;

    public Course(String id, String name, String lecturer, int seats) {
        this.id = id;
        this.name = name;
        this.lecturer = lecturer;
        this.seats = seats;
        this.studentHashMap = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public int getSeats() {
        return seats;
    }

    public void addStudent(Student student){
        if (studentHashMap.size() == seats)
            throw new RuntimeException("No seats left.");
        studentHashMap.put(student.getId(), student);
    }

    public void removeStudent(Student student){
        studentHashMap.remove(student.getId());
    }

    public boolean hasNoStudents(){ return studentHashMap.isEmpty(); }
}
