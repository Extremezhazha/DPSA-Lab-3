import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zhazha on 10/25/17.
 */
public class RegistrarSpringTest {
    @Test
    public void getInstance() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        RegistrarSpring obj = (RegistrarSpring) context.getBean("registrar");
        Assert.assertEquals(obj, context.getBean("registrar"));
    }
}