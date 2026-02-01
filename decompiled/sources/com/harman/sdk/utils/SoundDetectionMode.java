package com.harman.sdk.utils;

import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/sdk/utils/SoundDetectionMode;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "g", "()I", "modeName", "Ljava/lang/String;", "i", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "SOUND_DETECTION_OFF", "SOUND_DETECTION_ON", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SoundDetectionMode {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SoundDetectionMode[] $VALUES;

    @l3.d
    public static final a Companion;
    public static final SoundDetectionMode SOUND_DETECTION_OFF = new SoundDetectionMode("SOUND_DETECTION_OFF", 0, 0, "Sound Detection Off");
    public static final SoundDetectionMode SOUND_DETECTION_ON = new SoundDetectionMode("SOUND_DETECTION_ON", 1, 1, "Sound Detection On");
    private final int id;

    @l3.d
    private final String modeName;

    @U({"SMAP\nSoundDetectionMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundDetectionMode.kt\ncom/harman/sdk/utils/SoundDetectionMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final SoundDetectionMode a(int i4) {
            SoundDetectionMode soundDetectionMode;
            SoundDetectionMode[] values = SoundDetectionMode.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    soundDetectionMode = values[i5];
                    if (soundDetectionMode.g() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    soundDetectionMode = null;
                    break;
                }
            }
            if (soundDetectionMode == null) {
                return SoundDetectionMode.SOUND_DETECTION_OFF;
            }
            return soundDetectionMode;
        }

        private a() {
        }
    }

    static {
        SoundDetectionMode[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private SoundDetectionMode(String str, int i4, int i5, String str2) {
        this.id = i5;
        this.modeName = str2;
    }

    private static final /* synthetic */ SoundDetectionMode[] b() {
        return new SoundDetectionMode[]{SOUND_DETECTION_OFF, SOUND_DETECTION_ON};
    }

    @W2.n
    @l3.d
    public static final SoundDetectionMode e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<SoundDetectionMode> f() {
        return $ENTRIES;
    }

    public static SoundDetectionMode valueOf(String str) {
        return (SoundDetectionMode) Enum.valueOf(SoundDetectionMode.class, str);
    }

    public static SoundDetectionMode[] values() {
        return (SoundDetectionMode[]) $VALUES.clone();
    }

    public final int g() {
        return this.id;
    }

    @l3.d
    public final String i() {
        return this.modeName;
    }

    @Override // java.lang.Enum
    @l3.d
    public String toString() {
        return "SoundDetectionMode{Id=" + this.id + ", Name='" + this.modeName + "'}";
    }
}
