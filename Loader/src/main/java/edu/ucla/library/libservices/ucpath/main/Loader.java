package edu.ucla.library.libservices.ucpath.main;

import edu.ucla.library.libservices.ucpath.bean.Employee;
import edu.ucla.library.libservices.ucpath.generators.EmployeeGenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Loader
{
  private static final Logger logger = Logger.getLogger( Loader.class );
  private static Properties props;
  private static List<Employee> employees;

  public Loader()
  {
    super();
  }

  public static void main( String[] args )
  {
    loadProperties( args[ 0 ] );
    getEmployees();
    writeFile();
  }

  private static void loadProperties( String propFile )
  {
    props = new Properties();
    try
    {
      props.load( new FileInputStream( new File( propFile ) ) );
    }
    catch ( IOException ioe )
    {
      logger.fatal( "problem with props file" + ioe.getMessage() );
      System.exit( -1 );
    }
  }

  public static void getEmployees()
  {
    EmployeeGenerator generator;

    generator = new EmployeeGenerator();
    generator.setProps( props );
    employees = generator.getEmployees();
  }
  
  public static void writeFile()
  {
    BufferedWriter writer;
    try
    {
      writer = new BufferedWriter( new FileWriter( new File( "C:\\Temp\\patrons\\employees.txt" )) );
      
      for ( Employee theEmp : employees )
      {
        writer.write( theEmp.toString() );
        writer.newLine();
      }

      writer.flush();
      writer.close();
    }
    catch ( IOException ioe )
    {
      ioe.printStackTrace();
    }
  }
}
