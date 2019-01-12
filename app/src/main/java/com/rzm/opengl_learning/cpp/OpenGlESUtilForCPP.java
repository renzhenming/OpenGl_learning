package com.rzm.opengl_learning.cpp;

public class OpenGlESUtilForCPP {
    static {
        System.loadLibrary("native-lib");
    }

    public native void  LoadTriangle();
}
