package factory.config.interfaces;

/**
 * @author wangpengkai
 */
public interface SingletonBeanRegistry {
    /**
     * get singleton object
     * @param beanName the name of bean
     * @return object
     */
    public Object getSingleton(String beanName);
}
