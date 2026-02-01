package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30121b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30122c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30123d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J1 f30124e;

    public C1(J1 j12, String str, boolean z3) {
        this.f30124e = j12;
        C1285y.h(str);
        this.f30120a = str;
        this.f30121b = z3;
    }

    @androidx.annotation.j0
    public final void a(boolean z3) {
        SharedPreferences.Editor edit = this.f30124e.m().edit();
        edit.putBoolean(this.f30120a, z3);
        edit.apply();
        this.f30123d = z3;
    }

    @androidx.annotation.j0
    public final boolean b() {
        if (!this.f30122c) {
            this.f30122c = true;
            this.f30123d = this.f30124e.m().getBoolean(this.f30120a, this.f30121b);
        }
        return this.f30123d;
    }
}
