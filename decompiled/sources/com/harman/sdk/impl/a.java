package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.ReqBassBoostCommand;
import com.harman.sdk.command.SetBassBoostCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nBassBoostControlImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BassBoostControlImpl.kt\ncom/harman/sdk/impl/BassBoostControlImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes2.dex */
public final class a implements z2.b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f47867a;

    public a(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        this.f47867a = impl;
    }

    @Override // z2.b
    public void B(@l3.d HmDevice device) {
        F.p(device, "device");
        int P02 = ((PartyBoxDevice) device).P0();
        com.harman.log.f.a("BASS_BOOST", "  sendCommand: setBassBoostXLSOperation and bassState is " + P02);
        q0(device, new SetBassBoostCommand(new byte[]{(byte) P02}), null);
    }

    public final void I0(@l3.d HmDevice device) {
        F.p(device, "device");
        com.harman.log.f.a("BLE_LOG", "  sendCommand: setBassBoostXLSOperation and bassState is " + ((PartyBoxDevice) device).P0());
    }

    @Override // z2.b
    public void d0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new ReqBassBoostCommand(), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f47867a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f47867a.y(listener);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        this.f47867a.G(device, command, dVar);
    }
}
