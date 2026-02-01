package com.spotify.protocol.client;

import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class p {

    /* loaded from: classes2.dex */
    static class a<T> implements o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f48892a;

        a(Throwable error) {
            this.f48892a = error;
        }

        @Override // com.spotify.protocol.client.o
        public Throwable a() {
            return this.f48892a;
        }

        @Override // com.spotify.protocol.client.o
        public String b() {
            return this.f48892a.getMessage();
        }

        @Override // com.spotify.protocol.client.o
        @Nullable
        public T c() {
            return null;
        }

        @Override // com.spotify.protocol.client.o
        public boolean l() {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    static class b<T> implements o<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f48893a;

        b(T payload) {
            this.f48893a = payload;
        }

        @Override // com.spotify.protocol.client.o
        @Nullable
        public Throwable a() {
            return null;
        }

        @Override // com.spotify.protocol.client.o
        @Nullable
        public String b() {
            return null;
        }

        @Override // com.spotify.protocol.client.o
        public T c() {
            return this.f48893a;
        }

        @Override // com.spotify.protocol.client.o
        public boolean l() {
            return true;
        }
    }

    private p() {
    }

    public static <T> o<T> a(Throwable t3) {
        return new a(t3);
    }

    public static <T> o<T> b(T payload) {
        return new b(payload);
    }
}
