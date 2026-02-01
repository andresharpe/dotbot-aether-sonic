package com.harman.sdk.utils;

import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/harman/sdk/utils/LightPattern;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "g", "()I", "patternName", "Ljava/lang/String;", "i", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "OFF", "ROCK", "NEON", "CLUB", "FLOW", "RIPPLE", "CROSS", "FLASH", "CUSTOM", "LOOP", "BOUNCE", "TRIM", "SWITCH", "FREEZE", "UNKNOWN", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LightPattern {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ LightPattern[] $VALUES;

    @l3.d
    public static final a Companion;
    private final int id;

    @l3.d
    private final String patternName;
    public static final LightPattern OFF = new LightPattern("OFF", 0, 0, "OFF");
    public static final LightPattern ROCK = new LightPattern("ROCK", 1, 1, "ROCK");
    public static final LightPattern NEON = new LightPattern("NEON", 2, 2, "NEON");
    public static final LightPattern CLUB = new LightPattern("CLUB", 3, 3, "CLUB");
    public static final LightPattern FLOW = new LightPattern("FLOW", 4, 4, "FLOW");
    public static final LightPattern RIPPLE = new LightPattern("RIPPLE", 5, 5, "RIPPLE");
    public static final LightPattern CROSS = new LightPattern("CROSS", 6, 6, "CROSS");
    public static final LightPattern FLASH = new LightPattern("FLASH", 7, 7, "FLASH");
    public static final LightPattern CUSTOM = new LightPattern("CUSTOM", 8, 8, "CUSTOM");
    public static final LightPattern LOOP = new LightPattern("LOOP", 9, 9, "LOOP");
    public static final LightPattern BOUNCE = new LightPattern("BOUNCE", 10, 10, "BOUNCE");
    public static final LightPattern TRIM = new LightPattern("TRIM", 11, 11, "TRIM");
    public static final LightPattern SWITCH = new LightPattern("SWITCH", 12, 12, "SWITCH");
    public static final LightPattern FREEZE = new LightPattern("FREEZE", 13, 13, "FREEZE");
    public static final LightPattern UNKNOWN = new LightPattern("UNKNOWN", 14, 255, "UNKNOWN");

    @U({"SMAP\nLightPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightPattern.kt\ncom/harman/sdk/utils/LightPattern$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final LightPattern a(int i4) {
            LightPattern lightPattern;
            LightPattern[] values = LightPattern.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    lightPattern = values[i5];
                    if (lightPattern.g() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    lightPattern = null;
                    break;
                }
            }
            if (lightPattern == null) {
                return LightPattern.OFF;
            }
            return lightPattern;
        }

        private a() {
        }
    }

    static {
        LightPattern[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private LightPattern(String str, int i4, int i5, String str2) {
        this.id = i5;
        this.patternName = str2;
    }

    private static final /* synthetic */ LightPattern[] b() {
        return new LightPattern[]{OFF, ROCK, NEON, CLUB, FLOW, RIPPLE, CROSS, FLASH, CUSTOM, LOOP, BOUNCE, TRIM, SWITCH, FREEZE, UNKNOWN};
    }

    @W2.n
    @l3.d
    public static final LightPattern e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<LightPattern> f() {
        return $ENTRIES;
    }

    public static LightPattern valueOf(String str) {
        return (LightPattern) Enum.valueOf(LightPattern.class, str);
    }

    public static LightPattern[] values() {
        return (LightPattern[]) $VALUES.clone();
    }

    public final int g() {
        return this.id;
    }

    @l3.d
    public final String i() {
        return this.patternName;
    }

    @Override // java.lang.Enum
    @l3.d
    public String toString() {
        return "LightPattern{Id=" + this.id + ", Name='" + this.patternName + "'}";
    }
}
