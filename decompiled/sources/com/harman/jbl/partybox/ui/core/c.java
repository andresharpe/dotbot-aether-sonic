package com.harman.jbl.partybox.ui.core;

import androidx.lifecycle.P;
import com.harman.jbl.partybox.h;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.impl.connect.i;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.DeviceProtocol;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.e;
import y2.InterfaceC2445a;

/* loaded from: classes2.dex */
public final class c extends com.harman.jbl.partybox.ui.core.base.a {

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    public static final a f42427K = new a(null);

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private static final String f42428L;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f42429I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final InterfaceC2445a.InterfaceC0551a f42430J;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return c.f42428L;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC2445a.InterfaceC0551a {
        b() {
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            String str;
            F.p(protocol, "protocol");
            a aVar = c.f42427K;
            String a4 = aVar.a();
            if (hmDevice != null) {
                str = hmDevice.n();
            } else {
                str = null;
            }
            f.a(a4, "connectionListener onStatusChanged: device = " + str + ", mainDevice = " + c.this.u().n() + ", status = " + i4 + ", protocol = " + protocol);
            if (F.g(c.this.u(), hmDevice) && i4 == 0) {
                f.a(aVar.a(), "connectionListener onStatusChanged: changed bleConnectStatusLiveData to false");
                h.f40556a.b(c.this.w(), Boolean.FALSE);
            } else if (F.g(c.this.u(), hmDevice) && i4 == 2) {
                f.a(aVar.a(), "connectionListener onStatusChanged: changed bleConnectStatusLiveData to true");
                h.f40556a.b(c.this.w(), Boolean.TRUE);
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void b(@l3.d HmDevice hmDevice) {
            InterfaceC2445a.InterfaceC0551a.C0552a.a(this, hmDevice);
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void c(@l3.d HmDevice hmDevice) {
            InterfaceC2445a.InterfaceC0551a.C0552a.b(this, hmDevice);
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void d(@l3.d BaseMessage deviceMessage) {
            F.p(deviceMessage, "deviceMessage");
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        F.o(simpleName, "getSimpleName(...)");
        f42428L = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@l3.d PartyBoxDevice device) {
        super(device);
        F.p(device, "device");
        this.f42429I = new P<>();
        b bVar = new b();
        this.f42430J = bVar;
        i d4 = com.harman.sdk.b.d(com.harman.sdk.b.f47608a, null, 1, null);
        if (d4 != null) {
            d4.c(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.harman.jbl.partybox.ui.core.base.a, androidx.lifecycle.j0
    public void s() {
        i d4 = com.harman.sdk.b.d(com.harman.sdk.b.f47608a, null, 1, null);
        if (d4 != null) {
            d4.d(this.f42430J);
        }
    }

    @l3.d
    public final P<Boolean> w() {
        return this.f42429I;
    }
}
