package com.google.android.datatransport.runtime;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.q;
import java.util.Arrays;

/* loaded from: classes.dex */
final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    private final String f27395a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27396b;

    /* renamed from: c, reason: collision with root package name */
    private final Priority f27397c;

    /* loaded from: classes.dex */
    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private String f27398a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f27399b;

        /* renamed from: c, reason: collision with root package name */
        private Priority f27400c;

        @Override // com.google.android.datatransport.runtime.q.a
        public q a() {
            String str = "";
            if (this.f27398a == null) {
                str = " backendName";
            }
            if (this.f27400c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f27398a, this.f27399b, this.f27400c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public q.a b(String str) {
            if (str != null) {
                this.f27398a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public q.a c(@P byte[] bArr) {
            this.f27399b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public q.a d(Priority priority) {
            if (priority != null) {
                this.f27400c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // com.google.android.datatransport.runtime.q
    public String b() {
        return this.f27395a;
    }

    @Override // com.google.android.datatransport.runtime.q
    @P
    public byte[] c() {
        return this.f27396b;
    }

    @Override // com.google.android.datatransport.runtime.q
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Priority d() {
        return this.f27397c;
    }

    public boolean equals(Object obj) {
        byte[] c4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f27395a.equals(qVar.b())) {
            byte[] bArr = this.f27396b;
            if (qVar instanceof d) {
                c4 = ((d) qVar).f27396b;
            } else {
                c4 = qVar.c();
            }
            if (Arrays.equals(bArr, c4) && this.f27397c.equals(qVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f27395a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27396b)) * 1000003) ^ this.f27397c.hashCode();
    }

    private d(String str, @P byte[] bArr, Priority priority) {
        this.f27395a = str;
        this.f27396b = bArr;
        this.f27397c = priority;
    }
}
