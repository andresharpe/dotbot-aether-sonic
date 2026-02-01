package com.harman.sdk.impl;

import com.harman.sdk.command.BaseCommand;
import com.harman.sdk.command.ReqPlayerInfoCommand;
import com.harman.sdk.command.SetPlayerInfoCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.utils.MuteStatus;
import com.harman.sdk.utils.PlayerStatus;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;

/* loaded from: classes2.dex */
public final class m implements z2.l {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48015a;

    public m(@l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(impl, "impl");
        this.f48015a = impl;
    }

    private final void I0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48015a.G(hmDevice, aVar, dVar);
    }

    @Override // z2.l
    public void C(@l3.d HmDevice device, @l3.d PlayerStatus status, @l3.e z2.d dVar) {
        int a4;
        F.p(device, "device");
        F.p(status, "status");
        byte m4 = (byte) device.m();
        a4 = C2220b.a(16);
        q0(device, new SetPlayerInfoCommand(new byte[]{m4, Byte.parseByte("41", a4), 1, (byte) status.j()}), dVar);
    }

    @Override // z2.l
    public void G0(@l3.d HmDevice device, @l3.d MuteStatus status, @l3.e z2.d dVar) {
        int a4;
        F.p(device, "device");
        F.p(status, "status");
        byte m4 = (byte) device.m();
        a4 = C2220b.a(16);
        q0(device, new SetPlayerInfoCommand(new byte[]{m4, Byte.parseByte("43", a4), 1, (byte) status.j()}), dVar);
    }

    @Override // z2.l
    public void N(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetPlayerInfoCommand(new byte[]{(byte) device.m(), 70, 1, (byte) i4}), dVar);
    }

    @Override // z2.l
    public void X(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        byte[] bArr = {(byte) device.m(), 54, 1, (byte) i4};
        BaseCommand baseCommand = new BaseCommand();
        baseCommand.p((byte) 19);
        baseCommand.j(bArr);
        q0(device, baseCommand, dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48015a.H(listener);
    }

    @Override // z2.l
    public void i0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        if (device instanceof PartyBoxDevice) {
            this.f48015a.G(device, new ReqPlayerInfoCommand(), dVar);
        }
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48015a.y(listener);
    }

    @Override // z2.l
    public void m0(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetPlayerInfoCommand(new byte[]{(byte) device.m(), 66, 1, (byte) i4}), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        I0(device, command, dVar);
    }

    @Override // z2.l
    public void w0(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetPlayerInfoCommand(new byte[]{(byte) device.m(), com.harman.sdk.utils.k.f48653d0, 1, (byte) i4}), dVar);
    }
}
