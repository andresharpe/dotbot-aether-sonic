package com.harman.sdk.utils;

import kotlin.E;
import kotlin.jvm.internal.C2197u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/harman/sdk/utils/EnumSyncOnOff;", "", "", "value", "I", "g", "()I", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "OFF", "ON", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumSyncOnOff {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnumSyncOnOff[] $VALUES;

    @l3.d
    public static final a Companion;
    public static final EnumSyncOnOff OFF = new EnumSyncOnOff("OFF", 0, 0, "Sync on/off disabled");
    public static final EnumSyncOnOff ON = new EnumSyncOnOff("ON", 1, 1, "Sync on/off enabled");

    @l3.d
    private final String desc;
    private final int value;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.e
        public final EnumSyncOnOff a(int i4) {
            EnumSyncOnOff enumSyncOnOff = EnumSyncOnOff.OFF;
            if (i4 != enumSyncOnOff.g()) {
                EnumSyncOnOff enumSyncOnOff2 = EnumSyncOnOff.ON;
                if (i4 != enumSyncOnOff2.g()) {
                    return null;
                }
                return enumSyncOnOff2;
            }
            return enumSyncOnOff;
        }

        private a() {
        }
    }

    static {
        EnumSyncOnOff[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private EnumSyncOnOff(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.desc = str2;
    }

    private static final /* synthetic */ EnumSyncOnOff[] b() {
        return new EnumSyncOnOff[]{OFF, ON};
    }

    @l3.d
    public static kotlin.enums.a<EnumSyncOnOff> f() {
        return $ENTRIES;
    }

    public static EnumSyncOnOff valueOf(String str) {
        return (EnumSyncOnOff) Enum.valueOf(EnumSyncOnOff.class, str);
    }

    public static EnumSyncOnOff[] values() {
        return (EnumSyncOnOff[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.desc;
    }

    public final int g() {
        return this.value;
    }
}
