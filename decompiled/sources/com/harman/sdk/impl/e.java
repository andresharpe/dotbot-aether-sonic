package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.AuracastCommand;
import com.harman.sdk.command.IdentificationCommand;
import com.harman.sdk.command.LockPanelSwitchCommand;
import com.harman.sdk.command.PortableAuraCastCommand;
import com.harman.sdk.command.ProAuraCastCommand;
import com.harman.sdk.command.ReqBatteryCommand;
import com.harman.sdk.command.ReqChannelCommand;
import com.harman.sdk.command.ReqDevFeatureInfoCommand;
import com.harman.sdk.command.ReqDevInfoCommand;
import com.harman.sdk.command.ReqFeedbackToneCommand;
import com.harman.sdk.command.ReqLEAudioStatusCommand;
import com.harman.sdk.command.SQOnOffCommand;
import com.harman.sdk.command.SetChannelCommand;
import com.harman.sdk.command.SetDeviceNameCommand;
import com.harman.sdk.command.SetFeedbackToneCommand;
import com.harman.sdk.command.SetLEAudioStatusCommand;
import com.harman.sdk.command.SetStereoGroupNameCmd;
import com.harman.sdk.command.SetToneShifterLevelCommand;
import com.harman.sdk.command.StereoFlowCommand;
import com.harman.sdk.command.SyncOnOffCommand;
import com.harman.sdk.command.V5AuraCastCommand;
import com.harman.sdk.command.VolumeBoostSwitchCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.impl.connect.AbstractC2035b;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.AuracastStatus;
import com.harman.sdk.utils.EnumSyncOnOff;
import com.harman.sdk.utils.PartyConnectStatus;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nDeviceStatusControlImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStatusControlImpl.kt\ncom/harman/sdk/impl/DeviceStatusControlImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1#2:243\n*E\n"})
/* loaded from: classes2.dex */
public final class e implements z2.e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Context f48001a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48002b;

    public e(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i impl) {
        F.p(context, "context");
        F.p(impl, "impl");
        Context applicationContext = context.getApplicationContext();
        F.o(applicationContext, "getApplicationContext(...)");
        this.f48001a = applicationContext;
        this.f48002b = impl;
    }

    private final void I0(HmDevice hmDevice, com.harman.sdk.a aVar, z2.d dVar) {
        this.f48002b.G(hmDevice, aVar, dVar);
    }

    @Override // z2.e
    public void A0(@l3.d HmDevice device, boolean z3, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new LockPanelSwitchCommand(device, z3), dVar);
    }

    @Override // z2.e
    public void C0(@l3.d HmDevice device, byte b4, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void D(@l3.d HmDevice device, @l3.d AudioChannel audioChn, @l3.d PartyConnectStatus connectStatus, @l3.d String groupID, @l3.e String str, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(audioChn, "audioChn");
        F.p(connectStatus, "connectStatus");
        F.p(groupID, "groupID");
        StereoFlowCommand stereoFlowCommand = new StereoFlowCommand(device, audioChn, connectStatus, groupID, str);
        com.harman.log.f.d("Stereo.DeviceStatusControlImpl", "setStereoFlow() >>> send CMD to MAC[" + device.n() + "] BLE[" + device.g() + "] payload[" + com.harman.sdk.utils.g.g(stereoFlowCommand.n()) + "]");
        this.f48002b.G(device, stereoFlowCommand, dVar);
    }

    @Override // z2.e
    public void F0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void G(@l3.d HmDevice device, @l3.d String deviceName, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(deviceName, "deviceName");
        this.f48002b.G(device, new SetDeviceNameCommand(device, deviceName), dVar);
    }

    @Override // z2.e
    public void H0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new ReqChannelCommand(device.m()), dVar);
    }

    @Override // z2.e
    public void I(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void M(@l3.d HmDevice device, @l3.d EnumSyncOnOff value, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(value, "value");
        SyncOnOffCommand syncOnOffCommand = new SyncOnOffCommand(device, value);
        com.harman.log.f.d("Stereo.DeviceStatusControlImpl", "setSyncOnOff() >>> set " + value.e() + " to MAC[" + device.n() + "] BLE[" + device.g() + "] payload[" + com.harman.sdk.utils.g.g(syncOnOffCommand.n()) + "]");
        this.f48002b.G(device, syncOnOffCommand, dVar);
    }

    @Override // z2.e
    public void R(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new ReqFeedbackToneCommand(), dVar);
    }

    @Override // z2.e
    public void Z(@l3.d HmDevice device, byte b4, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void a0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new ReqDevFeatureInfoCommand(), dVar);
    }

    @Override // z2.e
    public void c0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new ReqLEAudioStatusCommand(), dVar);
    }

    @Override // z2.e
    public void e0(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new SetToneShifterLevelCommand(i4), dVar);
    }

    @Override // z2.e
    public void f(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void g(@l3.d HmDevice device, boolean z3, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void g0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new ReqBatteryCommand(device.m()), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48002b.H(listener);
    }

    @Override // z2.e
    public void h0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new ReqDevInfoCommand(), dVar);
    }

    @Override // z2.e
    public void i(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new IdentificationCommand(device.m()), dVar);
    }

    @Override // z2.e
    public void j(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void k(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new SetLEAudioStatusCommand(i4), dVar);
    }

    @Override // z2.e
    public void l(@l3.d HmDevice device, boolean z3, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new VolumeBoostSwitchCommand(device, z3), dVar);
    }

    @Override // z2.e
    public void l0(@l3.d HmDevice device, byte b4, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new SetFeedbackToneCommand(b4), dVar);
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48002b.y(listener);
    }

    @Override // z2.e
    public void o0(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void p(@l3.d HmDevice device, @l3.d AudioChannel channel, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(channel, "channel");
        SetChannelCommand setChannelCommand = new SetChannelCommand(device.m(), channel);
        AbstractC2035b v3 = this.f48002b.v(device.F());
        if (v3 != null) {
            v3.j(device, setChannelCommand);
        }
    }

    @Override // z2.e
    public void q(@l3.d HmDevice device, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        I0(device, command, dVar);
    }

    @Override // z2.e
    public void r0(@l3.d HmDevice device, boolean z3, @l3.e z2.d dVar) {
        F.p(device, "device");
        this.f48002b.G(device, new SQOnOffCommand(device, z3), dVar);
    }

    @Override // z2.e
    public void t0(@l3.d HmDevice device, @l3.e String str, @l3.e z2.d dVar) {
        F.p(device, "device");
        SetStereoGroupNameCmd setStereoGroupNameCmd = new SetStereoGroupNameCmd(device, str);
        com.harman.log.f.d("Stereo.DeviceStatusControlImpl", "setStereoGroupName() >>> send CMD to MAC[" + device.n() + "] BLE[" + device.g() + "] payload[" + com.harman.sdk.utils.g.g(setStereoGroupNameCmd.n()) + "]");
        this.f48002b.G(device, setStereoGroupNameCmd, dVar);
    }

    @Override // z2.e
    public void u0(@l3.d HmDevice device, @l3.d AuracastStatus status, @l3.e z2.d dVar) {
        byte b4;
        F.p(device, "device");
        F.p(status, "status");
        if (com.harman.sdk.utils.d.k0(device)) {
            this.f48002b.G(device, new V5AuraCastCommand(status), dVar);
            return;
        }
        if (com.harman.sdk.utils.d.X(device)) {
            com.harman.sdk.impl.connect.i iVar = this.f48002b;
            if (status == AuracastStatus.AURACAST_MODE) {
                b4 = 2;
            } else {
                b4 = 0;
            }
            iVar.G(device, new PortableAuraCastCommand(b4), dVar);
            return;
        }
        if (com.harman.sdk.utils.d.a0(device)) {
            this.f48002b.G(device, new ProAuraCastCommand(status), dVar);
        } else {
            this.f48002b.G(device, new AuracastCommand(device, status), dVar);
        }
    }

    @Override // z2.e
    public void v0(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void x(@l3.d HmDevice device, int i4, @l3.e z2.d dVar) {
        F.p(device, "device");
    }

    @Override // z2.e
    public void z(@l3.d HmDevice device, boolean z3, @l3.e z2.d dVar) {
        F.p(device, "device");
    }
}
