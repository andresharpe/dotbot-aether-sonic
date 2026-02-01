package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class f implements com.google.firebase.encoders.e, com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    private f f35925a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35926b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f35927c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f35928d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f35929e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f35930f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f35931g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(@N Writer writer, @N Map<Class<?>, com.google.firebase.encoders.d<?>> map, @N Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar, boolean z3) {
        this.f35927c = new JsonWriter(writer);
        this.f35928d = map;
        this.f35929e = map2;
        this.f35930f = dVar;
        this.f35931g = z3;
    }

    private boolean H(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    private f K(@N String str, @P Object obj) throws IOException, EncodingException {
        M();
        this.f35927c.name(str);
        if (obj == null) {
            this.f35927c.nullValue();
            return this;
        }
        return y(obj, false);
    }

    private f L(@N String str, @P Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        M();
        this.f35927c.name(str);
        return y(obj, false);
    }

    private void M() throws IOException {
        if (this.f35926b) {
            f fVar = this.f35925a;
            if (fVar != null) {
                fVar.M();
                this.f35925a.f35926b = false;
                this.f35925a = null;
                this.f35927c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public f j(@N String str, double d4) throws IOException {
        M();
        this.f35927c.name(str);
        return q(d4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public f l(@N String str, int i4) throws IOException {
        M();
        this.f35927c.name(str);
        return add(i4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public f k(@N String str, long j4) throws IOException {
        M();
        this.f35927c.name(str);
        return p(j4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public f o(@N String str, @P Object obj) throws IOException {
        if (this.f35931g) {
            return L(str, obj);
        }
        return K(str, obj);
    }

    @Override // com.google.firebase.encoders.e
    @N
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public f i(@N String str, boolean z3) throws IOException {
        M();
        this.f35927c.name(str);
        return n(z3);
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public f n(boolean z3) throws IOException {
        M();
        this.f35927c.value(z3);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public f d(@P byte[] bArr) throws IOException {
        M();
        if (bArr == null) {
            this.f35927c.nullValue();
        } else {
            this.f35927c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I() throws IOException {
        M();
        this.f35927c.flush();
    }

    f J(com.google.firebase.encoders.d<Object> dVar, Object obj, boolean z3) throws IOException {
        if (!z3) {
            this.f35927c.beginObject();
        }
        dVar.a(obj, this);
        if (!z3) {
            this.f35927c.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e a(@N com.google.firebase.encoders.c cVar, boolean z3) throws IOException {
        return i(cVar.b(), z3);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e b(@N com.google.firebase.encoders.c cVar, long j4) throws IOException {
        return k(cVar.b(), j4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e c(@N com.google.firebase.encoders.c cVar, int i4) throws IOException {
        return l(cVar.b(), i4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e e(@N com.google.firebase.encoders.c cVar, float f4) throws IOException {
        return j(cVar.b(), f4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e f(@N com.google.firebase.encoders.c cVar) throws IOException {
        return s(cVar.b());
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e g(@N com.google.firebase.encoders.c cVar, double d4) throws IOException {
        return j(cVar.b(), d4);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e h(@P Object obj) throws IOException {
        return y(obj, true);
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e s(@N String str) throws IOException {
        M();
        this.f35925a = new f(this);
        this.f35927c.name(str);
        this.f35927c.beginObject();
        return this.f35925a;
    }

    @Override // com.google.firebase.encoders.e
    @N
    public com.google.firebase.encoders.e t(@N com.google.firebase.encoders.c cVar, @P Object obj) throws IOException {
        return o(cVar.b(), obj);
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public f q(double d4) throws IOException {
        M();
        this.f35927c.value(d4);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public f r(float f4) throws IOException {
        M();
        this.f35927c.value(f4);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public f add(int i4) throws IOException {
        M();
        this.f35927c.value(i4);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public f p(long j4) throws IOException {
        M();
        this.f35927c.value(j4);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public f y(@P Object obj, boolean z3) throws IOException {
        Class<?> cls;
        int i4 = 0;
        if (z3 && H(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f35927c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f35927c.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return d((byte[]) obj);
            }
            this.f35927c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i4 < length) {
                    this.f35927c.value(r6[i4]);
                    i4++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i4 < length2) {
                    p(jArr[i4]);
                    i4++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i4 < length3) {
                    this.f35927c.value(dArr[i4]);
                    i4++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i4 < length4) {
                    this.f35927c.value(zArr[i4]);
                    i4++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    y(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    y(obj2, false);
                }
            }
            this.f35927c.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.f35927c.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                y(it.next(), false);
            }
            this.f35927c.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.f35927c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    o((String) key, entry.getValue());
                } catch (ClassCastException e4) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                }
            }
            this.f35927c.endObject();
            return this;
        }
        com.google.firebase.encoders.d<?> dVar = this.f35928d.get(obj.getClass());
        if (dVar != null) {
            return J(dVar, obj, z3);
        }
        com.google.firebase.encoders.f<?> fVar = this.f35929e.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            m(((Enum) obj).name());
            return this;
        }
        return J(this.f35930f, obj, z3);
    }

    @Override // com.google.firebase.encoders.g
    @N
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public f m(@P String str) throws IOException {
        M();
        this.f35927c.value(str);
        return this;
    }

    private f(f fVar) {
        this.f35927c = fVar.f35927c;
        this.f35928d = fVar.f35928d;
        this.f35929e = fVar.f35929e;
        this.f35930f = fVar.f35930f;
        this.f35931g = fVar.f35931g;
    }
}
