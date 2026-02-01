package com.harman.jbl.partybox.ui.group;

import androidx.lifecycle.P;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.EnumIdentifyDevice;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class l extends com.harman.jbl.partybox.c {

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    public static final a f43759R = new a(null);

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    public static final String f43760S = "SpeakerInGroupViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<AudioChannel> f43761P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private P<AudioChannel> f43762Q;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public l() {
        P<AudioChannel> p4 = new P<>();
        this.f43761P = p4;
        this.f43762Q = p4;
    }

    @l3.d
    public final P<AudioChannel> V() {
        return this.f43762Q;
    }

    public final void W(@l3.d HmDevice device, @l3.d EnumIdentifyDevice mainIdentity, @l3.d EnumIdentifyDevice secondaryIdentity) {
        F.p(device, "device");
        F.p(mainIdentity, "mainIdentity");
        F.p(secondaryIdentity, "secondaryIdentity");
        z2.g m4 = com.harman.sdk.b.f47608a.m(device);
        if (m4 == null) {
            com.harman.log.f.b(f43760S, "lightIdentifyDevice() >>> go lightIdentity");
        } else {
            m4.y0(device, mainIdentity, secondaryIdentity, null);
        }
    }

    public final void X(@l3.d P<AudioChannel> p4) {
        F.p(p4, "<set-?>");
        this.f43762Q = p4;
    }

    public final void Y(@l3.d AudioChannel channel) {
        F.p(channel, "channel");
        com.harman.jbl.partybox.h.f40556a.b(this.f43761P, channel);
    }
}
