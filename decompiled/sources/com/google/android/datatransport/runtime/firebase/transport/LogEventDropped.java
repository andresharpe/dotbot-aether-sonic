package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes.dex */
public final class LogEventDropped {

    /* renamed from: c, reason: collision with root package name */
    private static final LogEventDropped f27447c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f27448a;

    /* renamed from: b, reason: collision with root package name */
    private final Reason f27449b;

    /* loaded from: classes.dex */
    public enum Reason implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i4) {
            this.number_ = i4;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int b() {
            return this.number_;
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27450a = 0;

        /* renamed from: b, reason: collision with root package name */
        private Reason f27451b = Reason.REASON_UNKNOWN;

        a() {
        }

        public LogEventDropped a() {
            return new LogEventDropped(this.f27450a, this.f27451b);
        }

        public a b(long j4) {
            this.f27450a = j4;
            return this;
        }

        public a c(Reason reason) {
            this.f27451b = reason;
            return this;
        }
    }

    LogEventDropped(long j4, Reason reason) {
        this.f27448a = j4;
        this.f27449b = reason;
    }

    public static LogEventDropped a() {
        return f27447c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long b() {
        return this.f27448a;
    }

    @Protobuf(tag = 3)
    public Reason c() {
        return this.f27449b;
    }
}
