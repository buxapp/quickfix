package org.quickfix.fix41;
import org.quickfix.FieldNotFound;
import org.quickfix.Group;
import org.quickfix.field.*;

public class OrderCancelReject extends Message
{
  public OrderCancelReject()
  {
    getHeader().setField(new MsgType("9"));
  }
  public OrderCancelReject(
    org.quickfix.field.OrderID aOrderID,
    org.quickfix.field.ClOrdID aClOrdID,
    org.quickfix.field.OrigClOrdID aOrigClOrdID,
    org.quickfix.field.OrdStatus aOrdStatus ) {

    getHeader().setField(new MsgType("9"));
    set(aOrderID);
    set(aClOrdID);
    set(aOrigClOrdID);
    set(aOrdStatus);
  }

  public void set(org.quickfix.field.OrderID value)
  { setField(value); }
  public org.quickfix.field.OrderID get(org.quickfix.field.OrderID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderID getOrderID() throws FieldNotFound
  { org.quickfix.field.OrderID value = new org.quickfix.field.OrderID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderID field)
  { return isSetField(field); }
  public boolean isSetOrderID()
  { return isSetField(37); }
  public void set(org.quickfix.field.SecondaryOrderID value)
  { setField(value); }
  public org.quickfix.field.SecondaryOrderID get(org.quickfix.field.SecondaryOrderID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound
  { org.quickfix.field.SecondaryOrderID value = new org.quickfix.field.SecondaryOrderID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecondaryOrderID field)
  { return isSetField(field); }
  public boolean isSetSecondaryOrderID()
  { return isSetField(198); }
  public void set(org.quickfix.field.ClOrdID value)
  { setField(value); }
  public org.quickfix.field.ClOrdID get(org.quickfix.field.ClOrdID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ClOrdID getClOrdID() throws FieldNotFound
  { org.quickfix.field.ClOrdID value = new org.quickfix.field.ClOrdID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ClOrdID field)
  { return isSetField(field); }
  public boolean isSetClOrdID()
  { return isSetField(11); }
  public void set(org.quickfix.field.OrigClOrdID value)
  { setField(value); }
  public org.quickfix.field.OrigClOrdID get(org.quickfix.field.OrigClOrdID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound
  { org.quickfix.field.OrigClOrdID value = new org.quickfix.field.OrigClOrdID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrigClOrdID field)
  { return isSetField(field); }
  public boolean isSetOrigClOrdID()
  { return isSetField(41); }
  public void set(org.quickfix.field.OrdStatus value)
  { setField(value); }
  public org.quickfix.field.OrdStatus get(org.quickfix.field.OrdStatus  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound
  { org.quickfix.field.OrdStatus value = new org.quickfix.field.OrdStatus();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrdStatus field)
  { return isSetField(field); }
  public boolean isSetOrdStatus()
  { return isSetField(39); }
  public void set(org.quickfix.field.ClientID value)
  { setField(value); }
  public org.quickfix.field.ClientID get(org.quickfix.field.ClientID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ClientID getClientID() throws FieldNotFound
  { org.quickfix.field.ClientID value = new org.quickfix.field.ClientID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ClientID field)
  { return isSetField(field); }
  public boolean isSetClientID()
  { return isSetField(109); }
  public void set(org.quickfix.field.ExecBroker value)
  { setField(value); }
  public org.quickfix.field.ExecBroker get(org.quickfix.field.ExecBroker  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecBroker getExecBroker() throws FieldNotFound
  { org.quickfix.field.ExecBroker value = new org.quickfix.field.ExecBroker();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecBroker field)
  { return isSetField(field); }
  public boolean isSetExecBroker()
  { return isSetField(76); }
  public void set(org.quickfix.field.ListID value)
  { setField(value); }
  public org.quickfix.field.ListID get(org.quickfix.field.ListID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ListID getListID() throws FieldNotFound
  { org.quickfix.field.ListID value = new org.quickfix.field.ListID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ListID field)
  { return isSetField(field); }
  public boolean isSetListID()
  { return isSetField(66); }
  public void set(org.quickfix.field.CxlRejReason value)
  { setField(value); }
  public org.quickfix.field.CxlRejReason get(org.quickfix.field.CxlRejReason  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CxlRejReason getCxlRejReason() throws FieldNotFound
  { org.quickfix.field.CxlRejReason value = new org.quickfix.field.CxlRejReason();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CxlRejReason field)
  { return isSetField(field); }
  public boolean isSetCxlRejReason()
  { return isSetField(102); }
  public void set(org.quickfix.field.Text value)
  { setField(value); }
  public org.quickfix.field.Text get(org.quickfix.field.Text  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Text getText() throws FieldNotFound
  { org.quickfix.field.Text value = new org.quickfix.field.Text();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Text field)
  { return isSetField(field); }
  public boolean isSetText()
  { return isSetField(58); }
}
