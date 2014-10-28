package org.javaspa.core;

import org.jcp.xml.dsig.internal.dom.ApacheData;

/**
 * Created by annkur on 5/13/14.
 */
public class ClassLoaderTut {

  public ClassLoaderTut(){
    System.out.println(ApacheData.class.getClassLoader());
  }
}
