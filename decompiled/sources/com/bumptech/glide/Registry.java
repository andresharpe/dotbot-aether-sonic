package com.bumptech.glide;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.t;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: k, reason: collision with root package name */
    public static final String f25354k = "Gif";

    /* renamed from: l, reason: collision with root package name */
    public static final String f25355l = "Bitmap";

    /* renamed from: m, reason: collision with root package name */
    public static final String f25356m = "BitmapDrawable";

    /* renamed from: n, reason: collision with root package name */
    private static final String f25357n = "legacy_prepend_all";

    /* renamed from: o, reason: collision with root package name */
    private static final String f25358o = "legacy_append";

    /* renamed from: a, reason: collision with root package name */
    private final p f25359a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.provider.a f25360b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.provider.e f25361c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.provider.f f25362d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f25363e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.transcode.f f25364f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.provider.b f25365g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.provider.d f25366h = new com.bumptech.glide.provider.d();

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.provider.c f25367i = new com.bumptech.glide.provider.c();

    /* renamed from: j, reason: collision with root package name */
    private final t.a<List<Throwable>> f25368j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@N String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@N Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@N M m4, @N List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m4);
        }

        public NoModelLoaderAvailableException(@N Class<?> cls, @N Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@N Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@N Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        t.a<List<Throwable>> f4 = com.bumptech.glide.util.pool.a.f();
        this.f25368j = f4;
        this.f25359a = new p(f4);
        this.f25360b = new com.bumptech.glide.provider.a();
        this.f25361c = new com.bumptech.glide.provider.e();
        this.f25362d = new com.bumptech.glide.provider.f();
        this.f25363e = new com.bumptech.glide.load.data.f();
        this.f25364f = new com.bumptech.glide.load.resource.transcode.f();
        this.f25365g = new com.bumptech.glide.provider.b();
        z(Arrays.asList(f25354k, f25355l, f25356m));
    }

    @N
    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(@N Class<Data> cls, @N Class<TResource> cls2, @N Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f25361c.d(cls, cls2)) {
            for (Class cls5 : this.f25364f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f25361c.b(cls, cls4), this.f25364f.a(cls4, cls5), this.f25368j));
            }
        }
        return arrayList;
    }

    @N
    public <Data> Registry a(@N Class<Data> cls, @N com.bumptech.glide.load.a<Data> aVar) {
        this.f25360b.a(cls, aVar);
        return this;
    }

    @N
    public <TResource> Registry b(@N Class<TResource> cls, @N com.bumptech.glide.load.h<TResource> hVar) {
        this.f25362d.a(cls, hVar);
        return this;
    }

    @N
    public <Data, TResource> Registry c(@N Class<Data> cls, @N Class<TResource> cls2, @N com.bumptech.glide.load.g<Data, TResource> gVar) {
        e(f25358o, cls, cls2, gVar);
        return this;
    }

    @N
    public <Model, Data> Registry d(@N Class<Model> cls, @N Class<Data> cls2, @N o<Model, Data> oVar) {
        this.f25359a.a(cls, cls2, oVar);
        return this;
    }

    @N
    public <Data, TResource> Registry e(@N String str, @N Class<Data> cls, @N Class<TResource> cls2, @N com.bumptech.glide.load.g<Data, TResource> gVar) {
        this.f25361c.a(str, gVar, cls, cls2);
        return this;
    }

    @N
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b4 = this.f25365g.b();
        if (!b4.isEmpty()) {
            return b4;
        }
        throw new NoImageHeaderParserException();
    }

    @P
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> h(@N Class<Data> cls, @N Class<TResource> cls2, @N Class<Transcode> cls3) {
        s<Data, TResource, Transcode> a4 = this.f25367i.a(cls, cls2, cls3);
        if (this.f25367i.c(a4)) {
            return null;
        }
        if (a4 == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f4 = f(cls, cls2, cls3);
            if (f4.isEmpty()) {
                a4 = null;
            } else {
                a4 = new s<>(cls, cls2, cls3, f4, this.f25368j);
            }
            this.f25367i.d(cls, cls2, cls3, a4);
        }
        return a4;
    }

    @N
    public <Model> List<n<Model, ?>> i(@N Model model) {
        return this.f25359a.e(model);
    }

    @N
    public <Model, TResource, Transcode> List<Class<?>> j(@N Class<Model> cls, @N Class<TResource> cls2, @N Class<Transcode> cls3) {
        List<Class<?>> b4 = this.f25366h.b(cls, cls2, cls3);
        if (b4 == null) {
            b4 = new ArrayList<>();
            Iterator<Class<?>> it = this.f25359a.d(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f25361c.d(it.next(), cls2)) {
                    if (!this.f25364f.b(cls4, cls3).isEmpty() && !b4.contains(cls4)) {
                        b4.add(cls4);
                    }
                }
            }
            this.f25366h.c(cls, cls2, cls3, Collections.unmodifiableList(b4));
        }
        return b4;
    }

    @N
    public <X> com.bumptech.glide.load.h<X> k(@N u<X> uVar) throws NoResultEncoderAvailableException {
        com.bumptech.glide.load.h<X> b4 = this.f25362d.b(uVar.d());
        if (b4 != null) {
            return b4;
        }
        throw new NoResultEncoderAvailableException(uVar.d());
    }

    @N
    public <X> com.bumptech.glide.load.data.e<X> l(@N X x3) {
        return this.f25363e.a(x3);
    }

    @N
    public <X> com.bumptech.glide.load.a<X> m(@N X x3) throws NoSourceEncoderAvailableException {
        com.bumptech.glide.load.a<X> b4 = this.f25360b.b(x3.getClass());
        if (b4 != null) {
            return b4;
        }
        throw new NoSourceEncoderAvailableException(x3.getClass());
    }

    public boolean n(@N u<?> uVar) {
        if (this.f25362d.b(uVar.d()) != null) {
            return true;
        }
        return false;
    }

    @N
    public <Data> Registry o(@N Class<Data> cls, @N com.bumptech.glide.load.a<Data> aVar) {
        this.f25360b.c(cls, aVar);
        return this;
    }

    @N
    public <TResource> Registry p(@N Class<TResource> cls, @N com.bumptech.glide.load.h<TResource> hVar) {
        this.f25362d.c(cls, hVar);
        return this;
    }

    @N
    public <Data, TResource> Registry q(@N Class<Data> cls, @N Class<TResource> cls2, @N com.bumptech.glide.load.g<Data, TResource> gVar) {
        s(f25357n, cls, cls2, gVar);
        return this;
    }

    @N
    public <Model, Data> Registry r(@N Class<Model> cls, @N Class<Data> cls2, @N o<Model, Data> oVar) {
        this.f25359a.g(cls, cls2, oVar);
        return this;
    }

    @N
    public <Data, TResource> Registry s(@N String str, @N Class<Data> cls, @N Class<TResource> cls2, @N com.bumptech.glide.load.g<Data, TResource> gVar) {
        this.f25361c.e(str, gVar, cls, cls2);
        return this;
    }

    @N
    public Registry t(@N ImageHeaderParser imageHeaderParser) {
        this.f25365g.a(imageHeaderParser);
        return this;
    }

    @N
    public Registry u(@N e.a<?> aVar) {
        this.f25363e.b(aVar);
        return this;
    }

    @N
    @Deprecated
    public <Data> Registry v(@N Class<Data> cls, @N com.bumptech.glide.load.a<Data> aVar) {
        return a(cls, aVar);
    }

    @N
    @Deprecated
    public <TResource> Registry w(@N Class<TResource> cls, @N com.bumptech.glide.load.h<TResource> hVar) {
        return b(cls, hVar);
    }

    @N
    public <TResource, Transcode> Registry x(@N Class<TResource> cls, @N Class<Transcode> cls2, @N com.bumptech.glide.load.resource.transcode.e<TResource, Transcode> eVar) {
        this.f25364f.c(cls, cls2, eVar);
        return this;
    }

    @N
    public <Model, Data> Registry y(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        this.f25359a.i(cls, cls2, oVar);
        return this;
    }

    @N
    public final Registry z(@N List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(f25357n);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(f25358o);
        this.f25361c.f(arrayList);
        return this;
    }
}
