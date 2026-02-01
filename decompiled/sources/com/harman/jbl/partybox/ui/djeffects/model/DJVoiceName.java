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
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/harman/jbl/partybox/ui/djeffects/model/DJVoiceName;", "", "", "toString", "()Ljava/lang/String;", "", b.c.f48986a, "I", "g", "()I", "patternName", "Ljava/lang/String;", "i", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "UNKNOWN", "LETS_GO", "HANDS_UP", "HEY", "PARTY", "JUMP", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DJVoiceName {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DJVoiceName[] $VALUES;

    @d
    public static final a Companion;
    private final int id;

    @d
    private final String patternName;
    public static final DJVoiceName UNKNOWN = new DJVoiceName("UNKNOWN", 0, 0, "UNKNOWN");
    public static final DJVoiceName LETS_GO = new DJVoiceName("LETS_GO", 1, 19, "LETS_GO");
    public static final DJVoiceName HANDS_UP = new DJVoiceName("HANDS_UP", 2, 16, "HANDS_UP");
    public static final DJVoiceName HEY = new DJVoiceName("HEY", 3, 15, "HEY");
    public static final DJVoiceName PARTY = new DJVoiceName("PARTY", 4, 14, "PARTY");
    public static final DJVoiceName JUMP = new DJVoiceName("JUMP", 5, 18, "JUMP");

    @U({"SMAP\nDJVoiceName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DJVoiceName.kt\ncom/harman/jbl/partybox/ui/djeffects/model/DJVoiceName$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @d
        public final DJVoiceName a(int i4) {
            DJVoiceName dJVoiceName;
            DJVoiceName[] values = DJVoiceName.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    dJVoiceName = values[i5];
                    if (dJVoiceName.g() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    dJVoiceName = null;
                    break;
                }
            }
            if (dJVoiceName == null) {
                return DJVoiceName.UNKNOWN;
            }
            return dJVoiceName;
        }

        private a() {
        }
    }

    static {
        DJVoiceName[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
        Companion = new a(null);
    }

    private DJVoiceName(String str, int i4, int i5, String str2) {
        this.id = i5;
        this.patternName = str2;
    }

    private static final /* synthetic */ DJVoiceName[] b() {
        return new DJVoiceName[]{UNKNOWN, LETS_GO, HANDS_UP, HEY, PARTY, JUMP};
    }

    @n
    @d
    public static final DJVoiceName e(int i4) {
        return Companion.a(i4);
    }

    @d
    public static kotlin.enums.a<DJVoiceName> f() {
        return $ENTRIES;
    }

    public static DJVoiceName valueOf(String str) {
        return (DJVoiceName) Enum.valueOf(DJVoiceName.class, str);
    }

    public static DJVoiceName[] values() {
        return (DJVoiceName[]) $VALUES.clone();
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
        return "DJVoiceName{Id=" + this.id + ", Name='" + this.patternName + "'}";
    }
}
