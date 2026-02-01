package com.harman.jbl.cd_biz_comm.wireless_tech.type;

import com.spotify.sdk.android.auth.b;
import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerAuracastMode;", "", "", b.c.f48986a, "B", "f", "()B", "<init>", "(Ljava/lang/String;IB)V", "OFF", "ON", "NOT_SUPPORT", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SpeakerAuracastMode {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SpeakerAuracastMode[] $VALUES;
    private final byte id;
    public static final SpeakerAuracastMode OFF = new SpeakerAuracastMode("OFF", 0, (byte) 0);
    public static final SpeakerAuracastMode ON = new SpeakerAuracastMode("ON", 1, (byte) 1);
    public static final SpeakerAuracastMode NOT_SUPPORT = new SpeakerAuracastMode("NOT_SUPPORT", 2, (byte) -1);

    static {
        SpeakerAuracastMode[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private SpeakerAuracastMode(String str, int i4, byte b4) {
        this.id = b4;
    }

    private static final /* synthetic */ SpeakerAuracastMode[] b() {
        return new SpeakerAuracastMode[]{OFF, ON, NOT_SUPPORT};
    }

    @l3.d
    public static kotlin.enums.a<SpeakerAuracastMode> e() {
        return $ENTRIES;
    }

    public static SpeakerAuracastMode valueOf(String str) {
        return (SpeakerAuracastMode) Enum.valueOf(SpeakerAuracastMode.class, str);
    }

    public static SpeakerAuracastMode[] values() {
        return (SpeakerAuracastMode[]) $VALUES.clone();
    }

    public final byte f() {
        return this.id;
    }
}
