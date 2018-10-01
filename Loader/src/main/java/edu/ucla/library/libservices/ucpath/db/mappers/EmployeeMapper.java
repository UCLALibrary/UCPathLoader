package edu.ucla.library.libservices.ucpath.db.mappers;

import edu.ucla.library.libservices.ucpath.bean.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper
  implements RowMapper
{
  public EmployeeMapper()
  {
    super();
  }

  @Override
  public Object mapRow( ResultSet rs, int i )
    throws SQLException
  {
    Employee bean;

    bean = new Employee();
    bean.setAddrLine1( rs.getString( "work_addr_line1" ) );
    bean.setAddrLine2( rs.getString( "work_addr_line2" ) );
    bean.setCity( rs.getString( "work_addr_city" ) );
    bean.setEmail( rs.getString( "email_addr" ) );
    bean.setFirstName( rs.getString( "emp_first_name" ) );
    //bean.setHomeDeptCode( rs.getString( "home_dept_code" ) );
    bean.setLastName( rs.getString( "emp_last_name" ) );
    bean.setLaw( rs.getInt( "law" ) );
    bean.setMailCode( rs.getString( "campus_mail_code" ) );
    bean.setMiddleName( rs.getString( "emp_middle_name" ) );
    bean.setPhone( rs.getString( "campus_phone" ) );
    bean.setState( rs.getString( "work_addr_state" ) );
    bean.setType( rs.getInt( "type" ) );
    bean.setUid( rs.getString( "employee_id" ) );
    bean.setZip( rs.getString( "work_addr_zip" ) );

    return bean;
  }
}
