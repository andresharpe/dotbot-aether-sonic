package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.b;
import com.bumptech.glide.request.target.r;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    @i0
    static final k<?, ?> f25406k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f25407a;

    /* renamed from: b, reason: collision with root package name */
    private final Registry f25408b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.k f25409c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f25410d;

    /* renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.g<Object>> f25411e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, k<?, ?>> f25412f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f25413g;

    /* renamed from: h, reason: collision with root package name */
    private final e f25414h;

    /* renamed from: i, reason: collision with root package name */
    private final int f25415i;

    /* renamed from: j, reason: collision with root package name */
    @P
    @B("this")
    private com.bumptech.glide.request.h f25416j;

    public d(@N Context context, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @N Registry registry, @N com.bumptech.glide.request.target.k kVar, @N b.a aVar, @N Map<Class<?>, k<?, ?>> map, @N List<com.bumptech.glide.request.g<Object>> list, @N com.bumptech.glide.load.engine.k kVar2, @N e eVar, int i4) {
        super(context.getApplicationContext());
        this.f25407a = bVar;
        this.f25408b = registry;
        this.f25409c = kVar;
        this.f25410d = aVar;
        this.f25411e = list;
        this.f25412f = map;
        this.f25413g = kVar2;
        this.f25414h = eVar;
        this.f25415i = i4;
    }

    @N
    public <X> r<ImageView, X> a(@N ImageView imageView, @N Class<X> cls) {
        return this.f25409c.a(imageView, cls);
    }

    @N
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f25407a;
    }

    public List<com.bumptech.glide.request.g<Object>> c() {
        return this.f25411e;
    }

    public synchronized com.bumptech.glide.request.h d() {
        try {
            if (this.f25416j == null) {
                this.f25416j = this.f25410d.a().o0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25416j;
    }

    @N
    public <T> k<?, T> e(@N Class<T> cls) {
        k<?, T> kVar = (k) this.f25412f.get(cls);
        if (kVar == null) {
            for (Map.Entry<Class<?>, k<?, ?>> entry : this.f25412f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        if (kVar == null) {
            return (k<?, T>) f25406k;
        }
        return kVar;
    }

    @N
    public com.bumptech.glide.load.engine.k f() {
        return this.f25413g;
    }

    public e g() {
        return this.f25414h;
    }

    public int h() {
        return this.f25415i;
    }

    @N
    public Registry i() {
        return this.f25408b;
    }
}
