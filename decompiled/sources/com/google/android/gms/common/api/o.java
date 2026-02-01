package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public abstract class o<R extends q> extends s<R> {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f28459a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28460b;

    protected o(@N Activity activity, int i4) {
        C1285y.m(activity, "Activity must not be null");
        this.f28459a = activity;
        this.f28460b = i4;
    }

    @Override // com.google.android.gms.common.api.s
    @I0.a
    public final void b(@N Status status) {
        if (status.x0()) {
            try {
                status.E0(this.f28459a, this.f28460b);
                return;
            } catch (IntentSender.SendIntentException e4) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e4);
                d(new Status(8));
                return;
            }
        }
        d(status);
    }

    @Override // com.google.android.gms.common.api.s
    public abstract void c(@N R r4);

    public abstract void d(@N Status status);
}
