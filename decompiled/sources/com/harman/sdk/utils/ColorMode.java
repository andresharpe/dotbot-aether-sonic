package com.harman.sdk.utils;

import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/sdk/utils/ColorMode;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "g", "()I", "modeName", "Ljava/lang/String;", "i", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "COLOR_LOOP", "STATIC_COLOR", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ColorMode {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ColorMode[] $VALUES;

    @l3.d
    public static final a Companion;
    private final int id;

    @l3.d
    private final String modeName;
    public static final ColorMode COLOR_LOOP = new ColorMode("COLOR_LOOP", 0, 0, "COLOR_LOOP");
    public static final ColorMode STATIC_COLOR = new ColorMode("STATIC_COLOR", 1, 1, "STATIC_COLOR");

    @U({"SMAP\nColorMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMode.kt\ncom/harman/sdk/utils/ColorMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final ColorMode a(int i4) {
            ColorMode colorMode;
            ColorMode[] values = ColorMode.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    colorMode = values[i5];
                    if (colorMode.g() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    colorMode = null;
                    break;
                }
            }
            if (colorMode == null) {
                return ColorMode.COLOR_LOOP;
            }
            return colorMode;
        }

        private a() {
        }
    }

    static {
        ColorMode[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private ColorMode(String str, int i4, int i5, String str2) {
        this.id = i5;
        this.modeName = str2;
    }

    private static final /* synthetic */ ColorMode[] b() {
        return new ColorMode[]{COLOR_LOOP, STATIC_COLOR};
    }

    @W2.n
    @l3.d
    public static final ColorMode e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<ColorMode> f() {
        return $ENTRIES;
    }

    public static ColorMode valueOf(String str) {
        return (ColorMode) Enum.valueOf(ColorMode.class, str);
    }

    public static ColorMode[] values() {
        return (ColorMode[]) $VALUES.clone();
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
        return "ColorMode{Id=" + this.id + ", Name='" + this.modeName + "'}";
    }
}
