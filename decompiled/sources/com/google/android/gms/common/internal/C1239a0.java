package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.api.C1164a;

/* renamed from: com.google.android.gms.common.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1239a0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f28680a;

    /* renamed from: b, reason: collision with root package name */
    private C1237i f28681b;

    public C1239a0() {
        this(C1236h.x());
    }

    public final int a(Context context, int i4) {
        return this.f28680a.get(i4, -1);
    }

    public final int b(@androidx.annotation.N Context context, @androidx.annotation.N C1164a.f fVar) {
        C1285y.l(context);
        C1285y.l(fVar);
        int i4 = 0;
        if (!fVar.q()) {
            return 0;
        }
        int s4 = fVar.s();
        int a4 = a(context, s4);
        if (a4 == -1) {
            int i5 = 0;
            while (true) {
                if (i5 < this.f28680a.size()) {
                    int keyAt = this.f28680a.keyAt(i5);
                    if (keyAt > s4 && this.f28680a.get(keyAt) == 0) {
                        break;
                    }
                    i5++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                a4 = this.f28681b.k(context, s4);
            } else {
                a4 = i4;
            }
            this.f28680a.put(s4, a4);
        }
        return a4;
    }

    public final void c() {
        this.f28680a.clear();
    }

    public C1239a0(@androidx.annotation.N C1237i c1237i) {
        this.f28680a = new SparseIntArray();
        C1285y.l(c1237i);
        this.f28681b = c1237i;
    }
}
