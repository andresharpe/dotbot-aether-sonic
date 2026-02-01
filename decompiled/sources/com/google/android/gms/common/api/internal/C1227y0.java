package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.internal.C1281w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1227y0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1175c<?> f28450a;

    /* renamed from: b, reason: collision with root package name */
    private final C1233e f28451b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1227y0(C1175c c1175c, C1233e c1233e, C1225x0 c1225x0) {
        this.f28450a = c1175c;
        this.f28451b = c1233e;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj != null && (obj instanceof C1227y0)) {
            C1227y0 c1227y0 = (C1227y0) obj;
            if (C1281w.b(this.f28450a, c1227y0.f28450a) && C1281w.b(this.f28451b, c1227y0.f28451b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(this.f28450a, this.f28451b);
    }

    public final String toString() {
        return C1281w.d(this).a("key", this.f28450a).a("feature", this.f28451b).toString();
    }
}
