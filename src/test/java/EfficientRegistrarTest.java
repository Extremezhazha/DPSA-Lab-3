import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhazha on 10/25/17.
 */
public class EfficientRegistrarTest {
    @Test
    public void getInstance() throws Exception {
        Object superInstanceA = RegistrarSubclassable.getInstance();
        Assert.assertEquals(superInstanceA, RegistrarSubclassable.getInstance());
        Object instanceA = EfficientRegistrar.getInstance();
        Assert.assertEquals(instanceA, EfficientRegistrar.getInstance());
        Assert.assertNotEquals(superInstanceA, instanceA);
    }

}