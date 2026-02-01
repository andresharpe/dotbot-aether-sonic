package com.harman.jbl.partybox.ui.party.auracast.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPanelStyle;", "", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", "PLAY_MUSIC_TIPS", "DEVICE_CARD", "RECEIVER_TIPS", "SHARING_TIPS", "OTHER_DEVICES_POPUP", "NO_CONNECTABLE_DEVICE", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumPanelStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumPanelStyle[] $VALUES;

    @d
    private final String desc;
    public static final EnumPanelStyle NONE = new EnumPanelStyle("NONE", 0, "None");
    public static final EnumPanelStyle PLAY_MUSIC_TIPS = new EnumPanelStyle("PLAY_MUSIC_TIPS", 1, "Play Music Tips");
    public static final EnumPanelStyle DEVICE_CARD = new EnumPanelStyle("DEVICE_CARD", 2, "Device Card");
    public static final EnumPanelStyle RECEIVER_TIPS = new EnumPanelStyle("RECEIVER_TIPS", 3, "Receiver Tips");
    public static final EnumPanelStyle SHARING_TIPS = new EnumPanelStyle("SHARING_TIPS", 4, "Sharing Tips");
    public static final EnumPanelStyle OTHER_DEVICES_POPUP = new EnumPanelStyle("OTHER_DEVICES_POPUP", 5, "Other Devices PopUp");
    public static final EnumPanelStyle NO_CONNECTABLE_DEVICE = new EnumPanelStyle("NO_CONNECTABLE_DEVICE", 6, "No Connectable Device");

    static {
        EnumPanelStyle[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumPanelStyle(String str, int i4, String str2) {
        this.desc = str2;
    }

    private static final /* synthetic */ EnumPanelStyle[] b() {
        return new EnumPanelStyle[]{NONE, PLAY_MUSIC_TIPS, DEVICE_CARD, RECEIVER_TIPS, SHARING_TIPS, OTHER_DEVICES_POPUP, NO_CONNECTABLE_DEVICE};
    }

    @d
    public static a<EnumPanelStyle> f() {
        return $ENTRIES;
    }

    public static EnumPanelStyle valueOf(String str) {
        return (EnumPanelStyle) Enum.valueOf(EnumPanelStyle.class, str);
    }

    public static EnumPanelStyle[] values() {
        return (EnumPanelStyle[]) $VALUES.clone();
    }

    @d
    public final String e() {
        return this.desc;
    }
}
