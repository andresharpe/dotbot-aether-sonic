package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.ReqDeviceDisconnectCommand;
import com.harman.sdk.command.ReqPhoneMacAddressCommand;
import com.harman.sdk.command.ReqPowerOffCommand;
import com.harman.sdk.command.ReqPowerOnCommand;
import com.harman.sdk.command.SetPhoneMacAddressCommand;
import com.harman.sdk.device.HmDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C;
import kotlin.text.C2220b;

@U({"SMAP\nPartyBoxDeviceControlImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyBoxDeviceControlImpl.kt\ncom/harman/sdk/impl/PartyBoxDeviceControlImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1549#2:64\n1620#2,3:65\n*S KotlinDebug\n*F\n+ 1 PartyBoxDeviceControlImpl.kt\ncom/harman/sdk/impl/PartyBoxDeviceControlImpl\n*L\n53#1:64\n53#1:65,3\n*E\n"})
/* loaded from: classes2.dex */
public final class l implements z2.j {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48014a;

    public l(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        this.f48014a = impl;
    }

    private final void J0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48014a.G(hmDevice, aVar, dVar);
    }

    @Override // z2.j
    public void E(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48014a.G(device, new ReqPhoneMacAddressCommand(), dVar);
    }

    @l3.d
    public final byte[] I0(@l3.d String str) {
        List<String> r6;
        int b02;
        byte[] O5;
        int a4;
        F.p(str, "<this>");
        r6 = C.r6(str, 2);
        b02 = C2109w.b0(r6, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (String str2 : r6) {
            a4 = C2220b.a(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, a4)));
        }
        O5 = D.O5(arrayList);
        return O5;
    }

    @Override // z2.j
    public void U(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        com.harman.log.f.a("BLE_LOG", " powerOnDevice ");
        q0(device, new ReqPowerOnCommand(), dVar);
    }

    @Override // z2.j
    public void V(@l3.d HmDevice device, @l3.d String phoneMacAddress, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(phoneMacAddress, "phoneMacAddress");
        byte[] I02 = I0(phoneMacAddress);
        com.harman.log.f.a("BLE_LOG", " setPhoneMacAddress macAddress : " + I02);
        q0(device, new SetPhoneMacAddressCommand(I02), dVar);
    }

    @Override // z2.j
    public void Y(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        com.harman.log.f.a("BLE_LOG", " powerOffDevice ");
        q0(device, new ReqPowerOffCommand(), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48014a.H(listener);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48014a.y(listener);
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        J0(device, command, dVar);
    }

    @Override // z2.j
    public void t(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        com.harman.log.f.a("BLE_LOG", " disconnectDevice command sent");
        q0(device, new ReqDeviceDisconnectCommand(), dVar);
    }
}
