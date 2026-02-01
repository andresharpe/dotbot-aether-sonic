package com.harman.jbl.partylight.lib.biz;

import com.harman.jbl.cd_biz_comm.utils.i;
import com.harman.sdk.message.AdvancedCustomEQPayload;
import com.harman.sdk.message.GestureInfo;
import com.spotify.sdk.android.auth.b;
import java.util.Iterator;
import java.util.List;
import kotlin.E;
import kotlin.collections.A;
import kotlin.collections.C2101p;
import kotlin.collections.D;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.p0;
import kotlinx.coroutines.scheduling.q;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class LightInfo {

    /* renamed from: i, reason: collision with root package name */
    @d
    public static final a f46228i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @e
    private final Pattern f46229a;

    /* renamed from: b, reason: collision with root package name */
    @e
    private final Color f46230b;

    /* renamed from: c, reason: collision with root package name */
    @e
    private final PatternLooping f46231c;

    /* renamed from: d, reason: collision with root package name */
    @e
    private final Integer f46232d;

    /* renamed from: e, reason: collision with root package name */
    @e
    private final Integer f46233e;

    /* renamed from: f, reason: collision with root package name */
    @e
    private final String f46234f;

    /* renamed from: g, reason: collision with root package name */
    @e
    private final Integer f46235g;

    /* renamed from: h, reason: collision with root package name */
    @e
    private final Switch f46236h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/harman/jbl/partylight/lib/biz/LightInfo$Pattern;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "B", "f", "()B", "patternName", "Ljava/lang/String;", "g", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", "NEON", "RANDOM", "LOOP", "BOUNCE", "TRIM", "SWITCH", "FREEZE", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class Pattern {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Pattern[] $VALUES;
        private final byte id;

        @d
        private final String patternName;
        public static final Pattern NEON = new Pattern("NEON", 0, (byte) 2, "NEON");
        public static final Pattern RANDOM = new Pattern("RANDOM", 1, (byte) 8, "CUSTOM");
        public static final Pattern LOOP = new Pattern("LOOP", 2, (byte) 9, "LOOP");
        public static final Pattern BOUNCE = new Pattern("BOUNCE", 3, (byte) 10, "BOUNCE");
        public static final Pattern TRIM = new Pattern("TRIM", 4, (byte) 11, "TRIM");
        public static final Pattern SWITCH = new Pattern("SWITCH", 5, AdvancedCustomEQPayload.f48133O, "SWITCH");
        public static final Pattern FREEZE = new Pattern("FREEZE", 6, (byte) 13, "FREEZE");

        static {
            Pattern[] b4 = b();
            $VALUES = b4;
            $ENTRIES = c.c(b4);
        }

        private Pattern(String str, int i4, byte b4, String str2) {
            this.id = b4;
            this.patternName = str2;
        }

        private static final /* synthetic */ Pattern[] b() {
            return new Pattern[]{NEON, RANDOM, LOOP, BOUNCE, TRIM, SWITCH, FREEZE};
        }

        @d
        public static kotlin.enums.a<Pattern> e() {
            return $ENTRIES;
        }

        public static Pattern valueOf(String str) {
            return (Pattern) Enum.valueOf(Pattern.class, str);
        }

        public static Pattern[] values() {
            return (Pattern[]) $VALUES.clone();
        }

        public final byte f() {
            return this.id;
        }

        @d
        public final String g() {
            return this.patternName;
        }

        @Override // java.lang.Enum
        @d
        public String toString() {
            byte b4 = this.id;
            return "LightPattern{Id=" + ((int) b4) + ", Name='" + this.patternName + "'}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/harman/jbl/partylight/lib/biz/LightInfo$PatternLooping;", "", "", b.c.f48986a, "B", "f", "()B", "<init>", "(Ljava/lang/String;IB)V", "COLOR_LOOP", "STATIC_COLOR", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class PatternLooping {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ PatternLooping[] $VALUES;
        public static final PatternLooping COLOR_LOOP = new PatternLooping("COLOR_LOOP", 0, (byte) 0);
        public static final PatternLooping STATIC_COLOR = new PatternLooping("STATIC_COLOR", 1, (byte) 1);
        private final byte id;

        static {
            PatternLooping[] b4 = b();
            $VALUES = b4;
            $ENTRIES = c.c(b4);
        }

        private PatternLooping(String str, int i4, byte b4) {
            this.id = b4;
        }

        private static final /* synthetic */ PatternLooping[] b() {
            return new PatternLooping[]{COLOR_LOOP, STATIC_COLOR};
        }

        @d
        public static kotlin.enums.a<PatternLooping> e() {
            return $ENTRIES;
        }

        public static PatternLooping valueOf(String str) {
            return (PatternLooping) Enum.valueOf(PatternLooping.class, str);
        }

        public static PatternLooping[] values() {
            return (PatternLooping[]) $VALUES.clone();
        }

        public final byte f() {
            return this.id;
        }
    }

    @U({"SMAP\nTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Types.kt\ncom/harman/jbl/partylight/lib/biz/LightInfo$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final LightInfo a(@d byte[] byteArray) {
            List Ny;
            Object M02;
            Pattern pattern;
            Object B22;
            Object B23;
            Object B24;
            Object B25;
            byte[] O5;
            Object B26;
            Switch r9;
            Object B27;
            F.p(byteArray, "byteArray");
            try {
                LightInfo lightInfo = new LightInfo(null, null, null, null, null, null, null, null, 255, null);
                Ny = C2101p.Ny(byteArray);
                M02 = A.M0(Ny);
                ((Number) M02).byteValue();
                Iterator it = Ny.iterator();
                LightInfo lightInfo2 = lightInfo;
                while (it.hasNext()) {
                    byte byteValue = ((Number) it.next()).byteValue();
                    List b4 = i.b(it, ((Number) it.next()).byteValue());
                    PatternLooping patternLooping = null;
                    int i4 = 0;
                    if (byteValue == 49) {
                        Pattern[] values = Pattern.values();
                        int length = values.length;
                        while (true) {
                            if (i4 < length) {
                                Pattern pattern2 = values[i4];
                                byte f4 = pattern2.f();
                                B22 = D.B2(b4);
                                if (f4 == ((Number) B22).byteValue()) {
                                    pattern = pattern2;
                                    break;
                                }
                                i4++;
                            } else {
                                pattern = null;
                                break;
                            }
                        }
                        lightInfo2 = LightInfo.j(lightInfo2, pattern, null, null, null, null, null, null, null, GestureInfo.f48245e0, null);
                    } else if (byteValue == 50) {
                        lightInfo2 = LightInfo.j(lightInfo2, null, new Color(p0.l(((Number) b4.get(0)).byteValue()) & 255, p0.l(((Number) b4.get(1)).byteValue()) & 255, p0.l(((Number) b4.get(2)).byteValue()) & 255), null, null, null, null, null, null, GestureInfo.f48244d0, null);
                    } else if (byteValue == 54) {
                        PatternLooping[] values2 = PatternLooping.values();
                        int length2 = values2.length;
                        while (true) {
                            if (i4 >= length2) {
                                break;
                            }
                            PatternLooping patternLooping2 = values2[i4];
                            byte f5 = patternLooping2.f();
                            B23 = D.B2(b4);
                            if (f5 == ((Number) B23).byteValue()) {
                                patternLooping = patternLooping2;
                                break;
                            }
                            i4++;
                        }
                        lightInfo2 = LightInfo.j(lightInfo2, null, null, patternLooping, null, null, null, null, null, 251, null);
                    } else if (byteValue == 69) {
                        B24 = D.B2(b4);
                        lightInfo2 = LightInfo.j(lightInfo2, null, null, null, Integer.valueOf(((Number) B24).byteValue()), null, null, null, null, 247, null);
                    } else if (byteValue == 70) {
                        B25 = D.B2(b4);
                        lightInfo2 = LightInfo.j(lightInfo2, null, null, null, null, Integer.valueOf(((Number) B25).byteValue()), null, null, null, 239, null);
                    } else if (byteValue == 71) {
                        O5 = D.O5(b4);
                        String f6 = i.f(O5);
                        if (F.g(f6, "0000")) {
                            lightInfo2 = LightInfo.j(lightInfo2, null, null, null, null, null, null, null, null, 223, null);
                        } else {
                            lightInfo2 = LightInfo.j(lightInfo2, null, null, null, null, null, f6, null, null, 223, null);
                        }
                    } else if (byteValue == 72) {
                        B26 = D.B2(b4);
                        byte byteValue2 = ((Number) B26).byteValue();
                        if (byteValue2 == -1) {
                            lightInfo2 = LightInfo.j(lightInfo2, null, null, null, null, null, null, null, null, 191, null);
                        } else {
                            lightInfo2 = LightInfo.j(lightInfo2, null, null, null, null, null, null, Integer.valueOf(byteValue2), null, 191, null);
                        }
                    } else if (byteValue == 73) {
                        Switch[] values3 = Switch.values();
                        int length3 = values3.length;
                        while (true) {
                            if (i4 < length3) {
                                Switch r6 = values3[i4];
                                byte f7 = r6.f();
                                B27 = D.B2(b4);
                                if (f7 == ((Number) B27).byteValue()) {
                                    r9 = r6;
                                    break;
                                }
                                i4++;
                            } else {
                                r9 = null;
                                break;
                            }
                        }
                        lightInfo2 = LightInfo.j(lightInfo2, null, null, null, null, null, null, null, r9, q.f54649c, null);
                    }
                }
                return lightInfo2;
            } catch (Throwable th) {
                th.printStackTrace();
                return new LightInfo(null, null, null, null, null, null, null, null, 255, null);
            }
        }

        private a() {
        }
    }

    public LightInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ LightInfo j(LightInfo lightInfo, Pattern pattern, Color color, PatternLooping patternLooping, Integer num, Integer num2, String str, Integer num3, Switch r17, int i4, Object obj) {
        return lightInfo.i((i4 & 1) != 0 ? lightInfo.f46229a : pattern, (i4 & 2) != 0 ? lightInfo.f46230b : color, (i4 & 4) != 0 ? lightInfo.f46231c : patternLooping, (i4 & 8) != 0 ? lightInfo.f46232d : num, (i4 & 16) != 0 ? lightInfo.f46233e : num2, (i4 & 32) != 0 ? lightInfo.f46234f : str, (i4 & 64) != 0 ? lightInfo.f46235g : num3, (i4 & 128) != 0 ? lightInfo.f46236h : r17);
    }

    @e
    public final Pattern a() {
        return this.f46229a;
    }

    @e
    public final Color b() {
        return this.f46230b;
    }

    @e
    public final PatternLooping c() {
        return this.f46231c;
    }

    @e
    public final Integer d() {
        return this.f46232d;
    }

    @e
    public final Integer e() {
        return this.f46233e;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightInfo)) {
            return false;
        }
        LightInfo lightInfo = (LightInfo) obj;
        return this.f46229a == lightInfo.f46229a && F.g(this.f46230b, lightInfo.f46230b) && this.f46231c == lightInfo.f46231c && F.g(this.f46232d, lightInfo.f46232d) && F.g(this.f46233e, lightInfo.f46233e) && F.g(this.f46234f, lightInfo.f46234f) && F.g(this.f46235g, lightInfo.f46235g) && this.f46236h == lightInfo.f46236h;
    }

    @e
    public final String f() {
        return this.f46234f;
    }

    @e
    public final Integer g() {
        return this.f46235g;
    }

    @e
    public final Switch h() {
        return this.f46236h;
    }

    public int hashCode() {
        Pattern pattern = this.f46229a;
        int hashCode = (pattern == null ? 0 : pattern.hashCode()) * 31;
        Color color = this.f46230b;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        PatternLooping patternLooping = this.f46231c;
        int hashCode3 = (hashCode2 + (patternLooping == null ? 0 : patternLooping.hashCode())) * 31;
        Integer num = this.f46232d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f46233e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f46234f;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f46235g;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Switch r22 = this.f46236h;
        return hashCode7 + (r22 != null ? r22.hashCode() : 0);
    }

    @d
    public final LightInfo i(@e Pattern pattern, @e Color color, @e PatternLooping patternLooping, @e Integer num, @e Integer num2, @e String str, @e Integer num3, @e Switch r18) {
        return new LightInfo(pattern, color, patternLooping, num, num2, str, num3, r18);
    }

    @d
    public final LightInfo k(@d LightInfo data) {
        F.p(data, "data");
        Pattern pattern = data.f46229a;
        if (pattern == null) {
            pattern = this.f46229a;
        }
        Pattern pattern2 = pattern;
        Color color = data.f46230b;
        if (color == null) {
            color = this.f46230b;
        }
        Color color2 = color;
        PatternLooping patternLooping = data.f46231c;
        if (patternLooping == null) {
            patternLooping = this.f46231c;
        }
        PatternLooping patternLooping2 = patternLooping;
        Integer num = data.f46232d;
        if (num == null) {
            num = this.f46232d;
        }
        Integer num2 = num;
        Integer num3 = data.f46233e;
        if (num3 == null) {
            num3 = this.f46233e;
        }
        Integer num4 = num3;
        String str = data.f46234f;
        if (str == null) {
            str = this.f46234f;
        }
        String str2 = str;
        Integer num5 = data.f46235g;
        if (num5 == null) {
            num5 = this.f46235g;
        }
        Integer num6 = num5;
        Switch r11 = data.f46236h;
        if (r11 == null) {
            r11 = this.f46236h;
        }
        return new LightInfo(pattern2, color2, patternLooping2, num2, num4, str2, num6, r11);
    }

    @e
    public final Switch l() {
        return this.f46236h;
    }

    @e
    public final Color m() {
        return this.f46230b;
    }

    @e
    public final Integer n() {
        return this.f46233e;
    }

    @e
    public final Integer o() {
        return this.f46232d;
    }

    @e
    public final Pattern p() {
        return this.f46229a;
    }

    @e
    public final PatternLooping q() {
        return this.f46231c;
    }

    @e
    public final String r() {
        return this.f46234f;
    }

    @e
    public final Integer s() {
        return this.f46235g;
    }

    @d
    public String toString() {
        return "LightInfo(pattern=" + this.f46229a + ", currentColor=" + this.f46230b + ", patternLooping=" + this.f46231c + ", lightBrightness=" + this.f46232d + ", lEDMovementSpeed=" + this.f46233e + ", speakerIDtoLight=" + this.f46234f + ", stageLightNum=" + this.f46235g + ", backLightMode=" + this.f46236h + ")";
    }

    public LightInfo(@e Pattern pattern, @e Color color, @e PatternLooping patternLooping, @e Integer num, @e Integer num2, @e String str, @e Integer num3, @e Switch r8) {
        this.f46229a = pattern;
        this.f46230b = color;
        this.f46231c = patternLooping;
        this.f46232d = num;
        this.f46233e = num2;
        this.f46234f = str;
        this.f46235g = num3;
        this.f46236h = r8;
    }

    public /* synthetic */ LightInfo(Pattern pattern, Color color, PatternLooping patternLooping, Integer num, Integer num2, String str, Integer num3, Switch r17, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : pattern, (i4 & 2) != 0 ? null : color, (i4 & 4) != 0 ? null : patternLooping, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : num2, (i4 & 32) != 0 ? null : str, (i4 & 64) != 0 ? null : num3, (i4 & 128) == 0 ? r17 : null);
    }
}
