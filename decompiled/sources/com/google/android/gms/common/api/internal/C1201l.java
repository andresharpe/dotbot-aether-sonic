package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC0889g;
import com.google.android.gms.common.internal.C1285y;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1201l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28350a;

    public C1201l(@androidx.annotation.N Activity activity) {
        C1285y.m(activity, "Activity must not be null");
        this.f28350a = activity;
    }

    @androidx.annotation.N
    public final Activity a() {
        return (Activity) this.f28350a;
    }

    @androidx.annotation.N
    public final ActivityC0889g b() {
        return (ActivityC0889g) this.f28350a;
    }

    public final boolean c() {
        return this.f28350a instanceof Activity;
    }

    public final boolean d() {
        return this.f28350a instanceof ActivityC0889g;
    }

    @I0.a
    public C1201l(@androidx.annotation.N ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
