package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U3 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ AtomicReference f30428E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30429F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f30430G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ Z4 f30431H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ C1628d4 f30432I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U3(C1628d4 c1628d4, AtomicReference atomicReference, String str, String str2, String str3, Z4 z4) {
        this.f30432I = c1628d4;
        this.f30428E = atomicReference;
        this.f30429F = str2;
        this.f30430G = str3;
        this.f30431H = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1628d4 c1628d4;
        InterfaceC1661j1 interfaceC1661j1;
        synchronized (this.f30428E) {
            try {
                try {
                    c1628d4 = this.f30432I;
                    interfaceC1661j1 = c1628d4.f30589d;
                } catch (RemoteException e4) {
                    this.f30432I.f31060a.b().p().d("(legacy) Failed to get conditional properties; remote exception", null, this.f30429F, e4);
                    this.f30428E.set(Collections.emptyList());
                    atomicReference = this.f30428E;
                }
                if (interfaceC1661j1 == null) {
                    c1628d4.f31060a.b().p().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f30429F, this.f30430G);
                    this.f30428E.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C1285y.l(this.f30431H);
                    this.f30428E.set(interfaceC1661j1.R0(this.f30429F, this.f30430G, this.f30431H));
                } else {
                    this.f30428E.set(interfaceC1661j1.r0(null, this.f30429F, this.f30430G));
                }
                this.f30432I.C();
                atomicReference = this.f30428E;
                atomicReference.notify();
            } finally {
                this.f30428E.notify();
            }
        }
    }
}
