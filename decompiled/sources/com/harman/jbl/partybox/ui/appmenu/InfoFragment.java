package com.harman.jbl.partybox.ui.appmenu;

import X2.l;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1946v0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.debug.DevelopConfigActivity;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.legal.InfoActivity;
import com.harman.jbl.partybox.ui.main.o;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/harman/jbl/partybox/ui/appmenu/InfoFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "y0", "()V", "x0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onResume", "Lcom/harman/jbl/partybox/databinding/v0;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/v0;", "binding", "Lcom/harman/jbl/partybox/a;", "O0", "Lkotlin/A;", "o0", "()Lcom/harman/jbl/partybox/a;", "appViewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "P0", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/appmenu/h;", "Q0", "q0", "()Lcom/harman/jbl/partybox/ui/appmenu/h;", "infoFragmentViewModel", "", "R0", "Z", "dialogBlock", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoFragment.kt\ncom/harman/jbl/partybox/ui/appmenu/InfoFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,198:1\n66#2,4:199\n66#2,4:203\n56#3,10:207\n1#4:217\n260#5:218\n*S KotlinDebug\n*F\n+ 1 InfoFragment.kt\ncom/harman/jbl/partybox/ui/appmenu/InfoFragment\n*L\n31#1:199,4\n32#1:203,4\n33#1:207,10\n161#1:218\n*E\n"})
/* loaded from: classes2.dex */
public final class InfoFragment extends Fragment {

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private static final String f42086T0 = "showSwitchSpeaker";

    @l3.d
    public static final String TAG = "InfoFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42087N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f42088O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f42089P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final A f42090Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f42091R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f42085S0 = {N.u(new PropertyReference1Impl(InfoFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentInfoBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final InfoFragment a(boolean z3) {
            InfoFragment infoFragment = new InfoFragment();
            infoFragment.setArguments(C0741d.b(C2122h0.a(InfoFragment.f42086T0, Boolean.valueOf(z3))));
            return infoFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1946v0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42096N = new b();

        b() {
            super(1, C1946v0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentInfoBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1946v0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1946v0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<Boolean, H0> {
        c() {
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
                InfoFragment.this.startActivity(new Intent(InfoFragment.this.getContext(), (Class<?>) DevelopConfigActivity.class));
                InfoFragment.this.q0().z().o(Boolean.FALSE);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f42098a;

        d(l function) {
            F.p(function, "function");
            this.f42098a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42098a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42098a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public InfoFragment() {
        super(j.i.f41511k0);
        this.f42087N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42096N);
        this.f42088O0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.a.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f42089P0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.appmenu.InfoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f42090Q0 = FragmentViewModelLazyKt.c(this, N.d(h.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.appmenu.InfoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.appmenu.InfoFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f42091R0 = true;
    }

    @W2.n
    @l3.d
    public static final InfoFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    private final com.harman.jbl.partybox.a o0() {
        return (com.harman.jbl.partybox.a) this.f42088O0.getValue();
    }

    private final C1946v0 p0() {
        return (C1946v0) this.f42087N0.a(this, f42085S0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h q0() {
        return (h) this.f42090Q0.getValue();
    }

    private final o r0() {
        return (o) this.f42089P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(InfoFragment this$0, View view) {
        F.p(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) InfoActivity.class);
        intent.putExtra("page", "ADD_PRODUCT");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(InfoFragment this$0, View view) {
        F.p(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) InfoActivity.class);
        intent.putExtra("page", "LANGUAGE");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(InfoFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.x0();
        Intent intent = new Intent(this$0.getContext(), (Class<?>) InfoActivity.class);
        intent.putExtra("page", "LEGAL");
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(InfoFragment this$0, View view) {
        F.p(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) InfoActivity.class);
        intent.putExtra("page", "FEEDBACK");
        this$0.startActivity(intent);
    }

    private static final void w0(InfoFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.q0().A();
    }

    private final void x0() {
        r0().l2(L1.a.f1629o2, C0741d.a());
    }

    private final void y0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String packageName;
        PackageManager packageManager;
        C1946v0 p02 = p0();
        TextView textView = p02.f40227U;
        Context context = getContext();
        PackageInfo packageInfo = null;
        if (context != null) {
            str = context.getString(j.m.f41769i3);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = p02.f40213G;
        Context context2 = getContext();
        if (context2 != null) {
            str2 = context2.getString(j.m.f41750f);
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        TextView textView3 = p02.f40226T;
        Context context3 = getContext();
        if (context3 != null) {
            str3 = context3.getString(j.m.f41775k);
        } else {
            str3 = null;
        }
        textView3.setText(str3);
        TextView textView4 = p02.f40220N;
        Context context4 = getContext();
        if (context4 != null) {
            str4 = context4.getString(j.m.U7);
        } else {
            str4 = null;
        }
        textView4.setText(str4);
        TextView textView5 = p02.f40228V;
        Context context5 = getContext();
        if (context5 != null) {
            str5 = context5.getString(j.m.A9);
        } else {
            str5 = null;
        }
        textView5.setText(str5);
        TextView textView6 = p02.f40222P;
        Context context6 = getContext();
        if (context6 != null) {
            str6 = context6.getString(j.m.V7);
        } else {
            str6 = null;
        }
        textView6.setText(str6);
        p02.f40218L.setText(getString(j.m.M7));
        p02.f40216J.setText(getString(j.m.d7));
        TextView switchSpeakerView = p02.f40224R;
        F.o(switchSpeakerView, "switchSpeakerView");
        if (switchSpeakerView.getVisibility() == 0) {
            p02.f40224R.setText(getString(j.m.G9));
        }
        try {
            ActivityC0889g activity = getActivity();
            if (activity != null && (packageName = activity.getPackageName()) != null) {
                F.m(packageName);
                ActivityC0889g activity2 = getActivity();
                if (activity2 != null && (packageManager = activity2.getPackageManager()) != null) {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
        }
        if (packageInfo != null) {
            p02.f40225S.setText(getString(j.m.h6) + " v" + packageInfo.versionName);
        }
        T1.a.a("BLE_LOG InfoFragment Selected String : " + getString(j.m.U7));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@l3.d Configuration newConfig) {
        F.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        T1.a.a("BLE_LOG InfoFragment " + o0());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r0().T2(true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(6:5|(1:7)(1:33)|8|(1:10)|11|(8:13|14|15|16|(2:20|(1:24))|(1:27)|28|29))|34|14|15|16|(3:18|20|(2:22|24))|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r4.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(@l3.d android.view.View r4, @l3.e android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.F.p(r4, r0)
            super.onViewCreated(r4, r5)
            r4 = 1
            r3.f42091R0 = r4
            android.os.Bundle r5 = r3.getArguments()
            r0 = 0
            r1 = 0
            if (r5 == 0) goto L58
            java.lang.String r2 = "showSwitchSpeaker"
            boolean r5 = r5.containsKey(r2)
            if (r5 == 0) goto L58
            android.os.Bundle r5 = r3.getArguments()
            if (r5 == 0) goto L26
            java.lang.Object r5 = r5.get(r2)
            goto L27
        L26:
            r5 = r1
        L27:
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.F.n(r5, r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r4) goto L35
            goto L36
        L35:
            r4 = r0
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "BLE_LOG shouldShowSwitchSpeaker is "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "SupportedDevicesFragment"
            com.harman.log.f.a(r2, r5)
            if (r4 == 0) goto L58
            com.harman.jbl.partybox.databinding.v0 r4 = r3.p0()
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f40223Q
            r4.setVisibility(r0)
            goto L63
        L58:
            com.harman.jbl.partybox.databinding.v0 r4 = r3.p0()
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f40223Q
            r5 = 8
            r4.setVisibility(r5)
        L63:
            com.harman.jbl.partybox.databinding.v0 r4 = r3.p0()
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.f40212F
            com.harman.jbl.partybox.ui.appmenu.a r2 = new com.harman.jbl.partybox.ui.appmenu.a
            r2.<init>()
            r5.setOnClickListener(r2)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.f40219M
            com.harman.jbl.partybox.ui.appmenu.b r2 = new com.harman.jbl.partybox.ui.appmenu.b
            r2.<init>()
            r5.setOnClickListener(r2)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r4.f40221O
            com.harman.jbl.partybox.ui.appmenu.c r2 = new com.harman.jbl.partybox.ui.appmenu.c
            r2.<init>()
            r5.setOnClickListener(r2)
            androidx.constraintlayout.widget.ConstraintLayout r4 = r4.f40215I
            com.harman.jbl.partybox.ui.appmenu.d r5 = new com.harman.jbl.partybox.ui.appmenu.d
            r5.<init>()
            r4.setOnClickListener(r5)
            java.lang.String r4 = " BLE_LOG AppMenuFragment and switchSpeaker clicked "
            T1.a.a(r4)
            androidx.fragment.app.g r4 = r3.getActivity()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            if (r4 == 0) goto Lb8
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            if (r4 == 0) goto Lb8
            kotlin.jvm.internal.F.m(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            androidx.fragment.app.g r5 = r3.getActivity()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            if (r5 == 0) goto Lb8
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            if (r5 == 0) goto Lb8
            android.content.pm.PackageInfo r1 = r5.getPackageInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb4
            goto Lb8
        Lb4:
            r4 = move-exception
            r4.printStackTrace()
        Lb8:
            if (r1 == 0) goto Ldf
            int r4 = com.harman.jbl.partybox.j.m.h6
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r5 = r1.versionName
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " v"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            com.harman.jbl.partybox.databinding.v0 r5 = r3.p0()
            android.widget.TextView r5 = r5.f40225S
            r5.setText(r4)
        Ldf:
            com.harman.jbl.partybox.ui.appmenu.h r4 = r3.q0()
            androidx.lifecycle.P r4 = r4.z()
            androidx.lifecycle.E r5 = r3.getViewLifecycleOwner()
            com.harman.jbl.partybox.ui.appmenu.InfoFragment$c r0 = new com.harman.jbl.partybox.ui.appmenu.InfoFragment$c
            r0.<init>()
            com.harman.jbl.partybox.ui.appmenu.InfoFragment$d r1 = new com.harman.jbl.partybox.ui.appmenu.InfoFragment$d
            r1.<init>(r0)
            r4.k(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.appmenu.InfoFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
