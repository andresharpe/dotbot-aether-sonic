package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.K;
import androidx.annotation.N;
import com.google.android.gms.measurement.internal.N1;
import com.google.android.gms.measurement.internal.O1;

/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends E.a implements N1 {

    /* renamed from: d, reason: collision with root package name */
    private O1 f30092d;

    @Override // com.google.android.gms.measurement.internal.N1
    @K
    public void a(@N Context context, @N Intent intent) {
        E.a.c(context, intent);
    }

    @N
    public BroadcastReceiver.PendingResult d() {
        return goAsync();
    }

    @Override // android.content.BroadcastReceiver
    @K
    public void onReceive(@N Context context, @N Intent intent) {
        if (this.f30092d == null) {
            this.f30092d = new O1(this);
        }
        this.f30092d.a(context, intent);
    }
}
