package com.google.firebase.encoders.proto;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.remoteconfig.l;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.scheduling.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e implements com.google.firebase.encoders.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f35937f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.c f35938g = com.google.firebase.encoders.c.a("key").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final com.google.firebase.encoders.c f35939h = com.google.firebase.encoders.c.a("value").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Map.Entry<Object, Object>> f35940i = new com.google.firebase.encoders.d() { // from class: com.google.firebase.encoders.proto.d
        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.e eVar) {
            e.F((Map.Entry) obj, eVar);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f35941a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f35942b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f35943c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f35944d;

    /* renamed from: e, reason: collision with root package name */
    private final h f35945e = new h(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35946a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f35946a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35946a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35946a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(OutputStream outputStream, Map<Class<?>, com.google.firebase.encoders.d<?>> map, Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar) {
        this.f35941a = outputStream;
        this.f35942b = map;
        this.f35943c = map2;
        this.f35944d = dVar;
    }

    private <T> e A(com.google.firebase.encoders.d<T> dVar, com.google.firebase.encoders.c cVar, T t3, boolean z3) throws IOException {
        long z4 = z(dVar, t3);
        if (z3 && z4 == 0) {
            return this;
        }
        G((E(cVar) << 3) | 2);
        H(z4);
        dVar.a(t3, this);
        return this;
    }

    private <T> e B(com.google.firebase.encoders.f<T> fVar, com.google.firebase.encoders.c cVar, T t3, boolean z3) throws IOException {
        this.f35945e.b(cVar, z3);
        fVar.a(t3, this.f35945e);
        return this;
    }

    private static Protobuf D(com.google.firebase.encoders.c cVar) {
        Protobuf protobuf = (Protobuf) cVar.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int E(com.google.firebase.encoders.c cVar) {
        Protobuf protobuf = (Protobuf) cVar.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Map.Entry entry, com.google.firebase.encoders.e eVar) throws IOException {
        eVar.t(f35938g, entry.getKey());
        eVar.t(f35939h, entry.getValue());
    }

    private void G(int i4) throws IOException {
        while ((i4 & (-128)) != 0) {
            this.f35941a.write((i4 & q.f54649c) | 128);
            i4 >>>= 7;
        }
        this.f35941a.write(i4 & q.f54649c);
    }

    private void H(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.f35941a.write((((int) j4) & q.f54649c) | 128);
            j4 >>>= 7;
        }
        this.f35941a.write(((int) j4) & q.f54649c);
    }

    private static ByteBuffer y(int i4) {
        return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long z(com.google.firebase.encoders.d<T> dVar, T t3) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f35941a;
            this.f35941a = bVar;
            try {
                dVar.a(t3, this);
                this.f35941a = outputStream;
                long a4 = bVar.a();
                bVar.close();
                return a4;
            } catch (Throwable th) {
                this.f35941a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e C(@P Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        com.google.firebase.encoders.d<?> dVar = this.f35942b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e e(@N com.google.firebase.encoders.c cVar, float f4) throws IOException {
        return n(cVar, f4, true);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e f(@N com.google.firebase.encoders.c cVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e g(@N com.google.firebase.encoders.c cVar, double d4) throws IOException {
        return m(cVar, d4, true);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e h(@P Object obj) throws IOException {
        return C(obj);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e i(@N String str, boolean z3) throws IOException {
        return a(com.google.firebase.encoders.c.d(str), z3);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e j(@N String str, double d4) throws IOException {
        return g(com.google.firebase.encoders.c.d(str), d4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e k(@N String str, long j4) throws IOException {
        return b(com.google.firebase.encoders.c.d(str), j4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e l(@N String str, int i4) throws IOException {
        return c(com.google.firebase.encoders.c.d(str), i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.encoders.e m(@N com.google.firebase.encoders.c cVar, double d4, boolean z3) throws IOException {
        if (z3 && d4 == l.f37524n) {
            return this;
        }
        G((E(cVar) << 3) | 1);
        this.f35941a.write(y(8).putDouble(d4).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.encoders.e n(@N com.google.firebase.encoders.c cVar, float f4, boolean z3) throws IOException {
        if (z3 && f4 == 0.0f) {
            return this;
        }
        G((E(cVar) << 3) | 5);
        this.f35941a.write(y(4).putFloat(f4).array());
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e o(@N String str, @P Object obj) throws IOException {
        return t(com.google.firebase.encoders.c.d(str), obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.encoders.e p(@N com.google.firebase.encoders.c cVar, @P Object obj, boolean z3) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return this;
            }
            G((E(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f35937f);
            G(bytes.length);
            this.f35941a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                p(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                A(f35940i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m(cVar, ((Double) obj).doubleValue(), z3);
        }
        if (obj instanceof Float) {
            return n(cVar, ((Float) obj).floatValue(), z3);
        }
        if (obj instanceof Number) {
            return v(cVar, ((Number) obj).longValue(), z3);
        }
        if (obj instanceof Boolean) {
            return x(cVar, ((Boolean) obj).booleanValue(), z3);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return this;
            }
            G((E(cVar) << 3) | 2);
            G(bArr.length);
            this.f35941a.write(bArr);
            return this;
        }
        com.google.firebase.encoders.d<?> dVar = this.f35942b.get(obj.getClass());
        if (dVar != null) {
            return A(dVar, cVar, obj, z3);
        }
        com.google.firebase.encoders.f<?> fVar = this.f35943c.get(obj.getClass());
        if (fVar != null) {
            return B(fVar, cVar, obj, z3);
        }
        if (obj instanceof c) {
            return c(cVar, ((c) obj).b());
        }
        if (obj instanceof Enum) {
            return c(cVar, ((Enum) obj).ordinal());
        }
        return A(this.f35944d, cVar, obj, z3);
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public e c(@N com.google.firebase.encoders.c cVar, int i4) throws IOException {
        return r(cVar, i4, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e r(@N com.google.firebase.encoders.c cVar, int i4, boolean z3) throws IOException {
        if (z3 && i4 == 0) {
            return this;
        }
        Protobuf D3 = D(cVar);
        int i5 = a.f35946a[D3.intEncoding().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    G((D3.tag() << 3) | 5);
                    this.f35941a.write(y(4).putInt(i4).array());
                }
            } else {
                G(D3.tag() << 3);
                G((i4 << 1) ^ (i4 >> 31));
            }
        } else {
            G(D3.tag() << 3);
            G(i4);
        }
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e s(@N String str) throws IOException {
        return f(com.google.firebase.encoders.c.d(str));
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e t(@N com.google.firebase.encoders.c cVar, @P Object obj) throws IOException {
        return p(cVar, obj, true);
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public e b(@N com.google.firebase.encoders.c cVar, long j4) throws IOException {
        return v(cVar, j4, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e v(@N com.google.firebase.encoders.c cVar, long j4, boolean z3) throws IOException {
        if (z3 && j4 == 0) {
            return this;
        }
        Protobuf D3 = D(cVar);
        int i4 = a.f35946a[D3.intEncoding().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    G((D3.tag() << 3) | 1);
                    this.f35941a.write(y(8).putLong(j4).array());
                }
            } else {
                G(D3.tag() << 3);
                H((j4 >> 63) ^ (j4 << 1));
            }
        } else {
            G(D3.tag() << 3);
            H(j4);
        }
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public e a(@N com.google.firebase.encoders.c cVar, boolean z3) throws IOException {
        return x(cVar, z3, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e x(@N com.google.firebase.encoders.c cVar, boolean z3, boolean z4) throws IOException {
        return r(cVar, z3 ? 1 : 0, z4);
    }
}
