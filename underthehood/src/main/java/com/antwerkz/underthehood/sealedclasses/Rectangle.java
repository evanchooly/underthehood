package com.antwerkz.underthehood.sealedclasses;

public sealed class Rectangle extends Shape permits FilledRectangle {
    public double length, width;
}