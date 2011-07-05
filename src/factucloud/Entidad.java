package factucloud;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Entidad
{
@PrimaryKey  
@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 	
private String refentidad;
@Persistent private String nombre;
@Persistent private String apellidos;
@Persistent private String nif;

public String getRefentidad()
	{
	return refentidad;
	}
public void setRefentidad(String refentidad)
	{
	this.refentidad=refentidad;
	}
public String getNombre()
	{
	return nombre;
	}
public void setNombre(String nombre)
	{
	this.nombre=nombre;
	}
public String getApellidos()
	{
	return apellidos;
	}
public void setApellidos(String apellidos)
	{
	this.apellidos=apellidos;
	}
public String getNif()
	{
	return nif;
	}
public void setNif(String nif)
	{
	this.nif=nif;
	}
}
