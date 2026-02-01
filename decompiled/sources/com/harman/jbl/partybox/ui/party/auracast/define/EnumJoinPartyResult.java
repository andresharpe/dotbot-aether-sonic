package com.harman.jbl.partybox.ui.party.auracast.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumJoinPartyResult;", "", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "OK", "NON_COMPATIBLE_TO_CURRENT_PARTY", "SPEAKER_IN_OTHER_PARTY", "START_NEW_PARTY", "SPEAKER_NOT_BT_CONNECTED", "PARTY_ONLY_SUPPORT_TWO_SPEAKERS", "SPEAKER_IN_DAISY_CHAIN", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumJoinPartyResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumJoinPartyResult[] $VALUES;

    @d
    private final String desc;
    public static final EnumJoinPartyResult OK = new EnumJoinPartyResult("OK", 0, "OK");
    public static final EnumJoinPartyResult NON_COMPATIBLE_TO_CURRENT_PARTY = new EnumJoinPartyResult("NON_COMPATIBLE_TO_CURRENT_PARTY", 1, "Non-compatible to current party");
    public static final EnumJoinPartyResult SPEAKER_IN_OTHER_PARTY = new EnumJoinPartyResult("SPEAKER_IN_OTHER_PARTY", 2, "The speaker is in other party");
    public static final EnumJoinPartyResult START_NEW_PARTY = new EnumJoinPartyResult("START_NEW_PARTY", 3, "Start new party");
    public static final EnumJoinPartyResult SPEAKER_NOT_BT_CONNECTED = new EnumJoinPartyResult("SPEAKER_NOT_BT_CONNECTED", 4, "The speaker is not bt connected");
    public static final EnumJoinPartyResult PARTY_ONLY_SUPPORT_TWO_SPEAKERS = new EnumJoinPartyResult("PARTY_ONLY_SUPPORT_TWO_SPEAKERS", 5, "The party only support two speakers");
    public static final EnumJoinPartyResult SPEAKER_IN_DAISY_CHAIN = new EnumJoinPartyResult("SPEAKER_IN_DAISY_CHAIN", 6, "The speaker is in daisy chain");

    static {
        EnumJoinPartyResult[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumJoinPartyResult(String str, int i4, String str2) {
        this.desc = str2;
    }

    private static final /* synthetic */ EnumJoinPartyResult[] b() {
        return new EnumJoinPartyResult[]{OK, NON_COMPATIBLE_TO_CURRENT_PARTY, SPEAKER_IN_OTHER_PARTY, START_NEW_PARTY, SPEAKER_NOT_BT_CONNECTED, PARTY_ONLY_SUPPORT_TWO_SPEAKERS, SPEAKER_IN_DAISY_CHAIN};
    }

    @d
    public static a<EnumJoinPartyResult> f() {
        return $ENTRIES;
    }

    public static EnumJoinPartyResult valueOf(String str) {
        return (EnumJoinPartyResult) Enum.valueOf(EnumJoinPartyResult.class, str);
    }

    public static EnumJoinPartyResult[] values() {
        return (EnumJoinPartyResult[]) $VALUES.clone();
    }

    @d
    public final String e() {
        return this.desc;
    }
}
