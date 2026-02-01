package com.harman.jbl.partybox.ui.party.stereo;

import androidx.annotation.K;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.blankj.utilcode.util.x0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoRenameFromPage;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class w extends j0 {

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    public static final a f45380N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final String f45381O = "Stereo.RenameViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<EnumStereoRenameFromPage> f45382H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45383I = new P<>();

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45384J = new P<>();

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private P<HmDevice> f45385K = new P<>();

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private P<HmDevice> f45386L = new P<>();

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final P<String> f45387M = new P<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @l3.d
    public final LiveData<HmDevice> A() {
        return this.f45386L;
    }

    @K
    public final void B(@l3.e String str, @l3.d X2.a<H0> toDashboard) {
        boolean S12;
        F.p(toDashboard, "toDashboard");
        com.harman.log.f.d(f45381O, "onNameChanged() >>> name[" + str + "]");
        if (str != null) {
            S12 = kotlin.text.z.S1(str);
            if (!S12) {
                this.f45387M.r(str);
                toDashboard.n();
            }
        }
    }

    @K
    public final void u(@l3.d t args) {
        String d4;
        AudioChannel audioChannel;
        String str;
        F.p(args, "args");
        this.f45383I.r(args.e());
        this.f45384J.r(args.c());
        this.f45382H.r(EnumStereoRenameFromPage.Companion.a(args.d()));
        P<String> p4 = this.f45387M;
        TWSInfo M3 = args.e().M();
        if (M3 == null || (d4 = M3.b()) == null) {
            d4 = x0.d(j.m.V5);
        }
        p4.r(d4);
        HmDevice f4 = this.f45383I.f();
        String str2 = null;
        if (f4 != null) {
            audioChannel = f4.i();
        } else {
            audioChannel = null;
        }
        if (audioChannel == AudioChannel.STEREO_LEFT) {
            this.f45385K = this.f45383I;
            this.f45386L = this.f45384J;
        } else {
            this.f45385K = this.f45384J;
            this.f45386L = this.f45383I;
        }
        HmDevice e4 = args.e();
        if (e4 != null) {
            str = com.harman.jbl.partybox.ui.party.b.f44881a.t(e4);
        } else {
            str = null;
        }
        HmDevice c4 = args.c();
        if (c4 != null) {
            str2 = com.harman.jbl.partybox.ui.party.b.f44881a.t(c4);
        }
        com.harman.log.f.d(f45381O, "bindArgs() >>> mainDev " + str + "\ncoDev " + str2 + "\nfrom[" + args.d() + "]");
    }

    @l3.d
    public final LiveData<HmDevice> v() {
        return this.f45384J;
    }

    @l3.d
    public final LiveData<EnumStereoRenameFromPage> w() {
        return this.f45382H;
    }

    @l3.d
    public final LiveData<String> x() {
        return this.f45387M;
    }

    @l3.d
    public final LiveData<HmDevice> y() {
        return this.f45385K;
    }

    @l3.d
    public final LiveData<HmDevice> z() {
        return this.f45383I;
    }
}
