package com.harman.jbl.partylight.lib.ota;

import java.nio.ByteBuffer;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class DfuStatus {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final a f47249c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Status f47250a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47251b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/harman/jbl/partylight/lib/ota/DfuStatus$Status;", "", "(Ljava/lang/String;I)V", "Error", "Ready", "Receiving", "Completed", "partylightLib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Status {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status Error = new Status("Error", 0);
        public static final Status Ready = new Status("Ready", 1);
        public static final Status Receiving = new Status("Receiving", 2);
        public static final Status Completed = new Status("Completed", 3);

        static {
            Status[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private Status(String str, int i4) {
        }

        private static final /* synthetic */ Status[] b() {
            return new Status[]{Error, Ready, Receiving, Completed};
        }

        @l3.d
        public static kotlin.enums.a<Status> e() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final DfuStatus a(@l3.d byte[] bytes) {
            Status status;
            F.p(bytes, "bytes");
            ByteBuffer wrap = ByteBuffer.wrap(bytes);
            byte b4 = wrap.get();
            if (b4 != 1) {
                if (b4 != 2) {
                    if (b4 != 3) {
                        status = Status.Error;
                    } else {
                        status = Status.Completed;
                    }
                } else {
                    status = Status.Receiving;
                }
            } else {
                status = Status.Ready;
            }
            return new DfuStatus(status, wrap.getInt());
        }

        private a() {
        }
    }

    public DfuStatus(@l3.d Status status, int i4) {
        F.p(status, "status");
        this.f47250a = status;
        this.f47251b = i4;
    }

    public static /* synthetic */ DfuStatus d(DfuStatus dfuStatus, Status status, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            status = dfuStatus.f47250a;
        }
        if ((i5 & 2) != 0) {
            i4 = dfuStatus.f47251b;
        }
        return dfuStatus.c(status, i4);
    }

    @l3.d
    public final Status a() {
        return this.f47250a;
    }

    public final int b() {
        return this.f47251b;
    }

    @l3.d
    public final DfuStatus c(@l3.d Status status, int i4) {
        F.p(status, "status");
        return new DfuStatus(status, i4);
    }

    public final int e() {
        return this.f47251b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DfuStatus)) {
            return false;
        }
        DfuStatus dfuStatus = (DfuStatus) obj;
        return this.f47250a == dfuStatus.f47250a && this.f47251b == dfuStatus.f47251b;
    }

    @l3.d
    public final Status f() {
        return this.f47250a;
    }

    public int hashCode() {
        return (this.f47250a.hashCode() * 31) + Integer.hashCode(this.f47251b);
    }

    @l3.d
    public String toString() {
        return "DfuStatus(status=" + this.f47250a + ", packageIndex=" + this.f47251b + ")";
    }
}
