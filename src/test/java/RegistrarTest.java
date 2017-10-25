import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhazha on 10/25/17.
 */
public class RegistrarTest {
    @Test
    public void getInstance() throws Exception {
        Registrar a = Registrar.getInstance();
        Assert.assertEquals(a,Registrar.getInstance());
    }

    @Test
    public void register() throws Exception {
    }

    @Test
    public void register1() throws Exception {
    }

}