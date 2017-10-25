import java.util.HashMap;

/**
 * Created by zhazha on 10/25/17.
 */
public final class SingletonRegistry {
    public static final SingletonRegistry REGISTRY = new SingletonRegistry();
    private static HashMap<String, Object> map = new HashMap<>();

    private SingletonRegistry() {
    }

    public synchronized Object getInstance(String classname) {
        Object instance = map.get(classname);
        if (instance == null) {
            try {
                instance = Class.forName(classname).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            map.put(classname, instance);
        }
        return instance;
    }
}
