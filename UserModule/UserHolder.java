package UserModule;

/**
* UserModule/UserHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
*/

public final class UserHolder implements org.omg.CORBA.portable.Streamable
{
  public User value = null;

  public UserHolder ()
  {
  }

  public UserHolder (User initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UserHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UserHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UserHelper.type ();
  }

}
