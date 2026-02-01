package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class I3 {

    /* renamed from: a, reason: collision with root package name */
    final Map f29356a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f29356a.put(str, callable);
    }
}
