package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C1771l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class v<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f27939a;

    /* renamed from: b, reason: collision with root package name */
    final C1771l<T> f27940b = new C1771l<>();

    /* renamed from: c, reason: collision with root package name */
    final int f27941c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f27942d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i4, int i5, Bundle bundle) {
        this.f27939a = i4;
        this.f27941c = i5;
        this.f27942d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f27940b.b(zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(T t3) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t3);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f27940b.c(t3);
    }

    public final String toString() {
        int i4 = this.f27941c;
        int i5 = this.f27939a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i4);
        sb.append(" id=");
        sb.append(i5);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
