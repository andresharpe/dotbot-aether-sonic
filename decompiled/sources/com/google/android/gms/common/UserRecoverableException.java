package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: E, reason: collision with root package name */
    private final Intent f27989E;

    public UserRecoverableException(@androidx.annotation.N String str, @androidx.annotation.N Intent intent) {
        super(str);
        this.f27989E = intent;
    }

    @androidx.annotation.N
    public Intent a() {
        return new Intent(this.f27989E);
    }
}
