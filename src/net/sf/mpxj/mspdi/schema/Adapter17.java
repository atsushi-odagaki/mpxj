//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.08.30 at 11:25:19 AM BST
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import net.sf.mpxj.AccrueType;

@SuppressWarnings("all") public class Adapter17 extends XmlAdapter<String, AccrueType>
{

   public AccrueType unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseAccrueType(value));
   }

   public String marshal(AccrueType value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printAccrueType(value));
   }

}
