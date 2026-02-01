package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f30203a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30204b;

    /* renamed from: c, reason: collision with root package name */
    private String f30205c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ J1 f30206d;

    public I1(J1 j12, String str, String str2) {
        this.f30206d = j12;
        C1285y.h(str);
        this.f30203a = str;
    }

    @androidx.annotation.j0
    public final String a() {
        if (!this.f30204b) {
            this.f30204b = true;
            this.f30205c = this.f30206d.m().getString(this.f30203a, null);
        }
        return this.f30205c;
    }

    @androidx.annotation.j0
    public final void b(String str) {
        SharedPreferences.Editor edit = this.f30206d.m().edit();
        edit.putString(this.f30203a, str);
        edit.apply();
        this.f30205c = str;
    }
}
