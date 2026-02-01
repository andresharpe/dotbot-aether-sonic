package com.harman.jbl.partybox.ui.bassboost;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.partybox.ui.bassboost.BassBoostFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e extends com.harman.jbl.partybox.c {

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    public static final a f42132Q = new a(null);

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private static final String f42133R = "BassBoostViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<PartyBoxDevice> f42134P = new P<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @l3.d
    public final LiveData<PartyBoxDevice> V() {
        return this.f42134P;
    }

    public final void W(@l3.d HmDevice device, int i4) {
        F.p(device, "device");
        ((PartyBoxDevice) device).U1(i4);
        z2.b a4 = com.harman.sdk.b.f47608a.a(device);
        if (a4 != null) {
            a4.B(device);
        }
        if (i4 != BassBoostFragment.EqType.PB_SIMPLE_EQ_OFF.ordinal()) {
            com.harman.jbl.partybox.persistence.a aVar = com.harman.jbl.partybox.persistence.a.f42065a;
            String n4 = device.n();
            Application a5 = E0.a();
            F.o(a5, "getApp(...)");
            aVar.z("BASS_BOOST_STATE_KEY", n4, i4, a5);
        }
    }
}
