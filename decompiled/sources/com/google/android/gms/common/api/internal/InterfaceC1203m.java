package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1203m {
    @I0.a
    void addCallback(@androidx.annotation.N String str, @androidx.annotation.N LifecycleCallback lifecycleCallback);

    @androidx.annotation.P
    @I0.a
    <T extends LifecycleCallback> T getCallbackOrNull(@androidx.annotation.N String str, @androidx.annotation.N Class<T> cls);

    @androidx.annotation.P
    @I0.a
    Activity getLifecycleActivity();

    @I0.a
    boolean isCreated();

    @I0.a
    boolean isStarted();

    @I0.a
    void startActivityForResult(@androidx.annotation.N Intent intent, int i4);
}
