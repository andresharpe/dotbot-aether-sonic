package com.harman.sdk.utils;

import android.text.TextUtils;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/harman/sdk/utils/AuracastSupport;", "", "", "value", "I", "j", "()I", "", "desc", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "DONT_SUPPORT", "SUPPORT", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AuracastSupport {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ AuracastSupport[] $VALUES;

    @l3.d
    public static final a Companion;
    public static final AuracastSupport DONT_SUPPORT = new AuracastSupport("DONT_SUPPORT", 0, 0, "Don't support Auracast");
    public static final AuracastSupport SUPPORT = new AuracastSupport("SUPPORT", 1, 1, "Support Auracast");

    @l3.d
    private final String desc;
    private final int value;

    @U({"SMAP\nAuracastStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastStatus.kt\ncom/harman/sdk/utils/AuracastSupport$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final AuracastSupport a(int i4) {
            AuracastSupport auracastSupport;
            AuracastSupport[] values = AuracastSupport.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    auracastSupport = values[i5];
                    if (auracastSupport.j() == i4) {
                        break;
                    }
                    i5++;
                } else {
                    auracastSupport = null;
                    break;
                }
            }
            if (auracastSupport == null) {
                return AuracastSupport.DONT_SUPPORT;
            }
            return auracastSupport;
        }

        @W2.n
        @l3.d
        public final AuracastSupport b(@l3.e String str) {
            int a4;
            if (str != null && !TextUtils.isEmpty(str)) {
                a4 = C2220b.a(16);
                return a(Integer.parseInt(str, a4));
            }
            return AuracastSupport.DONT_SUPPORT;
        }

        private a() {
        }
    }

    static {
        AuracastSupport[] b4 = b();
        $VALUES = b4;
        $ENTRIES = kotlin.enums.c.c(b4);
        Companion = new a(null);
    }

    private AuracastSupport(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.desc = str2;
    }

    private static final /* synthetic */ AuracastSupport[] b() {
        return new AuracastSupport[]{DONT_SUPPORT, SUPPORT};
    }

    @W2.n
    @l3.d
    public static final AuracastSupport e(int i4) {
        return Companion.a(i4);
    }

    @l3.d
    public static kotlin.enums.a<AuracastSupport> g() {
        return $ENTRIES;
    }

    @W2.n
    @l3.d
    public static final AuracastSupport i(@l3.e String str) {
        return Companion.b(str);
    }

    public static AuracastSupport valueOf(String str) {
        return (AuracastSupport) Enum.valueOf(AuracastSupport.class, str);
    }

    public static AuracastSupport[] values() {
        return (AuracastSupport[]) $VALUES.clone();
    }

    @l3.d
    public final String f() {
        return this.desc;
    }

    public final int j() {
        return this.value;
    }
}
