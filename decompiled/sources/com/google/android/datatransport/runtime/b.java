package com.google.android.datatransport.runtime;

import androidx.annotation.P;
import com.google.android.datatransport.runtime.j;
import java.util.Map;

/* loaded from: classes.dex */
final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f27347a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f27348b;

    /* renamed from: c, reason: collision with root package name */
    private final i f27349c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27350d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27351e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f27352f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0254b extends j.a {

        /* renamed from: a, reason: collision with root package name */
        private String f27353a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f27354b;

        /* renamed from: c, reason: collision with root package name */
        private i f27355c;

        /* renamed from: d, reason: collision with root package name */
        private Long f27356d;

        /* renamed from: e, reason: collision with root package name */
        private Long f27357e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f27358f;

        @Override // com.google.android.datatransport.runtime.j.a
        public j d() {
            String str = "";
            if (this.f27353a == null) {
                str = " transportName";
            }
            if (this.f27355c == null) {
                str = str + " encodedPayload";
            }
            if (this.f27356d == null) {
                str = str + " eventMillis";
            }
            if (this.f27357e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f27358f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f27353a, this.f27354b, this.f27355c, this.f27356d.longValue(), this.f27357e.longValue(), this.f27358f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.j.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f27358f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.j.a
        public j.a f(Map<String, String> map) {
            if (map != null) {
                this.f27358f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a g(Integer num) {
            this.f27354b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a h(i iVar) {
            if (iVar != null) {
                this.f27355c = iVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a i(long j4) {
            this.f27356d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a j(String str) {
            if (str != null) {
                this.f27353a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public j.a k(long j4) {
            this.f27357e = Long.valueOf(j4);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.datatransport.runtime.j
    public Map<String, String> c() {
        return this.f27352f;
    }

    @Override // com.google.android.datatransport.runtime.j
    @P
    public Integer d() {
        return this.f27348b;
    }

    @Override // com.google.android.datatransport.runtime.j
    public i e() {
        return this.f27349c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f27347a.equals(jVar.l()) && ((num = this.f27348b) != null ? num.equals(jVar.d()) : jVar.d() == null) && this.f27349c.equals(jVar.e()) && this.f27350d == jVar.f() && this.f27351e == jVar.m() && this.f27352f.equals(jVar.c())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.j
    public long f() {
        return this.f27350d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f27347a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f27348b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f27349c.hashCode()) * 1000003;
        long j4 = this.f27350d;
        int i4 = (hashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f27351e;
        return ((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f27352f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.j
    public String l() {
        return this.f27347a;
    }

    @Override // com.google.android.datatransport.runtime.j
    public long m() {
        return this.f27351e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f27347a + ", code=" + this.f27348b + ", encodedPayload=" + this.f27349c + ", eventMillis=" + this.f27350d + ", uptimeMillis=" + this.f27351e + ", autoMetadata=" + this.f27352f + "}";
    }

    private b(String str, @P Integer num, i iVar, long j4, long j5, Map<String, String> map) {
        this.f27347a = str;
        this.f27348b = num;
        this.f27349c = iVar;
        this.f27350d = j4;
        this.f27351e = j5;
        this.f27352f = map;
    }
}
