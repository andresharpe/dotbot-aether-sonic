package com.harman.sdk.utils;

import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/sdk/utils/OTAChannel;", "", "", "value", "I", "g", "()I", "", "otaChannelName", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "CHANNEL_UNKNOWN", "CHANNEL_APP", "CHANNEL_GOOGLE_AI", "CHANNEL_AMAZON_AI", "STATUS_XIAOWEI_AI", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class OTAChannel {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ OTAChannel[] $VALUES;

    @l3.d
    private final String otaChannelName;
    private final int value;
    public static final OTAChannel CHANNEL_UNKNOWN = new OTAChannel("CHANNEL_UNKNOWN", 0, -1, "OTA Channel Unknown");
    public static final OTAChannel CHANNEL_APP = new OTAChannel("CHANNEL_APP", 1, 0, "OTA Channel App");
    public static final OTAChannel CHANNEL_GOOGLE_AI = new OTAChannel("CHANNEL_GOOGLE_AI", 2, 1, "OTA Channel Google Assistant");
    public static final OTAChannel CHANNEL_AMAZON_AI = new OTAChannel("CHANNEL_AMAZON_AI", 3, 2, "OTA Channel Amazon Alexa");
    public static final OTAChannel STATUS_XIAOWEI_AI = new OTAChannel("STATUS_XIAOWEI_AI", 4, 3, "OTA Channel Xiaowei");

    static {
        OTAChannel[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private OTAChannel(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.otaChannelName = str2;
    }

    private static final /* synthetic */ OTAChannel[] b() {
        return new OTAChannel[]{CHANNEL_UNKNOWN, CHANNEL_APP, CHANNEL_GOOGLE_AI, CHANNEL_AMAZON_AI, STATUS_XIAOWEI_AI};
    }

    @l3.d
    public static kotlin.enums.a<OTAChannel> e() {
        return $ENTRIES;
    }

    public static OTAChannel valueOf(String str) {
        return (OTAChannel) Enum.valueOf(OTAChannel.class, str);
    }

    public static OTAChannel[] values() {
        return (OTAChannel[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.otaChannelName;
    }

    public final int g() {
        return this.value;
    }
}
