package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.ReqSimpleEqCommand;
import com.harman.sdk.command.SetSimpleEqCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.SimpleEQSettings;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nSimpleEQControlImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleEQControlImpl.kt\ncom/harman/sdk/impl/SimpleEQControlImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes2.dex */
public final class n implements z2.m {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Context f48016a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48017b;

    public n(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        Context applicationContext = context.getApplicationContext();
        F.o(applicationContext, "getApplicationContext(...)");
        this.f48016a = applicationContext;
        this.f48017b = impl;
    }

    private final void I0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48017b.G(hmDevice, aVar, dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48017b.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48017b.y(listener);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        I0(device, command, dVar);
    }

    @Override // z2.m
    public void r(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new ReqSimpleEqCommand(), dVar);
    }

    @Override // z2.m
    public void s(@l3.d HmDevice device, @l3.d SimpleEQSettings simpleEq, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(simpleEq, "simpleEq");
        q0(device, new SetSimpleEqCommand(simpleEq, (byte) device.m()), dVar);
    }
}
