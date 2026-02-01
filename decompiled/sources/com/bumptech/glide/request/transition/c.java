package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public class c implements g<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f26899a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26900b;

    /* renamed from: c, reason: collision with root package name */
    private d f26901c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        private static final int f26902c = 300;

        /* renamed from: a, reason: collision with root package name */
        private final int f26903a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26904b;

        public a() {
            this(f26902c);
        }

        public c a() {
            return new c(this.f26903a, this.f26904b);
        }

        public a b(boolean z3) {
            this.f26904b = z3;
            return this;
        }

        public a(int i4) {
            this.f26903a = i4;
        }
    }

    protected c(int i4, boolean z3) {
        this.f26899a = i4;
        this.f26900b = z3;
    }

    private f<Drawable> b() {
        if (this.f26901c == null) {
            this.f26901c = new d(this.f26899a, this.f26900b);
        }
        return this.f26901c;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<Drawable> a(DataSource dataSource, boolean z3) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return e.b();
        }
        return b();
    }
}
