package com.clj.fastble.scan;

import java.util.UUID;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private UUID[] f27116a = null;

    /* renamed from: b, reason: collision with root package name */
    private String[] f27117b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f27118c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27119d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27120e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f27121f = 10000;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private UUID[] f27122a = null;

        /* renamed from: b, reason: collision with root package name */
        private String[] f27123b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f27124c = null;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27125d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f27126e = false;

        /* renamed from: f, reason: collision with root package name */
        private long f27127f = 10000;

        void a(b bVar) {
            bVar.f27116a = this.f27122a;
            bVar.f27117b = this.f27123b;
            bVar.f27118c = this.f27124c;
            bVar.f27119d = this.f27125d;
            bVar.f27120e = this.f27126e;
            bVar.f27121f = this.f27127f;
        }

        public b b() {
            b bVar = new b();
            a(bVar);
            return bVar;
        }

        public a c(boolean z3) {
            this.f27125d = z3;
            return this;
        }

        public a d(String str) {
            this.f27124c = str;
            return this;
        }

        public a e(boolean z3, String... strArr) {
            this.f27126e = z3;
            this.f27123b = strArr;
            return this;
        }

        public a f(long j4) {
            this.f27127f = j4;
            return this;
        }

        public a g(UUID[] uuidArr) {
            this.f27122a = uuidArr;
            return this;
        }
    }

    public String g() {
        return this.f27118c;
    }

    public String[] h() {
        return this.f27117b;
    }

    public long i() {
        return this.f27121f;
    }

    public UUID[] j() {
        return this.f27116a;
    }

    public boolean k() {
        return this.f27119d;
    }

    public boolean l() {
        return this.f27120e;
    }
}
