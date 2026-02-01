package com.harman.jbl.partylight.lib.productinfo.command;

import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a TOTAL_POWER_DURATION_MINUTES = new a("TOTAL_POWER_DURATION_MINUTES", 0, (byte) 11);
    private final byte id;

    static {
        a[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
    }

    private a(String str, int i4, byte b4) {
        this.id = b4;
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{TOTAL_POWER_DURATION_MINUTES};
    }

    @d
    public static kotlin.enums.a<a> e() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final byte f() {
        return this.id;
    }
}
