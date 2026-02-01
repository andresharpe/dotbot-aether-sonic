package androidx.recyclerview.widget;

import androidx.annotation.N;

/* loaded from: classes.dex */
interface G {

    /* loaded from: classes.dex */
    public static class a implements G {

        /* renamed from: a, reason: collision with root package name */
        long f17459a = 0;

        /* renamed from: androidx.recyclerview.widget.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0165a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.collection.h<Long> f17460a = new androidx.collection.h<>();

            C0165a() {
            }

            @Override // androidx.recyclerview.widget.G.d
            public long a(long j4) {
                Long i4 = this.f17460a.i(j4);
                if (i4 == null) {
                    i4 = Long.valueOf(a.this.b());
                    this.f17460a.p(j4, i4);
                }
                return i4.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.G
        @N
        public d a() {
            return new C0165a();
        }

        long b() {
            long j4 = this.f17459a;
            this.f17459a = 1 + j4;
            return j4;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements G {

        /* renamed from: a, reason: collision with root package name */
        private final d f17462a = new a();

        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.G.d
            public long a(long j4) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.G
        @N
        public d a() {
            return this.f17462a;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements G {

        /* renamed from: a, reason: collision with root package name */
        private final d f17464a = new a();

        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.G.d
            public long a(long j4) {
                return j4;
            }
        }

        @Override // androidx.recyclerview.widget.G
        @N
        public d a() {
            return this.f17464a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        long a(long j4);
    }

    @N
    d a();
}
