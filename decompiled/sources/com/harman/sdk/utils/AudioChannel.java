package com.harman.sdk.utils;

import kotlin.E;
import kotlin.jvm.internal.C2197u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/harman/sdk/utils/AudioChannel;", "", "", "toString", "()Ljava/lang/String;", "", "value", "I", "i", "()I", "channelName", "Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "UNKNOWN", "NONE_CHANNEL", "STEREO_LEFT", "STEREO_RIGHT", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AudioChannel {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ AudioChannel[] $VALUES;

    @l3.d
    public static final a Companion;

    @l3.d
    private final String channelName;
    private final int value;
    public static final AudioChannel UNKNOWN = new AudioChannel("UNKNOWN", 0, -1, "Unknown");
    public static final AudioChannel NONE_CHANNEL = new AudioChannel("NONE_CHANNEL", 1, 0, "NONE_CHANNEL");
    public static final AudioChannel STEREO_LEFT = new AudioChannel("STEREO_LEFT", 2, 1, "LEFT_CHANNEL");
    public static final AudioChannel STEREO_RIGHT = new AudioChannel("STEREO_RIGHT", 3, 2, "RIGHT_CHANNEL");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final AudioChannel a(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return AudioChannel.UNKNOWN;
                    }
                    return AudioChannel.STEREO_RIGHT;
                }
                return AudioChannel.STEREO_LEFT;
            }
            return AudioChannel.NONE_CHANNEL;
        }

        private a() {
        }
    }

    static {
        AudioChannel[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private AudioChannel(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.channelName = str2;
    }

    private static final /* synthetic */ AudioChannel[] b() {
        return new AudioChannel[]{UNKNOWN, NONE_CHANNEL, STEREO_LEFT, STEREO_RIGHT};
    }

    @W2.n
    @l3.d
    public static final AudioChannel e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<AudioChannel> g() {
        return $ENTRIES;
    }

    public static AudioChannel valueOf(String str) {
        return (AudioChannel) Enum.valueOf(AudioChannel.class, str);
    }

    public static AudioChannel[] values() {
        return (AudioChannel[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.channelName;
    }

    public final int i() {
        return this.value;
    }

    @Override // java.lang.Enum
    @l3.d
    public String toString() {
        return "AudioChannel{mValue=" + this.value + ", mName='" + this.channelName + "'}";
    }
}
