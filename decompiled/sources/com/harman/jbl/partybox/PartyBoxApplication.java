package com.harman.jbl.partybox;

import android.content.Context;
import android.webkit.WebView;
import com.harman.jbl.partylight.lib.core.PBDevice;
import com.harman.jbl.partylight.lib.f;
import com.harman.sdk.setting.ProductConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import t2.C2418d;
import t2.InterfaceC2419e;

@E(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/harman/jbl/partybox/PartyBoxApplication;", "Lcom/harman/jbl/partybox/d;", "Ljava/lang/Thread$UncaughtExceptionHandler;", com.harman.log.b.f47574c, "()Ljava/lang/Thread$UncaughtExceptionHandler;", "Lkotlin/H0;", "c", "()V", "onCreate", "LQ1/b;", "I", "LQ1/b;", "uncaughtExceptionHandler", "<init>", "J", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyBoxApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyBoxApplication.kt\ncom/harman/jbl/partybox/PartyBoxApplication\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1855#2,2:147\n*S KotlinDebug\n*F\n+ 1 PartyBoxApplication.kt\ncom/harman/jbl/partybox/PartyBoxApplication\n*L\n46#1:147,2\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyBoxApplication extends d {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f38288J = new a(null);

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private Q1.b f38289I;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC2419e {
        b() {
        }

        @Override // t2.InterfaceC2419e
        public void a() {
        }

        @Override // t2.InterfaceC2419e
        public void b() {
            q2.b a4 = q2.b.f57366d.a();
            Context applicationContext = PartyBoxApplication.this.getApplicationContext();
            F.o(applicationContext, "getApplicationContext(...)");
            a4.f(applicationContext, null, C2418d.f57874c.a().e("RatingInAppAndroid"));
        }
    }

    private final Thread.UncaughtExceptionHandler b() {
        if (this.f38289I == null) {
            this.f38289I = Q1.b.d(this);
        }
        return this.f38289I;
    }

    private final void c() {
        com.harman.sdk.concurrent.a.a().execute(new Runnable() { // from class: com.harman.jbl.partybox.i
            @Override // java.lang.Runnable
            public final void run() {
                PartyBoxApplication.d(PartyBoxApplication.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.harman.jbl.partybox.PartyBoxApplication r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.PartyBoxApplication.d(com.harman.jbl.partybox.PartyBoxApplication):void");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        new R1.a().b();
        new T1.b().b();
        new P1.a().b();
        ArrayList arrayList = new ArrayList();
        ProductConfig A3 = com.harman.sdk.utils.d.A();
        if (A3 != null && A3.a() != null) {
            List<ProductConfig.ProductItem> a4 = A3.a();
            F.o(a4, "getProductItems(...)");
            for (ProductConfig.ProductItem productItem : a4) {
                if (productItem.n()) {
                    String i4 = productItem.i();
                    F.o(i4, "getPid(...)");
                    String a5 = productItem.a();
                    F.o(a5, "getDeviceName(...)");
                    arrayList.add(new PBDevice(i4, a5));
                }
            }
        }
        f.b.c(com.harman.jbl.partylight.lib.f.f46571a.a(), null, f.f40396k, arrayList, 1, null);
        com.harman.log.f.a(d.f38437H, "app version:3.12.20");
        com.harman.log.f.a(d.f38437H, "LegalManager init called");
        com.harman.legallib.d dVar = com.harman.legallib.d.f47556a;
        Context applicationContext = getApplicationContext();
        F.o(applicationContext, "getApplicationContext(...)");
        dVar.o(applicationContext, f.f40394i);
        c();
        new WebView(getApplicationContext()).clearCache(true);
        if (com.harman.jbl.partybox.persistence.a.g("legal_info_agreed")) {
            com.google.firebase.e.x(getApplicationContext());
            com.google.firebase.crashlytics.i.d().j(true);
            C2418d.f57874c.a().f(new b());
        }
    }
}
