package com.harman.jbl.partybox.ui.feedback.view;

import X2.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1907n0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.CollapsingToolBar;
import com.harman.jbl.partybox.utils.q;
import com.harman.sdk.device.HmDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u0019\u0010\u001d\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u001d\u0010\u0015R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/harman/jbl/partybox/ui/feedback/view/FeedbackFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Landroid/view/View$OnClickListener;", "Lkotlin/H0;", "onBtnBackClick", "()V", "t0", "y0", "", "enable", "Landroid/view/ViewGroup;", "vg", "u0", "(ZLandroid/view/ViewGroup;)V", "G0", "Landroid/widget/TextView;", "v", "F0", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "E0", "(Landroid/view/View;)V", com.google.android.gms.analytics.ecommerce.c.f27782c, "H0", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onClick", "Lcom/harman/jbl/partybox/databinding/n0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "v0", "()Lcom/harman/jbl/partybox/databinding/n0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "w0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/feedback/viewmodel/a;", "S0", "x0", "()Lcom/harman/jbl/partybox/ui/feedback/viewmodel/a;", "viewModel", "", "LZ1/a;", "T0", "Ljava/util/List;", "list", "U0", "Z", "isBlockedScrollView", "", "V0", "I", "textlimit", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nFeedbackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackFragment.kt\ncom/harman/jbl/partybox/ui/feedback/view/FeedbackFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n66#2,4:281\n56#3,10:285\n1#4:295\n*S KotlinDebug\n*F\n+ 1 FeedbackFragment.kt\ncom/harman/jbl/partybox/ui/feedback/view/FeedbackFragment\n*L\n34#1:281,4\n35#1:285,10\n*E\n"})
/* loaded from: classes2.dex */
public final class FeedbackFragment extends BackDispatcherFragment implements View.OnClickListener {

    @l3.d
    public static final String TAG = "FeedbackFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43658Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43659R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f43660S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final List<Z1.a> f43661T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f43662U0;

    /* renamed from: V0, reason: collision with root package name */
    private int f43663V0;

    /* renamed from: W0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43657W0 = {N.u(new PropertyReference1Impl(FeedbackFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentFeedbackBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1907n0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43668N = new b();

        b() {
            super(1, C1907n0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentFeedbackBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1907n0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1907n0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements CollapsingToolBar.b {
        c() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void a() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void b() {
            FeedbackFragment.this.onBtnBackClick();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1907n0 f43670E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ FeedbackFragment f43671F;

        d(C1907n0 c1907n0, FeedbackFragment feedbackFragment) {
            this.f43670E = c1907n0;
            this.f43671F = feedbackFragment;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.d Editable s4) {
            F.p(s4, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.d CharSequence s4, int i4, int i5, int i6) {
            F.p(s4, "s");
        }

        @Override // android.text.TextWatcher
        @SuppressLint({"SetTextI18n"})
        public void onTextChanged(@l3.d CharSequence s4, int i4, int i5, int i6) {
            F.p(s4, "s");
            C1907n0 c1907n0 = this.f43670E;
            c1907n0.f39883Y.setText(String.valueOf(c1907n0.f39866H.getText()).length() + " / " + this.f43671F.f43663V0);
            this.f43670E.f39866H.setCursorVisible(true);
            this.f43671F.G0();
        }
    }

    public FeedbackFragment() {
        super(j.i.f41483d0);
        this.f43658Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43668N);
        this.f43659R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.feedback.view.FeedbackFragment$special$$inlined$viewModels$default$1
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
        this.f43660S0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.feedback.viewmodel.a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.feedback.view.FeedbackFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.feedback.view.FeedbackFragment$special$$inlined$viewModels$default$3
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
        this.f43661T0 = new ArrayList();
        this.f43663V0 = 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(FeedbackFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(FeedbackFragment this$0, Boolean bool) {
        F.p(this$0, "this$0");
        F.m(bool);
        if (bool.booleanValue()) {
            I a4 = f.a();
            F.o(a4, "actionFeedbackFragmentTo…dbackSuccessFragment(...)");
            q.f(this$0, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C0(C1907n0 this_apply, FeedbackFragment this$0, TextView textView, int i4, KeyEvent keyEvent) {
        CharSequence C5;
        F.p(this_apply, "$this_apply");
        F.p(this$0, "this$0");
        C5 = kotlin.text.A.C5(String.valueOf(this_apply.f39866H.getText()));
        if (C5.toString().length() > 0 && i4 == 6) {
            this$0.t0();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(C1907n0 this_apply, View view) {
        F.p(this_apply, "$this_apply");
        this_apply.f39866H.setCursorVisible(true);
    }

    private final void E0(View view) {
        if (this.f43661T0.get(Integer.parseInt(view.getTag().toString())).f3833c) {
            this.f43661T0.get(Integer.parseInt(view.getTag().toString())).f3833c = false;
            view.setBackgroundResource(j.f.Mb);
        } else {
            this.f43661T0.get(Integer.parseInt(view.getTag().toString())).f3833c = true;
            view.setBackgroundResource(j.f.Nb);
        }
    }

    private final void F0(TextView textView) {
        if (this.f43661T0.get(Integer.parseInt(textView.getTag().toString())).f3833c) {
            this.f43661T0.get(Integer.parseInt(textView.getTag().toString())).f3833c = false;
            textView.setBackgroundResource(j.f.Ob);
            textView.setTextColor(C0669d.f(requireContext(), j.d.f40749f1));
        } else {
            this.f43661T0.get(Integer.parseInt(textView.getTag().toString())).f3833c = true;
            textView.setBackgroundResource(j.f.Pb);
            textView.setTextColor(C0669d.f(requireContext(), j.d.f40753h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0() {
        CharSequence C5;
        boolean z3;
        Editable text = v0().f39866H.getText();
        F.m(text);
        C5 = kotlin.text.A.C5(text);
        if (C5.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int size = this.f43661T0.size() - 2;
        if (size >= 0) {
            for (int i4 = 0; !this.f43661T0.get(i4).f3833c; i4++) {
                if (i4 != size) {
                }
            }
            v0().f39882X.setEnabled(true);
            v0().f39882X.setBackground(C0669d.i(requireActivity(), j.f.f41104t));
            v0().f39882X.setTextColor(C0669d.f(requireActivity(), j.d.f40749f1));
        }
        if (!z3) {
            v0().f39882X.setEnabled(false);
            v0().f39882X.setBackground(C0669d.i(requireActivity(), j.f.f41112v));
            v0().f39882X.setTextColor(C0669d.f(requireActivity(), j.d.f40755h1));
            return;
        }
        v0().f39882X.setEnabled(true);
        v0().f39882X.setBackground(C0669d.i(requireActivity(), j.f.f41104t));
        v0().f39882X.setTextColor(C0669d.f(requireActivity(), j.d.f40749f1));
    }

    private final void H0(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBtnBackClick() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void t0() {
        CharSequence C5;
        String str;
        String str2;
        CharSequence C52;
        y0();
        ArrayList<String> arrayList = new ArrayList<>();
        int size = this.f43661T0.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f43661T0.get(i4).f3833c) {
                arrayList.add(this.f43661T0.get(i4).f3831a);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f43662U0 = false;
        ConstraintLayout layout = v0().f39876R;
        F.o(layout, "layout");
        u0(false, layout);
        v0().f39876R.setClickable(false);
        if (F.g(arrayList.get(arrayList.size() - 1), getResources().getString(j.m.I9))) {
            arrayList.remove(arrayList.size() - 1);
        }
        C5 = kotlin.text.A.C5(String.valueOf(v0().f39866H.getText()));
        if (C5.toString().length() > 0) {
            C52 = kotlin.text.A.C5(String.valueOf(v0().f39866H.getText()));
            arrayList.add(C52.toString());
        }
        if (w0().k1() != null) {
            HmDevice k12 = w0().k1();
            if (k12 != null) {
                str2 = com.harman.sdk.utils.d.v(k12.q());
            } else {
                str2 = null;
            }
            str = String.valueOf(str2);
        } else {
            str = "";
        }
        x0().B(str, arrayList);
    }

    private final void u0(boolean z3, ViewGroup viewGroup) {
        viewGroup.setEnabled(z3);
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            F.o(childAt, "getChildAt(...)");
            childAt.setEnabled(z3);
            childAt.setClickable(z3);
        }
    }

    private final C1907n0 v0() {
        return (C1907n0) this.f43658Q0.a(this, f43657W0[0]);
    }

    private final o w0() {
        return (o) this.f43659R0.getValue();
    }

    private final com.harman.jbl.partybox.ui.feedback.viewmodel.a x0() {
        return (com.harman.jbl.partybox.ui.feedback.viewmodel.a) this.f43660S0.getValue();
    }

    private final void y0() {
        IBinder iBinder;
        Object systemService = requireActivity().getSystemService("input_method");
        F.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = getView();
        if (view != null) {
            iBinder = view.getWindowToken();
        } else {
            iBinder = null;
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(FeedbackFragment this$0) {
        F.p(this$0, "this$0");
        this$0.v0().f39881W.z(130);
        this$0.v0().f39866H.requestFocus();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // android.view.View.OnClickListener
    @SuppressLint({"SetTextI18n"})
    public void onClick(@l3.e View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i4 = j.h.R4;
        if (num != null && num.intValue() == i4) {
            F.n(view, "null cannot be cast to non-null type android.widget.TextView");
            F0((TextView) view);
            G0();
            return;
        }
        int i5 = j.h.S4;
        if (num != null && num.intValue() == i5) {
            F.n(view, "null cannot be cast to non-null type android.widget.TextView");
            F0((TextView) view);
            G0();
            return;
        }
        int i6 = j.h.T4;
        if (num != null && num.intValue() == i6) {
            F.n(view, "null cannot be cast to non-null type android.widget.TextView");
            F0((TextView) view);
            G0();
            return;
        }
        int i7 = j.h.U4;
        if (num != null && num.intValue() == i7) {
            E0(view);
            G0();
            return;
        }
        int i8 = j.h.V4;
        if (num != null && num.intValue() == i8) {
            E0(view);
            G0();
            return;
        }
        int i9 = j.h.W4;
        if (num != null && num.intValue() == i9) {
            E0(view);
            G0();
            return;
        }
        int i10 = j.h.X4;
        if (num != null && num.intValue() == i10) {
            E0(view);
            G0();
            return;
        }
        int i11 = j.h.Y4;
        if (num != null && num.intValue() == i11) {
            E0(view);
            G0();
            return;
        }
        int i12 = j.h.Z4;
        if (num != null && num.intValue() == i12) {
            E0(view);
            if (this.f43661T0.get(Integer.parseInt(view.getTag().toString())).f3833c) {
                v0().f39884Z.setVisibility(0);
                v0().f39866H.setImeOptions(6);
                v0().f39883Y.setText(String.valueOf(v0().f39866H.getText()).length() + " / " + this.f43663V0);
                H0(view);
                v0().f39881W.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.feedback.view.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedbackFragment.z0(FeedbackFragment.this);
                    }
                }, 100L);
                return;
            }
            y0();
            v0().f39884Z.setVisibility(8);
            v0().f39866H.setText("");
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        T1.a.a("BLE_LOG FeedbackFragment onViewCreated ");
        super.onViewCreated(view, bundle);
        final C1907n0 v02 = v0();
        v02.f39864F.setNavigationListener(new c());
        v02.f39882X.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.feedback.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeedbackFragment.A0(FeedbackFragment.this, view2);
            }
        });
        v02.f39866H.addTextChangedListener(new d(v02, this));
        x0().x().k(getViewLifecycleOwner(), new Q() { // from class: com.harman.jbl.partybox.ui.feedback.view.c
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                FeedbackFragment.B0(FeedbackFragment.this, (Boolean) obj);
            }
        });
        v02.f39866H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.harman.jbl.partybox.ui.feedback.view.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean C02;
                C02 = FeedbackFragment.C0(C1907n0.this, this, textView, i4, keyEvent);
                return C02;
            }
        });
        v02.f39866H.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.feedback.view.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeedbackFragment.D0(C1907n0.this, view2);
            }
        });
        v02.f39866H.setCursorVisible(false);
        G0();
        v0().f39867I.setOnClickListener(this);
        v0().f39868J.setOnClickListener(this);
        v0().f39869K.setOnClickListener(this);
        v0().f39870L.setOnClickListener(this);
        v0().f39871M.setOnClickListener(this);
        v0().f39872N.setOnClickListener(this);
        v0().f39873O.setOnClickListener(this);
        v0().f39874P.setOnClickListener(this);
        v0().f39875Q.setOnClickListener(this);
        this.f43661T0.addAll(x0().y());
    }
}
