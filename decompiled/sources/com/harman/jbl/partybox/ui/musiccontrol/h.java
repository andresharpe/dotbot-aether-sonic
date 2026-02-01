package com.harman.jbl.partybox.ui.musiccontrol;

import android.os.Bundle;
import androidx.core.os.C0741d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import com.harman.sdk.command.ReqPlayerInfoCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.MusicControlSettings;
import com.harman.sdk.utils.PartyConnectStatus;
import com.harman.sdk.utils.PlayerStatus;
import com.harman.sdk.utils.StatusCode;
import kotlin.C2122h0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import z2.l;

/* loaded from: classes2.dex */
public final class h extends com.harman.jbl.partybox.c {

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    public static final a f44366R = new a(null);

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private static final String f44367S = "MusicControlViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final P<PartyBoxDevice> f44368P = new P<>();

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final z2.d f44369Q = new c();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44370a;

        static {
            int[] iArr = new int[MessageID.values().length];
            try {
                iArr[MessageID.PLAYER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageID.DEVICE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageID.RET_VOLUME_BOOST_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44370a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements z2.d {
        c() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            if (device instanceof PartyBoxDevice) {
                h.this.a0(device, code, msg);
            }
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            if (device instanceof PartyBoxDevice) {
                h.this.a0(device, code, msg);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        int i4;
        this.f38311M = hmDevice;
        T1.a.a("MusicControlViewModel, MusicControlUpdate observer called, msg = " + baseMessage + " device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            MessageID b4 = baseMessage.b();
            if (b4 == null) {
                i4 = -1;
            } else {
                i4 = b.f44370a[b4.ordinal()];
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        com.harman.jbl.partybox.h.f40556a.b(this.f44368P, hmDevice);
                        return;
                    }
                    return;
                }
                com.harman.jbl.partybox.h.f40556a.b(this.f44368P, hmDevice);
                return;
            }
            com.harman.jbl.partybox.h.f40556a.b(this.f44368P, hmDevice);
        }
    }

    @Override // com.harman.jbl.partybox.c
    public void O() {
        z2.e e4;
        super.O();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.h(this.f44369Q);
        }
    }

    @Override // com.harman.jbl.partybox.c
    public void P() {
        z2.e e4;
        super.P();
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null && (e4 = com.harman.sdk.b.f47608a.e(hmDevice)) != null) {
            e4.m(this.f44369Q);
        }
    }

    public final void W(@l3.d String actionValue, @l3.e String str) {
        F.p(actionValue, "actionValue");
        Bundle b4 = C0741d.b(C2122h0.a("di_action_type", actionValue), C2122h0.a(L1.a.u3, Integer.valueOf(com.harman.jbl.partybox.c.f38305O)));
        if (str != null && str.length() != 0) {
            b4.putString(L1.a.f1522R1, str);
        }
        HmDevice hmDevice = this.f38311M;
        if (hmDevice != null) {
            b4.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
        }
        K1.a.a(L1.a.f1514P1, b4);
    }

    @l3.d
    public final LiveData<PartyBoxDevice> X() {
        return this.f44368P;
    }

    public final void Y(@l3.d HmDevice device) {
        F.p(device, "device");
        this.f38311M = device;
        P();
    }

    public final void Z(@l3.d HmDevice device, int i4) {
        F.p(device, "device");
        l j4 = com.harman.sdk.b.f47608a.j(device);
        if (j4 != null) {
            j4.X(device, i4, this.f44369Q);
        }
    }

    public final void b0(@l3.d HmDevice device, @l3.d PlayerStatus playerStatePrev) {
        l j4;
        F.p(device, "device");
        F.p(playerStatePrev, "playerStatePrev");
        T1.a.a("BLE_LOG MusicPlayControl, Connected Device = " + device + " PlayerStatus = " + playerStatePrev);
        if ((device.c() != ReqPlayerInfoCommand.f47674L.a() || (playerStatePrev != PlayerStatus.PLAYER_STATE_PREV && playerStatePrev != PlayerStatus.PLAYER_STATE_NEXT)) && (j4 = com.harman.sdk.b.f47608a.j(device)) != null) {
            j4.C(device, playerStatePrev, this.f44369Q);
        }
    }

    public final void c0(@l3.d HmDevice device, int i4) {
        F.p(device, "device");
        MusicControlSettings e12 = ((PartyBoxDevice) device).e1();
        if (e12 != null) {
            e12.k(i4);
        }
        l j4 = com.harman.sdk.b.f47608a.j(device);
        if (j4 != null) {
            j4.w0(device, i4, this.f44369Q);
        }
        W(L1.a.f1554Z1, null);
    }

    public final void d0(@l3.d HmDevice connectedDevice, int i4) {
        F.p(connectedDevice, "connectedDevice");
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) connectedDevice;
        MusicControlSettings e12 = partyBoxDevice.e1();
        if (e12 != null) {
            e12.n(i4);
        }
        if (partyBoxDevice.O1() && partyBoxDevice.r1() && partyBoxDevice.i1() == PartyConnectStatus.PARTY_CONNECT_WIRELESS_CONNECTED) {
            T1.a.a("BLE_LOG MusicVolumeControl, Connected Device = " + connectedDevice + " VolumeStatus = " + i4);
            l j4 = com.harman.sdk.b.f47608a.j(connectedDevice);
            if (j4 != null) {
                j4.N(connectedDevice, i4, this.f44369Q);
            }
        } else {
            T1.a.a("BLE_LOG MusicVolumeControl, Connected Device = " + connectedDevice + " VolumeStatus = " + i4);
            l j5 = com.harman.sdk.b.f47608a.j(connectedDevice);
            if (j5 != null) {
                j5.m0(connectedDevice, i4, this.f44369Q);
            }
        }
        W(L1.a.f1550Y1, null);
    }
}
