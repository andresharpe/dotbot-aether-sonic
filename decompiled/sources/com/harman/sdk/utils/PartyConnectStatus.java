package com.harman.sdk.utils;

import android.text.TextUtils;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/harman/sdk/utils/PartyConnectStatus;", "", "", "toString", "()Ljava/lang/String;", "", "value", "I", "j", "()I", "channelName", "Ljava/lang/String;", "f", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "UNKNOWN", "PARTY_CONNECT_OFF", "PARTY_CONNECT_WIRELESS_CONNECTING", "PARTY_CONNECT_WIRELESS_CONNECTED", "PARTY_CONNECT_WIRED", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyConnectStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PartyConnectStatus[] $VALUES;

    @l3.d
    public static final a Companion;

    @l3.d
    private final String channelName;
    private final int value;
    public static final PartyConnectStatus UNKNOWN = new PartyConnectStatus("UNKNOWN", 0, -1, "UNKNOWN");
    public static final PartyConnectStatus PARTY_CONNECT_OFF = new PartyConnectStatus("PARTY_CONNECT_OFF", 1, 0, "PARTY_CONNECT_OFF");
    public static final PartyConnectStatus PARTY_CONNECT_WIRELESS_CONNECTING = new PartyConnectStatus("PARTY_CONNECT_WIRELESS_CONNECTING", 2, 1, "PARTY_CONNECT_WIRELESS_CONNECTING");
    public static final PartyConnectStatus PARTY_CONNECT_WIRELESS_CONNECTED = new PartyConnectStatus("PARTY_CONNECT_WIRELESS_CONNECTED", 3, 2, "PARTY_CONNECT_WIRELESS_CONNECTED");
    public static final PartyConnectStatus PARTY_CONNECT_WIRED = new PartyConnectStatus("PARTY_CONNECT_WIRED", 4, 3, "PARTY_CONNECT_WIRED");

    @U({"SMAP\nPartyConnectStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyConnectStatus.kt\ncom/harman/sdk/utils/PartyConnectStatus$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final PartyConnectStatus a(int i4) {
            PartyConnectStatus partyConnectStatus;
            PartyConnectStatus[] values = PartyConnectStatus.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    partyConnectStatus = values[i5];
                    if (partyConnectStatus.j() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    partyConnectStatus = null;
                    break;
                }
            }
            if (partyConnectStatus == null) {
                return PartyConnectStatus.UNKNOWN;
            }
            return partyConnectStatus;
        }

        @W2.n
        @l3.d
        public final PartyConnectStatus b(@l3.e String str) {
            int a4;
            if (str != null && !TextUtils.isEmpty(str)) {
                a4 = C2220b.a(16);
                return a(Integer.parseInt(str, a4));
            }
            return PartyConnectStatus.UNKNOWN;
        }

        private a() {
        }
    }

    static {
        PartyConnectStatus[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private PartyConnectStatus(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.channelName = str2;
    }

    private static final /* synthetic */ PartyConnectStatus[] b() {
        return new PartyConnectStatus[]{UNKNOWN, PARTY_CONNECT_OFF, PARTY_CONNECT_WIRELESS_CONNECTING, PARTY_CONNECT_WIRELESS_CONNECTED, PARTY_CONNECT_WIRED};
    }

    @W2.n
    @l3.d
    public static final PartyConnectStatus e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<PartyConnectStatus> g() {
        return $ENTRIES;
    }

    @W2.n
    @l3.d
    public static final PartyConnectStatus i(@l3.e String str) {
        return Companion.b(str);
    }

    public static PartyConnectStatus valueOf(String str) {
        return (PartyConnectStatus) Enum.valueOf(PartyConnectStatus.class, str);
    }

    public static PartyConnectStatus[] values() {
        return (PartyConnectStatus[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.channelName;
    }

    public final int j() {
        return this.value;
    }

    @Override // java.lang.Enum
    @l3.d
    public String toString() {
        return "PartyConnectStatus{value=" + this.value + ", name='" + this.channelName + "'}";
    }
}
