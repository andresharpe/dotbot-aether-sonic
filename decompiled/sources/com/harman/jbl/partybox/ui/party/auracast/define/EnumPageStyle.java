package com.harman.jbl.partybox.ui.party.auracast.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPageStyle;", "", "(Ljava/lang/String;I)V", "GRANT_PERMISSION", "NO_PRODUCT_CONNECTED", "PARTY_TOGETHER", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnumPageStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumPageStyle[] $VALUES;
    public static final EnumPageStyle GRANT_PERMISSION = new EnumPageStyle("GRANT_PERMISSION", 0);
    public static final EnumPageStyle NO_PRODUCT_CONNECTED = new EnumPageStyle("NO_PRODUCT_CONNECTED", 1);
    public static final EnumPageStyle PARTY_TOGETHER = new EnumPageStyle("PARTY_TOGETHER", 2);

    static {
        EnumPageStyle[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumPageStyle(String str, int i4) {
    }

    private static final /* synthetic */ EnumPageStyle[] b() {
        return new EnumPageStyle[]{GRANT_PERMISSION, NO_PRODUCT_CONNECTED, PARTY_TOGETHER};
    }

    @d
    public static a<EnumPageStyle> e() {
        return $ENTRIES;
    }

    public static EnumPageStyle valueOf(String str) {
        return (EnumPageStyle) Enum.valueOf(EnumPageStyle.class, str);
    }

    public static EnumPageStyle[] values() {
        return (EnumPageStyle[]) $VALUES.clone();
    }
}
