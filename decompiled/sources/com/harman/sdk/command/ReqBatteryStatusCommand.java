package com.harman.sdk.command;

import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;

@E(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/harman/sdk/command/ReqBatteryStatusCommand;", "Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/device/HmDevice;", "device", "Lcom/harman/sdk/a;", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "", "L", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "TAG", "", "Lcom/harman/sdk/message/BatteryInfo$FeatureType;", "featureList", "<init>", "(Ljava/util/List;)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nReqBatteryStatusCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReqBatteryStatusCommand.kt\ncom/harman/sdk/command/ReqBatteryStatusCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1855#2,2:67\n*S KotlinDebug\n*F\n+ 1 ReqBatteryStatusCommand.kt\ncom/harman/sdk/command/ReqBatteryStatusCommand\n*L\n29#1:67,2\n*E\n"})
/* loaded from: classes2.dex */
public class ReqBatteryStatusCommand extends BaseCommand {

    /* renamed from: L, reason: collision with root package name */
    @d
    private final String f47666L;

    public ReqBatteryStatusCommand(@d List<? extends BatteryInfo.FeatureType> featureList) {
        F.p(featureList, "featureList");
        this.f47666L = "ReqBatteryStatusCommand";
        p((byte) -99);
        byte[] bArr = new byte[featureList.size()];
        Iterator<T> it = featureList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            bArr[i4] = (byte) ((BatteryInfo.FeatureType) it.next()).f();
            i4++;
        }
        j(bArr);
        f.a(this.f47666L, "payload: " + g.g(n()));
        v().add((byte) -98);
    }

    @Override // com.harman.sdk.command.BaseCommand, com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        byte[] n4 = receivedCommand.n();
        f.a(this.f47666L, "receivedPayload: " + n4);
        BaseMessage baseMessage = new BaseMessage();
        if (n4 != 0 && n4.length > 2 && -98 == receivedCommand.k()) {
            v().clear();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i4 = 0;
            while (i4 < n4.length) {
                int i5 = i4 + 1;
                int i6 = n4[i4];
                int i7 = i4 + 2;
                int i8 = n4[i5];
                byte[] bArr = new byte[i8];
                System.arraycopy(n4, i7, bArr, 0, i8);
                linkedHashMap.put(Integer.valueOf(i6), Integer.valueOf(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt()));
                i4 = i7 + i8;
            }
            if (!linkedHashMap.isEmpty()) {
                BatteryInfo f4 = device.f();
                if (f4 != null) {
                    f4.f(linkedHashMap);
                }
                baseMessage.d(MessageID.BATTERY_STATUS);
            }
        } else {
            baseMessage.d(MessageID.UNKNOWN);
        }
        return baseMessage;
    }

    @d
    public final String y() {
        return this.f47666L;
    }
}
