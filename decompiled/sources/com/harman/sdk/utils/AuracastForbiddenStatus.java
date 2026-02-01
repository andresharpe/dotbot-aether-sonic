package com.harman.sdk.utils;

import android.text.TextUtils;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/harman/sdk/utils/AuracastForbiddenStatus;", "", "", "value", "I", "j", "()I", "", "desc", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "STATUS_NORMAL", "STATUS_FORBIDDEN", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuracastForbiddenStatus {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ AuracastForbiddenStatus[] $VALUES;

    @l3.d
    public static final a Companion;

    @l3.d
    private final String desc;
    private final int value;
    public static final AuracastForbiddenStatus STATUS_NORMAL = new AuracastForbiddenStatus("STATUS_NORMAL", 0, 0, "Auracast Normal");
    public static final AuracastForbiddenStatus STATUS_FORBIDDEN = new AuracastForbiddenStatus("STATUS_FORBIDDEN", 1, 1, "Auracast Forbidden");

    @U({"SMAP\nAuracastStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastStatus.kt\ncom/harman/sdk/utils/AuracastForbiddenStatus$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final AuracastForbiddenStatus a(int i4) {
            AuracastForbiddenStatus auracastForbiddenStatus;
            AuracastForbiddenStatus[] values = AuracastForbiddenStatus.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    auracastForbiddenStatus = values[i5];
                    if (auracastForbiddenStatus.j() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    auracastForbiddenStatus = null;
                    break;
                }
            }
            if (auracastForbiddenStatus == null) {
                return AuracastForbiddenStatus.STATUS_NORMAL;
            }
            return auracastForbiddenStatus;
        }

        @W2.n
        @l3.d
        public final AuracastForbiddenStatus b(@l3.e String str) {
            int a4;
            if (str != null && !TextUtils.isEmpty(str)) {
                a4 = C2220b.a(16);
                return a(Integer.parseInt(str, a4));
            }
            return AuracastForbiddenStatus.STATUS_NORMAL;
        }

        private a() {
        }
    }

    static {
        AuracastForbiddenStatus[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private AuracastForbiddenStatus(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.desc = str2;
    }

    private static final /* synthetic */ AuracastForbiddenStatus[] b() {
        return new AuracastForbiddenStatus[]{STATUS_NORMAL, STATUS_FORBIDDEN};
    }

    @W2.n
    @l3.d
    public static final AuracastForbiddenStatus e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<AuracastForbiddenStatus> g() {
        return $ENTRIES;
    }

    @W2.n
    @l3.d
    public static final AuracastForbiddenStatus i(@l3.e String str) {
        return Companion.b(str);
    }

    public static AuracastForbiddenStatus valueOf(String str) {
        return (AuracastForbiddenStatus) Enum.valueOf(AuracastForbiddenStatus.class, str);
    }

    public static AuracastForbiddenStatus[] values() {
        return (AuracastForbiddenStatus[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.desc;
    }

    public final int j() {
        return this.value;
    }
}
