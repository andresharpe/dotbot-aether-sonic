package com.harman.sdk.impl;

import android.content.Context;
import android.util.Log;
import com.harman.sdk.command.BaseNoResponseCommand;
import com.harman.sdk.device.HmDevice;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class d implements z2.c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48000a;

    public d(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        this.f48000a = impl;
    }

    private final void I0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48000a.G(hmDevice, aVar, dVar);
    }

    @Override // z2.c
    public void T(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        BaseNoResponseCommand baseNoResponseCommand = new BaseNoResponseCommand();
        byte[] bArr = {com.harman.sdk.utils.k.f48712s, 0};
        baseNoResponseCommand.p((byte) 1);
        baseNoResponseCommand.j(bArr);
        q0(device, baseNoResponseCommand, dVar);
        Log.d("DEVICE_ANALYTICS_LOG", baseNoResponseCommand.toString());
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48000a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48000a.y(listener);
    }

    @Override // z2.c
    public void o(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        BaseNoResponseCommand baseNoResponseCommand = new BaseNoResponseCommand();
        baseNoResponseCommand.p(com.harman.sdk.utils.k.f48708r);
        baseNoResponseCommand.j(null);
        q0(device, baseNoResponseCommand, dVar);
        Log.d("DEVICE_ANALYTICS_LOG", baseNoResponseCommand.toString());
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        I0(device, command, dVar);
    }

    @Override // z2.c
    public void w(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        BaseNoResponseCommand baseNoResponseCommand = new BaseNoResponseCommand();
        byte[] bArr = {com.harman.sdk.utils.k.f48718u, 0};
        baseNoResponseCommand.p((byte) 1);
        baseNoResponseCommand.j(bArr);
        q0(device, baseNoResponseCommand, dVar);
        Log.d("PLAY_ANALYTICS_LOG", baseNoResponseCommand.toString());
    }

    @Override // z2.c
    public void y(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        BaseNoResponseCommand baseNoResponseCommand = new BaseNoResponseCommand();
        baseNoResponseCommand.p(com.harman.sdk.utils.k.f48715t);
        baseNoResponseCommand.j(null);
        q0(device, baseNoResponseCommand, dVar);
        Log.d("PLAY_ANALYTICS_LOG", baseNoResponseCommand.toString());
    }
}
