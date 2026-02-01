package com.harman.sdk.impl;

import android.content.Context;
import com.harman.sdk.command.BaseCommand;
import com.harman.sdk.command.LightInfoReqCommand;
import com.harman.sdk.command.SetLightCmdCommand;
import com.harman.sdk.command.StickStageNumberCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.CustomLightPattern;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.SoloPattern;
import com.harman.sdk.utils.SoloPatternMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.collections.C2109w;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nLightShowControlImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowControlImpl.kt\ncom/harman/sdk/impl/LightShowControlImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1#2:272\n1549#3:273\n1620#3,3:274\n*S KotlinDebug\n*F\n+ 1 LightShowControlImpl.kt\ncom/harman/sdk/impl/LightShowControlImpl\n*L\n255#1:273\n255#1:274,3\n*E\n"})
/* loaded from: classes2.dex */
public final class i implements z2.i {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final com.harman.sdk.impl.connect.i f48006a;

    public i(@l3.d Context context, @l3.d com.harman.sdk.impl.connect.i deviceConnect) {
        F.p(context, "context");
        F.p(deviceConnect, "deviceConnect");
        this.f48006a = deviceConnect;
    }

    @Override // z2.i
    public void A(@l3.e HmDevice hmDevice, @l3.d LightElements element, boolean z3, @l3.e z2.d dVar) {
        F.p(element, "element");
        if (hmDevice != null) {
            byte[] bArr = new byte[4];
            bArr[0] = (byte) hmDevice.m();
            bArr[1] = (byte) element.i();
            bArr[2] = 1;
            if (z3) {
                bArr[3] = 1;
            } else {
                bArr[3] = 0;
            }
            q0(hmDevice, new SetLightCmdCommand(hmDevice, bArr), dVar);
        }
    }

    @Override // z2.i
    public void D0(@l3.e HmDevice hmDevice, int i4, @l3.e z2.d dVar) {
        if (hmDevice != null) {
            q0(hmDevice, new StickStageNumberCommand(hmDevice, i4), dVar);
        }
    }

    @Override // z2.i
    public void J(@l3.e HmDevice hmDevice, @l3.d LightPattern pattern, boolean z3, @l3.e z2.d dVar) {
        String str;
        F.p(pattern, "pattern");
        if (hmDevice != null) {
            byte[] bArr = new byte[7];
            bArr[0] = (byte) hmDevice.m();
            bArr[1] = 49;
            bArr[2] = 1;
            bArr[3] = (byte) pattern.g();
            bArr[4] = 55;
            bArr[5] = 1;
            if (z3) {
                str = "01";
            } else {
                str = "00";
            }
            bArr[6] = Byte.parseByte(str);
            q0(hmDevice, new SetLightCmdCommand(hmDevice, bArr), dVar);
        }
    }

    @Override // z2.i
    public void L(@l3.e HmDevice hmDevice, @l3.d Color color, @l3.e z2.d dVar) {
        F.p(color, "color");
        if (hmDevice != null) {
            q0(hmDevice, new SetLightCmdCommand(hmDevice, new byte[]{(byte) hmDevice.m(), 54, 1, 1, 50, 3, (byte) color.h(), (byte) color.g(), (byte) color.f()}), dVar);
        }
    }

    @Override // z2.i
    public void O(@l3.e HmDevice hmDevice, @l3.d CustomLightPattern pattern, @l3.e z2.d dVar) {
        F.p(pattern, "pattern");
        if (hmDevice != null) {
            q0(hmDevice, new SetLightCmdCommand(hmDevice, new byte[]{(byte) pattern.g().i(), (byte) pattern.h(), (byte) pattern.f().h(), (byte) pattern.f().g(), (byte) pattern.f().f()}), dVar);
        }
    }

    @Override // z2.i
    public void P(@l3.e HmDevice hmDevice, @l3.d LightPattern pattern, @l3.e z2.d dVar) {
        F.p(pattern, "pattern");
        if (hmDevice != null) {
            q0(hmDevice, new SetLightCmdCommand(hmDevice, new byte[]{(byte) hmDevice.m(), 49, 1, (byte) pattern.g()}), dVar);
        }
    }

    @Override // z2.i
    public void S(@l3.e HmDevice hmDevice, @l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e z2.d dVar) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // z2.i
    public void W(@l3.e HmDevice hmDevice, @l3.d SoloPattern pattern, @l3.d SoloPatternMode patternMode, @l3.e z2.d dVar) {
        F.p(pattern, "pattern");
        F.p(patternMode, "patternMode");
        if (hmDevice != null) {
            q0(hmDevice, new SetLightCmdCommand(hmDevice, new byte[]{(byte) hmDevice.m(), 53, 1, (byte) pattern.g(), com.harman.sdk.utils.k.f48684l, 1, (byte) patternMode.g()}), dVar);
        }
    }

    @Override // z2.i
    public void a(@l3.e HmDevice hmDevice, @l3.e z2.d dVar) {
        if (hmDevice != null) {
            q0(hmDevice, new LightInfoReqCommand(), dVar);
        }
    }

    @Override // z2.i
    public void b(@l3.e HmDevice hmDevice, int i4, @l3.e z2.d dVar) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // z2.i
    public void c(@l3.e HmDevice hmDevice, @l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e z2.d dVar) {
        if (hmDevice != null) {
            hmDevice.m();
        }
    }

    @Override // z2.i
    public void d(@l3.e HmDevice hmDevice, @l3.e z2.d dVar) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // z2.i
    public void e(@l3.e HmDevice hmDevice, byte b4, @l3.e z2.d dVar) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // z2.InterfaceC2449a
    public void h(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48006a.H(listener);
    }

    @Override // z2.i
    public void j0(@l3.e HmDevice hmDevice, boolean z3, @l3.e z2.d dVar) {
        if (hmDevice != null) {
            byte[] bArr = new byte[4];
            bArr[0] = (byte) hmDevice.m();
            bArr[1] = 54;
            bArr[2] = 1;
            if (z3) {
                bArr[3] = 0;
            } else {
                bArr[3] = 1;
            }
            q0(hmDevice, new SetLightCmdCommand(hmDevice, bArr), dVar);
        }
    }

    @Override // z2.InterfaceC2449a
    public void m(@l3.d z2.d listener) {
        F.p(listener, "listener");
        this.f48006a.y(listener);
    }

    @Override // z2.i
    public void n(@l3.e HmDevice hmDevice, boolean z3, @l3.e z2.d dVar) {
        if (hmDevice != null) {
            q0(hmDevice, new SetLightCmdCommand(hmDevice, new byte[]{(byte) hmDevice.m(), -103, 1, z3 ? (byte) 1 : (byte) 0}), dVar);
        }
    }

    @Override // z2.i
    public void p0(@l3.e HmDevice hmDevice, @l3.d List<CustomLightPattern> lightPatternList, @l3.e z2.d dVar) {
        int b02;
        byte[] O5;
        F.p(lightPatternList, "lightPatternList");
        if (hmDevice != null) {
            BaseCommand baseCommand = new BaseCommand();
            ArrayList arrayList = new ArrayList();
            if (!lightPatternList.isEmpty()) {
                for (CustomLightPattern customLightPattern : lightPatternList) {
                    arrayList.add(Integer.valueOf(customLightPattern.g().i()));
                    arrayList.add(Integer.valueOf(customLightPattern.h()));
                    arrayList.add(Integer.valueOf(customLightPattern.f().h()));
                    arrayList.add(Integer.valueOf(customLightPattern.f().g()));
                    arrayList.add(Integer.valueOf(customLightPattern.f().f()));
                }
                b02 = C2109w.b0(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(b02);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Byte.valueOf((byte) ((Number) it.next()).intValue()));
                }
                O5 = D.O5(arrayList2);
                baseCommand.p((byte) 53);
                baseCommand.j(O5);
                q0(hmDevice, baseCommand, dVar);
            }
        }
    }

    @Override // z2.InterfaceC2449a
    public void q0(@l3.d HmDevice device, @l3.d com.harman.sdk.a command, @l3.e z2.d dVar) {
        F.p(device, "device");
        F.p(command, "command");
        this.f48006a.G(device, command, dVar);
    }

    @Override // z2.i
    public void k0(@l3.e HmDevice hmDevice, @l3.e z2.d dVar) {
    }
}
