package com.bumptech.glide.load.model;

import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0236b<Data> f26273a;

    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.model.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0235a implements InterfaceC0236b<ByteBuffer> {
            C0235a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0236b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0236b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<byte[], ByteBuffer> c(@N r rVar) {
            return new b(new C0235a());
        }
    }

    /* renamed from: com.bumptech.glide.load.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0236b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: E, reason: collision with root package name */
        private final byte[] f26275E;

        /* renamed from: F, reason: collision with root package name */
        private final InterfaceC0236b<Data> f26276F;

        c(byte[] bArr, InterfaceC0236b<Data> interfaceC0236b) {
            this.f26275E = bArr;
            this.f26276F = interfaceC0236b;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<Data> a() {
            return this.f26276F.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super Data> aVar) {
            aVar.f(this.f26276F.b(this.f26275E));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* loaded from: classes.dex */
        class a implements InterfaceC0236b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0236b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.b.InterfaceC0236b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<byte[], InputStream> c(@N r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0236b<Data> interfaceC0236b) {
        this.f26273a = interfaceC0236b;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N byte[] bArr, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(bArr), new c(bArr, this.f26273a));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N byte[] bArr) {
        return true;
    }
}
