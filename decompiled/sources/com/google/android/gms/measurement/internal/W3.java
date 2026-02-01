package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class W3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30469E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30470F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30471G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ Z4 f30472H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ boolean f30473I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30474J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W3(C1628d4 c1628d4, AtomicReference atomicReference, String str, String str2, String str3, Z4 z4, boolean z3) {
        this.f30474J = c1628d4;
        this.f30469E = atomicReference;
        this.f30470F = str2;
        this.f30471G = str3;
        this.f30472H = z4;
        this.f30473I = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1628d4 c1628d4;
        InterfaceC1661j1 interfaceC1661j1;
        synchronized (this.f30469E) {
            try {
                try {
                    c1628d4 = this.f30474J;
                    interfaceC1661j1 = c1628d4.f30589d;
                } catch (RemoteException e4) {
                    this.f30474J.f31060a.b().p().d("(legacy) Failed to get user properties; remote exception", null, this.f30470F, e4);
                    this.f30469E.set(Collections.emptyList());
                    atomicReference = this.f30469E;
                }
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().d("(legacy) Failed to get user properties; not connected to service", null, this.f30470F, this.f30471G);
                    this.f30469E.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C1285y.l(this.f30472H);
                    this.f30469E.set(interfaceC1661j1.n1(this.f30470F, this.f30471G, this.f30473I, this.f30472H));
                } else {
                    this.f30469E.set(interfaceC1661j1.V(null, this.f30470F, this.f30471G, this.f30473I));
                }
                this.f30474J.C();
                atomicReference = this.f30469E;
                atomicReference.notify();
            } finally {
                this.f30469E.notify();
            }
        }
    }
}
