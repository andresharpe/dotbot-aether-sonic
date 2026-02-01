package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private final A f27822a;

    /* renamed from: b, reason: collision with root package name */
    protected final q f27823b;

    /* renamed from: c, reason: collision with root package name */
    private final List f27824c;

    /* JADX INFO: Access modifiers changed from: protected */
    @com.google.android.gms.common.util.D
    public t(A a4, InterfaceC1306g interfaceC1306g) {
        C1285y.l(a4);
        this.f27822a = a4;
        this.f27824c = new ArrayList();
        q qVar = new q(this, interfaceC1306g);
        qVar.h();
        this.f27823b = qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(q qVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final A b() {
        return this.f27822a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(q qVar) {
        Iterator it = this.f27824c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).zza();
        }
    }
}
