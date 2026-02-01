package com.harman.jbl.partylight.lib.debug.productlist;

import X2.l;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActivityC0587e;
import androidx.lifecycle.Q;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.C0965k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.ToastUtils;
import com.harman.jbl.cd_biz_comm.wireless_tech.bleconn.a;
import java.util.Locale;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import m2.C2364d;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/harman/jbl/partylight/lib/debug/productlist/DebugProductListActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "J0", "()V", "L0", "M0", "Lm2/d;", "h0", "Lkotlin/A;", "G0", "()Lm2/d;", "binding", "Lcom/harman/jbl/partylight/lib/debug/productlist/d;", "i0", "I0", "()Lcom/harman/jbl/partylight/lib/debug/productlist/d;", "vm", "Landroid/app/ProgressDialog;", "j0", "H0", "()Landroid/app/ProgressDialog;", "loadingDialog", "<init>", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDebugProductListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProductListActivity.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,67:1\n40#2,8:68\n*S KotlinDebug\n*F\n+ 1 DebugProductListActivity.kt\ncom/harman/jbl/partylight/lib/debug/productlist/DebugProductListActivity\n*L\n20#1:68,8\n*E\n"})
/* loaded from: classes2.dex */
public final class DebugProductListActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final A f46496h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final A f46497i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final A f46498j0;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.a<C2364d> {
        a() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2364d n() {
            return C2364d.c(DebugProductListActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<ProgressDialog> {
        b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ProgressDialog n() {
            ProgressDialog progressDialog = new ProgressDialog(DebugProductListActivity.this);
            progressDialog.setCancelable(false);
            progressDialog.setTitle("connecting...");
            return progressDialog;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<String, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f46503F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(String str) {
            c(str);
            return H0.f51801a;
        }

        public final void c(String str) {
            ToastUtils.W(str, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<Boolean, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            F.m(bool);
            if (bool.booleanValue()) {
                DebugProductListActivity.this.H0().show();
            } else {
                DebugProductListActivity.this.H0().dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f46505a;

        e(l function) {
            F.p(function, "function");
            this.f46505a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f46505a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f46505a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public DebugProductListActivity() {
        A a4;
        A a5;
        a4 = C.a(new a());
        this.f46496h0 = a4;
        this.f46497i0 = new l0(N.d(com.harman.jbl.partylight.lib.debug.productlist.d.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.debug.productlist.DebugProductListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ComponentActivity.this.getViewModelStore();
                F.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.debug.productlist.DebugProductListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        a5 = C.a(new b());
        this.f46498j0 = a5;
    }

    private final C2364d G0() {
        return (C2364d) this.f46496h0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressDialog H0() {
        return (ProgressDialog) this.f46498j0.getValue();
    }

    private final com.harman.jbl.partylight.lib.debug.productlist.d I0() {
        return (com.harman.jbl.partylight.lib.debug.productlist.d) this.f46497i0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(View view) {
        a.b.a(com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G, null, 1, null);
    }

    public final void J0() {
        G0().f55105H.setLayoutManager(new LinearLayoutManager(this));
        G0().f55105H.setAdapter(new com.harman.jbl.partylight.lib.debug.productlist.c(I0(), this));
        G0().f55105H.n(new C0965k(this, 1));
        G0().f55105H.setItemAnimator(null);
        G0().f55104G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.debug.productlist.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugProductListActivity.K0(view);
            }
        });
    }

    public final void L0() {
        I0().A().k(this, new e(c.f46503F));
        I0().y().k(this, new e(new d()));
    }

    public final void M0() {
        Resources resources = getResources();
        F.o(resources, "getResources(...)");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocales(new LocaleList(Locale.ENGLISH));
        getApplicationContext().createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, displayMetrics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setContentView(G0().d());
        J0();
        L0();
        M0();
    }
}
