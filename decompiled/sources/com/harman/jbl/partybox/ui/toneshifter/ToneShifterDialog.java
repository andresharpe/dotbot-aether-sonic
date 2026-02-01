package com.harman.jbl.partybox.ui.toneshifter;

import X2.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.databinding.L;
import com.harman.jbl.partybox.j;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/harman/jbl/partybox/ui/toneshifter/ToneShifterDialog;", "Lcom/harman/jbl/partybox/ui/toneshifter/BottomPopUpDialogFragment;", "", "value", "Lkotlin/H0;", "D0", "(I)V", "A0", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "buildContentView", "(Landroid/view/View;)V", "observeModel", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "prepareData", "Landroid/content/Context;", "q1", "Landroid/content/Context;", "context", "Lcom/harman/sdk/device/PartyBoxDevice;", "r1", "Lcom/harman/sdk/device/PartyBoxDevice;", "device", "Lcom/harman/jbl/partybox/databinding/L;", "s1", "Lkotlin/A;", "E0", "()Lcom/harman/jbl/partybox/databinding/L;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "t1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partybox/ui/toneshifter/i;", "u1", "F0", "()Lcom/harman/jbl/partybox/ui/toneshifter/i;", "vm", "<init>", "(Landroid/content/Context;Lcom/harman/sdk/device/PartyBoxDevice;)V", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ToneShifterDialog extends BottomPopUpDialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String TAG = "ToneShifterDialog";
    public static final int TONESHIFTER_MAX = 5;
    public static final int TONESHIFTER_MIN = -5;

    /* renamed from: q1, reason: collision with root package name */
    @l3.d
    private final Context f45668q1;

    /* renamed from: r1, reason: collision with root package name */
    @l3.d
    private final PartyBoxDevice f45669r1;

    /* renamed from: s1, reason: collision with root package name */
    @l3.d
    private final A f45670s1;

    /* renamed from: t1, reason: collision with root package name */
    private BitmapDrawable f45671t1;

    /* renamed from: u1, reason: collision with root package name */
    @l3.d
    private final A f45672u1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<L> {
        b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final L n() {
            return L.c(ToneShifterDialog.this.getLayoutInflater());
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<Integer, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num.intValue());
            return H0.f51801a;
        }

        public final void c(int i4) {
            ToneShifterDialog.this.F0().B(i4 - 5);
            ToneShifterDialog.this.F0().u();
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements l<Integer, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num);
            return H0.f51801a;
        }

        public final void c(Integer num) {
            ToneShifterDialog toneShifterDialog = ToneShifterDialog.this;
            F.m(num);
            toneShifterDialog.D0(num.intValue());
            ToneShifterDialog.this.A0(num.intValue());
            ToneShifterDialog.this.E0().f38844H.setValue(num.intValue() + 5);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements l<Integer, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num);
            return H0.f51801a;
        }

        public final void c(Integer num) {
            ToneShifterDialog.this.E0().f38844H.setInitialValue(num.intValue() + 5);
        }
    }

    /* loaded from: classes2.dex */
    static final class f implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f45681a;

        f(l function) {
            F.p(function, "function");
            this.f45681a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45681a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45681a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToneShifterDialog(@l3.d Context context, @l3.d PartyBoxDevice device) {
        super(context, 0, null, false, 14, null);
        A a4;
        A a5;
        F.p(context, "context");
        F.p(device, "device");
        this.f45668q1 = context;
        this.f45669r1 = device;
        a4 = C.a(new b());
        this.f45670s1 = a4;
        a5 = C.a(new X2.a<i>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog$vm$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final i n() {
                PartyBoxDevice partyBoxDevice;
                final ToneShifterDialog toneShifterDialog = ToneShifterDialog.this;
                final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog$vm$2$invoke$$inlined$viewModels$default$1
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
                i iVar = (i) FragmentViewModelLazyKt.c(toneShifterDialog, N.d(i.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog$vm$2$invoke$$inlined$viewModels$default$2
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
                }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog$vm$2$invoke$$inlined$viewModels$default$3
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
                            bVar = toneShifterDialog.getDefaultViewModelProviderFactory();
                        }
                        F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                        return bVar;
                    }
                }).getValue();
                partyBoxDevice = ToneShifterDialog.this.f45669r1;
                iVar.A(partyBoxDevice);
                return iVar;
            }
        });
        this.f45672u1 = a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0(int i4) {
        boolean z3;
        AppCompatTextView appCompatTextView = E0().f38842F;
        if (i4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        appCompatTextView.setEnabled(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(ToneShifterDialog this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(ToneShifterDialog this$0, View view) {
        F.p(this$0, "this$0");
        this$0.F0().z();
        this$0.F0().u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void D0(int i4) {
        E0().f38848L.setText(String.valueOf(i4));
        if (i4 == 0) {
            E0().f38848L.setTextColor(getResources().getColor(j.d.f40749f1));
            E0().f38847K.setTextColor(getResources().getColor(j.d.f40749f1));
            E0().f38842F.setTextColor(getResources().getColor(j.d.f40790x0));
            E0().f38847K.setText(getString(j.m.c5));
            return;
        }
        E0().f38848L.setTextColor(getResources().getColor(j.d.f40685C0));
        E0().f38847K.setTextColor(getResources().getColor(j.d.f40685C0));
        E0().f38842F.setTextColor(getResources().getColor(j.d.f40685C0));
        E0().f38847K.setText(getString(j.m.Z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L E0() {
        return (L) this.f45670s1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i F0() {
        return (i) this.f45672u1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(ToneShifterDialog this$0) {
        F.p(this$0, "this$0");
        this$0.E0().f38845I.setVisibility(0);
        FrameLayout frameLayout = this$0.E0().f38843G;
        BitmapDrawable bitmapDrawable = this$0.f45671t1;
        if (bitmapDrawable == null) {
            F.S("backgroundImage");
            bitmapDrawable = null;
        }
        frameLayout.setBackground(bitmapDrawable);
    }

    @Override // com.harman.jbl.partybox.ui.toneshifter.BottomPopUpDialogFragment
    public void buildContentView(@l3.d View view) {
        F.p(view, "view");
        E0().f38846J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.toneshifter.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToneShifterDialog.B0(ToneShifterDialog.this, view2);
            }
        });
        E0().f38842F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.toneshifter.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToneShifterDialog.C0(ToneShifterDialog.this, view2);
            }
        });
        E0().f38844H.setOnValueChange(new c());
    }

    @Override // com.harman.jbl.partybox.ui.toneshifter.BottomPopUpDialogFragment
    @l3.d
    public View getContentView() {
        Resources resources;
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f45671t1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        FrameLayout d4 = E0().d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // com.harman.jbl.partybox.ui.toneshifter.BottomPopUpDialogFragment
    public void observeModel() {
        F0().y().k(this, new f(new d()));
        F0().x().k(this, new f(new e()));
    }

    @Override // com.harman.jbl.partybox.ui.toneshifter.BottomPopUpDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.toneshifter.f
            @Override // java.lang.Runnable
            public final void run() {
                ToneShifterDialog.G0(ToneShifterDialog.this);
            }
        }, 200L);
    }

    @Override // com.harman.jbl.partybox.ui.toneshifter.BottomPopUpDialogFragment
    public void prepareData() {
        F0().v();
    }
}
