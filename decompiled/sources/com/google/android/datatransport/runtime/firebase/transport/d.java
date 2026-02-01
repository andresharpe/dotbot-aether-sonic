package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static final d f27469c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f27470a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27471b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27472a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f27473b = 0;

        a() {
        }

        public d a() {
            return new d(this.f27472a, this.f27473b);
        }

        public a b(long j4) {
            this.f27472a = j4;
            return this;
        }

        public a c(long j4) {
            this.f27473b = j4;
            return this;
        }
    }

    d(long j4, long j5) {
        this.f27470a = j4;
        this.f27471b = j5;
    }

    public static d b() {
        return f27469c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long a() {
        return this.f27470a;
    }

    @Protobuf(tag = 2)
    public long c() {
        return this.f27471b;
    }
}
