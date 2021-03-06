/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArLineFinderSegment extends ArLineSegment {
  private transient long swigCPtr;

  public ArLineFinderSegment(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.ArLineFinderSegment_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArLineFinderSegment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArLineFinderSegment(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArLineFinderSegment() {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_0(), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2, int numPoints, int startPoint, int endPoint) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_1(x1, y1, x2, y2, numPoints, startPoint, endPoint), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2, int numPoints, int startPoint) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_2(x1, y1, x2, y2, numPoints, startPoint), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2, int numPoints) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_3(x1, y1, x2, y2, numPoints), true);
  }

  public ArLineFinderSegment(double x1, double y1, double x2, double y2) {
    this(AriaJavaJNI.new_ArLineFinderSegment__SWIG_4(x1, y1, x2, y2), true);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2, int numPoints, int startPoint, int endPoint) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_0(swigCPtr, this, x1, y1, x2, y2, numPoints, startPoint, endPoint);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2, int numPoints, int startPoint) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_1(swigCPtr, this, x1, y1, x2, y2, numPoints, startPoint);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2, int numPoints) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_2(swigCPtr, this, x1, y1, x2, y2, numPoints);
  }

  public void newEndPoints(double x1, double y1, double x2, double y2) {
    AriaJavaJNI.ArLineFinderSegment_newEndPoints__SWIG_3(swigCPtr, this, x1, y1, x2, y2);
  }

  public double getLineAngle() {
    return AriaJavaJNI.ArLineFinderSegment_getLineAngle(swigCPtr, this);
  }

  public double getLength() {
    return AriaJavaJNI.ArLineFinderSegment_getLength(swigCPtr, this);
  }

  public int getNumPoints() {
    return AriaJavaJNI.ArLineFinderSegment_getNumPoints(swigCPtr, this);
  }

  public int getStartPoint() {
    return AriaJavaJNI.ArLineFinderSegment_getStartPoint(swigCPtr, this);
  }

  public int getEndPoint() {
    return AriaJavaJNI.ArLineFinderSegment_getEndPoint(swigCPtr, this);
  }

  public void setAveDistFromLine(double aveDistFromLine) {
    AriaJavaJNI.ArLineFinderSegment_setAveDistFromLine(swigCPtr, this, aveDistFromLine);
  }

  public double getAveDistFromLine() {
    return AriaJavaJNI.ArLineFinderSegment_getAveDistFromLine(swigCPtr, this);
  }

}
