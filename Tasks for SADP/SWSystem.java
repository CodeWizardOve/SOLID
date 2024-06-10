class SWSystem
{
    public static void main(String[] args)
    {
        ConfigurationManager configurationManager = ConfigurationManager.getConfiguration();
        configurationManager.addConfiguration();
        configurationManager.addSettings(); 
    }
}

class ConfigurationManager
{
    private static ConfigurationManager configuration = new ConfigurationManager();
    private ConfigurationManager(){}
    public static ConfigurationManager getConfiguration() {
        return null;
    }
    public static ConfigurationManager gConfiguration()
    {
        return configuration;
    }
}

public void addConfiguration()
{
    System.out.println("Application configured");

}


public void addSettings()
{
    System.out.println("Settings added");
    
}