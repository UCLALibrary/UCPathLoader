package edu.ucla.library.libservices.ucpath.bean;

public class Employee
{
  private String uid;
  private String firstName;
  private String middleName;
  private String lastName;
  private String email;
  private String addrLine1;
  private String addrLine2;
  private String mailCode;
  private String phone;
  private String city;
  private String state;
  private String zip;
  private String homeDeptCode;
  private int type;
  private int law;

  public Employee()
  {
    super();
  }

  public void setUid( String uid )
  {
    this.uid = uid;
  }

  public String getUid()
  {
    return ( uid == null || uid.equalsIgnoreCase( "null" ) ? "" : uid.trim() );
  }

  public void setFirstName( String firstName )
  {
    this.firstName = firstName;
  }

  public String getFirstName()
  {
    return ( firstName == null || firstName.equalsIgnoreCase( "null" ) ? "" : firstName.trim() );
  }

  public void setMiddleName( String middleName )
  {
    this.middleName = middleName;
  }

  public String getMiddleName()
  {
    return ( middleName == null || middleName.equalsIgnoreCase( "null" ) ? "" : middleName.trim() );
  }

  public void setLastName( String lastName )
  {
    this.lastName = lastName;
  }

  public String getLastName()
  {
    return ( lastName == null || lastName.equalsIgnoreCase( "null" ) ? "" : lastName.trim() );
  }

  public void setEmail( String email )
  {
    this.email = email;
  }

  public String getEmail()
  {
    return ( email == null || email.equalsIgnoreCase( "null" ) ? "" : email.trim() );
  }

  public void setAddrLine1( String addrLine1 )
  {
    this.addrLine1 = addrLine1;
  }

  public String getAddrLine1()
  {
    return ( addrLine1 == null || addrLine1.equalsIgnoreCase( "null" ) ? "" : addrLine1.trim() );
  }

  public void setAddrLine2( String addrLine2 )
  {
    this.addrLine2 = addrLine2;
  }

  public String getAddrLine2()
  {
    return ( addrLine2 == null || addrLine2.equalsIgnoreCase( "null" ) ? "" : addrLine2.trim() );
  }

  public void setMailCode( String mailCode )
  {
    this.mailCode = mailCode;
  }

  public String getMailCode()
  {
    return ( mailCode == null || mailCode.equalsIgnoreCase( "null" ) ? "" : mailCode.trim() );
  }

  public void setPhone( String phone )
  {
    this.phone = phone;
  }

  public String getPhone()
  {
    return ( phone == null || phone.equalsIgnoreCase( "null" ) ? "" : phone.trim() );
  }

  public void setCity( String city )
  {
    this.city = city;
  }

  public String getCity()
  {
    return ( city == null || city.equalsIgnoreCase( "null" ) ? "" : city.trim() );
  }

  public void setState( String state )
  {
    this.state = state;
  }

  public String getState()
  {
    return ( state == null || state.equalsIgnoreCase( "null" ) ? "" : state.trim() );
  }

  public void setZip( String zip )
  {
    this.zip = zip;
  }

  public String getZip()
  {
    return ( zip == null || zip.equalsIgnoreCase( "null" ) ? "" : zip.trim() );
  }

  public void setHomeDeptCode( String homeDeptCode )
  {
    this.homeDeptCode = homeDeptCode;
  }

  public String getHomeDeptCode()
  {
    return ( homeDeptCode == null || homeDeptCode.equalsIgnoreCase( "null" ) ? "" : homeDeptCode.trim() );
  }

  public void setType( int type )
  {
    this.type = type;
  }

  public int getType()
  {
    return type;
  }

  public void setLaw( int law )
  {
    this.law = law;
  }

  public int getLaw()
  {
    return law;
  }

  public String toString()
  {
    StringBuffer toString;

    toString = new StringBuffer( getUid() );
    toString.append( "," ).append( getFirstName() ).append( "," ).append( getMiddleName() ).append( "," ).append( getLastName() ).append( "," );
    toString.append( getEmail() ).append( "," ).append( getAddrLine1() ).append( "," ).append( getAddrLine2() ).append( "," ).append( getMailCode() );
    toString.append( "," ).append( getPhone() ).append( "," ).append( getCity() ).append( "," ).append( getState() ).append( "," ).append( getZip() );
    toString.append( "," ).append( getType() ).append( "," ).append( getLaw() );
    //toString.append( "," ).append( getHomeDeptCode() )

    return toString.toString();
  }
}
