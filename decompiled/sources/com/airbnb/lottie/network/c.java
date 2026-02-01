package com.airbnb.lottie.network;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public interface c extends Closeable {
    @P
    String f0();

    @P
    String h0();

    boolean l();

    @N
    InputStream o0() throws IOException;
}
