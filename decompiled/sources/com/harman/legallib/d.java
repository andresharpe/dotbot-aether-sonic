package com.harman.legallib;

import X2.p;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.android.volley.p;
import com.android.volley.toolbox.E;
import com.android.volley.toolbox.t;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.harman.legallib.LegalConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.A;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.V;
import org.json.JSONObject;
import p2.C2390a;
import p2.C2391b;
import p2.C2392c;
import p2.C2393d;

@U({"SMAP\nLegalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegalManager.kt\ncom/harman/legallib/LegalManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"})
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final d f47556a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final String f47557b = d.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static String f47558c = LegalConfig.f47542e;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static String f47559d = LegalConfig.f47542e;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static String f47560e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f47561f = true;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static AtomicBoolean f47562g = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.legallib.LegalManager$doInitConfig$1", f = "LegalManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f47563I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ Context f47564J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ LegalModel f47565K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, LegalModel legalModel, kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
            this.f47564J = context;
            this.f47565K = legalModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            String h4;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f47563I == 0) {
                W.n(obj);
                if (d.f47556a.u(this.f47564J, this.f47565K) && (h4 = this.f47565K.h()) != null) {
                    Context context = this.f47564J;
                    d.f47559d = h4;
                    C2392c.f55873a.i(context, LegalConfig.f47546i, h4);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(this.f47564J, this.f47565K, cVar);
        }
    }

    private d() {
    }

    private final String h(Context context, LegalConfig.Type type, String str) {
        InputStream inputStream;
        String str2 = "android_" + type.f() + "_" + str + ".txt";
        String e4 = C2392c.f55873a.e(context, LegalConfig.f47546i, "");
        if (TextUtils.isEmpty(e4) && !f47561f) {
            e4 = f47560e;
        }
        String str3 = null;
        if (TextUtils.isEmpty(e4)) {
            try {
                inputStream = context.getAssets().open(str2);
            } catch (Exception unused) {
                str2 = "android_" + type.f() + "_en.txt";
                inputStream = null;
            }
            if (inputStream == null) {
                try {
                    inputStream = context.getAssets().open(str2);
                } catch (Exception unused2) {
                }
            }
            if (inputStream != null) {
                str3 = f47556a.t(inputStream);
            }
        } else {
            String j4 = j(context);
            String str4 = File.separator;
            String str5 = j4 + str4 + e4 + str4 + LegalConfig.f47543f + str4 + type.f();
            File file = new File(str5, str2);
            if (!file.exists()) {
                file = new File(str5, "android_" + type.f() + "_en.txt");
            }
            try {
                str3 = t(new FileInputStream(file.getAbsolutePath()));
            } catch (FileNotFoundException unused3) {
            }
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    private final void i(Context context, LegalModel legalModel) {
        if (n(context, legalModel)) {
            C2323l.f(V.a(C2322k0.a()), null, null, new a(context, legalModel, null), 3, null);
        }
    }

    private final String j(Context context) {
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs != null && externalFilesDirs.length > 0) {
            String absolutePath = externalFilesDirs[0].getAbsolutePath();
            F.o(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
        return "";
    }

    private final boolean n(Context context, LegalModel legalModel) {
        String e4 = C2392c.f55873a.e(context, LegalConfig.f47546i, f47558c);
        String h4 = legalModel.h();
        if (h4 == null) {
            h4 = "";
        }
        if (!TextUtils.isEmpty(h4) && !F.g(h4, e4)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Context context, JSONObject jSONObject) {
        LegalModel legalModel;
        F.p(context, "$context");
        try {
            legalModel = (LegalModel) new Gson().fromJson(jSONObject.toString(), LegalModel.class);
        } catch (JsonSyntaxException unused) {
            legalModel = null;
        }
        if (legalModel != null) {
            f47556a.i(context, legalModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(VolleyError volleyError) {
    }

    private final String t(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read != -1) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        byteArrayOutputStream.close();
        inputStream.close();
        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
        F.o(byteArrayOutputStream2, "toString(...)");
        return byteArrayOutputStream2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(Context context, LegalModel legalModel) {
        String str = LegalConfig.f47538a.a() + legalModel.f();
        String j4 = j(context);
        String str2 = File.separator;
        File file = new File(j4 + str2 + legalModel.h());
        if (!file.exists()) {
            file.mkdirs();
        }
        File a4 = C2390a.a(str, file.getAbsolutePath() + str2 + legalModel.f());
        if (a4 == null) {
            return false;
        }
        try {
            C2393d.a(a4.getAbsolutePath(), file.getAbsolutePath());
            a4.delete();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c(@l3.d Context context) {
        F.p(context, "context");
        if (!f47562g.get()) {
            return;
        }
        if (f47561f && !F.g(f47559d, f47558c)) {
            f47561f = false;
            C2392c.f55873a.f(context, LegalConfig.f47545h, false);
        }
        C2392c.f55873a.i(context, LegalConfig.f47544g, f47559d);
        f47560e = f47559d;
    }

    @l3.d
    @InterfaceC2205l(message = "Deprecated method")
    public final String k(@l3.d Context context, @l3.e LegalConfig.Type type, @l3.e LegalConfig.Language language) {
        F.p(context, "context");
        if (type == null) {
            type = LegalConfig.Type.EULA;
        }
        if (language == null) {
            language = LegalConfig.Language.EN;
        }
        return h(context, type, language.f());
    }

    @l3.d
    public final String l(@l3.d Context context, @l3.d LegalConfig.Type type, @l3.d String language) {
        F.p(context, "context");
        F.p(type, "type");
        F.p(language, "language");
        return m(context, type, new Locale(language, "", ""));
    }

    @l3.d
    public final String m(@l3.d Context context, @l3.d LegalConfig.Type type, @l3.d Locale locale) {
        F.p(context, "context");
        F.p(type, "type");
        F.p(locale, "locale");
        if (!f47562g.get()) {
            return "";
        }
        String language = locale.getLanguage();
        if (F.g(locale.getLanguage(), Locale.SIMPLIFIED_CHINESE.getLanguage())) {
            language = "cn";
        }
        F.m(language);
        return h(context, type, language);
    }

    @InterfaceC2205l(message = "Deprecated method", replaceWith = @kotlin.V(expression = "init(context, url, LegalConfig.DEFAULT_LEGAL_VERSION)", imports = {"com.harman.legallib.LegalManager.init"}))
    public final void o(@l3.d Context context, @l3.e String str) {
        F.p(context, "context");
        p(context, str, LegalConfig.f47542e);
    }

    public final void p(@l3.d final Context context, @l3.e String str, @l3.d String currentLegalVersion) {
        int D3;
        F.p(context, "context");
        F.p(currentLegalVersion, "currentLegalVersion");
        f47558c = currentLegalVersion;
        C2392c c2392c = C2392c.f55873a;
        f47561f = c2392c.a(context, LegalConfig.f47545h, true);
        f47560e = c2392c.e(context, LegalConfig.f47544g, "");
        String e4 = c2392c.e(context, LegalConfig.f47546i, "");
        f47559d = e4;
        if (TextUtils.isEmpty(e4) && TextUtils.isEmpty(f47560e)) {
            f47559d = currentLegalVersion;
        }
        if (f47562g.getAndSet(true) || !C2391b.a(context)) {
            return;
        }
        if (str != null && str.length() != 0) {
            LegalConfig legalConfig = LegalConfig.f47538a;
            D3 = A.D3(str, "/", 0, false, 6, null);
            String substring = str.substring(0, D3 + 1);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            legalConfig.c(substring);
        } else {
            str = LegalConfig.f47538a.b();
        }
        t tVar = new t(0, str, null, new p.b() { // from class: com.harman.legallib.b
            @Override // com.android.volley.p.b
            public final void b(Object obj) {
                d.q(context, (JSONObject) obj);
            }
        }, new p.a() { // from class: com.harman.legallib.c
            @Override // com.android.volley.p.a
            public final void c(VolleyError volleyError) {
                d.r(volleyError);
            }
        });
        tVar.U(true);
        E.a(context).a(tVar);
    }

    public final boolean s(@l3.d Context context) {
        F.p(context, "context");
        if (!f47562g.get()) {
            return false;
        }
        if (!TextUtils.isEmpty(f47560e) && !TextUtils.isEmpty(f47559d) && !F.g(f47560e, f47559d)) {
            return true;
        }
        return TextUtils.isEmpty(f47560e);
    }
}
