package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.ReqDjEffectCommand;
import com.harman.sdk.command.SetDJFilterCommand;
import com.harman.sdk.command.SetDJVoiceCommand;
import com.harman.sdk.command.SetDjEffectToneCommand;
import com.harman.sdk.command.SetDjEffectToneWithOptionCommand;
import com.harman.sdk.device.HmDevice;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48003a;

    public f(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        this.f48003a = impl;
    }

    private final void I0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48003a.G(hmDevice, aVar, dVar);
    }

    @Override // z2.f
    public void E0(@l3.d HmDevice device, @l3.d byte[] status, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(status, "status");
    }

    @Override // z2.f
    public void H(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetDJVoiceCommand(new byte[]{(byte) i4}), dVar);
    }

    @Override // z2.f
    public void Q(@l3.d HmDevice device, int i4, int i5, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetDJFilterCommand(new byte[]{(byte) i4, (byte) i5}), dVar);
    }

    @Override // z2.f
    public void f0(@l3.d HmDevice connectedDevice, int i4, int i5, @l3.e z2.d dVar) {
        F.p(connectedDevice, "connectedDevice");
        q0(connectedDevice, new SetDjEffectToneWithOptionCommand(new byte[]{(byte) i5, (byte) i4}), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48003a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48003a.y(listener);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        I0(device, command, dVar);
    }

    @Override // z2.f
    public void u(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetDjEffectToneCommand(new byte[]{(byte) i4}), dVar);
    }

    @Override // z2.f
    public void v(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetDjEffectToneCommand(new byte[]{(byte) i4}), dVar);
    }

    @Override // z2.f
    public void z0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new ReqDjEffectCommand(), dVar);
    }
}
