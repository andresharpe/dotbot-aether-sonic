package com.harman.sdk.utils;

import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/harman/sdk/utils/SoloPattern;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "g", "()I", "patternName", "Ljava/lang/String;", "i", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "PATTERN_OFF", "PATTERN_1", "PATTERN_2", "PATTERN_3", "PATTERN_4", "PATTERN_5", "PATTERN_6", "PATTERN_7", "PATTERN_8", "PATTERN_9", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SoloPattern {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SoloPattern[] $VALUES;

    @l3.d
    public static final a Companion;
    private final int id;

    @l3.d
    private final String patternName;
    public static final SoloPattern PATTERN_OFF = new SoloPattern("PATTERN_OFF", 0, 0, "OFF");
    public static final SoloPattern PATTERN_1 = new SoloPattern("PATTERN_1", 1, 1, "PATTERN_1");
    public static final SoloPattern PATTERN_2 = new SoloPattern("PATTERN_2", 2, 2, "PATTERN_2");
    public static final SoloPattern PATTERN_3 = new SoloPattern("PATTERN_3", 3, 3, "PATTERN_3");
    public static final SoloPattern PATTERN_4 = new SoloPattern("PATTERN_4", 4, 4, "PATTERN_4");
    public static final SoloPattern PATTERN_5 = new SoloPattern("PATTERN_5", 5, 5, "PATTERN_5");
    public static final SoloPattern PATTERN_6 = new SoloPattern("PATTERN_6", 6, 6, "PATTERN_6");
    public static final SoloPattern PATTERN_7 = new SoloPattern("PATTERN_7", 7, 7, "PATTERN_7");
    public static final SoloPattern PATTERN_8 = new SoloPattern("PATTERN_8", 8, 8, "PATTERN_8");
    public static final SoloPattern PATTERN_9 = new SoloPattern("PATTERN_9", 9, 9, "PATTERN_9");

    @U({"SMAP\nSoloPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoloPattern.kt\ncom/harman/sdk/utils/SoloPattern$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final SoloPattern a(int i4) {
            SoloPattern soloPattern;
            SoloPattern[] values = SoloPattern.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    soloPattern = values[i5];
                    if (soloPattern.g() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    soloPattern = null;
                    break;
                }
            }
            if (soloPattern == null) {
                return SoloPattern.PATTERN_OFF;
            }
            return soloPattern;
        }

        private a() {
        }
    }

    static {
        SoloPattern[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private SoloPattern(String str, int i4, int i5, String str2) {
        this.id = i5;
        this.patternName = str2;
    }

    private static final /* synthetic */ SoloPattern[] b() {
        return new SoloPattern[]{PATTERN_OFF, PATTERN_1, PATTERN_2, PATTERN_3, PATTERN_4, PATTERN_5, PATTERN_6, PATTERN_7, PATTERN_8, PATTERN_9};
    }

    @W2.n
    @l3.d
    public static final SoloPattern e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<SoloPattern> f() {
        return $ENTRIES;
    }

    public static SoloPattern valueOf(String str) {
        return (SoloPattern) Enum.valueOf(SoloPattern.class, str);
    }

    public static SoloPattern[] values() {
        return (SoloPattern[]) $VALUES.clone();
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
        return "SoloPattern{Id=" + this.id + ", Name='" + this.patternName + "'}";
    }
}
