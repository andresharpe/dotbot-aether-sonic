package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1285y;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@I0.a
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: E, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    protected final InterfaceC1203m f28187E;

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public LifecycleCallback(@androidx.annotation.N InterfaceC1203m interfaceC1203m) {
        this.f28187E = interfaceC1203m;
    }

    @I0.a
    @androidx.annotation.N
    public static InterfaceC1203m c(@androidx.annotation.N Activity activity) {
        return e(new C1201l(activity));
    }

    @I0.a
    @androidx.annotation.N
    public static InterfaceC1203m d(@androidx.annotation.N ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    @androidx.annotation.N
    public static InterfaceC1203m e(@androidx.annotation.N C1201l c1201l) {
        if (c1201l.d()) {
            return zzd.zzc(c1201l.b());
        }
        if (c1201l.c()) {
            return I1.c(c1201l.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC1203m getChimeraLifecycleFragmentImpl(C1201l c1201l) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @I0.a
    @androidx.annotation.K
    public void a(@androidx.annotation.N String str, @androidx.annotation.N FileDescriptor fileDescriptor, @androidx.annotation.N PrintWriter printWriter, @androidx.annotation.N String[] strArr) {
    }

    @I0.a
    @androidx.annotation.N
    public Activity b() {
        Activity lifecycleActivity = this.f28187E.getLifecycleActivity();
        C1285y.l(lifecycleActivity);
        return lifecycleActivity;
    }

    @I0.a
    @androidx.annotation.K
    public void f(int i4, int i5, @androidx.annotation.N Intent intent) {
    }

    @I0.a
    @androidx.annotation.K
    public void g(@androidx.annotation.P Bundle bundle) {
    }

    @I0.a
    @androidx.annotation.K
    public void h() {
    }

    @I0.a
    @androidx.annotation.K
    public void i() {
    }

    @I0.a
    @androidx.annotation.K
    public void j(@androidx.annotation.N Bundle bundle) {
    }

    @I0.a
    @androidx.annotation.K
    public void k() {
    }

    @I0.a
    @androidx.annotation.K
    public void l() {
    }
}
