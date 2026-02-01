package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?, ?>> f26650a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Z> f26651a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<R> f26652b;

        /* renamed from: c, reason: collision with root package name */
        final e<Z, R> f26653c;

        a(@N Class<Z> cls, @N Class<R> cls2, @N e<Z, R> eVar) {
            this.f26651a = cls;
            this.f26652b = cls2;
            this.f26653c = eVar;
        }

        public boolean a(@N Class<?> cls, @N Class<?> cls2) {
            if (this.f26651a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f26652b)) {
                return true;
            }
            return false;
        }
    }

    @N
    public synchronized <Z, R> e<Z, R> a(@N Class<Z> cls, @N Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f26650a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f26653c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @N
    public synchronized <Z, R> List<Class<R>> b(@N Class<Z> cls, @N Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f26650a.iterator();
        while (it.hasNext()) {
            if (it.next().a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@N Class<Z> cls, @N Class<R> cls2, @N e<Z, R> eVar) {
        this.f26650a.add(new a<>(cls, cls2, eVar));
    }
}
