package com.harman.sdk.utils;

import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B!\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/harman/sdk/utils/LightElements;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "i", "()I", "maxMotionAvailable", "j", "elementName", "Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;IIILjava/lang/String;)V", "Companion", "a", "LIGHT_STROBE", "LIGHT_EIGHT", "LIGHT_SIDE_RING", "LIGHT_STRIPE", "LIGHT_STAR", "LIGHT_STROBE_UP", "LIGHT_STROBE_DOWN", "LIGHT_EDGE", "LIGHT_BRIGHTNESS", "LIGHT_MOVEMENT_SPEED", "LIGHT_ASSIGN_SPEAKER_ID", "LIGHT_BATTERY_SAVING_MODE", "MAIN_SWITCH", "INVALID", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LightElements {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ LightElements[] $VALUES;

    @l3.d
    public static final a Companion;

    @l3.d
    private final String elementName;
    private final int id;
    private final int maxMotionAvailable;
    public static final LightElements LIGHT_STROBE = new LightElements("LIGHT_STROBE", 0, 51, 0, "LIGHT_STROBE");
    public static final LightElements LIGHT_EIGHT = new LightElements("LIGHT_EIGHT", 1, 56, 18, "LIGHT_EIGHT");
    public static final LightElements LIGHT_SIDE_RING = new LightElements("LIGHT_SIDE_RING", 2, 57, 0, "LIGHT_SIDE_RING");
    public static final LightElements LIGHT_STRIPE = new LightElements("LIGHT_STRIPE", 3, 64, 10, "LIGHT_STRIPE");
    public static final LightElements LIGHT_STAR = new LightElements("LIGHT_STAR", 4, 65, 3, "LIGHT_STAR");
    public static final LightElements LIGHT_STROBE_UP = new LightElements("LIGHT_STROBE_UP", 5, 66, 3, "LIGHT_STROBE_UP");
    public static final LightElements LIGHT_STROBE_DOWN = new LightElements("LIGHT_STROBE_DOWN", 6, 67, 3, "LIGHT_STROBE_DOWN");
    public static final LightElements LIGHT_EDGE = new LightElements("LIGHT_EDGE", 7, 68, 3, "LIGHT_EDGE");
    public static final LightElements LIGHT_BRIGHTNESS = new LightElements("LIGHT_BRIGHTNESS", 8, 69, 3, "LIGHT_BRIGHTNESS");
    public static final LightElements LIGHT_MOVEMENT_SPEED = new LightElements("LIGHT_MOVEMENT_SPEED", 9, 70, 3, "LIGHT_MOVEMENT_SPEED");
    public static final LightElements LIGHT_ASSIGN_SPEAKER_ID = new LightElements("LIGHT_ASSIGN_SPEAKER_ID", 10, 71, 3, "LIGHT_ASSIGN_SPEAKER_ID");
    public static final LightElements LIGHT_BATTERY_SAVING_MODE = new LightElements("LIGHT_BATTERY_SAVING_MODE", 11, 73, 3, "LIGHT_BATTERY_SAVING_MODE");
    public static final LightElements MAIN_SWITCH = new LightElements("MAIN_SWITCH", 12, 153, 3, "MAIN_SWITCH");
    public static final LightElements INVALID = new LightElements("INVALID", 13, 255, 0, "INVALID");

    @U({"SMAP\nLightElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightElements.kt\ncom/harman/sdk/utils/LightElements$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final LightElements a(int i4) {
            LightElements lightElements;
            LightElements[] values = LightElements.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    lightElements = values[i5];
                    if (lightElements.i() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    lightElements = null;
                    break;
                }
            }
            if (lightElements == null) {
                return LightElements.INVALID;
            }
            return lightElements;
        }

        private a() {
        }
    }

    static {
        LightElements[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private LightElements(String str, int i4, int i5, int i6, String str2) {
        this.id = i5;
        this.maxMotionAvailable = i6;
        this.elementName = str2;
    }

    private static final /* synthetic */ LightElements[] b() {
        return new LightElements[]{LIGHT_STROBE, LIGHT_EIGHT, LIGHT_SIDE_RING, LIGHT_STRIPE, LIGHT_STAR, LIGHT_STROBE_UP, LIGHT_STROBE_DOWN, LIGHT_EDGE, LIGHT_BRIGHTNESS, LIGHT_MOVEMENT_SPEED, LIGHT_ASSIGN_SPEAKER_ID, LIGHT_BATTERY_SAVING_MODE, MAIN_SWITCH, INVALID};
    }

    @W2.n
    @l3.d
    public static final LightElements e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<LightElements> g() {
        return $ENTRIES;
    }

    public static LightElements valueOf(String str) {
        return (LightElements) Enum.valueOf(LightElements.class, str);
    }

    public static LightElements[] values() {
        return (LightElements[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.elementName;
    }

    public final int i() {
        return this.id;
    }

    public final int j() {
        return this.maxMotionAvailable;
    }

    @Override // java.lang.Enum
    @l3.d
    public String toString() {
        return "LightElements{Id=" + this.id + ", Name='" + this.elementName + "'}";
    }
}
