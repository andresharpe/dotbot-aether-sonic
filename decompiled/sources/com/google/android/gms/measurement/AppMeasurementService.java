package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.measurement.internal.C1670k4;
import com.google.android.gms.measurement.internal.InterfaceC1664j4;

/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements InterfaceC1664j4 {

    /* renamed from: E, reason: collision with root package name */
    private C1670k4 f30093E;

    private final C1670k4 d() {
        if (this.f30093E == null) {
            this.f30093E = new C1670k4(this);
        }
        return this.f30093E;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1664j4
    public final boolean a(int i4) {
        return stopSelfResult(i4);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1664j4
    public final void b(@N Intent intent) {
        E.a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1664j4
    public final void c(@N JobParameters jobParameters, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    @P
    @K
    public IBinder onBind(@N Intent intent) {
        return d().b(intent);
    }

    @Override // android.app.Service
    @K
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    @K
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    @K
    public void onRebind(@N Intent intent) {
        d().g(intent);
    }

    @Override // android.app.Service
    @K
    public int onStartCommand(@N Intent intent, int i4, int i5) {
        d().a(intent, i4, i5);
        return 2;
    }

    @Override // android.app.Service
    @K
    public boolean onUnbind(@N Intent intent) {
        d().j(intent);
        return true;
    }
}
