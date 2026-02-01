package com.google.firebase.encoders.proto;

import androidx.annotation.N;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import x1.InterfaceC2438a;
import x1.InterfaceC2439b;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f35947a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f35948b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.encoders.d<Object> f35949c;

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC2439b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.d<Object> f35950d = new com.google.firebase.encoders.d() { // from class: com.google.firebase.encoders.proto.f
            @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
            public final void a(Object obj, com.google.firebase.encoders.e eVar) {
                g.a.f(obj, eVar);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.d<?>> f35951a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, com.google.firebase.encoders.f<?>> f35952b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private com.google.firebase.encoders.d<Object> f35953c = f35950d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public g d() {
            return new g(new HashMap(this.f35951a), new HashMap(this.f35952b), this.f35953c);
        }

        @N
        public a e(@N InterfaceC2438a interfaceC2438a) {
            interfaceC2438a.a(this);
            return this;
        }

        @Override // x1.InterfaceC2439b
        @N
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public <U> a b(@N Class<U> cls, @N com.google.firebase.encoders.d<? super U> dVar) {
            this.f35951a.put(cls, dVar);
            this.f35952b.remove(cls);
            return this;
        }

        @Override // x1.InterfaceC2439b
        @N
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public <U> a a(@N Class<U> cls, @N com.google.firebase.encoders.f<? super U> fVar) {
            this.f35952b.put(cls, fVar);
            this.f35951a.remove(cls);
            return this;
        }

        @N
        public a i(@N com.google.firebase.encoders.d<Object> dVar) {
            this.f35953c = dVar;
            return this;
        }
    }

    g(Map<Class<?>, com.google.firebase.encoders.d<?>> map, Map<Class<?>, com.google.firebase.encoders.f<?>> map2, com.google.firebase.encoders.d<Object> dVar) {
        this.f35947a = map;
        this.f35948b = map2;
        this.f35949c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(@N Object obj, @N OutputStream outputStream) throws IOException {
        new e(outputStream, this.f35947a, this.f35948b, this.f35949c).C(obj);
    }

    @N
    public byte[] c(@N Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
