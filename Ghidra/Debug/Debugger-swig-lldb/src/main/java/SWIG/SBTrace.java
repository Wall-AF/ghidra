/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package SWIG;

public class SBTrace {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBTrace(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBTrace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SBTrace obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lldbJNI.delete_SBTrace(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBTrace() {
    this(lldbJNI.new_SBTrace(), true);
  }

  public static SBTrace LoadTraceFromFile(SBError error, SBDebugger debugger, SBFileSpec trace_description_file) {
    return new SBTrace(lldbJNI.SBTrace_LoadTraceFromFile(SBError.getCPtr(error), error, SBDebugger.getCPtr(debugger), debugger, SBFileSpec.getCPtr(trace_description_file), trace_description_file), true);
  }

  public SBTraceCursor CreateNewCursor(SBError error, SBThread thread) {
    return new SBTraceCursor(lldbJNI.SBTrace_CreateNewCursor(swigCPtr, this, SBError.getCPtr(error), error, SBThread.getCPtr(thread), thread), true);
  }

  public SBFileSpec SaveToDisk(SBError error, SBFileSpec bundle_dir, boolean compact) {
    return new SBFileSpec(lldbJNI.SBTrace_SaveToDisk__SWIG_0(swigCPtr, this, SBError.getCPtr(error), error, SBFileSpec.getCPtr(bundle_dir), bundle_dir, compact), true);
  }

  public SBFileSpec SaveToDisk(SBError error, SBFileSpec bundle_dir) {
    return new SBFileSpec(lldbJNI.SBTrace_SaveToDisk__SWIG_1(swigCPtr, this, SBError.getCPtr(error), error, SBFileSpec.getCPtr(bundle_dir), bundle_dir), true);
  }

  public String GetStartConfigurationHelp() {
    return lldbJNI.SBTrace_GetStartConfigurationHelp(swigCPtr, this);
  }

  public SBError Start(SBStructuredData configuration) {
    return new SBError(lldbJNI.SBTrace_Start__SWIG_0(swigCPtr, this, SBStructuredData.getCPtr(configuration), configuration), true);
  }

  public SBError Start(SBThread thread, SBStructuredData configuration) {
    return new SBError(lldbJNI.SBTrace_Start__SWIG_1(swigCPtr, this, SBThread.getCPtr(thread), thread, SBStructuredData.getCPtr(configuration), configuration), true);
  }

  public SBError Stop() {
    return new SBError(lldbJNI.SBTrace_Stop__SWIG_0(swigCPtr, this), true);
  }

  public SBError Stop(SBThread thread) {
    return new SBError(lldbJNI.SBTrace_Stop__SWIG_1(swigCPtr, this, SBThread.getCPtr(thread), thread), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBTrace_IsValid(swigCPtr, this);
  }

}
