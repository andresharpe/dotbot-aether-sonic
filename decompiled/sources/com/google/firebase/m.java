package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.util.B;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    private static final String f36363h = "google_api_key";

    /* renamed from: i, reason: collision with root package name */
    private static final String f36364i = "google_app_id";

    /* renamed from: j, reason: collision with root package name */
    private static final String f36365j = "firebase_database_url";

    /* renamed from: k, reason: collision with root package name */
    private static final String f36366k = "ga_trackingId";

    /* renamed from: l, reason: collision with root package name */
    private static final String f36367l = "gcm_defaultSenderId";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36368m = "google_storage_bucket";

    /* renamed from: n, reason: collision with root package name */
    private static final String f36369n = "project_id";

    /* renamed from: a, reason: collision with root package name */
    private final String f36370a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36371b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36372c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36373d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36374e;

    /* renamed from: f, reason: collision with root package name */
    private final String f36375f;

    /* renamed from: g, reason: collision with root package name */
    private final String f36376g;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f36377a;

        /* renamed from: b, reason: collision with root package name */
        private String f36378b;

        /* renamed from: c, reason: collision with root package name */
        private String f36379c;

        /* renamed from: d, reason: collision with root package name */
        private String f36380d;

        /* renamed from: e, reason: collision with root package name */
        private String f36381e;

        /* renamed from: f, reason: collision with root package name */
        private String f36382f;

        /* renamed from: g, reason: collision with root package name */
        private String f36383g;

        public b() {
        }

        @N
        public m a() {
            return new m(this.f36378b, this.f36377a, this.f36379c, this.f36380d, this.f36381e, this.f36382f, this.f36383g);
        }

        @N
        public b b(@N String str) {
            this.f36377a = C1285y.i(str, "ApiKey must be set.");
            return this;
        }

        @N
        public b c(@N String str) {
            this.f36378b = C1285y.i(str, "ApplicationId must be set.");
            return this;
        }

        @N
        public b d(@P String str) {
            this.f36379c = str;
            return this;
        }

        @I0.a
        @N
        public b e(@P String str) {
            this.f36380d = str;
            return this;
        }

        @N
        public b f(@P String str) {
            this.f36381e = str;
            return this;
        }

        @N
        public b g(@P String str) {
            this.f36383g = str;
            return this;
        }

        @N
        public b h(@P String str) {
            this.f36382f = str;
            return this;
        }

        public b(@N m mVar) {
            this.f36378b = mVar.f36371b;
            this.f36377a = mVar.f36370a;
            this.f36379c = mVar.f36372c;
            this.f36380d = mVar.f36373d;
            this.f36381e = mVar.f36374e;
            this.f36382f = mVar.f36375f;
            this.f36383g = mVar.f36376g;
        }
    }

    @P
    public static m h(@N Context context) {
        E e4 = new E(context);
        String a4 = e4.a(f36364i);
        if (TextUtils.isEmpty(a4)) {
            return null;
        }
        return new m(a4, e4.a(f36363h), e4.a(f36365j), e4.a(f36366k), e4.a(f36367l), e4.a(f36368m), e4.a(f36369n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!C1281w.b(this.f36371b, mVar.f36371b) || !C1281w.b(this.f36370a, mVar.f36370a) || !C1281w.b(this.f36372c, mVar.f36372c) || !C1281w.b(this.f36373d, mVar.f36373d) || !C1281w.b(this.f36374e, mVar.f36374e) || !C1281w.b(this.f36375f, mVar.f36375f) || !C1281w.b(this.f36376g, mVar.f36376g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C1281w.c(this.f36371b, this.f36370a, this.f36372c, this.f36373d, this.f36374e, this.f36375f, this.f36376g);
    }

    @N
    public String i() {
        return this.f36370a;
    }

    @N
    public String j() {
        return this.f36371b;
    }

    @P
    public String k() {
        return this.f36372c;
    }

    @P
    @I0.a
    public String l() {
        return this.f36373d;
    }

    @P
    public String m() {
        return this.f36374e;
    }

    @P
    public String n() {
        return this.f36376g;
    }

    @P
    public String o() {
        return this.f36375f;
    }

    public String toString() {
        return C1281w.d(this).a("applicationId", this.f36371b).a("apiKey", this.f36370a).a("databaseUrl", this.f36372c).a("gcmSenderId", this.f36374e).a("storageBucket", this.f36375f).a("projectId", this.f36376g).toString();
    }

    private m(@N String str, @N String str2, @P String str3, @P String str4, @P String str5, @P String str6, @P String str7) {
        C1285y.s(!B.b(str), "ApplicationId must be set.");
        this.f36371b = str;
        this.f36370a = str2;
        this.f36372c = str3;
        this.f36373d = str4;
        this.f36374e = str5;
        this.f36375f = str6;
        this.f36376g = str7;
    }
}
