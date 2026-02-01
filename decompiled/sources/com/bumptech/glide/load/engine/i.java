package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.N;
import androidx.core.util.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f26103f = "DecodePath";

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f26104a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> f26105b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> f26106c;

    /* renamed from: d, reason: collision with root package name */
    private final t.a<List<Throwable>> f26107d;

    /* renamed from: e, reason: collision with root package name */
    private final String f26108e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
        @N
        u<ResourceType> a(@N u<ResourceType> uVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.g<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, t.a<List<Throwable>> aVar) {
        this.f26104a = cls;
        this.f26105b = list;
        this.f26106c = eVar;
        this.f26107d = aVar;
        this.f26108e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @N
    private u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i4, int i5, @N com.bumptech.glide.load.f fVar) throws GlideException {
        List<Throwable> list = (List) com.bumptech.glide.util.l.d(this.f26107d.b());
        try {
            return c(eVar, i4, i5, fVar, list);
        } finally {
            this.f26107d.a(list);
        }
    }

    @N
    private u<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i4, int i5, @N com.bumptech.glide.load.f fVar, List<Throwable> list) throws GlideException {
        int size = this.f26105b.size();
        u<ResourceType> uVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            com.bumptech.glide.load.g<DataType, ResourceType> gVar = this.f26105b.get(i6);
            try {
                if (gVar.a(eVar.a(), fVar)) {
                    uVar = gVar.b(eVar.a(), i4, i5, fVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable(f26103f, 2)) {
                    Log.v(f26103f, "Failed to decode data for " + gVar, e4);
                }
                list.add(e4);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f26108e, new ArrayList(list));
    }

    public u<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i4, int i5, @N com.bumptech.glide.load.f fVar, a<ResourceType> aVar) throws GlideException {
        return this.f26106c.a(aVar.a(b(eVar, i4, i5, fVar)), fVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f26104a + ", decoders=" + this.f26105b + ", transcoder=" + this.f26106c + '}';
    }
}
