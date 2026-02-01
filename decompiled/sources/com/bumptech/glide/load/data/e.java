package com.bumptech.glide.load.data;

import androidx.annotation.N;
import java.io.IOException;

/* loaded from: classes.dex */
public interface e<T> {

    /* loaded from: classes.dex */
    public interface a<T> {
        @N
        Class<T> a();

        @N
        e<T> b(@N T t3);
    }

    @N
    T a() throws IOException;

    void b();
}
