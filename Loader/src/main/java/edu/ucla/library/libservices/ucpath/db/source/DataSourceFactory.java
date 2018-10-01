package edu.ucla.library.libservices.ucpath.db.source;

import java.util.Properties;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceFactory
{
  public DataSourceFactory()
  {
    super();
  }

  public static DriverManagerDataSource createSource(Properties props, String schema)
  {
    DriverManagerDataSource ds;

    ds = new DriverManagerDataSource();
    ds.setDriverClassName( props.getProperty( "db.driver.".concat( schema ) ) );
    ds.setUrl( props.getProperty( "db.url.".concat( schema ) ) );
    ds.setUsername( props.getProperty( "db.user.".concat( schema ) ) );
    ds.setPassword( props.getProperty( "db.password.".concat( schema ) ) );

    return ds;
  }
}
