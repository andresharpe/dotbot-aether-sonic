package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.N;
import androidx.annotation.Y;
import com.google.android.gms.internal.gtm.zzfk;

/* loaded from: classes.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private zzfk f27742a;

    @Override // android.content.BroadcastReceiver
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(@N Context context, @N Intent intent) {
        if (this.f27742a == null) {
            this.f27742a = new zzfk();
        }
        zzfk.zzb(context, intent);
    }
}
