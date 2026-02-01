package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.b;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.tasks.C1771l;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1216t<A extends C1164a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    private final C1205n<L> f28408a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private final C1233e[] f28409b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28410c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28411d;

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public AbstractC1216t(@androidx.annotation.N C1205n<L> c1205n, @androidx.annotation.P C1233e[] c1233eArr, boolean z3, int i4) {
        this.f28408a = c1205n;
        this.f28409b = c1233eArr;
        this.f28410c = z3;
        this.f28411d = i4;
    }

    @I0.a
    public void a() {
        this.f28408a.a();
    }

    @androidx.annotation.P
    @I0.a
    public C1205n.a<L> b() {
        return this.f28408a.b();
    }

    @androidx.annotation.P
    @I0.a
    public C1233e[] c() {
        return this.f28409b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public abstract void d(@androidx.annotation.N A a4, @androidx.annotation.N C1771l<Void> c1771l) throws RemoteException;

    public final int e() {
        return this.f28411d;
    }

    public final boolean f() {
        return this.f28410c;
    }

    @I0.a
    protected AbstractC1216t(@androidx.annotation.N C1205n<L> c1205n) {
        this(c1205n, null, false, 0);
    }

    @I0.a
    protected AbstractC1216t(@androidx.annotation.N C1205n<L> c1205n, @androidx.annotation.N C1233e[] c1233eArr, boolean z3) {
        this(c1205n, c1233eArr, z3, 0);
    }
}
