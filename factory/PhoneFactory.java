package factory;

public class PhoneFactory
{
    public Phone getPhone(String phone)
    {
   if(phone == null)
    {
        return null;
    }
      if(phone.equalsIgnoreCase("landline"))
      {
        return new Landline();

      }
      else if(phone.equalsIgnoreCase("satellitephone"))
    {
        return new SatellitePhone();

    }
      else if(phone.equalsIgnoreCase("smartphone"))
    {
        return new SmartPhone();
    }

      return null;
}
}
