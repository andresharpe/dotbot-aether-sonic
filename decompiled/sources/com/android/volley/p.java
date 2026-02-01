package com.android.volley;

import androidx.annotation.P;
import com.android.volley.e;

/* loaded from: classes.dex */
public class p<T> {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final T f24520a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final e.a f24521b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final VolleyError f24522c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24523d;

    /* loaded from: classes.dex */
    public interface a {
        void c(VolleyError volleyError);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void b(T t3);
    }

    private p(@P T t3, @P e.a aVar) {
        this.f24523d = false;
        this.f24520a = t3;
        this.f24521b = aVar;
        this.f24522c = null;
    }

    public static <T> p<T> a(VolleyError volleyError) {
        return new p<>(volleyError);
    }

    public static <T> p<T> c(@P T t3, @P e.a aVar) {
        return new p<>(t3, aVar);
    }

    public boolean b() {
        if (this.f24522c == null) {
            return true;
        }
        return false;
    }

    private p(VolleyError volleyError) {
        this.f24523d = false;
        this.f24520a = null;
        this.f24521b = null;
        this.f24522c = volleyError;
    }
}
