package com.google.firebase.encoders.json;

import androidx.annotation.N;
import com.amazonaws.util.k;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import x1.InterfaceC2438a;
import x1.InterfaceC2439b;

/* loaded from: classes2.dex */
public final class e implements InterfaceC2439b<e> {

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Object> f35915e = new com.google.firebase.encoders.d() { // from class: com.google.firebase.encoders.json.b
        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.e eVar) {
            e.m(obj, eVar);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final com.google.firebase.encoders.f<String> f35916f = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.c
        @Override // com.google.firebase.encoders.f, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.g gVar) {
            gVar.m((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final com.google.firebase.encoders.f<Boolean> f35917g = new com.google.firebase.encoders.f() { // from class: com.google.firebase.encoders.json.d
        @Override // com.google.firebase.encoders.f, com.google.firebase.encoders.b
        public final void a(Object obj, com.google.firebase.encoders.g gVar) {
            e.o((Boolean) obj, gVar);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f35918h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.d<?>> f35919a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.encoders.f<?>> f35920b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.encoders.d<Object> f35921c = f35915e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35922d = false;

    /* loaded from: classes2.dex */
    class a implements com.google.firebase.encoders.a {
        a() {
        }

        @Override // com.google.firebase.encoders.a
        public void a(@N Object obj, @N Writer writer) throws IOException {
            f fVar = new f(writer, e.this.f35919a, e.this.f35920b, e.this.f35921c, e.this.f35922d);
            fVar.y(obj, false);
            fVar.I();
        }

        @Override // com.google.firebase.encoders.a
        public String b(@N Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* loaded from: classes2.dex */
    private static final class b implements com.google.firebase.encoders.f<Date> {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f35924a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(k.f24329a, Locale.US);
            f35924a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // com.google.firebase.encoders.f, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@N Date date, @N com.google.firebase.encoders.g gVar) throws IOException {
            gVar.m(f35924a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public e() {
        a(String.class, f35916f);
        a(Boolean.class, f35917g);
        a(Date.class, f35918h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(Boolean bool, com.google.firebase.encoders.g gVar) throws IOException {
        gVar.n(bool.booleanValue());
    }

    @N
    public com.google.firebase.encoders.a j() {
        return new a();
    }

    @N
    public e k(@N InterfaceC2438a interfaceC2438a) {
        interfaceC2438a.a(this);
        return this;
    }

    @N
    public e l(boolean z3) {
        this.f35922d = z3;
        return this;
    }

    @Override // x1.InterfaceC2439b
    @N
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public <T> e b(@N Class<T> cls, @N com.google.firebase.encoders.d<? super T> dVar) {
        this.f35919a.put(cls, dVar);
        this.f35920b.remove(cls);
        return this;
    }

    @Override // x1.InterfaceC2439b
    @N
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public <T> e a(@N Class<T> cls, @N com.google.firebase.encoders.f<? super T> fVar) {
        this.f35920b.put(cls, fVar);
        this.f35919a.remove(cls);
        return this;
    }

    @N
    public e r(@N com.google.firebase.encoders.d<Object> dVar) {
        this.f35921c = dVar;
        return this;
    }
}
