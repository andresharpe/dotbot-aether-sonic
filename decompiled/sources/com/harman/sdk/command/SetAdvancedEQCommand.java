package com.harman.sdk.command;

import com.harman.log.b;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AdvancedCustomEQPayload;
import com.harman.sdk.message.AdvancedEQSettings;
import com.harman.sdk.message.AdvancedPresetEQPayload;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.EQCategory;
import com.harman.sdk.utils.g;
import com.harman.sdk.utils.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kotlin.E;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/harman/sdk/command/SetAdvancedEQCommand;", "Lcom/harman/sdk/command/BaseCommand;", "", "gain", "", "y", "(F)[B", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", b.f47574c, "()[B", "", "L", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "TAG", "", "d", "()Z", "isChangeCommand", "", "activeId", "Lcom/harman/sdk/message/AdvancedEQSettings;", "settings", "<init>", "(BLcom/harman/sdk/message/AdvancedEQSettings;)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSetAdvancedEQCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetAdvancedEQCommand.kt\ncom/harman/sdk/command/SetAdvancedEQCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,147:1\n1864#2,3:148\n13316#3,2:151\n13316#3,2:153\n13316#3,2:155\n13316#3,2:157\n13316#3,2:159\n13316#3,2:161\n13316#3,2:163\n*S KotlinDebug\n*F\n+ 1 SetAdvancedEQCommand.kt\ncom/harman/sdk/command/SetAdvancedEQCommand\n*L\n47#1:148,3\n71#1:151,2\n74#1:153,2\n77#1:155,2\n82#1:157,2\n105#1:159,2\n107#1:161,2\n128#1:163,2\n*E\n"})
/* loaded from: classes2.dex */
public class SetAdvancedEQCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    private final String f47687L;

    public SetAdvancedEQCommand(byte b4, @d AdvancedEQSettings settings) {
        byte[] bArr;
        int i4;
        Integer num;
        ArrayList<AdvancedPresetEQPayload.Parameter> b5;
        AdvancedPresetEQPayload.Parameter parameter;
        F.p(settings, "settings");
        this.f47687L = "SetAdvancedEQCommand";
        p(k.f48621T1);
        AdvancedPresetEQPayload c4 = settings.c();
        AdvancedCustomEQPayload b6 = settings.b();
        int i5 = 0;
        if (c4 != null) {
            ArrayList<AdvancedPresetEQPayload.Parameter> b7 = c4.b();
            if (b6 != null && c4.a() == EQCategory.CUSTOM_C2) {
                int i6 = 0;
                for (Object obj : b7) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.Z();
                    }
                    AdvancedPresetEQPayload.Parameter parameter2 = (AdvancedPresetEQPayload.Parameter) obj;
                    if (i6 < b6.b().size()) {
                        if (b6.b().get(i6).byteValue() >= 0) {
                            parameter2.g(b6.b().get(i6).floatValue() * 0.5f);
                        } else if (i6 == 0) {
                            parameter2.g(b6.b().get(i6).floatValue() * 0.75f);
                        } else {
                            parameter2.g(b6.b().get(i6).floatValue() * 0.5f);
                        }
                    }
                    i6 = i7;
                }
                f.a(this.f47687L, "set custom-c2: " + b7);
            }
            int size = b7.size() * 13;
            byte[] bArr2 = new byte[size];
            int size2 = b7.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                AdvancedPresetEQPayload.Parameter parameter3 = b7.get(i9);
                F.o(parameter3, "get(...)");
                AdvancedPresetEQPayload.Parameter parameter4 = parameter3;
                byte[] bArr3 = new byte[13];
                bArr3[0] = parameter4.e().f();
                byte[] y3 = y(parameter4.b());
                int length = y3.length;
                int i10 = 0;
                int i11 = 1;
                while (i10 < length) {
                    bArr3[i11] = y3[i10];
                    i10++;
                    i11++;
                }
                byte[] y4 = y(parameter4.a());
                int length2 = y4.length;
                int i12 = 0;
                while (i12 < length2) {
                    bArr3[i11] = y4[i12];
                    i12++;
                    i11++;
                }
                byte[] y5 = y(parameter4.c());
                int length3 = y5.length;
                int i13 = 0;
                while (i13 < length3) {
                    bArr3[i11] = y5[i13];
                    i13++;
                    i11++;
                }
                int i14 = 0;
                while (i14 < 13) {
                    bArr2[i8] = bArr3[i14];
                    i14++;
                    i8++;
                }
            }
            ByteBuffer allocate = ByteBuffer.allocate(4);
            AdvancedPresetEQPayload c5 = settings.c();
            if (c5 != null && (b5 = c5.b()) != null && (parameter = b5.get(0)) != null) {
                num = Integer.valueOf(parameter.d());
            } else {
                num = null;
            }
            F.m(num);
            allocate.putInt(num.intValue());
            byte[] array = allocate.array();
            bArr = new byte[array.length + size + 1];
            bArr[0] = (byte) b7.size();
            F.m(array);
            int length4 = array.length;
            int i15 = 0;
            int i16 = 1;
            while (i15 < length4) {
                bArr[i16] = array[i15];
                i15++;
                i16++;
            }
            int i17 = 0;
            while (i17 < size) {
                bArr[i16] = bArr2[i17];
                i17++;
                i16++;
            }
        } else if (b6 != null) {
            bArr = new byte[(b6.b().size() * 2) + 2];
            bArr[0] = b6.c();
            bArr[1] = (byte) b6.b().size();
            int size3 = b6.b().size();
            int i18 = 2;
            int i19 = 0;
            while (i19 < size3) {
                int i20 = i18 + 1;
                int i21 = i19 + 1;
                bArr[i18] = (byte) i21;
                i18 += 2;
                Byte b8 = b6.b().get(i19);
                F.o(b8, "get(...)");
                bArr[i20] = b8.byteValue();
                i19 = i21;
            }
        } else {
            bArr = null;
        }
        f.a(this.f47687L, "bytes: " + g.g(bArr));
        if (bArr != null) {
            i4 = bArr.length;
        } else {
            i4 = 0;
        }
        byte[] bArr4 = new byte[i4 + 1];
        bArr4[0] = b4;
        if (bArr != null) {
            int length5 = bArr.length;
            int i22 = 1;
            while (i5 < length5) {
                bArr4[i22] = bArr[i5];
                i5++;
                i22++;
            }
        }
        j(bArr4);
        f.a(this.f47687L, "payload: " + g.g(n()));
    }

    private final byte[] y(float f4) {
        byte[] array = ByteBuffer.allocate(4).putFloat(f4).array();
        F.o(array, "array(...)");
        return array;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @e
    public byte[] b() {
        byte[] bArr = {g(), k(), (byte) ((l() >> 8) & 255), (byte) l()};
        byte[] n4 = n();
        if (n4 != null) {
            byte[] bArr2 = new byte[n4.length + 4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            System.arraycopy(n4, 0, bArr2, 4, n4.length);
            return bArr2;
        }
        return bArr;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    public boolean d() {
        return true;
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        return new ReqAdvancedEQCommand().q(device, receivedCommand);
    }

    @d
    public final String z() {
        return this.f47687L;
    }
}
