public interface IConnectionProvider
{
    public Connection establishconnection();
}

public class H2ConnectionProvider implements IConnectionProvider
{
    public Connection establishconnection();
    {
      return null;
    }
}

public class MySQLConnectionProvider implements IConnectionProvider
{
    public Connection establishconnection();
    {
        return null;
    }
}

public class OracleConnectionProvider implements IConnectionProvider
{
   public Connection establishconnection()
   {
      return null;
   }
}

public class OracleConnectionProvider extends IConnectionProvider
{
    public Connection establishconnection()
    {
        return null;
    }
}


public static void  main (String []args)
{
    OracleConnectionProvider oracleConnectionProvider
}
