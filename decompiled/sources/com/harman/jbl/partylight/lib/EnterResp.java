package com.harman.jbl.partylight.lib;

import kotlin.E;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public final class EnterResp {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f46205a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final EnterError f46206b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/harman/jbl/partylight/lib/EnterResp$EnterError;", "", "", "errMsg", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CONNECT_FAIL", "NOT_INIT", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class EnterError {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EnterError[] $VALUES;
        public static final EnterError CONNECT_FAIL = new EnterError("CONNECT_FAIL", 0, "connect failed");
        public static final EnterError NOT_INIT = new EnterError("NOT_INIT", 1, "not init");

        @l3.d
        private final String errMsg;

        static {
            EnterError[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private EnterError(String str, int i4, String str2) {
            this.errMsg = str2;
        }

        private static final /* synthetic */ EnterError[] b() {
            return new EnterError[]{CONNECT_FAIL, NOT_INIT};
        }

        @l3.d
        public static kotlin.enums.a<EnterError> e() {
            return $ENTRIES;
        }

        public static EnterError valueOf(String str) {
            return (EnterError) Enum.valueOf(EnterError.class, str);
        }

        public static EnterError[] values() {
            return (EnterError[]) $VALUES.clone();
        }

        @l3.d
        public final String f() {
            return this.errMsg;
        }
    }

    public EnterResp(boolean z3, @l3.e EnterError enterError) {
        this.f46205a = z3;
        this.f46206b = enterError;
    }

    public static /* synthetic */ EnterResp d(EnterResp enterResp, boolean z3, EnterError enterError, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = enterResp.f46205a;
        }
        if ((i4 & 2) != 0) {
            enterError = enterResp.f46206b;
        }
        return enterResp.c(z3, enterError);
    }

    public final boolean a() {
        return this.f46205a;
    }

    @l3.e
    public final EnterError b() {
        return this.f46206b;
    }

    @l3.d
    public final EnterResp c(boolean z3, @l3.e EnterError enterError) {
        return new EnterResp(z3, enterError);
    }

    @l3.e
    public final EnterError e() {
        return this.f46206b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterResp)) {
            return false;
        }
        EnterResp enterResp = (EnterResp) obj;
        return this.f46205a == enterResp.f46205a && this.f46206b == enterResp.f46206b;
    }

    public final boolean f() {
        return this.f46205a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z3 = this.f46205a;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        EnterError enterError = this.f46206b;
        return i4 + (enterError == null ? 0 : enterError.hashCode());
    }

    @l3.d
    public String toString() {
        return "EnterResp(isOk=" + this.f46205a + ", error=" + this.f46206b + ")";
    }

    public /* synthetic */ EnterResp(boolean z3, EnterError enterError, int i4, C2197u c2197u) {
        this(z3, (i4 & 2) != 0 ? null : enterError);
    }
}
