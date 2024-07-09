package ProtoType.ConfigurationObject;

public class Client {
    public static void main(String[] args) {
        Configuration configuration = new Configuration("Dark",true,"en-us",true,24,"inter",ConfigurationType.BASIC);
        ConfigurationPrototypeRegistry configurationPrototypeRegistry = new ConfigurationPrototypeRegistryImpl();
        configurationPrototypeRegistry.addPrototype(configuration);
        Configuration config = configurationPrototypeRegistry.getPrototype(ConfigurationType.BASIC);
        System.out.println(config.getAutoSave());
        System.out.println(config.getFontFamily());
        System.out.println(config.getThemeColor());
    }
}
