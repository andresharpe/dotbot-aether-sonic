package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.utils.MessageID;
import kotlin.E;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/harman/sdk/message/OTAInfoMessage;", "Lcom/harman/sdk/message/BaseMessage;", "Lcom/harman/sdk/message/OTAInfo;", "H", "Lcom/harman/sdk/message/OTAInfo;", "otaInfo", "Lcom/harman/sdk/utils/MessageID;", "msgID", b.f47574c, "()Lcom/harman/sdk/utils/MessageID;", "f", "(Lcom/harman/sdk/utils/MessageID;)V", "", "msgContent", "a", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "<init>", "(Lcom/harman/sdk/message/OTAInfo;)V", "1_sdk_api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OTAInfoMessage extends BaseMessage {

    /* renamed from: H, reason: collision with root package name */
    @SerializedName("otaInfo")
    @d
    private final OTAInfo f48275H;

    public OTAInfoMessage(@d OTAInfo otaInfo) {
        F.p(otaInfo, "otaInfo");
        this.f48275H = otaInfo;
    }

    @Override // com.harman.sdk.message.BaseMessage
    @e
    public Object a() {
        return this.f48275H;
    }

    @Override // com.harman.sdk.message.BaseMessage
    @e
    public MessageID b() {
        return MessageID.OTA_STATUS;
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
