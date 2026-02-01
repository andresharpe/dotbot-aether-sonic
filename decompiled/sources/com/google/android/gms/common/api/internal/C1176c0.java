package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1181e;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176c0 implements InterfaceC1202l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotOnlyInitialized
    private final C1208o0 f28258a;

    public C1176c0(C1208o0 c1208o0) {
        this.f28258a = c1208o0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void a(@androidx.annotation.P Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void b() {
        this.f28258a.q();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void c(C1231c c1231c, C1164a<?> c1164a, boolean z3) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void d(int i4) {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final void e() {
        Iterator<C1164a.f> it = this.f28258a.f28369n.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f28258a.f28377v.f28339s = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final <A extends C1164a.b, R extends com.google.android.gms.common.api.q, T extends C1181e.a<R, A>> T f(T t3) {
        this.f28258a.f28377v.f28331k.add(t3);
        return t3;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1202l0
    public final <A extends C1164a.b, T extends C1181e.a<? extends com.google.android.gms.common.api.q, A>> T h(T t3) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
