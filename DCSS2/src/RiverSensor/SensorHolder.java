package RiverSensor;

/**
 * Generated from IDL interface "Sensor".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 13-Apr-2020 20:24:29
 */

public final class SensorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Sensor value;
	public SensorHolder()
	{
	}
	public SensorHolder (final Sensor initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return SensorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SensorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		SensorHelper.write (_out,value);
	}
}
