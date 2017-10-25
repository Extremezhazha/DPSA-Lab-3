import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhazha on 10/25/17.
 */
public class RegistrarSpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        RegistrarSpring obj = (RegistrarSpring) context.getBean("registrar");
    }
}
