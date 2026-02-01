package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.ReqKaraokeCommand;
import com.harman.sdk.command.SetKaraokeCommand;
import com.harman.sdk.device.HmDevice;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h implements z2.h {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48005a;

    public h(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        this.f48005a = impl;
    }

    private final void I0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48005a.G(hmDevice, aVar, dVar);
    }

    @Override // z2.h
    public void B0(@l3.d HmDevice device, int i4, int i5, @l3.e z2.d dVar) {
        F.p(device, "device");
        q0(device, new SetKaraokeCommand(new byte[]{(byte) i4, (byte) i5}), dVar);
    }

    @Override // z2.h
    public void F(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48005a.G(device, new ReqKaraokeCommand(), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48005a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48005a.y(listener);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        I0(device, command, dVar);
    }
}
