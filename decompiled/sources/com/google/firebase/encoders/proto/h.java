package com.google.firebase.encoders.proto;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes2.dex */
class h implements com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35954a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35955b = false;

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.c f35956c;

    /* renamed from: d, reason: collision with root package name */
    private final e f35957d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(e eVar) {
        this.f35957d = eVar;
    }

    private void a() {
        if (!this.f35954a) {
            this.f35954a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g add(int i4) throws IOException {
        a();
        this.f35957d.r(this.f35956c, i4, this.f35955b);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(com.google.firebase.encoders.c cVar, boolean z3) {
        this.f35954a = false;
        this.f35956c = cVar;
        this.f35955b = z3;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g d(@N byte[] bArr) throws IOException {
        a();
        this.f35957d.p(this.f35956c, bArr, this.f35955b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g m(@P String str) throws IOException {
        a();
        this.f35957d.p(this.f35956c, str, this.f35955b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g n(boolean z3) throws IOException {
        a();
        this.f35957d.x(this.f35956c, z3, this.f35955b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g p(long j4) throws IOException {
        a();
        this.f35957d.v(this.f35956c, j4, this.f35955b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g q(double d4) throws IOException {
        a();
        this.f35957d.m(this.f35956c, d4, this.f35955b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public com.google.firebase.encoders.g r(float f4) throws IOException {
        a();
        this.f35957d.n(this.f35956c, f4, this.f35955b);
        return this;
    }
}
