package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C1285y;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class r1 extends w1 {

    /* renamed from: J, reason: collision with root package name */
    private final SparseArray<q1> f28401J;

    private r1(InterfaceC1203m interfaceC1203m) {
        super(interfaceC1203m, C1236h.x());
        this.f28401J = new SparseArray<>();
        this.f28187E.addCallback("AutoManageHelper", this);
    }

    public static r1 u(C1201l c1201l) {
        InterfaceC1203m e4 = LifecycleCallback.e(c1201l);
        r1 r1Var = (r1) e4.getCallbackOrNull("AutoManageHelper", r1.class);
        if (r1Var != null) {
            return r1Var;
        }
        return new r1(e4);
    }

    @androidx.annotation.P
    private final q1 x(int i4) {
        if (this.f28401J.size() <= i4) {
            return null;
        }
        SparseArray<q1> sparseArray = this.f28401J;
        return sparseArray.get(sparseArray.keyAt(i4));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i4 = 0; i4 < this.f28401J.size(); i4++) {
            q1 x3 = x(i4);
            if (x3 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(x3.f28395i);
                printWriter.println(":");
                x3.f28396j.j(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        boolean z3 = this.f28445F;
        String valueOf = String.valueOf(this.f28401J);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z3);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f28446G.get() == null) {
            for (int i4 = 0; i4 < this.f28401J.size(); i4++) {
                q1 x3 = x(i4);
                if (x3 != null) {
                    x3.f28396j.g();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void l() {
        super.l();
        for (int i4 = 0; i4 < this.f28401J.size(); i4++) {
            q1 x3 = x(i4);
            if (x3 != null) {
                x3.f28396j.i();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w1
    protected final void n(C1231c c1231c, int i4) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i4 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        q1 q1Var = this.f28401J.get(i4);
        if (q1Var != null) {
            w(i4);
            i.c cVar = q1Var.f28397k;
            if (cVar != null) {
                cVar.A(c1231c);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.w1
    protected final void o() {
        for (int i4 = 0; i4 < this.f28401J.size(); i4++) {
            q1 x3 = x(i4);
            if (x3 != null) {
                x3.f28396j.g();
            }
        }
    }

    public final void v(int i4, com.google.android.gms.common.api.i iVar, @androidx.annotation.P i.c cVar) {
        boolean z3;
        C1285y.m(iVar, "GoogleApiClient instance cannot be null");
        if (this.f28401J.indexOfKey(i4) < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i4);
        C1285y.s(z3, sb.toString());
        t1 t1Var = this.f28446G.get();
        boolean z4 = this.f28445F;
        String valueOf = String.valueOf(t1Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i4);
        sb2.append(" ");
        sb2.append(z4);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        q1 q1Var = new q1(this, i4, iVar, cVar);
        iVar.C(q1Var);
        this.f28401J.put(i4, q1Var);
        if (this.f28445F && t1Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(iVar.toString()));
            iVar.g();
        }
    }

    public final void w(int i4) {
        q1 q1Var = this.f28401J.get(i4);
        this.f28401J.remove(i4);
        if (q1Var != null) {
            q1Var.f28396j.G(q1Var);
            q1Var.f28396j.i();
        }
    }
}
