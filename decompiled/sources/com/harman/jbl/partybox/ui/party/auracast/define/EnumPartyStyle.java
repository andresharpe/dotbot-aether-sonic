package com.harman.jbl.partybox.ui.party.auracast.define;

import kotlin.E;
import kotlin.enums.a;
import kotlin.enums.c;
import l3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/define/EnumPartyStyle;", "", "", "desc", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "", "outsideReceiverCount", "I", "g", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "NO_BROADCASTER", "BROADCASTER", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumPartyStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EnumPartyStyle[] $VALUES;

    @d
    private final String desc;
    private final int outsideReceiverCount;
    public static final EnumPartyStyle NO_BROADCASTER = new EnumPartyStyle("NO_BROADCASTER", 0, "No_Broadcaster", 5);
    public static final EnumPartyStyle BROADCASTER = new EnumPartyStyle("BROADCASTER", 1, "Broadcaster", 4);

    static {
        EnumPartyStyle[] b4 = b();
        $VALUES = b4;
        $ENTRIES = c.c(b4);
    }

    private EnumPartyStyle(String str, int i4, String str2, int i5) {
        this.desc = str2;
        this.outsideReceiverCount = i5;
    }

    private static final /* synthetic */ EnumPartyStyle[] b() {
        return new EnumPartyStyle[]{NO_BROADCASTER, BROADCASTER};
    }

    @d
    public static a<EnumPartyStyle> f() {
        return $ENTRIES;
    }

    public static EnumPartyStyle valueOf(String str) {
        return (EnumPartyStyle) Enum.valueOf(EnumPartyStyle.class, str);
    }

    public static EnumPartyStyle[] values() {
        return (EnumPartyStyle[]) $VALUES.clone();
    }

    @d
    public final String e() {
        return this.desc;
    }

    public final int g() {
        return this.outsideReceiverCount;
    }
}
