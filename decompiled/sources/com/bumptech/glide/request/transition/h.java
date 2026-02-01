package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.k;

/* loaded from: classes.dex */
public class h<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final k.a f26909a;

    /* renamed from: b, reason: collision with root package name */
    private f<R> f26910b;

    /* loaded from: classes.dex */
    private static class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final Animation f26911a;

        a(Animation animation) {
            this.f26911a = animation;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return this.f26911a;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        private final int f26912a;

        b(int i4) {
            this.f26912a = i4;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f26912a);
        }
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(DataSource dataSource, boolean z3) {
        if (dataSource != DataSource.MEMORY_CACHE && z3) {
            if (this.f26910b == null) {
                this.f26910b = new k(this.f26909a);
            }
            return this.f26910b;
        }
        return e.b();
    }

    public h(int i4) {
        this(new b(i4));
    }

    h(k.a aVar) {
        this.f26909a = aVar;
    }
}
