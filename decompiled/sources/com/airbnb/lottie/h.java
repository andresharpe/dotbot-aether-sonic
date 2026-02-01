package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.P;
import androidx.annotation.V;
import androidx.annotation.j0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, q<com.airbnb.lottie.g>> f21447a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f21448b = {80, com.harman.sdk.utils.k.f48661f0, 3, 4};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l<com.airbnb.lottie.g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21449a;

        a(String str) {
            this.f21449a = str;
        }

        @Override // com.airbnb.lottie.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(com.airbnb.lottie.g gVar) {
            h.f21447a.remove(this.f21449a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements l<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21450a;

        b(String str) {
            this.f21450a = str;
        }

        @Override // com.airbnb.lottie.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            h.f21447a.remove(this.f21450a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21451a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21452b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21453c;

        c(Context context, String str, String str2) {
            this.f21451a = context;
            this.f21452b = str;
            this.f21453c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            p<com.airbnb.lottie.g> c4 = com.airbnb.lottie.e.d(this.f21451a).c(this.f21452b, this.f21453c);
            if (this.f21453c != null && c4.b() != null) {
                com.airbnb.lottie.model.f.c().d(this.f21453c, c4.b());
            }
            return c4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21454a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21456c;

        d(Context context, String str, String str2) {
            this.f21454a = context;
            this.f21455b = str;
            this.f21456c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.h(this.f21454a, this.f21455b, this.f21456c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f21457a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f21458b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21459c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21460d;

        e(WeakReference weakReference, Context context, int i4, String str) {
            this.f21457a = weakReference;
            this.f21458b = context;
            this.f21459c = i4;
            this.f21460d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            Context context = (Context) this.f21457a.get();
            if (context == null) {
                context = this.f21458b;
            }
            return h.v(context, this.f21459c, this.f21460d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f21461a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21462b;

        f(InputStream inputStream, String str) {
            this.f21461a = inputStream;
            this.f21462b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.k(this.f21461a, this.f21462b);
        }
    }

    /* loaded from: classes.dex */
    class g implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f21463a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21464b;

        g(JSONObject jSONObject, String str) {
            this.f21463a = jSONObject;
            this.f21464b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.r(this.f21463a, this.f21464b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0197h implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21465a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21466b;

        CallableC0197h(String str, String str2) {
            this.f21465a = str;
            this.f21466b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.q(this.f21465a, this.f21466b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsonReader f21467a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21468b;

        i(JsonReader jsonReader, String str) {
            this.f21467a = jsonReader;
            this.f21468b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.n(this.f21467a, this.f21468b);
        }
    }

    /* loaded from: classes.dex */
    class j implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ZipInputStream f21469a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21470b;

        j(ZipInputStream zipInputStream, String str) {
            this.f21469a = zipInputStream;
            this.f21470b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.B(this.f21469a, this.f21470b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.g f21471a;

        k(com.airbnb.lottie.g gVar) {
            this.f21471a = gVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return new p<>(this.f21471a);
        }
    }

    private h() {
    }

    public static q<com.airbnb.lottie.g> A(ZipInputStream zipInputStream, @P String str) {
        return b(str, new j(zipInputStream, str));
    }

    @j0
    public static p<com.airbnb.lottie.g> B(ZipInputStream zipInputStream, @P String str) {
        try {
            return C(zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.j.c(zipInputStream);
        }
    }

    @j0
    private static p<com.airbnb.lottie.g> C(ZipInputStream zipInputStream, @P String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            com.airbnb.lottie.g gVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    gVar = o(JsonReader.t(okio.o.d(okio.o.l(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (gVar == null) {
                return new p<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                com.airbnb.lottie.k d4 = d(gVar, (String) entry.getKey());
                if (d4 != null) {
                    d4.h(com.airbnb.lottie.utils.j.m((Bitmap) entry.getValue(), d4.f(), d4.d()));
                }
            }
            for (Map.Entry<String, com.airbnb.lottie.k> entry2 : gVar.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new p<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().c()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f.c().d(str, gVar);
            }
            return new p<>(gVar);
        } catch (IOException e4) {
            return new p<>((Throwable) e4);
        }
    }

    private static boolean D(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    private static Boolean E(okio.e eVar) {
        try {
            okio.e peek = eVar.peek();
            for (byte b4 : f21448b) {
                if (peek.readByte() != b4) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e4) {
            com.airbnb.lottie.utils.f.c("Failed to check zip file header", e4);
            return Boolean.FALSE;
        }
    }

    private static String F(Context context, @V int i4) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if (D(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i4);
        return sb.toString();
    }

    public static void G(int i4) {
        com.airbnb.lottie.model.f.c().e(i4);
    }

    private static q<com.airbnb.lottie.g> b(@P String str, Callable<p<com.airbnb.lottie.g>> callable) {
        com.airbnb.lottie.g b4;
        if (str == null) {
            b4 = null;
        } else {
            b4 = com.airbnb.lottie.model.f.c().b(str);
        }
        if (b4 != null) {
            return new q<>(new k(b4));
        }
        if (str != null) {
            Map<String, q<com.airbnb.lottie.g>> map = f21447a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        q<com.airbnb.lottie.g> qVar = new q<>(callable);
        if (str != null) {
            qVar.f(new a(str));
            qVar.e(new b(str));
            f21447a.put(str, qVar);
        }
        return qVar;
    }

    public static void c(Context context) {
        f21447a.clear();
        com.airbnb.lottie.model.f.c().a();
        com.airbnb.lottie.e.c(context).a();
    }

    @P
    private static com.airbnb.lottie.k d(com.airbnb.lottie.g gVar, String str) {
        for (com.airbnb.lottie.k kVar : gVar.j().values()) {
            if (kVar.c().equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public static q<com.airbnb.lottie.g> e(Context context, String str) {
        return f(context, str, "asset_" + str);
    }

    public static q<com.airbnb.lottie.g> f(Context context, String str, @P String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    @j0
    public static p<com.airbnb.lottie.g> g(Context context, String str) {
        return h(context, str, "asset_" + str);
    }

    @j0
    public static p<com.airbnb.lottie.g> h(Context context, String str, @P String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return k(context.getAssets().open(str), str2);
            }
            return B(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e4) {
            return new p<>((Throwable) e4);
        }
    }

    @Deprecated
    public static q<com.airbnb.lottie.g> i(JSONObject jSONObject, @P String str) {
        return b(str, new g(jSONObject, str));
    }

    public static q<com.airbnb.lottie.g> j(InputStream inputStream, @P String str) {
        return b(str, new f(inputStream, str));
    }

    @j0
    public static p<com.airbnb.lottie.g> k(InputStream inputStream, @P String str) {
        return l(inputStream, str, true);
    }

    @j0
    private static p<com.airbnb.lottie.g> l(InputStream inputStream, @P String str, boolean z3) {
        try {
            return n(JsonReader.t(okio.o.d(okio.o.l(inputStream))), str);
        } finally {
            if (z3) {
                com.airbnb.lottie.utils.j.c(inputStream);
            }
        }
    }

    public static q<com.airbnb.lottie.g> m(JsonReader jsonReader, @P String str) {
        return b(str, new i(jsonReader, str));
    }

    @j0
    public static p<com.airbnb.lottie.g> n(JsonReader jsonReader, @P String str) {
        return o(jsonReader, str, true);
    }

    private static p<com.airbnb.lottie.g> o(JsonReader jsonReader, @P String str, boolean z3) {
        try {
            try {
                com.airbnb.lottie.g a4 = w.a(jsonReader);
                if (str != null) {
                    com.airbnb.lottie.model.f.c().d(str, a4);
                }
                p<com.airbnb.lottie.g> pVar = new p<>(a4);
                if (z3) {
                    com.airbnb.lottie.utils.j.c(jsonReader);
                }
                return pVar;
            } catch (Exception e4) {
                p<com.airbnb.lottie.g> pVar2 = new p<>(e4);
                if (z3) {
                    com.airbnb.lottie.utils.j.c(jsonReader);
                }
                return pVar2;
            }
        } catch (Throwable th) {
            if (z3) {
                com.airbnb.lottie.utils.j.c(jsonReader);
            }
            throw th;
        }
    }

    public static q<com.airbnb.lottie.g> p(String str, @P String str2) {
        return b(str2, new CallableC0197h(str, str2));
    }

    @j0
    public static p<com.airbnb.lottie.g> q(String str, @P String str2) {
        return n(JsonReader.t(okio.o.d(okio.o.l(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @j0
    @Deprecated
    public static p<com.airbnb.lottie.g> r(JSONObject jSONObject, @P String str) {
        return q(jSONObject.toString(), str);
    }

    public static q<com.airbnb.lottie.g> s(Context context, @V int i4) {
        return t(context, i4, F(context, i4));
    }

    public static q<com.airbnb.lottie.g> t(Context context, @V int i4, @P String str) {
        return b(str, new e(new WeakReference(context), context.getApplicationContext(), i4, str));
    }

    @j0
    public static p<com.airbnb.lottie.g> u(Context context, @V int i4) {
        return v(context, i4, F(context, i4));
    }

    @j0
    public static p<com.airbnb.lottie.g> v(Context context, @V int i4, @P String str) {
        try {
            okio.e d4 = okio.o.d(okio.o.l(context.getResources().openRawResource(i4)));
            if (E(d4).booleanValue()) {
                return B(new ZipInputStream(d4.e1()), str);
            }
            return k(d4.e1(), str);
        } catch (Resources.NotFoundException e4) {
            return new p<>((Throwable) e4);
        }
    }

    public static q<com.airbnb.lottie.g> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static q<com.airbnb.lottie.g> x(Context context, String str, @P String str2) {
        return b(str2, new c(context, str, str2));
    }

    @j0
    public static p<com.airbnb.lottie.g> y(Context context, String str) {
        return z(context, str, str);
    }

    @j0
    public static p<com.airbnb.lottie.g> z(Context context, String str, @P String str2) {
        p<com.airbnb.lottie.g> c4 = com.airbnb.lottie.e.d(context).c(str, str2);
        if (str2 != null && c4.b() != null) {
            com.airbnb.lottie.model.f.c().d(str2, c4.b());
        }
        return c4;
    }
}
