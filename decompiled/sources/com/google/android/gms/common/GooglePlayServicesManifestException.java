package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: E, reason: collision with root package name */
    private final int f27958E;

    public GooglePlayServicesManifestException(int i4, @androidx.annotation.N String str) {
        super(str);
        this.f27958E = i4;
    }

    public int a() {
        return this.f27958E;
    }

    public int b() {
        return C1237i.f28553a;
    }
}
