package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.internal.C1285y;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1207o {

    /* renamed from: a, reason: collision with root package name */
    private final Set<C1205n<?>> f28363a = Collections.newSetFromMap(new WeakHashMap());

    @I0.a
    @androidx.annotation.N
    public static <L> C1205n<L> a(@androidx.annotation.N L l4, @androidx.annotation.N Looper looper, @androidx.annotation.N String str) {
        C1285y.m(l4, "Listener must not be null");
        C1285y.m(looper, "Looper must not be null");
        C1285y.m(str, "Listener type must not be null");
        return new C1205n<>(looper, l4, str);
    }

    @I0.a
    @androidx.annotation.N
    public static <L> C1205n<L> b(@androidx.annotation.N L l4, @androidx.annotation.N Executor executor, @androidx.annotation.N String str) {
        C1285y.m(l4, "Listener must not be null");
        C1285y.m(executor, "Executor must not be null");
        C1285y.m(str, "Listener type must not be null");
        return new C1205n<>(executor, l4, str);
    }

    @I0.a
    @androidx.annotation.N
    public static <L> C1205n.a<L> c(@androidx.annotation.N L l4, @androidx.annotation.N String str) {
        C1285y.m(l4, "Listener must not be null");
        C1285y.m(str, "Listener type must not be null");
        C1285y.i(str, "Listener type must not be empty");
        return new C1205n.a<>(l4, str);
    }

    @androidx.annotation.N
    public final <L> C1205n<L> d(@androidx.annotation.N L l4, @androidx.annotation.N Looper looper, @androidx.annotation.N String str) {
        C1205n<L> a4 = a(l4, looper, "NO_TYPE");
        this.f28363a.add(a4);
        return a4;
    }

    public final void e() {
        Iterator<C1205n<?>> it = this.f28363a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f28363a.clear();
    }
}
