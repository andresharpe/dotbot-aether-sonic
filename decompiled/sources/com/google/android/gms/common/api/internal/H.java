package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C1771l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f28157a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map<C1771l<?>, Boolean> f28158b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z3, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f28157a) {
            hashMap = new HashMap(this.f28157a);
        }
        synchronized (this.f28158b) {
            hashMap2 = new HashMap(this.f28158b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1771l) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(BasePendingResult<? extends com.google.android.gms.common.api.q> basePendingResult, boolean z3) {
        this.f28157a.put(basePendingResult, Boolean.valueOf(z3));
        basePendingResult.addStatusListener(new F(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <TResult> void d(C1771l<TResult> c1771l, boolean z3) {
        this.f28158b.put(c1771l, Boolean.valueOf(z3));
        c1771l.a().e(new G(this, c1771l));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i4, @androidx.annotation.P String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, C1193i.f28284t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.f28157a.isEmpty() && this.f28158b.isEmpty()) {
            return false;
        }
        return true;
    }
}
