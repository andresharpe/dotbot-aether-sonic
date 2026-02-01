package com.harman.jbl.partybox.ui.core;

import X2.l;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActivityC0587e;
import androidx.core.app.C0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Q;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.navigation.C0943u;
import androidx.navigation.J;
import androidx.navigation.fragment.NavHostFragment;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$1;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/harman/jbl/partybox/ui/core/PartyBoxDashboardActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onPause", "", C0.f11609s0, "M0", "(Ljava/lang/String;)V", "Lcom/harman/jbl/partybox/ui/main/o;", "h0", "Lkotlin/A;", "K0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/sdk/device/PartyBoxDevice;", "i0", "Lcom/harman/sdk/device/PartyBoxDevice;", "mainDevice", "Lcom/harman/jbl/partybox/ui/core/c;", "j0", "L0", "()Lcom/harman/jbl/partybox/ui/core/c;", "viewModel", "Landroid/content/BroadcastReceiver;", "k0", "Landroid/content/BroadcastReceiver;", "mDataAnalyticsReceiver", "<init>", "l0", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyBoxDashboardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyBoxDashboardActivity.kt\ncom/harman/jbl/partybox/ui/core/PartyBoxDashboardActivity\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,181:1\n30#2,4:182\n75#3,13:186\n*S KotlinDebug\n*F\n+ 1 PartyBoxDashboardActivity.kt\ncom/harman/jbl/partybox/ui/core/PartyBoxDashboardActivity\n*L\n34#1:182,4\n38#1:186,13\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyBoxDashboardActivity extends ActivityC0587e {

    /* renamed from: l0, reason: collision with root package name */
    @l3.d
    public static final a f42403l0 = new a(null);

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private static final String f42404m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    public static final String f42405n0 = "EXTRACT_TARGET_GROUP";

    /* renamed from: o0, reason: collision with root package name */
    private static boolean f42406o0;

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final A f42407h0;

    /* renamed from: i0, reason: collision with root package name */
    private PartyBoxDevice f42408i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final A f42409j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.d
    private final BroadcastReceiver f42410k0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final boolean a() {
            return PartyBoxDashboardActivity.f42406o0;
        }

        @l3.d
        public final String b() {
            return PartyBoxDashboardActivity.f42404m0;
        }

        public final void c(boolean z3) {
            PartyBoxDashboardActivity.f42406o0 = z3;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@l3.e Context context, @l3.e Intent intent) {
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
            a aVar = PartyBoxDashboardActivity.f42403l0;
            com.harman.log.f.a(aVar.b(), aVar.b() + " BLE_LOG btConnectStatusLiveData : observe callback " + bool);
            if (!bool.booleanValue() && aVar.a() && !PartyBoxDashboardActivity.this.isFinishing()) {
                PartyBoxDashboardActivity.this.K0().x2();
                PartyBoxDashboardActivity.this.finish();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f42417a;

        d(l function) {
            F.p(function, "function");
            this.f42417a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42417a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42417a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        private final long f42418E = 500;

        /* renamed from: F, reason: collision with root package name */
        private long f42419F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ WindowManager f42420G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ TextView f42421H;

        e(WindowManager windowManager, TextView textView) {
            this.f42420G = windowManager;
            this.f42421H = textView;
        }

        public final long a() {
            return this.f42418E;
        }

        public final long b() {
            return this.f42419F;
        }

        public final void c(long j4) {
            this.f42419F = j4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@l3.d View view) {
            F.p(view, "view");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f42419F < this.f42418E) {
                this.f42420G.removeViewImmediate(this.f42421H);
            }
            this.f42419F = currentTimeMillis;
        }
    }

    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.a<m0.b> {
        f() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0.b n() {
            PartyBoxDevice partyBoxDevice = PartyBoxDashboardActivity.this.f42408i0;
            if (partyBoxDevice == null) {
                F.S("mainDevice");
                partyBoxDevice = null;
            }
            return new com.harman.jbl.partybox.ui.core.d(partyBoxDevice);
        }
    }

    static {
        String simpleName = PartyBoxDashboardActivity.class.getSimpleName();
        F.o(simpleName, "getSimpleName(...)");
        f42404m0 = simpleName;
        f42406o0 = true;
    }

    public PartyBoxDashboardActivity() {
        super(j.i.f41490f);
        this.f42407h0 = ApplicationViewModelLazyKt.e(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$1(this), new ApplicationViewModelLazyKt$applicationViewModels$2(this));
        final X2.a aVar = null;
        this.f42409j0 = new l0(N.d(com.harman.jbl.partybox.ui.core.c.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity$special$$inlined$viewModels$default$2
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
        }, new f(), new X2.a<R.a>() { // from class: com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final R.a n() {
                R.a aVar2;
                X2.a aVar3 = X2.a.this;
                if (aVar3 == null || (aVar2 = (R.a) aVar3.n()) == null) {
                    R.a l4 = this.l();
                    F.o(l4, "this.defaultViewModelCreationExtras");
                    return l4;
                }
                return aVar2;
            }
        });
        this.f42410k0 = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o K0() {
        return (o) this.f42407h0.getValue();
    }

    private final com.harman.jbl.partybox.ui.core.c L0() {
        return (com.harman.jbl.partybox.ui.core.c) this.f42409j0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N0(PartyBoxDashboardActivity this$0, TextView messages, View view) {
        F.p(this$0, "this$0");
        F.p(messages, "$messages");
        Object systemService = this$0.getSystemService("clipboard");
        F.n(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setText(messages.getText().toString());
        Toast.makeText(this$0.getApplicationContext(), "已经复制到剪贴板！", 0).show();
        return false;
    }

    public final void M0(@l3.d String msg) {
        F.p(msg, "msg");
        if (isFinishing()) {
            return;
        }
        com.harman.log.f.a(f42404m0, "showUploadAnalyticsInfo");
        WindowManager windowManager = getWindowManager();
        final TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundColor(Color.rgb(0, 0, 0));
        textView.getBackground().setAlpha(180);
        textView.setTextColor(Color.rgb(245, 245, 245));
        textView.setPadding(20, 20, 20, 20);
        textView.setTextIsSelectable(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setLongClickable(true);
        textView.setEnabled(true);
        textView.setOnClickListener(new e(windowManager, textView));
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.harman.jbl.partybox.ui.core.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean N02;
                N02 = PartyBoxDashboardActivity.N0(PartyBoxDashboardActivity.this, textView, view);
                return N02;
            }
        });
        textView.setText("send analytics data -->" + msg);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = 32;
        layoutParams.type = 2;
        layoutParams.gravity = 17;
        try {
            windowManager.addView(textView, layoutParams);
        } catch (Exception e4) {
            com.harman.log.f.c(f42404m0, "", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        PartyBoxDevice partyBoxDevice;
        super.onCreate(bundle);
        String str = f42404m0;
        com.harman.log.f.b(str, "PartyBoxDashboardActivity onCreate(), so set autoBack = true");
        f42406o0 = true;
        HmDevice k12 = K0().k1();
        if (k12 instanceof PartyBoxDevice) {
            partyBoxDevice = (PartyBoxDevice) k12;
        } else {
            partyBoxDevice = null;
        }
        if (partyBoxDevice == null) {
            finish();
            return;
        }
        this.f42408i0 = partyBoxDevice;
        Fragment n02 = S().n0(j.h.pb);
        F.n(n02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C0943u navController = ((NavHostFragment) n02).getNavController();
        J b4 = navController.M().b(j.k.f41583a);
        if (com.harman.sdk.utils.d.G(partyBoxDevice)) {
            com.harman.log.f.b(str, "PartyBoxDashboardActivity onCreate(), isNewPartyBox");
            b4.f0(j.h.Kf);
        } else if (com.harman.sdk.utils.d.I(partyBoxDevice.q())) {
            com.harman.log.f.b(str, "PartyBoxDashboardActivity onCreate(), isOldDevice");
            b4.f0(j.h.f41312n3);
        } else {
            com.harman.log.f.b(str, "PartyBoxDashboardActivity onCreate(), else");
            b4.f0(j.h.Kf);
        }
        navController.O0(b4, null);
        L0().w().k(this, new d(new c()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            unregisterReceiver(this.f42410k0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.f42410k0, new IntentFilter(com.harman.jbl.partybox.constants.a.f38384u), 2);
        } else {
            registerReceiver(this.f42410k0, new IntentFilter(com.harman.jbl.partybox.constants.a.f38384u));
        }
    }
}
