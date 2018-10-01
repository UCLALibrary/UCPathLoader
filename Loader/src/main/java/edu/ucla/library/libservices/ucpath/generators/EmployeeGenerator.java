package edu.ucla.library.libservices.ucpath.generators;

import edu.ucla.library.libservices.ucpath.bean.Employee;

import edu.ucla.library.libservices.ucpath.db.mappers.EmployeeMapper;
import edu.ucla.library.libservices.ucpath.db.source.DataSourceFactory;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Properties;

public class EmployeeGenerator
{
  private final String EMP_QUERY = "query.ucpath";
  private final String SCHEMA = "ucpath";
  private List<Employee> employees;
  private Properties props;
  private DriverManagerDataSource ds;

  public EmployeeGenerator()
  {
    super();
  }

  public void setProps( Properties props )
  {
    this.props = props;
  }

  public Properties getProps()
  {
    return props;
  }

  private void makeConnection()
  {
    ds = DataSourceFactory.createSource(getProps(), SCHEMA);
  }

  public List<Employee> getEmployees()
  {
    makeConnection();
    employees = new JdbcTemplate( ds ).query( getProps().getProperty( EMP_QUERY ), new EmployeeMapper() );
    return employees;
  }
}
