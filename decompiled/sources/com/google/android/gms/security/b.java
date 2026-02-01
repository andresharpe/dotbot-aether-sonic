package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.a;

/* loaded from: classes2.dex */
final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f31069a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.InterfaceC0273a f31070b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, a.InterfaceC0273a interfaceC0273a) {
        this.f31069a = context;
        this.f31070b = interfaceC0273a;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            a.a(this.f31069a);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e4) {
            return Integer.valueOf(e4.f27959E);
        } catch (GooglePlayServicesRepairableException e5) {
            return Integer.valueOf(e5.b());
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C1237i c1237i;
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            c1237i = a.f31065b;
            this.f31070b.b(num.intValue(), c1237i.e(this.f31069a, num.intValue(), "pi"));
            return;
        }
        this.f31070b.a();
    }
}
