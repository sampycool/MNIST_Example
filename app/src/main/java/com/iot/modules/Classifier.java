package com.iot.modules;

public interface Classifier {
    String name();

    Classification recognize(final float[] pixels);
}