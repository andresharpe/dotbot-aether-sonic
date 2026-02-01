package com.bumptech.glide.load.engine;

import androidx.annotation.i0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.c, l<?>> f26222a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.c, l<?>> f26223b = new HashMap();

    private Map<com.bumptech.glide.load.c, l<?>> c(boolean z3) {
        if (z3) {
            return this.f26223b;
        }
        return this.f26222a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<?> a(com.bumptech.glide.load.c cVar, boolean z3) {
        return c(z3).get(cVar);
    }

    @i0
    Map<com.bumptech.glide.load.c, l<?>> b() {
        return Collections.unmodifiableMap(this.f26222a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(com.bumptech.glide.load.c cVar, l<?> lVar) {
        c(lVar.q()).put(cVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(com.bumptech.glide.load.c cVar, l<?> lVar) {
        Map<com.bumptech.glide.load.c, l<?>> c4 = c(lVar.q());
        if (lVar.equals(c4.get(cVar))) {
            c4.remove(cVar);
        }
    }
}
