package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f27474c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f27475a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27476b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f27477a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f27478b = 0;

        a() {
        }

        public e a() {
            return new e(this.f27477a, this.f27478b);
        }

        public a b(long j4) {
            this.f27478b = j4;
            return this;
        }

        public a c(long j4) {
            this.f27477a = j4;
            return this;
        }
    }

    e(long j4, long j5) {
        this.f27475a = j4;
        this.f27476b = j5;
    }

    public static e a() {
        return f27474c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 2)
    public long b() {
        return this.f27476b;
    }

    @Protobuf(tag = 1)
    public long c() {
        return this.f27475a;
    }
}
