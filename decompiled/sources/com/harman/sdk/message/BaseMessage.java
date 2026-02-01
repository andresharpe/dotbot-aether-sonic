package com.harman.sdk.message;

import com.google.gson.annotations.SerializedName;
import com.harman.log.b;
import com.harman.sdk.utils.MessageID;
import java.io.Serializable;
import kotlin.E;
import l3.d;
import l3.e;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/harman/sdk/message/BaseMessage;", "Ljava/io/Serializable;", "Lcom/harman/sdk/utils/MessageID;", "messageId", "Lkotlin/H0;", "d", "(Lcom/harman/sdk/utils/MessageID;)V", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/utils/MessageID;", b.f47574c, "()Lcom/harman/sdk/utils/MessageID;", "f", "msgID", "", "F", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "msgContent", "", "G", "Z", "c", "()Z", "g", "(Z)V", "isPush", "<init>", "()V", "1_sdk_api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BaseMessage implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @SerializedName("messageId")
    @e
    private MessageID f48164E;

    /* renamed from: F, reason: collision with root package name */
    @SerializedName("msgContent")
    @e
    private Object f48165F;

    /* renamed from: G, reason: collision with root package name */
    @SerializedName("isPush")
    private boolean f48166G;

    @e
    public Object a() {
        return this.f48165F;
    }

    @e
    public MessageID b() {
        return this.f48164E;
    }

    public final boolean c() {
        return this.f48166G;
    }

    public final void d(@e MessageID messageID) {
        f(messageID);
    }

    public void e(@e Object obj) {
        this.f48165F = obj;
    }

    public void f(@e MessageID messageID) {
        this.f48164E = messageID;
    }

    public final void g(boolean z3) {
        this.f48166G = z3;
    }

    @d
    public String toString() {
        return "BaseMessage{messageId=" + b() + ", msgContent=" + a() + ", isPush=" + this.f48166G + "}";
    }
}
