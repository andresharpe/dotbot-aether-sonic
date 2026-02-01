package com.harman.jbl.partybox.ui.party.stereo.define;

import androidx.annotation.c0;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.enums.c;
import kotlin.jvm.internal.C2197u;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoRenameFromPage;", "", "", "intValue", "I", "i", "()I", "", "desc", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "titleRes", "j", "", "backIconVisible", "Z", "e", "()Z", "<init>", "(Ljava/lang/String;IILjava/lang/String;IZ)V", "Companion", "a", "STEREO_CREATE", "GROUP_SETTING", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumStereoRenameFromPage {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnumStereoRenameFromPage[] $VALUES;

    @d
    public static final a Companion;
    private final boolean backIconVisible;

    @d
    private final String desc;
    private final int intValue;
    private final int titleRes;
    public static final EnumStereoRenameFromPage STEREO_CREATE = new EnumStereoRenameFromPage("STEREO_CREATE", 0, 1, "Stereo Create", j.m.f41701U, true);
    public static final EnumStereoRenameFromPage GROUP_SETTING = new EnumStereoRenameFromPage("GROUP_SETTING", 1, 2, "Group Setting", j.m.w5, true);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final EnumStereoRenameFromPage a(int i4) {
            EnumStereoRenameFromPage enumStereoRenameFromPage = EnumStereoRenameFromPage.STEREO_CREATE;
            if (i4 != enumStereoRenameFromPage.i()) {
                EnumStereoRenameFromPage enumStereoRenameFromPage2 = EnumStereoRenameFromPage.GROUP_SETTING;
                enumStereoRenameFromPage2.i();
                return enumStereoRenameFromPage2;
            }
            return enumStereoRenameFromPage;
        }

        private a() {
        }
    }

    static {
        EnumStereoRenameFromPage[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
        Companion = new a(null);
    }

    private EnumStereoRenameFromPage(String str, int i4, @c0 int i5, String str2, int i6, boolean z3) {
        this.intValue = i5;
        this.desc = str2;
        this.titleRes = i6;
        this.backIconVisible = z3;
    }

    private static final /* synthetic */ EnumStereoRenameFromPage[] b() {
        return new EnumStereoRenameFromPage[]{STEREO_CREATE, GROUP_SETTING};
    }

    @d
    public static kotlin.enums.a<EnumStereoRenameFromPage> g() {
        return $ENTRIES;
    }

    public static EnumStereoRenameFromPage valueOf(String str) {
        return (EnumStereoRenameFromPage) Enum.valueOf(EnumStereoRenameFromPage.class, str);
    }

    public static EnumStereoRenameFromPage[] values() {
        return (EnumStereoRenameFromPage[]) $VALUES.clone();
    }

    public final boolean e() {
        return this.backIconVisible;
    }

    @d
    public final String f() {
        return this.desc;
    }

    public final int i() {
        return this.intValue;
    }

    public final int j() {
        return this.titleRes;
    }
}
