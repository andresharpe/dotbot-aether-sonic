package com.harman.jbl.partybox.ui.party.auracast.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumSelectDeviceTip;", "", "(Ljava/lang/String;I)V", "NOT_COMPATIBLE_PARTY", "SPEAKER_IN_OTHER_PARTY", "SPEAKER_NOT_BT_CONNECTED", "PARTY_ONLY_SUPPORT_TWO_SPEAKERS", "START_NEW_PARTY", "DEVICE_IN_DAISY_CHAIN", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnumSelectDeviceTip {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumSelectDeviceTip[] $VALUES;
    public static final EnumSelectDeviceTip NOT_COMPATIBLE_PARTY = new EnumSelectDeviceTip("NOT_COMPATIBLE_PARTY", 0);
    public static final EnumSelectDeviceTip SPEAKER_IN_OTHER_PARTY = new EnumSelectDeviceTip("SPEAKER_IN_OTHER_PARTY", 1);
    public static final EnumSelectDeviceTip SPEAKER_NOT_BT_CONNECTED = new EnumSelectDeviceTip("SPEAKER_NOT_BT_CONNECTED", 2);
    public static final EnumSelectDeviceTip PARTY_ONLY_SUPPORT_TWO_SPEAKERS = new EnumSelectDeviceTip("PARTY_ONLY_SUPPORT_TWO_SPEAKERS", 3);
    public static final EnumSelectDeviceTip START_NEW_PARTY = new EnumSelectDeviceTip("START_NEW_PARTY", 4);
    public static final EnumSelectDeviceTip DEVICE_IN_DAISY_CHAIN = new EnumSelectDeviceTip("DEVICE_IN_DAISY_CHAIN", 5);

    static {
        EnumSelectDeviceTip[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumSelectDeviceTip(String str, int i4) {
    }

    private static final /* synthetic */ EnumSelectDeviceTip[] b() {
        return new EnumSelectDeviceTip[]{NOT_COMPATIBLE_PARTY, SPEAKER_IN_OTHER_PARTY, SPEAKER_NOT_BT_CONNECTED, PARTY_ONLY_SUPPORT_TWO_SPEAKERS, START_NEW_PARTY, DEVICE_IN_DAISY_CHAIN};
    }

    @d
    public static a<EnumSelectDeviceTip> e() {
        return $ENTRIES;
    }

    public static EnumSelectDeviceTip valueOf(String str) {
        return (EnumSelectDeviceTip) Enum.valueOf(EnumSelectDeviceTip.class, str);
    }

    public static EnumSelectDeviceTip[] values() {
        return (EnumSelectDeviceTip[]) $VALUES.clone();
    }
}
