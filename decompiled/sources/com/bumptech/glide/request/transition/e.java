package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.f;

/* loaded from: classes.dex */
public class e<R> implements f<R> {

    /* renamed from: a, reason: collision with root package name */
    static final e<?> f26907a = new e<>();

    /* renamed from: b, reason: collision with root package name */
    private static final g<?> f26908b = new a();

    /* loaded from: classes.dex */
    public static class a<R> implements g<R> {
        @Override // com.bumptech.glide.request.transition.g
        public f<R> a(DataSource dataSource, boolean z3) {
            return e.f26907a;
        }
    }

    public static <R> f<R> b() {
        return f26907a;
    }

    public static <R> g<R> c() {
        return (g<R>) f26908b;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(Object obj, f.a aVar) {
        return false;
    }
}
