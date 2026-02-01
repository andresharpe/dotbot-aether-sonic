package com.airbnb.lottie;

import androidx.annotation.N;
import androidx.annotation.P;
import java.io.File;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    @P
    final com.airbnb.lottie.network.e f21472a;

    /* renamed from: b, reason: collision with root package name */
    @P
    final com.airbnb.lottie.network.d f21473b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f21474c;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        private com.airbnb.lottie.network.e f21475a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private com.airbnb.lottie.network.d f21476b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21477c = false;

        /* loaded from: classes.dex */
        class a implements com.airbnb.lottie.network.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f21478a;

            a(File file) {
                this.f21478a = file;
            }

            @Override // com.airbnb.lottie.network.d
            @N
            public File a() {
                if (this.f21478a.isDirectory()) {
                    return this.f21478a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* renamed from: com.airbnb.lottie.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0198b implements com.airbnb.lottie.network.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.airbnb.lottie.network.d f21480a;

            C0198b(com.airbnb.lottie.network.d dVar) {
                this.f21480a = dVar;
            }

            @Override // com.airbnb.lottie.network.d
            @N
            public File a() {
                File a4 = this.f21480a.a();
                if (a4.isDirectory()) {
                    return a4;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @N
        public i a() {
            return new i(this.f21475a, this.f21476b, this.f21477c);
        }

        @N
        public b b(boolean z3) {
            this.f21477c = z3;
            return this;
        }

        @N
        public b c(@N File file) {
            if (this.f21476b == null) {
                this.f21476b = new a(file);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @N
        public b d(@N com.airbnb.lottie.network.d dVar) {
            if (this.f21476b == null) {
                this.f21476b = new C0198b(dVar);
                return this;
            }
            throw new IllegalStateException("There is already a cache provider!");
        }

        @N
        public b e(@N com.airbnb.lottie.network.e eVar) {
            this.f21475a = eVar;
            return this;
        }
    }

    private i(@P com.airbnb.lottie.network.e eVar, @P com.airbnb.lottie.network.d dVar, boolean z3) {
        this.f21472a = eVar;
        this.f21473b = dVar;
        this.f21474c = z3;
    }
}
