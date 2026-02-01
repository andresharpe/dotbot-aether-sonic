package com.harman.jbl.partylight.lib.debug;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActivityC0587e;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import j2.C2074a;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import m2.C2363c;

@E(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/harman/jbl/partylight/lib/debug/DebugConfigActivity;", "Landroidx/appcompat/app/e;", "Lkotlin/H0;", "L0", "()V", "R0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "Lm2/c;", "h0", "Lkotlin/A;", "J0", "()Lm2/c;", "binding", "Lcom/harman/jbl/partylight/lib/debug/f;", "i0", "K0", "()Lcom/harman/jbl/partylight/lib/debug/f;", "vm", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "j0", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mAutoOTATestListener", "k0", "mEnableMacListener", "<init>", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDebugConfigActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugConfigActivity.kt\ncom/harman/jbl/partylight/lib/debug/DebugConfigActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,173:1\n40#2,8:174\n*S KotlinDebug\n*F\n+ 1 DebugConfigActivity.kt\ncom/harman/jbl/partylight/lib/debug/DebugConfigActivity\n*L\n42#1:174,8\n*E\n"})
/* loaded from: classes2.dex */
public final class DebugConfigActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final A f46471h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final A f46472i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f46473j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f46474k0;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.a<C2363c> {
        a() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2363c n() {
            return C2363c.c(DebugConfigActivity.this.getLayoutInflater());
        }
    }

    public DebugConfigActivity() {
        A a4;
        a4 = C.a(new a());
        this.f46471h0 = a4;
        this.f46472i0 = new l0(N.d(f.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.debug.DebugConfigActivity$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.debug.DebugConfigActivity$special$$inlined$viewModels$default$1
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
        this.f46473j0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partylight.lib.debug.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DebugConfigActivity.P0(compoundButton, z3);
            }
        };
        this.f46474k0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partylight.lib.debug.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DebugConfigActivity.Q0(compoundButton, z3);
            }
        };
    }

    private final C2363c J0() {
        return (C2363c) this.f46471h0.getValue();
    }

    private final f K0() {
        return (f) this.f46472i0.getValue();
    }

    private final void L0() {
        J0().f55095L.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.debug.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugConfigActivity.M0(DebugConfigActivity.this, view);
            }
        });
        J0().f55090G.setOnCheckedChangeListener(this.f46473j0);
        J0().f55094K.setOnCheckedChangeListener(this.f46474k0);
        J0().f55093J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.debug.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugConfigActivity.N0(DebugConfigActivity.this, view);
            }
        });
        J0().f55092I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.debug.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugConfigActivity.O0(DebugConfigActivity.this, view);
            }
        });
        J0().f55096M.setAdapter(new g(K0(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(DebugConfigActivity this$0, View view) {
        F.p(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(DebugConfigActivity this$0, View view) {
        String str;
        F.p(this$0, "this$0");
        f K02 = this$0.K0();
        Editable text = this$0.J0().f55097N.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        K02.z(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(DebugConfigActivity this$0, View view) {
        F.p(this$0, "this$0");
        this$0.K0().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(CompoundButton compoundButton, boolean z3) {
        C2074a.f("auto_ota_test", z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(CompoundButton compoundButton, boolean z3) {
        C2074a.f("ENABLE_SHOW_MAC", z3);
    }

    private final void R0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setContentView(J0().d());
        L0();
        R0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        J0().f55090G.setChecked(C2074a.b("auto_ota_test"));
        J0().f55094K.setChecked(C2074a.b("ENABLE_SHOW_MAC"));
    }
}
