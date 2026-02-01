package com.harman.jbl.partybox.ui.djeffects.model;

import W2.n;
import com.spotify.sdk.android.auth.b;
import kotlin.E;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/harman/jbl/partybox/ui/djeffects/model/DjEffectToneId;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "g", "()I", "patternName", "Ljava/lang/String;", "i", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "TONE_UNKNOWN", "TONE_HORN", "TONE_CLAPPING", "TONE_SCRATCH_1", "TONE_SCRATCH_2", "TONE_SCRATCH_3", "TONE_BARKING", "TONE_LIKE", "TONE_BOO", "TONE_READY", "TONE_DISCO1", "TONE_DISCO2", "TONE_DISCO3", "TONE_GAME", "TONE_PARTY", "TONE_HEY", "TONE_HANDS_UP", "TONE_123", "TONE_JUMP", "TONE_LETS_GO", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DjEffectToneId {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DjEffectToneId[] $VALUES;

    @d
    public static final a Companion;
    private final int id;

    @d
    private final String patternName;
    public static final DjEffectToneId TONE_UNKNOWN = new DjEffectToneId("TONE_UNKNOWN", 0, 0, "TONE_UNKNOWN");
    public static final DjEffectToneId TONE_HORN = new DjEffectToneId("TONE_HORN", 1, 1, "TONE_HORN");
    public static final DjEffectToneId TONE_CLAPPING = new DjEffectToneId("TONE_CLAPPING", 2, 2, "TONE_CLAPPING");
    public static final DjEffectToneId TONE_SCRATCH_1 = new DjEffectToneId("TONE_SCRATCH_1", 3, 3, "TONE_SCRATCH_1");
    public static final DjEffectToneId TONE_SCRATCH_2 = new DjEffectToneId("TONE_SCRATCH_2", 4, 4, "TONE_SCRATCH_2");
    public static final DjEffectToneId TONE_SCRATCH_3 = new DjEffectToneId("TONE_SCRATCH_3", 5, 5, "TONE_SCRATCH_3");
    public static final DjEffectToneId TONE_BARKING = new DjEffectToneId("TONE_BARKING", 6, 6, "TONE_BARKING");
    public static final DjEffectToneId TONE_LIKE = new DjEffectToneId("TONE_LIKE", 7, 7, "TONE_LIKE");
    public static final DjEffectToneId TONE_BOO = new DjEffectToneId("TONE_BOO", 8, 8, "TONE_BOO");
    public static final DjEffectToneId TONE_READY = new DjEffectToneId("TONE_READY", 9, 9, "TONE_READY");
    public static final DjEffectToneId TONE_DISCO1 = new DjEffectToneId("TONE_DISCO1", 10, 10, "TONE_DISCO1");
    public static final DjEffectToneId TONE_DISCO2 = new DjEffectToneId("TONE_DISCO2", 11, 11, "TONE_DISCO2");
    public static final DjEffectToneId TONE_DISCO3 = new DjEffectToneId("TONE_DISCO3", 12, 12, "TONE_DISCO3");
    public static final DjEffectToneId TONE_GAME = new DjEffectToneId("TONE_GAME", 13, 13, "TONE_GAME");
    public static final DjEffectToneId TONE_PARTY = new DjEffectToneId("TONE_PARTY", 14, 14, "TONE_PARTY");
    public static final DjEffectToneId TONE_HEY = new DjEffectToneId("TONE_HEY", 15, 15, "TONE_HEY");
    public static final DjEffectToneId TONE_HANDS_UP = new DjEffectToneId("TONE_HANDS_UP", 16, 16, "TONE_HANDS_UP");
    public static final DjEffectToneId TONE_123 = new DjEffectToneId("TONE_123", 17, 17, "TONE_123");
    public static final DjEffectToneId TONE_JUMP = new DjEffectToneId("TONE_JUMP", 18, 18, "TONE_JUMP");
    public static final DjEffectToneId TONE_LETS_GO = new DjEffectToneId("TONE_LETS_GO", 19, 19, "TONE_LETS_GO");

    @U({"SMAP\nDjEffectToneId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DjEffectToneId.kt\ncom/harman/jbl/partybox/ui/djeffects/model/DjEffectToneId$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @d
        public final DjEffectToneId a(int i4) {
            DjEffectToneId djEffectToneId;
            DjEffectToneId[] values = DjEffectToneId.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    djEffectToneId = values[i5];
                    if (djEffectToneId.g() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    djEffectToneId = null;
                    break;
                }
            }
            if (djEffectToneId == null) {
                return DjEffectToneId.TONE_UNKNOWN;
            }
            return djEffectToneId;
        }

        private a() {
        }
    }

    static {
        DjEffectToneId[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
        Companion = new a(null);
    }

    private DjEffectToneId(String str, int i4, int i5, String str2) {
        this.id = i5;
        this.patternName = str2;
    }

    private static final /* synthetic */ DjEffectToneId[] b() {
        return new DjEffectToneId[]{TONE_UNKNOWN, TONE_HORN, TONE_CLAPPING, TONE_SCRATCH_1, TONE_SCRATCH_2, TONE_SCRATCH_3, TONE_BARKING, TONE_LIKE, TONE_BOO, TONE_READY, TONE_DISCO1, TONE_DISCO2, TONE_DISCO3, TONE_GAME, TONE_PARTY, TONE_HEY, TONE_HANDS_UP, TONE_123, TONE_JUMP, TONE_LETS_GO};
    }

    @n
    @d
    public static final DjEffectToneId e(int i4) {
        return Companion.a(i4);
    }

    @d
    public static kotlin.enums.a<DjEffectToneId> f() {
        return $ENTRIES;
    }

    public static DjEffectToneId valueOf(String str) {
        return (DjEffectToneId) Enum.valueOf(DjEffectToneId.class, str);
    }

    public static DjEffectToneId[] values() {
        return (DjEffectToneId[]) $VALUES.clone();
    }

    public final int g() {
        return this.id;
    }

    @d
    public final String i() {
        return this.patternName;
    }

    @Override // java.lang.Enum
    @d
    public String toString() {
        return "DjEffectTone{Id=" + this.id + ", Name='" + this.patternName + "'}";
    }
}
