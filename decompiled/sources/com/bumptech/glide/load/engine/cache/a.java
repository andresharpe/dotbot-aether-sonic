package com.bumptech.glide.load.engine.cache;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.File;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.bumptech.glide.load.engine.cache.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0226a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f25949a = 262144000;

        /* renamed from: b, reason: collision with root package name */
        public static final String f25950b = "image_manager_disk_cache";

        @P
        a a();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(@N File file);
    }

    void a(com.bumptech.glide.load.c cVar, b bVar);

    @P
    File b(com.bumptech.glide.load.c cVar);

    void c(com.bumptech.glide.load.c cVar);

    void clear();
}
