package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/NoServant.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u25/1514/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, September 17, 2014 4:58:16 PM PDT
*/

public final class NoServant extends org.omg.CORBA.UserException
{

  public NoServant ()
  {
    super(NoServantHelper.id());
  } // ctor


  public NoServant (String $reason)
  {
    super(NoServantHelper.id() + "  " + $reason);
  } // ctor

} // class NoServant