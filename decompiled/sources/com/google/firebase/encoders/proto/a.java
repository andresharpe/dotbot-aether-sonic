package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f35932a;

    /* renamed from: b, reason: collision with root package name */
    private Protobuf.IntEncoding f35933b = Protobuf.IntEncoding.DEFAULT;

    /* renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0333a implements Protobuf {

        /* renamed from: T0, reason: collision with root package name */
        private final int f35934T0;

        /* renamed from: U0, reason: collision with root package name */
        private final Protobuf.IntEncoding f35935U0;

        C0333a(int i4, Protobuf.IntEncoding intEncoding) {
            this.f35934T0 = i4;
            this.f35935U0 = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.f35934T0 == protobuf.tag() && this.f35935U0.equals(protobuf.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f35934T0) + (this.f35935U0.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.f35935U0;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.f35934T0;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f35934T0 + "intEncoding=" + this.f35935U0 + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public Protobuf a() {
        return new C0333a(this.f35932a, this.f35933b);
    }

    public a c(Protobuf.IntEncoding intEncoding) {
        this.f35933b = intEncoding;
        return this;
    }

    public a d(int i4) {
        this.f35932a = i4;
        return this;
    }
}
