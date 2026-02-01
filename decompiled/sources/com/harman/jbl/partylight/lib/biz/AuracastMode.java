package com.harman.jbl.partylight.lib.biz;

import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/harman/jbl/partylight/lib/biz/AuracastMode;", "", "", b.c.f48986a, "B", "f", "()B", "<init>", "(Ljava/lang/String;IB)V", "OFF", "ON", "ON_NOT_LINKED", "ON_LINKED", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuracastMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuracastMode[] $VALUES;
    private final byte id;
    public static final AuracastMode OFF = new AuracastMode("OFF", 0, (byte) 0);
    public static final AuracastMode ON = new AuracastMode("ON", 1, (byte) 1);
    public static final AuracastMode ON_NOT_LINKED = new AuracastMode("ON_NOT_LINKED", 2, (byte) 2);
    public static final AuracastMode ON_LINKED = new AuracastMode("ON_LINKED", 3, (byte) 3);

    static {
        AuracastMode[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private AuracastMode(String str, int i4, byte b4) {
        this.id = b4;
    }

    private static final /* synthetic */ AuracastMode[] b() {
        return new AuracastMode[]{OFF, ON, ON_NOT_LINKED, ON_LINKED};
    }

    @d
    public static a<AuracastMode> e() {
        return $ENTRIES;
    }

    public static AuracastMode valueOf(String str) {
        return (AuracastMode) Enum.valueOf(AuracastMode.class, str);
    }

    public static AuracastMode[] values() {
        return (AuracastMode[]) $VALUES.clone();
    }

    public final byte f() {
        return this.id;
    }
}
