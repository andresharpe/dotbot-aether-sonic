package com.harman.sdk.message;

import com.harman.sdk.utils.k;
import j2.b;
import kotlin.E;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, d2 = {"Lcom/harman/sdk/message/EQCategory;", "", "", "type", "B", "g", "()B", "j", "(B)V", "", "displayName", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", "Companion", "a", "EQ_BALANCE", "EQ_BASS_BOOST_1", "EQ_BASS_BOOST_2", "VOCAL", "METAL", "CLASSICAL", "SIGNATURE", "RELAXING", "ENERGETIC", "EXTREME", "MOVIE", "CHILL", "RESERVED_1", "RESERVED_2", "RESERVED_3", "RESERVED_4", "RESERVED_5", "RESERVED_6", "RESERVED_7", "RESERVED_8", "RESERVED_9", "RESERVED_10", "RESERVED_11", "CUSTOM", "CUSTOM_C2", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EQCategory {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EQCategory[] $VALUES;

    @d
    public static final a Companion;

    @d
    private String displayName;
    private byte type;
    public static final EQCategory EQ_BALANCE = new EQCategory("EQ_BALANCE", 0, (byte) 0, "BALANCE");
    public static final EQCategory EQ_BASS_BOOST_1 = new EQCategory("EQ_BASS_BOOST_1", 1, (byte) 1, "EQ_BASS_BOOST");
    public static final EQCategory EQ_BASS_BOOST_2 = new EQCategory("EQ_BASS_BOOST_2", 2, (byte) 2, "EQ_BASS_BOOST");
    public static final EQCategory VOCAL = new EQCategory("VOCAL", 3, (byte) 3, "VOCAL");
    public static final EQCategory METAL = new EQCategory("METAL", 4, (byte) 4, "METAL");
    public static final EQCategory CLASSICAL = new EQCategory("CLASSICAL", 5, (byte) 5, "CLASSICAL");
    public static final EQCategory SIGNATURE = new EQCategory("SIGNATURE", 6, (byte) 6, "SIGNATURE");
    public static final EQCategory RELAXING = new EQCategory("RELAXING", 7, (byte) 7, "RELAXING");
    public static final EQCategory ENERGETIC = new EQCategory("ENERGETIC", 8, (byte) 8, "ENERGETIC");
    public static final EQCategory EXTREME = new EQCategory("EXTREME", 9, (byte) 9, "EXTREME");
    public static final EQCategory MOVIE = new EQCategory("MOVIE", 10, (byte) 10, "MOVIE");
    public static final EQCategory CHILL = new EQCategory("CHILL", 11, (byte) 11, "CHILL");
    public static final EQCategory RESERVED_1 = new EQCategory("RESERVED_1", 12, (byte) 33, "RESERVED_1");
    public static final EQCategory RESERVED_2 = new EQCategory("RESERVED_2", 13, k.f48709r0, "RESERVED_2");
    public static final EQCategory RESERVED_3 = new EQCategory("RESERVED_3", 14, (byte) 35, "RESERVED_3");
    public static final EQCategory RESERVED_4 = new EQCategory("RESERVED_4", 15, (byte) 36, "RESERVED_4");
    public static final EQCategory RESERVED_5 = new EQCategory("RESERVED_5", 16, b.f51040j, "RESERVED_5");
    public static final EQCategory RESERVED_6 = new EQCategory("RESERVED_6", 17, (byte) 38, "RESERVED_6");
    public static final EQCategory RESERVED_7 = new EQCategory("RESERVED_7", 18, b.f51046p, "RESERVED_7");
    public static final EQCategory RESERVED_8 = new EQCategory("RESERVED_8", 19, b.f51039i, "RESERVED_8");
    public static final EQCategory RESERVED_9 = new EQCategory("RESERVED_9", 20, (byte) 41, "RESERVED_9");
    public static final EQCategory RESERVED_10 = new EQCategory("RESERVED_10", 21, (byte) 42, "RESERVED_10");
    public static final EQCategory RESERVED_11 = new EQCategory("RESERVED_11", 22, (byte) 43, "RESERVED_11");
    public static final EQCategory CUSTOM = new EQCategory("CUSTOM", 23, (byte) -63, "CUSTOM");
    public static final EQCategory CUSTOM_C2 = new EQCategory("CUSTOM_C2", 24, (byte) -62, "CUSTOM");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final EQCategory a(byte b4) {
            if (b4 == 0) {
                return EQCategory.EQ_BALANCE;
            }
            if (b4 == 1) {
                return EQCategory.EQ_BASS_BOOST_1;
            }
            if (b4 == 2) {
                return EQCategory.EQ_BASS_BOOST_2;
            }
            if (b4 == 3) {
                return EQCategory.VOCAL;
            }
            if (b4 == 4) {
                return EQCategory.METAL;
            }
            if (b4 == 5) {
                return EQCategory.CLASSICAL;
            }
            if (b4 == 6) {
                return EQCategory.SIGNATURE;
            }
            if (b4 == 7) {
                return EQCategory.RELAXING;
            }
            if (b4 == 8) {
                return EQCategory.ENERGETIC;
            }
            if (b4 == 9) {
                return EQCategory.EXTREME;
            }
            if (b4 == 10) {
                return EQCategory.MOVIE;
            }
            if (b4 == 11) {
                return EQCategory.CHILL;
            }
            if (b4 == 33) {
                return EQCategory.RESERVED_1;
            }
            if (b4 == 34) {
                return EQCategory.RESERVED_2;
            }
            if (b4 == 35) {
                return EQCategory.RESERVED_3;
            }
            if (b4 == 36) {
                return EQCategory.RESERVED_4;
            }
            if (b4 == 37) {
                return EQCategory.RESERVED_5;
            }
            if (b4 == 38) {
                return EQCategory.RESERVED_6;
            }
            if (b4 == 39) {
                return EQCategory.RESERVED_7;
            }
            if (b4 == 40) {
                return EQCategory.RESERVED_8;
            }
            if (b4 == 41) {
                return EQCategory.RESERVED_9;
            }
            if (b4 == 42) {
                return EQCategory.RESERVED_10;
            }
            if (b4 == 43) {
                return EQCategory.RESERVED_11;
            }
            if (b4 == -63) {
                return EQCategory.CUSTOM;
            }
            if (b4 == -62) {
                return EQCategory.CUSTOM_C2;
            }
            return EQCategory.SIGNATURE;
        }

        private a() {
        }
    }

    static {
        EQCategory[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
        Companion = new a(null);
    }

    private EQCategory(String str, int i4, byte b4, String str2) {
        this.type = b4;
        this.displayName = str2;
    }

    private static final /* synthetic */ EQCategory[] b() {
        return new EQCategory[]{EQ_BALANCE, EQ_BASS_BOOST_1, EQ_BASS_BOOST_2, VOCAL, METAL, CLASSICAL, SIGNATURE, RELAXING, ENERGETIC, EXTREME, MOVIE, CHILL, RESERVED_1, RESERVED_2, RESERVED_3, RESERVED_4, RESERVED_5, RESERVED_6, RESERVED_7, RESERVED_8, RESERVED_9, RESERVED_10, RESERVED_11, CUSTOM, CUSTOM_C2};
    }

    @d
    public static kotlin.enums.a<EQCategory> f() {
        return $ENTRIES;
    }

    public static EQCategory valueOf(String str) {
        return (EQCategory) Enum.valueOf(EQCategory.class, str);
    }

    public static EQCategory[] values() {
        return (EQCategory[]) $VALUES.clone();
    }

    @d
    public final String e() {
        return this.displayName;
    }

    public final byte g() {
        return this.type;
    }

    public final void i(@d String str) {
        F.p(str, "<set-?>");
        this.displayName = str;
    }

    public final void j(byte b4) {
        this.type = b4;
    }
}
