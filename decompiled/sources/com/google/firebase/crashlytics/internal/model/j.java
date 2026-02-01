package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes2.dex */
final class j extends CrashlyticsReport.f.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f35477a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35478b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35479c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35480d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35481e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35482f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35483g;

    /* renamed from: h, reason: collision with root package name */
    private final String f35484h;

    /* renamed from: i, reason: collision with root package name */
    private final String f35485i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends CrashlyticsReport.f.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f35486a;

        /* renamed from: b, reason: collision with root package name */
        private String f35487b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f35488c;

        /* renamed from: d, reason: collision with root package name */
        private Long f35489d;

        /* renamed from: e, reason: collision with root package name */
        private Long f35490e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f35491f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f35492g;

        /* renamed from: h, reason: collision with root package name */
        private String f35493h;

        /* renamed from: i, reason: collision with root package name */
        private String f35494i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c a() {
            String str = "";
            if (this.f35486a == null) {
                str = " arch";
            }
            if (this.f35487b == null) {
                str = str + " model";
            }
            if (this.f35488c == null) {
                str = str + " cores";
            }
            if (this.f35489d == null) {
                str = str + " ram";
            }
            if (this.f35490e == null) {
                str = str + " diskSpace";
            }
            if (this.f35491f == null) {
                str = str + " simulator";
            }
            if (this.f35492g == null) {
                str = str + " state";
            }
            if (this.f35493h == null) {
                str = str + " manufacturer";
            }
            if (this.f35494i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new j(this.f35486a.intValue(), this.f35487b, this.f35488c.intValue(), this.f35489d.longValue(), this.f35490e.longValue(), this.f35491f.booleanValue(), this.f35492g.intValue(), this.f35493h, this.f35494i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a b(int i4) {
            this.f35486a = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a c(int i4) {
            this.f35488c = Integer.valueOf(i4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a d(long j4) {
            this.f35490e = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a e(String str) {
            if (str != null) {
                this.f35493h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a f(String str) {
            if (str != null) {
                this.f35487b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a g(String str) {
            if (str != null) {
                this.f35494i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a h(long j4) {
            this.f35489d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a i(boolean z3) {
            this.f35491f = Boolean.valueOf(z3);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c.a
        public CrashlyticsReport.f.c.a j(int i4) {
            this.f35492g = Integer.valueOf(i4);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public int b() {
        return this.f35477a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public int c() {
        return this.f35479c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public long d() {
        return this.f35481e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public String e() {
        return this.f35484h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.f.c)) {
            return false;
        }
        CrashlyticsReport.f.c cVar = (CrashlyticsReport.f.c) obj;
        if (this.f35477a == cVar.b() && this.f35478b.equals(cVar.f()) && this.f35479c == cVar.c() && this.f35480d == cVar.h() && this.f35481e == cVar.d() && this.f35482f == cVar.j() && this.f35483g == cVar.i() && this.f35484h.equals(cVar.e()) && this.f35485i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public String f() {
        return this.f35478b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    @N
    public String g() {
        return this.f35485i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public long h() {
        return this.f35480d;
    }

    public int hashCode() {
        int i4;
        int hashCode = (((((this.f35477a ^ 1000003) * 1000003) ^ this.f35478b.hashCode()) * 1000003) ^ this.f35479c) * 1000003;
        long j4 = this.f35480d;
        int i5 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f35481e;
        int i6 = (i5 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        if (this.f35482f) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((((((i6 ^ i4) * 1000003) ^ this.f35483g) * 1000003) ^ this.f35484h.hashCode()) * 1000003) ^ this.f35485i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public int i() {
        return this.f35483g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.f.c
    public boolean j() {
        return this.f35482f;
    }

    public String toString() {
        return "Device{arch=" + this.f35477a + ", model=" + this.f35478b + ", cores=" + this.f35479c + ", ram=" + this.f35480d + ", diskSpace=" + this.f35481e + ", simulator=" + this.f35482f + ", state=" + this.f35483g + ", manufacturer=" + this.f35484h + ", modelClass=" + this.f35485i + "}";
    }

    private j(int i4, String str, int i5, long j4, long j5, boolean z3, int i6, String str2, String str3) {
        this.f35477a = i4;
        this.f35478b = str;
        this.f35479c = i5;
        this.f35480d = j4;
        this.f35481e = j5;
        this.f35482f = z3;
        this.f35483g = i6;
        this.f35484h = str2;
        this.f35485i = str3;
    }
}
