package com.adap;

import com.friend.PilotPen;

// we basically try to add on our feature on an existing class without modifying its implementation
public class PenAdapter implements Pen{
    PilotPen pp =new PilotPen();
    @java.lang.Override
    public void write(String str) {
        pp.mark(str);
    }
}
