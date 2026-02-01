package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: F, reason: collision with root package name */
    private final int f27960F;

    public GooglePlayServicesRepairableException(int i4, @androidx.annotation.N String str, @androidx.annotation.N Intent intent) {
        super(str, intent);
        this.f27960F = i4;
    }

    public int b() {
        return this.f27960F;
    }
}
