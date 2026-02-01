package com.google.android.datatransport.runtime.backends;

import androidx.annotation.P;
import com.google.android.datatransport.runtime.backends.g;
import java.util.Arrays;

/* loaded from: classes.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<com.google.android.datatransport.runtime.j> f27359a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27360b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<com.google.android.datatransport.runtime.j> f27361a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f27362b;

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g a() {
            String str = "";
            if (this.f27361a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f27361a, this.f27362b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a b(Iterable<com.google.android.datatransport.runtime.j> iterable) {
            if (iterable != null) {
                this.f27361a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a c(@P byte[] bArr) {
            this.f27362b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public Iterable<com.google.android.datatransport.runtime.j> c() {
        return this.f27359a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    @P
    public byte[] d() {
        return this.f27360b;
    }

    public boolean equals(Object obj) {
        byte[] d4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f27359a.equals(gVar.c())) {
            byte[] bArr = this.f27360b;
            if (gVar instanceof a) {
                d4 = ((a) gVar).f27360b;
            } else {
                d4 = gVar.d();
            }
            if (Arrays.equals(bArr, d4)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27359a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27360b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f27359a + ", extras=" + Arrays.toString(this.f27360b) + "}";
    }

    private a(Iterable<com.google.android.datatransport.runtime.j> iterable, @P byte[] bArr) {
        this.f27359a = iterable;
        this.f27360b = bArr;
    }
}
