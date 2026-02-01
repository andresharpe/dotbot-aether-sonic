package com.harman.jbl.cd_biz_comm.wireless_tech.blecommander;

import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class WriteResp<R> {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final R f38057a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38058b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final Error f38059c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final String f38060d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private final com.harman.jbl.cd_biz_comm.wireless_tech.g f38061e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/wireless_tech/blecommander/WriteResp$Error;", "", "(Ljava/lang/String;I)V", "TIMEOUT", "WRITE_ERROR", "NOT_CONNECTED", "PARSE_ERROR", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Error {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;
        public static final Error TIMEOUT = new Error("TIMEOUT", 0);
        public static final Error WRITE_ERROR = new Error("WRITE_ERROR", 1);
        public static final Error NOT_CONNECTED = new Error("NOT_CONNECTED", 2);
        public static final Error PARSE_ERROR = new Error("PARSE_ERROR", 3);

        static {
            Error[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Error(String str, int i4) {
        }

        private static final /* synthetic */ Error[] b() {
            return new Error[]{TIMEOUT, WRITE_ERROR, NOT_CONNECTED, PARSE_ERROR};
        }

        @l3.d
        public static kotlin.enums.a<Error> e() {
            return $ENTRIES;
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    public WriteResp() {
        this(null, false, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WriteResp g(WriteResp writeResp, Object obj, boolean z3, Error error, String str, com.harman.jbl.cd_biz_comm.wireless_tech.g gVar, int i4, Object obj2) {
        R r4 = obj;
        if ((i4 & 1) != 0) {
            r4 = writeResp.f38057a;
        }
        if ((i4 & 2) != 0) {
            z3 = writeResp.f38058b;
        }
        boolean z4 = z3;
        if ((i4 & 4) != 0) {
            error = writeResp.f38059c;
        }
        Error error2 = error;
        if ((i4 & 8) != 0) {
            str = writeResp.f38060d;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            gVar = writeResp.f38061e;
        }
        return writeResp.f(r4, z4, error2, str2, gVar);
    }

    @l3.e
    public final R a() {
        return this.f38057a;
    }

    public final boolean b() {
        return this.f38058b;
    }

    @l3.e
    public final Error c() {
        return this.f38059c;
    }

    @l3.e
    public final String d() {
        return this.f38060d;
    }

    @l3.e
    public final com.harman.jbl.cd_biz_comm.wireless_tech.g e() {
        return this.f38061e;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteResp)) {
            return false;
        }
        WriteResp writeResp = (WriteResp) obj;
        return F.g(this.f38057a, writeResp.f38057a) && this.f38058b == writeResp.f38058b && this.f38059c == writeResp.f38059c && F.g(this.f38060d, writeResp.f38060d) && F.g(this.f38061e, writeResp.f38061e);
    }

    @l3.d
    public final WriteResp<R> f(@l3.e R r4, boolean z3, @l3.e Error error, @l3.e String str, @l3.e com.harman.jbl.cd_biz_comm.wireless_tech.g gVar) {
        return new WriteResp<>(r4, z3, error, str, gVar);
    }

    @l3.e
    public final String h() {
        return this.f38060d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        R r4 = this.f38057a;
        int hashCode = (r4 == null ? 0 : r4.hashCode()) * 31;
        boolean z3 = this.f38058b;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        Error error = this.f38059c;
        int hashCode2 = (i5 + (error == null ? 0 : error.hashCode())) * 31;
        String str = this.f38060d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.harman.jbl.cd_biz_comm.wireless_tech.g gVar = this.f38061e;
        return hashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    @l3.e
    public final Error i() {
        return this.f38059c;
    }

    @l3.e
    public final com.harman.jbl.cd_biz_comm.wireless_tech.g j() {
        return this.f38061e;
    }

    @l3.e
    public final R k() {
        return this.f38057a;
    }

    public final boolean l() {
        return this.f38058b;
    }

    @l3.d
    public String toString() {
        return "isOk: " + this.f38058b + " ; bean: " + this.f38057a + " ; error: " + this.f38059c + " ; errMsg: " + this.f38060d;
    }

    public WriteResp(@l3.e R r4, boolean z3, @l3.e Error error, @l3.e String str, @l3.e com.harman.jbl.cd_biz_comm.wireless_tech.g gVar) {
        this.f38057a = r4;
        this.f38058b = z3;
        this.f38059c = error;
        this.f38060d = str;
        this.f38061e = gVar;
    }

    public /* synthetic */ WriteResp(Object obj, boolean z3, Error error, String str, com.harman.jbl.cd_biz_comm.wireless_tech.g gVar, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : obj, (i4 & 2) != 0 ? false : z3, (i4 & 4) != 0 ? null : error, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : gVar);
    }
}
