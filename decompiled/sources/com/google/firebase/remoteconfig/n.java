package com.google.firebase.remoteconfig;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final long f37546a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37547b;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f37548a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f37549b = com.google.firebase.remoteconfig.internal.k.f37443j;

        @N
        public n c() {
            return new n(this);
        }

        public long d() {
            return this.f37548a;
        }

        public long e() {
            return this.f37549b;
        }

        @N
        public b f(long j4) throws IllegalArgumentException {
            if (j4 >= 0) {
                this.f37548a = j4;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j4)));
        }

        @N
        public b g(long j4) {
            if (j4 >= 0) {
                this.f37549b = j4;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j4 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f37546a;
    }

    public long b() {
        return this.f37547b;
    }

    @N
    public b c() {
        b bVar = new b();
        bVar.f(a());
        bVar.g(b());
        return bVar;
    }

    private n(b bVar) {
        this.f37546a = bVar.f37548a;
        this.f37547b = bVar.f37549b;
    }
}
