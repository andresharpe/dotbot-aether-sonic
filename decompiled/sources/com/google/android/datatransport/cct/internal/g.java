package com.google.android.datatransport.cct.internal;

import androidx.annotation.P;
import com.google.android.datatransport.cct.internal.l;
import java.util.List;
import w1.InterfaceC2431a;

/* loaded from: classes.dex */
final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f27304a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27305b;

    /* renamed from: c, reason: collision with root package name */
    private final ClientInfo f27306c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f27307d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27308e;

    /* renamed from: f, reason: collision with root package name */
    private final List<k> f27309f;

    /* renamed from: g, reason: collision with root package name */
    private final QosTier f27310g;

    /* loaded from: classes.dex */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f27311a;

        /* renamed from: b, reason: collision with root package name */
        private Long f27312b;

        /* renamed from: c, reason: collision with root package name */
        private ClientInfo f27313c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f27314d;

        /* renamed from: e, reason: collision with root package name */
        private String f27315e;

        /* renamed from: f, reason: collision with root package name */
        private List<k> f27316f;

        /* renamed from: g, reason: collision with root package name */
        private QosTier f27317g;

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l a() {
            String str = "";
            if (this.f27311a == null) {
                str = " requestTimeMs";
            }
            if (this.f27312b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f27311a.longValue(), this.f27312b.longValue(), this.f27313c, this.f27314d, this.f27315e, this.f27316f, this.f27317g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a b(@P ClientInfo clientInfo) {
            this.f27313c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a c(@P List<k> list) {
            this.f27316f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        l.a d(@P Integer num) {
            this.f27314d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        l.a e(@P String str) {
            this.f27315e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a f(@P QosTier qosTier) {
            this.f27317g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a g(long j4) {
            this.f27311a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a h(long j4) {
            this.f27312b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public ClientInfo b() {
        return this.f27306c;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    @InterfaceC2431a.InterfaceC0549a(name = "logEvent")
    public List<k> c() {
        return this.f27309f;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public Integer d() {
        return this.f27307d;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public String e() {
        return this.f27308e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<k> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f27304a == lVar.g() && this.f27305b == lVar.h() && ((clientInfo = this.f27306c) != null ? clientInfo.equals(lVar.b()) : lVar.b() == null) && ((num = this.f27307d) != null ? num.equals(lVar.d()) : lVar.d() == null) && ((str = this.f27308e) != null ? str.equals(lVar.e()) : lVar.e() == null) && ((list = this.f27309f) != null ? list.equals(lVar.c()) : lVar.c() == null)) {
            QosTier qosTier = this.f27310g;
            if (qosTier == null) {
                if (lVar.f() == null) {
                    return true;
                }
            } else if (qosTier.equals(lVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public QosTier f() {
        return this.f27310g;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public long g() {
        return this.f27304a;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public long h() {
        return this.f27305b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j4 = this.f27304a;
        long j5 = this.f27305b;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        ClientInfo clientInfo = this.f27306c;
        int i5 = 0;
        if (clientInfo == null) {
            hashCode = 0;
        } else {
            hashCode = clientInfo.hashCode();
        }
        int i6 = (i4 ^ hashCode) * 1000003;
        Integer num = this.f27307d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i7 = (i6 ^ hashCode2) * 1000003;
        String str = this.f27308e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i8 = (i7 ^ hashCode3) * 1000003;
        List<k> list = this.f27309f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i9 = (i8 ^ hashCode4) * 1000003;
        QosTier qosTier = this.f27310g;
        if (qosTier != null) {
            i5 = qosTier.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f27304a + ", requestUptimeMs=" + this.f27305b + ", clientInfo=" + this.f27306c + ", logSource=" + this.f27307d + ", logSourceName=" + this.f27308e + ", logEvents=" + this.f27309f + ", qosTier=" + this.f27310g + "}";
    }

    private g(long j4, long j5, @P ClientInfo clientInfo, @P Integer num, @P String str, @P List<k> list, @P QosTier qosTier) {
        this.f27304a = j4;
        this.f27305b = j5;
        this.f27306c = clientInfo;
        this.f27307d = num;
        this.f27308e = str;
        this.f27309f = list;
        this.f27310g = qosTier;
    }
}
