package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.auth.I;
import com.amazonaws.auth.InterfaceC1030h;
import com.amazonaws.e;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.f;
import com.amazonaws.http.h;
import com.amazonaws.http.j;
import com.amazonaws.http.l;
import com.amazonaws.http.s;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.k;
import com.amazonaws.util.w;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p0.InterfaceC2388a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements InvocationHandler {

    /* renamed from: i, reason: collision with root package name */
    private static final Gson f23846i = new GsonBuilder().registerTypeAdapter(Date.class, new com.amazonaws.util.json.d(new String[]{k.f24329a, k.f24330b, k.f24332d, k.f24331c})).create();

    /* renamed from: j, reason: collision with root package name */
    private static final int f23847j = 200;

    /* renamed from: k, reason: collision with root package name */
    private static final int f23848k = 300;

    /* renamed from: a, reason: collision with root package name */
    private final String f23849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23850b;

    /* renamed from: c, reason: collision with root package name */
    private final I f23851c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1030h f23852d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23853e;

    /* renamed from: f, reason: collision with root package name */
    private f f23854f;

    /* renamed from: g, reason: collision with root package name */
    private final com.amazonaws.http.k f23855g = new com.amazonaws.http.k();

    /* renamed from: h, reason: collision with root package name */
    private final com.amazonaws.d f23856h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, String str2, I i4, InterfaceC1030h interfaceC1030h, String str3, com.amazonaws.d dVar) {
        this.f23849a = str;
        this.f23850b = str2;
        this.f23851c = i4;
        this.f23852d = interfaceC1030h;
        this.f23853e = str3;
        this.f23856h = dVar;
        this.f23854f = new s(dVar);
    }

    private String f(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            boolean z3 = true;
            for (Object obj : collection) {
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(",");
                }
                sb.append(obj);
            }
            return sb.toString();
        }
        return "";
    }

    com.amazonaws.f<?> a(Method method, Object[] objArr) {
        I i4;
        InterfaceC2388a interfaceC2388a = (InterfaceC2388a) method.getAnnotation(InterfaceC2388a.class);
        if (interfaceC2388a != null) {
            e eVar = new e(this.f23850b);
            eVar.h(interfaceC2388a.path());
            eVar.w(URI.create(this.f23849a));
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = parameterAnnotations.length;
            boolean z3 = false;
            String str = null;
            for (int i5 = 0; i5 < length; i5++) {
                Annotation[] annotationArr = parameterAnnotations[i5];
                if (annotationArr.length == 0) {
                    if (str == null) {
                        Object obj = objArr[i5];
                        if (obj == null) {
                            str = null;
                        } else {
                            str = f23846i.toJson(obj);
                        }
                    } else {
                        throw new IllegalStateException("Can't have more than one Body");
                    }
                } else {
                    int length2 = annotationArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            Annotation annotation = annotationArr[i6];
                            if (annotation instanceof p0.b) {
                                g(eVar, (p0.b) annotation, objArr[i5]);
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
            if (str != null) {
                z3 = true;
            }
            i(eVar, interfaceC2388a.method(), z3);
            if (z3) {
                byte[] bytes = str.getBytes(w.f24366b);
                eVar.f(new ByteArrayInputStream(bytes));
                eVar.addHeader(h.f23644c, String.valueOf(bytes.length));
            }
            eVar.addHeader("Content-Type", "application/json");
            eVar.addHeader(h.f23642a, "application/json");
            String str2 = this.f23853e;
            if (str2 != null) {
                eVar.addHeader("x-api-key", str2);
            }
            InterfaceC1030h interfaceC1030h = this.f23852d;
            if (interfaceC1030h != null && (i4 = this.f23851c) != null) {
                i4.b(eVar, interfaceC1030h.a());
            }
            return eVar;
        }
        throw new IllegalArgumentException("Method isn't annotated with Operation");
    }

    j b(Method method, Object[] objArr) {
        com.amazonaws.f<?> a4 = a(method, objArr);
        com.amazonaws.http.e eVar = new com.amazonaws.http.e();
        String str = this.f23850b;
        if (a4.a().containsKey(h.f23650i)) {
            str = str + " " + a4.a().get(h.f23650i);
        }
        eVar.f(str);
        return this.f23855g.b(a4, this.f23856h, eVar);
    }

    Object c(l lVar, Method method) throws Throwable {
        String i4;
        int e4 = lVar.e();
        InputStream b4 = lVar.b();
        if (e4 >= 200 && e4 < f23848k) {
            Class<?> returnType = method.getReturnType();
            if (returnType != Void.TYPE && b4 != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(lVar.b(), w.f24366b);
                Object fromJson = f23846i.fromJson((Reader) inputStreamReader, (Type) returnType);
                inputStreamReader.close();
                return fromJson;
            }
            if (b4 != null) {
                b4.close();
                return null;
            }
            return null;
        }
        if (b4 == null) {
            i4 = "";
        } else {
            i4 = IOUtils.i(b4);
        }
        ApiClientException apiClientException = new ApiClientException(i4);
        apiClientException.m(lVar.e());
        apiClientException.l(this.f23850b);
        String str = lVar.c().get("x-amzn-RequestId");
        if (str != null) {
            apiClientException.k(str);
            throw apiClientException;
        }
        throw apiClientException;
    }

    j d(Object[] objArr) {
        I i4;
        com.amazonaws.http.e eVar = new com.amazonaws.http.e();
        com.amazonaws.f<d> f4 = ((c) objArr[0]).f();
        if (f4.s() == null) {
            f4.w(URI.create(this.f23849a));
        }
        String str = this.f23850b;
        if (f4.a().containsKey(h.f23650i)) {
            str = str + " " + f4.a().get(h.f23650i);
        }
        eVar.f(str);
        String str2 = this.f23853e;
        if (str2 != null) {
            f4.addHeader("x-api-key", str2);
        }
        InterfaceC1030h interfaceC1030h = this.f23852d;
        if (interfaceC1030h != null && (i4 = this.f23851c) != null) {
            i4.b(f4, interfaceC1030h.a());
        }
        return this.f23855g.b(f4, this.f23856h, eVar);
    }

    boolean e(Method method) {
        if (((InterfaceC2388a) method.getAnnotation(InterfaceC2388a.class)) != null || !"execute".equalsIgnoreCase(method.getName()) || !method.getReturnType().isAssignableFrom(d.class) || method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].isAssignableFrom(c.class)) {
            return false;
        }
        return true;
    }

    void g(com.amazonaws.f<?> fVar, p0.b bVar, Object obj) {
        String name = bVar.name();
        String location = bVar.location();
        if (obj == null) {
            return;
        }
        if ("header".equals(location)) {
            fVar.addHeader(name, String.valueOf(obj));
            return;
        }
        if ("path".equals(location)) {
            fVar.h(fVar.p().replaceAll("\\{" + name + "\\}", String.valueOf(obj)));
            return;
        }
        if (D0.d.f55b.equals(location)) {
            if (Map.class.isAssignableFrom(obj.getClass())) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    fVar.o((String) entry.getKey(), String.valueOf(entry.getValue()));
                }
                return;
            }
            if (Collection.class.isAssignableFrom(obj.getClass())) {
                fVar.o(name, f((Collection) obj));
                return;
            } else {
                fVar.o(name, String.valueOf(obj));
                return;
            }
        }
        throw new IllegalArgumentException("unknown parameter location: " + location);
    }

    void h(f fVar) {
        this.f23854f = fVar;
    }

    void i(com.amazonaws.f<?> fVar, String str, boolean z3) {
        HttpMethodName httpMethodName;
        try {
            fVar.n(HttpMethodName.valueOf(str));
        } catch (IllegalArgumentException unused) {
            fVar.addHeader("X-HTTP-Method-Override", str);
            if (z3) {
                httpMethodName = HttpMethodName.POST;
            } else {
                httpMethodName = HttpMethodName.GET;
            }
            fVar.n(httpMethodName);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String message;
        try {
            if (e(method)) {
                return new d(this.f23854f.a(d(objArr)));
            }
            return c(this.f23854f.a(b(method, objArr)), method);
        } catch (ApiClientException e4) {
            throw e4;
        } catch (Exception e5) {
            if (e5.getMessage() == null) {
                message = "";
            } else {
                message = e5.getMessage();
            }
            throw new ApiClientException(message, e5);
        }
    }
}
