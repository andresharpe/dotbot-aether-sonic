package com.harman.jbl.partybox.ui.splash;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.blankj.utilcode.util.E0;
import com.google.firebase.crashlytics.i;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<UiPage> f45534H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f45535I = new P<>();

    private final void x() {
        T1.a.a("BLE_LOG Enable Firebase Analytics during App Init.");
        K1.a.c(E0.a());
        r3.c.d(E0.a(), com.harman.jbl.partybox.f.f40392g, com.harman.jbl.partybox.f.f40391f);
        T1.a.a("BLE_LOG Enable Firebase Crashlytics during App Init.");
        i.d().j(true);
    }

    public final void A() {
        if (com.harman.jbl.partybox.persistence.a.f42065a.l(false)) {
            com.harman.legallib.d dVar = com.harman.legallib.d.f47556a;
            Application a4 = E0.a();
            F.o(a4, "getApp(...)");
            if (dVar.s(a4)) {
                T1.a.a("SplashViewModel welcomeActionCompleted : agreement accepted but new version is available, so display welcome screen again");
                this.f45535I.r(Boolean.TRUE);
                this.f45534H.r(UiPage.WELCOME_SCREEN);
                return;
            } else {
                x();
                this.f45534H.r(UiPage.DISCOVERY);
                return;
            }
        }
        this.f45534H.r(UiPage.WELCOME_SCREEN);
    }

    public final boolean u() {
        return com.harman.jbl.partybox.persistence.a.f42065a.s(true);
    }

    @l3.d
    public final LiveData<UiPage> v() {
        return this.f45534H;
    }

    @l3.d
    public final LiveData<Boolean> w() {
        return this.f45535I;
    }

    public final void y() {
        this.f45535I.r(Boolean.FALSE);
    }

    public final void z() {
        com.harman.jbl.partybox.persistence.a.f42065a.D();
    }
}
