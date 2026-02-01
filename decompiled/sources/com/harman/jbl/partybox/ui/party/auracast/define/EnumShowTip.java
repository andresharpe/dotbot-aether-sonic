package com.harman.jbl.partybox.ui.party.auracast.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumShowTip;", "", "(Ljava/lang/String;I)V", "NO_SHOW", "SHOW_PLAY_MUSIC", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnumShowTip {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumShowTip[] $VALUES;
    public static final EnumShowTip NO_SHOW = new EnumShowTip("NO_SHOW", 0);
    public static final EnumShowTip SHOW_PLAY_MUSIC = new EnumShowTip("SHOW_PLAY_MUSIC", 1);

    static {
        EnumShowTip[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumShowTip(String str, int i4) {
    }

    private static final /* synthetic */ EnumShowTip[] b() {
        return new EnumShowTip[]{NO_SHOW, SHOW_PLAY_MUSIC};
    }

    @d
    public static a<EnumShowTip> e() {
        return $ENTRIES;
    }

    public static EnumShowTip valueOf(String str) {
        return (EnumShowTip) Enum.valueOf(EnumShowTip.class, str);
    }

    public static EnumShowTip[] values() {
        return (EnumShowTip[]) $VALUES.clone();
    }
}
