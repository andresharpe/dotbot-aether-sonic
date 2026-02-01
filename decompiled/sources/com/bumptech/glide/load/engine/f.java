package com.bumptech.glide.load.engine;

import androidx.annotation.P;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
interface f {

    /* loaded from: classes.dex */
    public interface a {
        void b(com.bumptech.glide.load.c cVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource);

        void e();

        void f(com.bumptech.glide.load.c cVar, @P Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, com.bumptech.glide.load.c cVar2);
    }

    boolean a();

    void cancel();
}
