/**********************************************************************
 * $Source$
 * $Revision$
 * $Date$
 * $Author$
 *
 * Copyright (c) by Heiner Jostkleigrewe
 * All rights reserved
 * heiner@jverein.de
 * www.jverein.de
 * $Log$
 * Revision 1.2  2010-09-09 18:50:57  jost
 * Eigenschaftengruppen k�nnen jetzt auch das Merkmal "Pflicht" haben. Dann mu� mindestens eine Eigenschaft ausgew�hlt werden.
 *
 * Revision 1.1  2009/11/17 21:02:05  jost
 * Neu: Eigenschaft und EigenschaftGruppe
 *
 **********************************************************************/
package de.jost_net.JVerein.rmi;

import java.rmi.RemoteException;

import de.willuhn.datasource.rmi.DBObject;

public interface EigenschaftGruppe extends DBObject
{
  public String getBezeichnung() throws RemoteException;

  public void setBezeichnung(String bezeichnung) throws RemoteException;

  public void setPflicht(Boolean pflicht) throws RemoteException;

  public boolean getPflicht() throws RemoteException;

  public void setMax1(Boolean max1) throws RemoteException;

  public boolean getMax1() throws RemoteException;

}
