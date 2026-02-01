package com.harman.jbl.partybox.ui.party.stereo.define;

import com.harman.sdk.utils.d;
import kotlin.E;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import l3.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoType;", "", "", "value", "I", "g", "()I", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", d.f48543u, "STEREO", "WIRELESS", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumStereoType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnumStereoType[] $VALUES;

    @l3.d
    public static final a Companion;

    @l3.d
    private final String desc;
    private final int value;
    public static final EnumStereoType TWS = new EnumStereoType(d.f48543u, 0, 1, "Connect with Previous Model");
    public static final EnumStereoType STEREO = new EnumStereoType("STEREO", 1, 2, "Stereo TWS Flow");
    public static final EnumStereoType WIRELESS = new EnumStereoType("WIRELESS", 2, 3, "Old TWS Flow");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @e
        public final EnumStereoType a(int i4) {
            EnumStereoType enumStereoType = EnumStereoType.TWS;
            if (i4 != enumStereoType.g()) {
                EnumStereoType enumStereoType2 = EnumStereoType.STEREO;
                if (i4 != enumStereoType2.g()) {
                    EnumStereoType enumStereoType3 = EnumStereoType.WIRELESS;
                    if (i4 != enumStereoType3.g()) {
                        return null;
                    }
                    return enumStereoType3;
                }
                return enumStereoType2;
            }
            return enumStereoType;
        }

        private a() {
        }
    }

    static {
        EnumStereoType[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
        Companion = new a(null);
    }

    private EnumStereoType(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.desc = str2;
    }

    private static final /* synthetic */ EnumStereoType[] b() {
        return new EnumStereoType[]{TWS, STEREO, WIRELESS};
    }

    @l3.d
    public static kotlin.enums.a<EnumStereoType> f() {
        return $ENTRIES;
    }

    public static EnumStereoType valueOf(String str) {
        return (EnumStereoType) Enum.valueOf(EnumStereoType.class, str);
    }

    public static EnumStereoType[] values() {
        return (EnumStereoType[]) $VALUES.clone();
    }

    @l3.d
    public final String e() {
        return this.desc;
    }

    public final int g() {
        return this.value;
    }
}
