package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.j;

/* loaded from: classes.dex */
public class i<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final j.a f26913a;

    /* renamed from: b, reason: collision with root package name */
    private j<R> f26914b;

    public i(j.a aVar) {
        this.f26913a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(DataSource dataSource, boolean z3) {
        if (dataSource != DataSource.MEMORY_CACHE && z3) {
            if (this.f26914b == null) {
                this.f26914b = new j<>(this.f26913a);
            }
            return this.f26914b;
        }
        return e.b();
    }
}
