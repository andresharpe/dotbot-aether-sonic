package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: d, reason: collision with root package name */
    private int f28406d;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<C1175c<?>, String> f28404b = new androidx.collection.a<>();

    /* renamed from: c, reason: collision with root package name */
    private final C1771l<Map<C1175c<?>, String>> f28405c = new C1771l<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f28407e = false;

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<C1175c<?>, C1231c> f28403a = new androidx.collection.a<>();

    public s1(Iterable<? extends com.google.android.gms.common.api.j<?>> iterable) {
        Iterator<? extends com.google.android.gms.common.api.j<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f28403a.put(it.next().b(), null);
        }
        this.f28406d = this.f28403a.keySet().size();
    }

    public final AbstractC1770k<Map<C1175c<?>, String>> a() {
        return this.f28405c.a();
    }

    public final Set<C1175c<?>> b() {
        return this.f28403a.keySet();
    }

    public final void c(C1175c<?> c1175c, C1231c c1231c, @androidx.annotation.P String str) {
        this.f28403a.put(c1175c, c1231c);
        this.f28404b.put(c1175c, str);
        this.f28406d--;
        if (!c1231c.x0()) {
            this.f28407e = true;
        }
        if (this.f28406d == 0) {
            if (this.f28407e) {
                this.f28405c.b(new AvailabilityException(this.f28403a));
            } else {
                this.f28405c.c(this.f28404b);
            }
        }
    }
}
