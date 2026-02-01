package com.bumptech.glide.load.model;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* loaded from: classes.dex */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.c f26326a;

        /* renamed from: b, reason: collision with root package name */
        public final List<com.bumptech.glide.load.c> f26327b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f26328c;

        public a(@N com.bumptech.glide.load.c cVar, @N com.bumptech.glide.load.data.d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public a(@N com.bumptech.glide.load.c cVar, @N List<com.bumptech.glide.load.c> list, @N com.bumptech.glide.load.data.d<Data> dVar) {
            this.f26326a = (com.bumptech.glide.load.c) com.bumptech.glide.util.l.d(cVar);
            this.f26327b = (List) com.bumptech.glide.util.l.d(list);
            this.f26328c = (com.bumptech.glide.load.data.d) com.bumptech.glide.util.l.d(dVar);
        }
    }

    boolean a(@N Model model);

    @P
    a<Data> b(@N Model model, int i4, int i5, @N com.bumptech.glide.load.f fVar);
}
