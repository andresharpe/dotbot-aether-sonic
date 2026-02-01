package com.harman.jbl.partybox.ui.party.auracast.define;

import androidx.annotation.c0;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumAuracastSubQAStyle;", "", "", "strRes", "I", "f", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "WHAT_IS_PARTY_TOGETHER", "FIND_NEARBY_SPEAKERS", "PARTY_VS_STEREO_MODE", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumAuracastSubQAStyle {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnumAuracastSubQAStyle[] $VALUES;

    @d
    public static final a Companion;
    private final int strRes;
    public static final EnumAuracastSubQAStyle WHAT_IS_PARTY_TOGETHER = new EnumAuracastSubQAStyle("WHAT_IS_PARTY_TOGETHER", 0, j.m.cb);
    public static final EnumAuracastSubQAStyle FIND_NEARBY_SPEAKERS = new EnumAuracastSubQAStyle("FIND_NEARBY_SPEAKERS", 1, j.m.f41829v0);
    public static final EnumAuracastSubQAStyle PARTY_VS_STEREO_MODE = new EnumAuracastSubQAStyle("PARTY_VS_STEREO_MODE", 2, j.m.f41847z2);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final EnumAuracastSubQAStyle a(int i4) {
            EnumAuracastSubQAStyle enumAuracastSubQAStyle = EnumAuracastSubQAStyle.WHAT_IS_PARTY_TOGETHER;
            if (i4 != enumAuracastSubQAStyle.ordinal()) {
                EnumAuracastSubQAStyle enumAuracastSubQAStyle2 = EnumAuracastSubQAStyle.FIND_NEARBY_SPEAKERS;
                if (i4 != enumAuracastSubQAStyle2.ordinal()) {
                    enumAuracastSubQAStyle2 = EnumAuracastSubQAStyle.PARTY_VS_STEREO_MODE;
                    if (i4 != enumAuracastSubQAStyle2.ordinal()) {
                        return enumAuracastSubQAStyle;
                    }
                }
                return enumAuracastSubQAStyle2;
            }
            return enumAuracastSubQAStyle;
        }

        private a() {
        }
    }

    static {
        EnumAuracastSubQAStyle[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
        Companion = new a(null);
    }

    private EnumAuracastSubQAStyle(@c0 String str, int i4, int i5) {
        this.strRes = i5;
    }

    private static final /* synthetic */ EnumAuracastSubQAStyle[] b() {
        return new EnumAuracastSubQAStyle[]{WHAT_IS_PARTY_TOGETHER, FIND_NEARBY_SPEAKERS, PARTY_VS_STEREO_MODE};
    }

    @d
    public static kotlin.enums.a<EnumAuracastSubQAStyle> e() {
        return $ENTRIES;
    }

    public static EnumAuracastSubQAStyle valueOf(String str) {
        return (EnumAuracastSubQAStyle) Enum.valueOf(EnumAuracastSubQAStyle.class, str);
    }

    public static EnumAuracastSubQAStyle[] values() {
        return (EnumAuracastSubQAStyle[]) $VALUES.clone();
    }

    public final int f() {
        return this.strRes;
    }
}
