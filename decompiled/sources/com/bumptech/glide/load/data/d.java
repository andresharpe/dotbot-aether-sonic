package com.bumptech.glide.load.data;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public interface d<T> {

    /* loaded from: classes.dex */
    public interface a<T> {
        void c(@N Exception exc);

        void f(@P T t3);
    }

    @N
    Class<T> a();

    void b();

    void cancel();

    @N
    DataSource d();

    void e(@N Priority priority, @N a<? super T> aVar);
}
