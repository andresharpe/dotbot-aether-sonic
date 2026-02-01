package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f28347c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final Set<BasePendingResult<?>> f28348a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    private final C1198j1 f28349b = new C1198j1(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends com.google.android.gms.common.api.q> basePendingResult) {
        this.f28348a.add(basePendingResult);
        basePendingResult.zan(this.f28349b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f28348a.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f28348a.remove(basePendingResult);
            }
        }
    }
}
