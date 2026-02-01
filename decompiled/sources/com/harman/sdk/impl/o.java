package com.harman.sdk.impl;

import com.harman.sdk.command.BaseCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.PartyConnectStatus;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class o implements z2.n {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final a f48018b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final String f48019c = "Stereo.TWSControlImpl";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48020a;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public o(@l3.d com.harman.sdk.impl.connect.i deviceConnect) {
        F.p(deviceConnect, "deviceConnect");
        this.f48020a = deviceConnect;
    }

    @l3.d
    public final com.harman.sdk.impl.connect.i I0() {
        return this.f48020a;
    }

    @Override // z2.n
    public void K(@l3.e HmDevice hmDevice, @l3.d PartyConnectStatus twsMode, @l3.e z2.d dVar) {
        F.p(twsMode, "twsMode");
        if (hmDevice != null) {
            BaseCommand baseCommand = new BaseCommand();
            byte[] bArr = {(byte) hmDevice.m(), 57, 1, (byte) twsMode.j()};
            baseCommand.p((byte) 19);
            baseCommand.j(bArr);
            com.harman.log.f.d(f48019c, "setPartyConnectionOperation() >>> send to MAC[" + hmDevice.n() + "] BLE[" + hmDevice.g() + "]\npayload[" + com.harman.sdk.utils.g.g(bArr) + "]");
            q0(hmDevice, baseCommand, dVar);
        }
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48020a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48020a.y(listener);
    }

    @Override // z2.n
    public void n0(@l3.e HmDevice hmDevice, @l3.d AudioChannel channel, @l3.e z2.d dVar) {
        F.p(channel, "channel");
        if (hmDevice != null) {
            BaseCommand baseCommand = new BaseCommand();
            byte[] bArr = {(byte) hmDevice.m(), 53, 1, (byte) channel.i()};
            baseCommand.p((byte) 19);
            baseCommand.j(bArr);
            com.harman.log.f.d(f48019c, "sendChannelOperation() >>> send to MAC[" + hmDevice.n() + "] BLE[" + hmDevice.g() + "]\npayload[" + com.harman.sdk.utils.g.g(bArr) + "]");
            q0(hmDevice, baseCommand, dVar);
        }
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        this.f48020a.G(device, command, dVar);
    }

    @Override // z2.n
    public void s0(@l3.e HmDevice hmDevice, int i4, int i5, int i6, @l3.e z2.d dVar) {
        if (hmDevice != null) {
            BaseCommand baseCommand = new BaseCommand();
            byte[] bArr = {(byte) i4, 53, 1, (byte) i5, com.harman.sdk.utils.k.f48684l, 1, (byte) i6};
            baseCommand.p((byte) 51);
            baseCommand.j(bArr);
            com.harman.log.f.d(f48019c, "sendFlashOperation() >>> send to MAC[" + hmDevice.n() + "] BLE[" + hmDevice.g() + "]\npayload[" + com.harman.sdk.utils.g.g(bArr) + "]");
            q0(hmDevice, baseCommand, dVar);
        }
    }
}
