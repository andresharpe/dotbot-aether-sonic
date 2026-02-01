package com.harman.jbl.partybox.ui.party.stereo.ui;

import N0.a;
import X2.p;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.K;
import androidx.core.content.C0669d;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.P;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.databinding.J;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontEditText;
import com.harman.jbl.partybox.ui.party.stereo.ui.e;
import com.harman.sdk.device.HmDevice;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlin.text.C2222d;
import kotlin.text.z;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.w1;

@E(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 C2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bB\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u001dR\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/ui/DevRenameDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/widget/EditText;", "et", "Lkotlin/H0;", "t0", "(Landroid/widget/EditText;)V", "s0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/harman/sdk/device/HmDevice;", "device", "", "defaultName", "initParams", "(Lcom/harman/sdk/device/HmDevice;Ljava/lang/String;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "()V", "onResume", "dismiss", "onDestroy", "onConfirmClick", "releaseFocus", "onBoarderClick", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/e;", "k1", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/party/stereo/ui/e;", "viewModel", "Lcom/harman/jbl/partybox/databinding/J;", "l1", "Lcom/harman/jbl/partybox/databinding/J;", "binding", "Landroidx/lifecycle/P;", "m1", "Landroidx/lifecycle/P;", "getName", "()Landroidx/lifecycle/P;", a.C0015a.f1688b, "Lcom/harman/jbl/partybox/ui/party/stereo/ui/a;", "n1", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/a;", "getNameChangeListener", "()Lcom/harman/jbl/partybox/ui/party/stereo/ui/a;", "setNameChangeListener", "(Lcom/harman/jbl/partybox/ui/party/stereo/ui/a;)V", "nameChangeListener", "o1", "Lcom/harman/sdk/device/HmDevice;", "mainDevice", "p1", "Ljava/lang/String;", "lastGroupName", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nDevRenameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevRenameDialog.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/DevRenameDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,200:1\n56#2,10:201\n58#3,23:211\n93#3,3:234\n*S KotlinDebug\n*F\n+ 1 DevRenameDialog.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/DevRenameDialog\n*L\n39#1:201,10\n89#1:211,23\n89#1:234,3\n*E\n"})
/* loaded from: classes2.dex */
public final class DevRenameDialog extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: q1, reason: collision with root package name */
    @l3.d
    private static final String f45325q1 = "Stereo";

    /* renamed from: r1, reason: collision with root package name */
    private static final long f45326r1 = 10000;

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final A f45327k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.e
    private J f45328l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final P<String> f45329m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.party.stereo.ui.a f45330n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.e
    private HmDevice f45331o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.e
    private String f45332p1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog$onConfirmClick$1", f = "DevRenameDialog.kt", i = {}, l = {com.harman.analytics.deviceAws.a.f37828k}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45337I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f45338J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f45339K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ String f45340L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ DevRenameDialog f45341M;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog$onConfirmClick$1$result$1$1", f = "DevRenameDialog.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super e.b>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45342I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ DevRenameDialog f45343J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f45344K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ String f45345L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DevRenameDialog devRenameDialog, HmDevice hmDevice, String str, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45343J = devRenameDialog;
                this.f45344K = hmDevice;
                this.f45345L = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45342I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    e r02 = this.f45343J.r0();
                    HmDevice hmDevice = this.f45344K;
                    String str = this.f45345L;
                    this.f45342I = 1;
                    obj = r02.u(hmDevice, str, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super e.b> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f45343J, this.f45344K, this.f45345L, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(HmDevice hmDevice, String str, DevRenameDialog devRenameDialog, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f45339K = hmDevice;
            this.f45340L = str;
            this.f45341M = devRenameDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            Object b4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45337I;
            Object obj2 = null;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.log.f.d(DevRenameDialog.f45325q1, "onConfirmClick() >>> request change group name to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f45339K));
                    DevRenameDialog devRenameDialog = this.f45341M;
                    HmDevice hmDevice = this.f45339K;
                    String str = this.f45340L;
                    Result.a aVar = Result.f51807F;
                    a aVar2 = new a(devRenameDialog, hmDevice, str, null);
                    this.f45337I = 1;
                    obj = w1.c(10000L, aVar2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                b4 = Result.b((e.b) obj);
            } catch (Throwable th) {
                Result.a aVar3 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            if (!Result.i(b4)) {
                obj2 = b4;
            }
            e.b bVar = (e.b) obj2;
            if (Result.j(b4) && bVar != null && bVar.f()) {
                com.harman.log.f.d(DevRenameDialog.f45325q1, "onConfirmClick() >>> rename to [" + this.f45340L + "] suc with rsp.name[" + bVar.e() + "] to dev:" + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f45339K));
                com.harman.jbl.partybox.ui.party.stereo.ui.a nameChangeListener = this.f45341M.getNameChangeListener();
                if (nameChangeListener != null) {
                    nameChangeListener.onNameChanged(bVar.e());
                }
                this.f45341M.dismiss();
            } else {
                com.harman.log.f.b(DevRenameDialog.f45325q1, "onConfirmClick() >>> fail to change device name to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(this.f45339K) + "\nexception[" + Result.e(b4) + "]");
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f45339K, this.f45340L, this.f45341M, cVar);
            bVar.f45338J = obj;
            return bVar;
        }
    }

    @U({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 DevRenameDialog.kt\ncom/harman/jbl/partybox/ui/party/stereo/ui/DevRenameDialog\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n90#2,9:98\n71#3:107\n77#4:108\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ J f45346E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ DevRenameDialog f45347F;

        public c(J j4, DevRenameDialog devRenameDialog) {
            this.f45346E = j4;
            this.f45347F = devRenameDialog;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l3.e Editable editable) {
            String str;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            byte[] bytes = str.getBytes(C2222d.f52792b);
            F.o(bytes, "getBytes(...)");
            if (bytes.length <= 16) {
                this.f45347F.f45332p1 = str;
            } else {
                this.f45346E.f38752l0.setText(this.f45347F.f45332p1);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l3.e CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    public DevRenameDialog() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog$special$$inlined$viewModels$default$1
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
        this.f45327k1 = FragmentViewModelLazyKt.c(this, N.d(e.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog$special$$inlined$viewModels$default$3
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
        this.f45329m1 = new P<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e r0() {
        return (e) this.f45327k1.getValue();
    }

    private final void s0(EditText editText) {
        Object systemService = requireContext().getSystemService("input_method");
        F.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    private final void t0(EditText editText) {
        InputMethodManager inputMethodManager;
        if (editText.requestFocus() && (inputMethodManager = (InputMethodManager) requireContext().getSystemService("input_method")) != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        HmCustomFontEditText hmCustomFontEditText;
        if (getFragmentManager() != null) {
            super.dismiss();
            J j4 = this.f45328l1;
            if (j4 != null && (hmCustomFontEditText = j4.f38752l0) != null) {
                s0(hmCustomFontEditText);
            }
        }
    }

    @l3.d
    public final P<String> getName() {
        return this.f45329m1;
    }

    @l3.e
    public final com.harman.jbl.partybox.ui.party.stereo.ui.a getNameChangeListener() {
        return this.f45330n1;
    }

    @K
    public final void initParams(@l3.e HmDevice hmDevice, @l3.e String str) {
        String str2;
        if (hmDevice != null) {
            str2 = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice);
        } else {
            str2 = null;
        }
        com.harman.log.f.d(f45325q1, "initParams() >>> def.name[" + str + "] device: " + str2);
        this.f45329m1.r(str);
        this.f45331o1 = hmDevice;
        this.f45332p1 = str;
    }

    @K
    public final void onBoarderClick() {
        dismiss();
    }

    @K
    public final void onConfirmClick() {
        boolean S12;
        HmDevice hmDevice;
        String f4 = this.f45329m1.f();
        if (f4 != null) {
            S12 = z.S1(f4);
            if (!S12 && (hmDevice = this.f45331o1) != null) {
                C2323l.f(androidx.lifecycle.F.a(this), C2322k0.e(), null, new b(hmDevice, f4, this, null), 2, null);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Window window;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        Context context = getContext();
        if (context != null && (window = onCreateDialog.getWindow()) != null) {
            window.setNavigationBarColor(C0669d.f(context, j.d.f40732a));
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(21);
        }
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        J s12 = J.s1(inflater, viewGroup, false);
        F.o(s12, "inflate(...)");
        this.f45328l1 = s12;
        s12.f38752l0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        s12.f38752l0.setHorizontallyScrolling(true);
        HmCustomFontEditText etGroupName = s12.f38752l0;
        F.o(etGroupName, "etGroupName");
        etGroupName.addTextChangedListener(new c(s12, this));
        s12.M0(this);
        s12.v1(this);
        View d4 = s12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f45330n1 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        HmCustomFontEditText hmCustomFontEditText;
        super.onResume();
        J j4 = this.f45328l1;
        if (j4 != null && (hmCustomFontEditText = j4.f38752l0) != null) {
            hmCustomFontEditText.requestFocus();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setGravity(80);
        }
    }

    @K
    public final void releaseFocus() {
        HmCustomFontEditText hmCustomFontEditText;
        J j4 = this.f45328l1;
        if (j4 != null && (hmCustomFontEditText = j4.f38752l0) != null) {
            s0(hmCustomFontEditText);
        }
    }

    public final void setNameChangeListener(@l3.e com.harman.jbl.partybox.ui.party.stereo.ui.a aVar) {
        this.f45330n1 = aVar;
    }
}
