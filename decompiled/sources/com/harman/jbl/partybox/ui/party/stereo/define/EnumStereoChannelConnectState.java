package com.harman.jbl.partybox.ui.party.stereo.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/define/EnumStereoChannelConnectState;", "", "(Ljava/lang/String;I)V", "UNCONNECTED", "CONNECTED", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnumStereoChannelConnectState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumStereoChannelConnectState[] $VALUES;
    public static final EnumStereoChannelConnectState UNCONNECTED = new EnumStereoChannelConnectState("UNCONNECTED", 0);
    public static final EnumStereoChannelConnectState CONNECTED = new EnumStereoChannelConnectState("CONNECTED", 1);

    static {
        EnumStereoChannelConnectState[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumStereoChannelConnectState(String str, int i4) {
    }

    private static final /* synthetic */ EnumStereoChannelConnectState[] b() {
        return new EnumStereoChannelConnectState[]{UNCONNECTED, CONNECTED};
    }

    @d
    public static a<EnumStereoChannelConnectState> e() {
        return $ENTRIES;
    }

    public static EnumStereoChannelConnectState valueOf(String str) {
        return (EnumStereoChannelConnectState) Enum.valueOf(EnumStereoChannelConnectState.class, str);
    }

    public static EnumStereoChannelConnectState[] values() {
        return (EnumStereoChannelConnectState[]) $VALUES.clone();
    }
}
