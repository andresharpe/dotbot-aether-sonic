package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import androidx.core.util.t;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class s<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<Data> f26224a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<List<Throwable>> f26225b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f26226c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26227d;

    public s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, t.a<List<Throwable>> aVar) {
        this.f26224a = cls;
        this.f26225b = aVar;
        this.f26226c = (List) com.bumptech.glide.util.l.c(list);
        this.f26227d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private u<Transcode> c(com.bumptech.glide.load.data.e<Data> eVar, @N com.bumptech.glide.load.f fVar, int i4, int i5, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f26226c.size();
        u<Transcode> uVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            try {
                uVar = this.f26226c.get(i6).a(eVar, i4, i5, fVar, aVar);
            } catch (GlideException e4) {
                list.add(e4);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f26227d, new ArrayList(list));
    }

    public Class<Data> a() {
        return this.f26224a;
    }

    public u<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, @N com.bumptech.glide.load.f fVar, int i4, int i5, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.l.d(this.f26225b.b());
        try {
            return c(eVar, fVar, i4, i5, aVar, list);
        } finally {
            this.f26225b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f26226c.toArray()) + '}';
    }
}
