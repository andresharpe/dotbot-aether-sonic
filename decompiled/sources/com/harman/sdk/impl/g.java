package com.harman.sdk.impl;

import com.harman.sdk.command.IdentifyDeviceCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.EnumIdentifyDevice;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g implements z2.g {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48004a;

    public g(@l3.d com.harman.sdk.impl.connect.i deviceConnect) {
        F.p(deviceConnect, "deviceConnect");
        this.f48004a = deviceConnect;
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48004a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48004a.y(listener);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        this.f48004a.G(device, command, dVar);
    }

    @Override // z2.g
    public void y0(@l3.d HmDevice device, @l3.e EnumIdentifyDevice enumIdentifyDevice, @l3.e EnumIdentifyDevice enumIdentifyDevice2, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48004a.G(device, new IdentifyDeviceCommand(device, enumIdentifyDevice, enumIdentifyDevice2), dVar);
    }
}
