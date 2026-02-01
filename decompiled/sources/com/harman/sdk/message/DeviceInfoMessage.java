package com.harman.sdk.message;

import com.harman.log.b;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.MessageID;
import java.util.LinkedList;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/harman/sdk/message/DeviceInfoMessage;", "Lcom/harman/sdk/message/BaseMessage;", "Ljava/util/LinkedList;", "Lcom/harman/sdk/device/HmDevice;", "H", "Ljava/util/LinkedList;", "deviceList", "Lcom/harman/sdk/utils/MessageID;", "msgID", b.f47574c, "()Lcom/harman/sdk/utils/MessageID;", "f", "(Lcom/harman/sdk/utils/MessageID;)V", "", "msgContent", "a", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "<init>", "(Ljava/util/LinkedList;)V", "1_sdk_api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DeviceInfoMessage extends BaseMessage {

    /* renamed from: H, reason: collision with root package name */
    @d
    private final LinkedList<? extends HmDevice> f48177H;

    public DeviceInfoMessage(@d LinkedList<? extends HmDevice> deviceList) {
        F.p(deviceList, "deviceList");
        this.f48177H = deviceList;
    }

    @Override // com.harman.sdk.message.BaseMessage
    @e
    public Object a() {
        return this.f48177H;
    }

    @Override // com.harman.sdk.message.BaseMessage
    @e
    public MessageID b() {
        return MessageID.DEVICE_INFO;
    }

    @Override // com.harman.sdk.message.BaseMessage
    public void e(@e Object obj) {
        super.e(obj);
    }

    @Override // com.harman.sdk.message.BaseMessage
    public void f(@e MessageID messageID) {
        super.f(messageID);
    }
}
