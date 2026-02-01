package com.harman.jbl.partybox.ui.support;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.AbstractC1843a1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.U;
import kotlin.text.C2222d;
import kotlin.text.z;

@E(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b5\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0004J\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0004J\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0004R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u0011018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/harman/jbl/partybox/ui/support/RenameDeviceFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "t0", "()V", "initView", "Landroid/view/View;", "v", "w0", "(Landroid/view/View;)V", com.google.android.gms.analytics.ecommerce.c.f27782c, "E0", "Landroid/widget/TextView;", "etView", "C0", "(Landroid/widget/TextView;)V", "Lcom/harman/sdk/device/PartyBoxDevice;", "", "A0", "(Lcom/harman/sdk/device/PartyBoxDevice;)Z", "B0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "handleOnBackPressed", "onBtnBackClick", "onSaveBtnClicked", "Lcom/harman/jbl/partybox/databinding/a1;", "Q0", "Lcom/harman/jbl/partybox/databinding/a1;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "v0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Landroidx/lifecycle/P;", "S0", "Landroidx/lifecycle/P;", "_keyboardShow", "Landroidx/lifecycle/LiveData;", "getKeyboardShow", "()Landroidx/lifecycle/LiveData;", "keyboardShow", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nRenameDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenameDeviceFragment.kt\ncom/harman/jbl/partybox/ui/support/RenameDeviceFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,221:1\n66#2,4:222\n1#3:226\n58#4,23:227\n93#4,3:250\n*S KotlinDebug\n*F\n+ 1 RenameDeviceFragment.kt\ncom/harman/jbl/partybox/ui/support/RenameDeviceFragment\n*L\n33#1:222,4\n148#1:227,23\n148#1:250,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RenameDeviceFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private static final String f45579T0 = "RenameDeviceFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private AbstractC1843a1 f45580Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f45581R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final P<Boolean> f45582S0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @U({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 RenameDeviceFragment.kt\ncom/harman/jbl/partybox/ui/support/RenameDeviceFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n149#2,11:98\n71#3:109\n77#4:110\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f45583E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ AbstractC1843a1 f45584F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f45585G;

        public b(int i4, AbstractC1843a1 abstractC1843a1, Ref.ObjectRef objectRef) {
            this.f45583E = i4;
            this.f45584F = abstractC1843a1;
            this.f45585G = objectRef;
        }

        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
            ?? r32;
            if (editable != null) {
                r32 = editable.toString();
            } else {
                r32 = 0;
            }
            if (r32 != 0) {
                byte[] bytes = r32.getBytes(C2222d.f52792b);
                F.o(bytes, "getBytes(...)");
                if (bytes.length > this.f45583E) {
                    this.f45584F.f39333o0.setText((CharSequence) this.f45585G.f52301E);
                    EditText editText = this.f45584F.f39333o0;
                    editText.setSelection(editText.getText().length());
                    return;
                }
                this.f45585G.f52301E = r32;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
            String str;
            boolean w12;
            P p4 = RenameDeviceFragment.this.f45582S0;
            HmDevice k12 = RenameDeviceFragment.this.v0().k1();
            if (k12 != null) {
                str = k12.p();
            } else {
                str = null;
            }
            w12 = z.w1(charSequence, str);
            p4.r(Boolean.valueOf(!w12));
        }
    }

    public RenameDeviceFragment() {
        super(j.i.f41423O0);
        this.f45581R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f45582S0 = new P<>();
    }

    private final boolean A0(PartyBoxDevice partyBoxDevice) {
        if (!com.harman.sdk.utils.d.R(partyBoxDevice.q()) && !com.harman.sdk.utils.d.S(partyBoxDevice.q())) {
            return false;
        }
        return true;
    }

    private final boolean B0(PartyBoxDevice partyBoxDevice) {
        if (com.harman.sdk.utils.d.I(partyBoxDevice.q()) && !A0(partyBoxDevice)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C0(android.widget.TextView r2) {
        /*
            r1 = this;
            r1.w0(r2)
            com.harman.jbl.partybox.databinding.a1 r2 = r1.f45580Q0
            if (r2 == 0) goto L21
            android.widget.EditText r2 = r2.f39333o0
            if (r2 == 0) goto L21
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L21
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L21
            java.lang.CharSequence r2 = kotlin.text.q.C5(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L23
        L21:
            java.lang.String r2 = ""
        L23:
            boolean r0 = kotlin.text.q.S1(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L32
            com.harman.jbl.partybox.ui.main.o r0 = r1.v0()
            r0.B2(r2)
        L32:
            androidx.navigation.u r2 = androidx.navigation.fragment.f.a(r1)
            r2.t0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.support.RenameDeviceFragment.C0(android.widget.TextView):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(RenameDeviceFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    private final void E0(View view) {
        if (view.requestFocus()) {
            Object systemService = requireContext().getSystemService("input_method");
            F.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    private final void initView() {
        int i4;
        ImageView imageView;
        HmDevice k12 = v0().k1();
        if (k12 == null) {
            return;
        }
        PartyBoxDevice partyBoxDevice = (PartyBoxDevice) k12;
        if (A0(partyBoxDevice)) {
            i4 = 24;
        } else if (B0(partyBoxDevice)) {
            i4 = 16;
        } else {
            i4 = 22;
        }
        final AbstractC1843a1 abstractC1843a1 = this.f45580Q0;
        if (abstractC1843a1 != null) {
            abstractC1843a1.f39333o0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
            abstractC1843a1.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RenameDeviceFragment.x0(RenameDeviceFragment.this, abstractC1843a1, view);
                }
            });
            abstractC1843a1.f39331m0.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RenameDeviceFragment.y0(RenameDeviceFragment.this, abstractC1843a1, view);
                }
            });
            if (k12.o() != null) {
                int r4 = com.harman.sdk.utils.d.r(requireContext(), k12.q(), k12.o());
                AbstractC1843a1 abstractC1843a12 = this.f45580Q0;
                if (abstractC1843a12 != null && (imageView = abstractC1843a12.f39329k0) != null) {
                    imageView.setImageResource(r4);
                }
            }
            abstractC1843a1.f39333o0.setText(k12.p());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f52301E = k12.p();
            EditText speakerNameEditText = abstractC1843a1.f39333o0;
            F.o(speakerNameEditText, "speakerNameEditText");
            speakerNameEditText.addTextChangedListener(new b(i4, abstractC1843a1, objectRef));
            abstractC1843a1.f39333o0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.harman.jbl.partybox.ui.support.i
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                    boolean z02;
                    z02 = RenameDeviceFragment.z0(RenameDeviceFragment.this, textView, i5, keyEvent);
                    return z02;
                }
            });
            EditText speakerNameEditText2 = abstractC1843a1.f39333o0;
            F.o(speakerNameEditText2, "speakerNameEditText");
            E0(speakerNameEditText2);
        }
    }

    private final void t0() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.support.e
                @Override // java.lang.Runnable
                public final void run() {
                    RenameDeviceFragment.u0(RenameDeviceFragment.this);
                }
            }, 300L);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(RenameDeviceFragment this$0) {
        ScrollView scrollView;
        F.p(this$0, "this$0");
        AbstractC1843a1 abstractC1843a1 = this$0.f45580Q0;
        if (abstractC1843a1 != null && (scrollView = abstractC1843a1.f39332n0) != null) {
            com.harman.jbl.partybox.utils.o.a(scrollView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o v0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45581R0.getValue();
    }

    private final void w0(View view) {
        Object systemService = requireContext().getSystemService("input_method");
        F.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(RenameDeviceFragment this$0, AbstractC1843a1 this_run, View view) {
        F.p(this$0, "this$0");
        F.p(this_run, "$this_run");
        EditText speakerNameEditText = this_run.f39333o0;
        F.o(speakerNameEditText, "speakerNameEditText");
        this$0.w0(speakerNameEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(RenameDeviceFragment this$0, AbstractC1843a1 this_run, View view) {
        F.p(this$0, "this$0");
        F.p(this_run, "$this_run");
        EditText speakerNameEditText = this_run.f39333o0;
        F.o(speakerNameEditText, "speakerNameEditText");
        this$0.w0(speakerNameEditText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(RenameDeviceFragment this$0, TextView textView, int i4, KeyEvent keyEvent) {
        F.p(this$0, "this$0");
        if (i4 == 6) {
            F.m(textView);
            this$0.C0(textView);
            return true;
        }
        return true;
    }

    @l3.d
    public final LiveData<Boolean> getKeyboardShow() {
        return this.f45582S0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final void onBtnBackClick() {
        EditText editText;
        AbstractC1843a1 abstractC1843a1 = this.f45580Q0;
        if (abstractC1843a1 != null && (editText = abstractC1843a1.f39333o0) != null) {
            w0(editText);
        }
        androidx.navigation.fragment.f.a(this).t0();
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        AbstractC1843a1 s12 = AbstractC1843a1.s1(inflater, viewGroup, false);
        F.o(s12, "inflate(...)");
        s12.v1(this);
        s12.M0(this);
        this.f45580Q0 = s12;
        View d4 = s12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f45580Q0 = null;
    }

    public final void onSaveBtnClicked() {
        EditText editText;
        AbstractC1843a1 abstractC1843a1 = this.f45580Q0;
        if (abstractC1843a1 != null && (editText = abstractC1843a1.f39333o0) != null) {
            C0(editText);
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        AbstractC1843a1 abstractC1843a1 = this.f45580Q0;
        if (abstractC1843a1 != null) {
            abstractC1843a1.f39330l0.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.support.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RenameDeviceFragment.D0(RenameDeviceFragment.this, view2);
                }
            });
            abstractC1843a1.f39330l0.f38613I.setText(getString(j.m.Y8));
            abstractC1843a1.f39333o0.addTextChangedListener(new c());
        }
    }
}
