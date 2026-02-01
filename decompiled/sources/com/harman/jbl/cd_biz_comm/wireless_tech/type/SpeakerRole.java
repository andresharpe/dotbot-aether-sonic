package com.harman.jbl.cd_biz_comm.wireless_tech.type;

import com.spotify.sdk.android.auth.b;
import kotlin.E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/wireless_tech/type/SpeakerRole;", "", "", b.c.f48986a, "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "NORMAL", "MASTER", "SLAVE", "STANDBY", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SpeakerRole {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SpeakerRole[] $VALUES;
    private final int id;
    public static final SpeakerRole NORMAL = new SpeakerRole("NORMAL", 0, 0);
    public static final SpeakerRole MASTER = new SpeakerRole("MASTER", 1, 1);
    public static final SpeakerRole SLAVE = new SpeakerRole("SLAVE", 2, 2);
    public static final SpeakerRole STANDBY = new SpeakerRole("STANDBY", 3, 3);

    static {
        SpeakerRole[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private SpeakerRole(String str, int i4, int i5) {
        this.id = i5;
    }

    private static final /* synthetic */ SpeakerRole[] b() {
        return new SpeakerRole[]{NORMAL, MASTER, SLAVE, STANDBY};
    }

    @l3.d
    public static kotlin.enums.a<SpeakerRole> e() {
        return $ENTRIES;
    }

    public static SpeakerRole valueOf(String str) {
        return (SpeakerRole) Enum.valueOf(SpeakerRole.class, str);
    }

    public static SpeakerRole[] values() {
        return (SpeakerRole[]) $VALUES.clone();
    }

    public final int f() {
        return this.id;
    }
}
