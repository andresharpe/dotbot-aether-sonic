package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.N;
import com.google.android.datatransport.d;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.android.datatransport.h;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.v;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.firebase.crashlytics.internal.common.r;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static final String f35647f = "FIREBASE_CRASHLYTICS_REPORT";

    /* renamed from: a, reason: collision with root package name */
    private final g<CrashlyticsReport> f35649a;

    /* renamed from: b, reason: collision with root package name */
    private final f<CrashlyticsReport, byte[]> f35650b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.internal.model.serialization.g f35644c = new com.google.firebase.crashlytics.internal.model.serialization.g();

    /* renamed from: d, reason: collision with root package name */
    private static final String f35645d = f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e, reason: collision with root package name */
    private static final String f35646e = f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: g, reason: collision with root package name */
    private static final f<CrashlyticsReport, byte[]> f35648g = new f() { // from class: com.google.firebase.crashlytics.internal.send.b
        @Override // com.google.android.datatransport.f
        public final Object apply(Object obj) {
            byte[] e4;
            e4 = c.e((CrashlyticsReport) obj);
            return e4;
        }
    };

    c(g<CrashlyticsReport> gVar, f<CrashlyticsReport, byte[]> fVar) {
        this.f35649a = gVar;
        this.f35650b = fVar;
    }

    public static c c(Context context) {
        v.f(context);
        h g4 = v.c().g(new com.google.android.datatransport.cct.a(f35645d, f35646e));
        com.google.android.datatransport.c b4 = com.google.android.datatransport.c.b("json");
        f<CrashlyticsReport, byte[]> fVar = f35648g;
        return new c(g4.b(f35647f, CrashlyticsReport.class, b4, fVar), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(C1771l c1771l, r rVar, Exception exc) {
        if (exc != null) {
            c1771l.d(exc);
        } else {
            c1771l.e(rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] e(CrashlyticsReport crashlyticsReport) {
        return f35644c.G(crashlyticsReport).getBytes(Charset.forName("UTF-8"));
    }

    private static String f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i4 = 0; i4 < str.length(); i4++) {
                sb.append(str.charAt(i4));
                if (str2.length() > i4) {
                    sb.append(str2.charAt(i4));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    @N
    public AbstractC1770k<r> g(@N final r rVar) {
        CrashlyticsReport b4 = rVar.b();
        final C1771l c1771l = new C1771l();
        this.f35649a.b(d.i(b4), new i() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // com.google.android.datatransport.i
            public final void a(Exception exc) {
                c.d(C1771l.this, rVar, exc);
            }
        });
        return c1771l.a();
    }
}
