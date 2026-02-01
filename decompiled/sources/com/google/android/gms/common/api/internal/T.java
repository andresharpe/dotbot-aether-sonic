package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.internal.C1239a0;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class T extends AbstractRunnableC1170a0 {

    /* renamed from: F, reason: collision with root package name */
    private final Map<C1164a.f, P> f28210F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ C1173b0 f28211G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C1173b0 c1173b0, Map<C1164a.f, P> map) {
        super(c1173b0, null);
        this.f28211G = c1173b0;
        this.f28210F = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC1170a0
    @androidx.annotation.j0
    @GuardedBy("mLock")
    public final void a() {
        C1237i c1237i;
        Context context;
        boolean z3;
        Context context2;
        C1208o0 c1208o0;
        com.google.android.gms.signin.f fVar;
        com.google.android.gms.signin.f fVar2;
        C1208o0 c1208o02;
        Context context3;
        boolean z4;
        c1237i = this.f28211G.f28235d;
        C1239a0 c1239a0 = new C1239a0(c1237i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1164a.f fVar3 : this.f28210F.keySet()) {
            if (fVar3.q()) {
                z4 = this.f28210F.get(fVar3).f28200c;
                if (!z4) {
                    arrayList.add(fVar3);
                }
            }
            arrayList2.add(fVar3);
        }
        int i4 = -1;
        int i5 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i5 < size) {
                C1164a.f fVar4 = (C1164a.f) arrayList2.get(i5);
                context3 = this.f28211G.f28234c;
                i4 = c1239a0.b(context3, fVar4);
                i5++;
                if (i4 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i5 < size2) {
                C1164a.f fVar5 = (C1164a.f) arrayList.get(i5);
                context = this.f28211G.f28234c;
                i4 = c1239a0.b(context, fVar5);
                i5++;
                if (i4 != 0) {
                    break;
                }
            }
        }
        if (i4 != 0) {
            C1231c c1231c = new C1231c(i4, null);
            C1173b0 c1173b0 = this.f28211G;
            c1208o02 = c1173b0.f28232a;
            c1208o02.s(new Q(this, c1173b0, c1231c));
            return;
        }
        C1173b0 c1173b02 = this.f28211G;
        z3 = c1173b02.f28244m;
        if (z3) {
            fVar = c1173b02.f28242k;
            if (fVar != null) {
                fVar2 = c1173b02.f28242k;
                fVar2.d();
            }
        }
        for (C1164a.f fVar6 : this.f28210F.keySet()) {
            P p4 = this.f28210F.get(fVar6);
            if (fVar6.q()) {
                context2 = this.f28211G.f28234c;
                if (c1239a0.b(context2, fVar6) != 0) {
                    C1173b0 c1173b03 = this.f28211G;
                    c1208o0 = c1173b03.f28232a;
                    c1208o0.s(new S(this, c1173b03, p4));
                }
            }
            fVar6.l(p4);
        }
    }
}
