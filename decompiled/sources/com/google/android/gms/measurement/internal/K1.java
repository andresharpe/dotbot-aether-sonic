package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.messaging.C1821f;

/* loaded from: classes2.dex */
final class K1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.U f30275E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f30276F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ L1 f30277G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(L1 l12, com.google.android.gms.internal.measurement.U u3, ServiceConnection serviceConnection) {
        this.f30277G = l12;
        this.f30275E = u3;
        this.f30276F = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        L1 l12 = this.f30277G;
        M1 m12 = l12.f30297d;
        str = l12.f30296c;
        com.google.android.gms.internal.measurement.U u3 = this.f30275E;
        ServiceConnection serviceConnection = this.f30276F;
        m12.f30337a.a().f();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle o4 = u3.o(bundle);
            if (o4 == null) {
                m12.f30337a.b().p().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = o4;
            }
        } catch (Exception e4) {
            m12.f30337a.b().p().b("Exception occurred while retrieving the Install Referrer", e4.getMessage());
        }
        m12.f30337a.a().f();
        C1638f2.r();
        if (bundle2 != null) {
            long j4 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j4 == 0) {
                m12.f30337a.b().u().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    m12.f30337a.b().t().b("InstallReferrer API result", string);
                    Bundle r02 = m12.f30337a.L().r0(Uri.parse("?".concat(string)));
                    if (r02 == null) {
                        m12.f30337a.b().p().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = r02.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j5 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j5 == 0) {
                                m12.f30337a.b().p().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                r02.putLong("click_timestamp", j5);
                            }
                        }
                        if (j4 == m12.f30337a.D().f30252f.a()) {
                            m12.f30337a.b().t().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (m12.f30337a.m()) {
                            m12.f30337a.D().f30252f.b(j4);
                            m12.f30337a.b().t().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            r02.putString("_cis", "referrer API v2");
                            m12.f30337a.G().r(kotlinx.coroutines.W.f52989c, C1821f.C0339f.f36999l, r02, str);
                        }
                    }
                } else {
                    m12.f30337a.b().p().a("No referrer defined in Install Referrer response");
                }
            }
        }
        com.google.android.gms.common.stats.b.b().c(m12.f30337a.d(), serviceConnection);
    }
}
