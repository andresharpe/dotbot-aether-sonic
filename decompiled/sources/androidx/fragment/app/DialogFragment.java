package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.lifecycle.Q;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;

/* loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;

    /* renamed from: d1, reason: collision with root package name */
    private static final String f14888d1 = "android:savedDialogState";

    /* renamed from: e1, reason: collision with root package name */
    private static final String f14889e1 = "android:style";

    /* renamed from: f1, reason: collision with root package name */
    private static final String f14890f1 = "android:theme";

    /* renamed from: g1, reason: collision with root package name */
    private static final String f14891g1 = "android:cancelable";

    /* renamed from: h1, reason: collision with root package name */
    private static final String f14892h1 = "android:showsDialog";

    /* renamed from: i1, reason: collision with root package name */
    private static final String f14893i1 = "android:backStackId";

    /* renamed from: j1, reason: collision with root package name */
    private static final String f14894j1 = "android:dialogShowing";

    /* renamed from: N0, reason: collision with root package name */
    private Handler f14895N0;

    /* renamed from: O0, reason: collision with root package name */
    private Runnable f14896O0;

    /* renamed from: P0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f14897P0;

    /* renamed from: Q0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f14898Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f14899R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f14900S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f14901T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f14902U0;

    /* renamed from: V0, reason: collision with root package name */
    private int f14903V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f14904W0;

    /* renamed from: X0, reason: collision with root package name */
    private Q<androidx.lifecycle.E> f14905X0;

    /* renamed from: Y0, reason: collision with root package name */
    @androidx.annotation.P
    private Dialog f14906Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f14907Z0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f14908a1;

    /* renamed from: b1, reason: collision with root package name */
    private boolean f14909b1;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f14910c1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogFragment.this.f14898Q0.onDismiss(DialogFragment.this.f14906Y0);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@androidx.annotation.P DialogInterface dialogInterface) {
            if (DialogFragment.this.f14906Y0 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onCancel(dialogFragment.f14906Y0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@androidx.annotation.P DialogInterface dialogInterface) {
            if (DialogFragment.this.f14906Y0 != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                dialogFragment.onDismiss(dialogFragment.f14906Y0);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Q<androidx.lifecycle.E> {
        d() {
        }

        @Override // androidx.lifecycle.Q
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void f(androidx.lifecycle.E e4) {
            if (e4 != null && DialogFragment.this.f14902U0) {
                View requireView = DialogFragment.this.requireView();
                if (requireView.getParent() == null) {
                    if (DialogFragment.this.f14906Y0 != null) {
                        if (FragmentManager.S0(3)) {
                            Log.d(FragmentManager.f15087P, "DialogFragment " + this + " setting the content view on " + DialogFragment.this.f14906Y0);
                        }
                        DialogFragment.this.f14906Y0.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends AbstractC0891i {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC0891i f14915E;

        e(AbstractC0891i abstractC0891i) {
            this.f14915E = abstractC0891i;
        }

        @Override // androidx.fragment.app.AbstractC0891i
        @androidx.annotation.P
        public View c(int i4) {
            if (this.f14915E.e()) {
                return this.f14915E.c(i4);
            }
            return DialogFragment.this.o0(i4);
        }

        @Override // androidx.fragment.app.AbstractC0891i
        public boolean e() {
            if (!this.f14915E.e() && !DialogFragment.this.p0()) {
                return false;
            }
            return true;
        }
    }

    public DialogFragment() {
        this.f14896O0 = new a();
        this.f14897P0 = new b();
        this.f14898Q0 = new c();
        this.f14899R0 = 0;
        this.f14900S0 = 0;
        this.f14901T0 = true;
        this.f14902U0 = true;
        this.f14903V0 = -1;
        this.f14905X0 = new d();
        this.f14910c1 = false;
    }

    private void n0(boolean z3, boolean z4) {
        if (this.f14908a1) {
            return;
        }
        this.f14908a1 = true;
        this.f14909b1 = false;
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f14906Y0.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.f14895N0.getLooper()) {
                    onDismiss(this.f14906Y0);
                } else {
                    this.f14895N0.post(this.f14896O0);
                }
            }
        }
        this.f14907Z0 = true;
        if (this.f14903V0 >= 0) {
            getParentFragmentManager().k1(this.f14903V0, 1, z3);
            this.f14903V0 = -1;
            return;
        }
        F q4 = getParentFragmentManager().q();
        q4.Q(true);
        q4.B(this);
        if (z3) {
            q4.r();
        } else {
            q4.q();
        }
    }

    private void q0(@androidx.annotation.P Bundle bundle) {
        if (this.f14902U0 && !this.f14910c1) {
            try {
                this.f14904W0 = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.f14906Y0 = onCreateDialog;
                if (this.f14902U0) {
                    setupDialog(onCreateDialog, this.f14899R0);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f14906Y0.setOwnerActivity((Activity) context);
                    }
                    this.f14906Y0.setCancelable(this.f14901T0);
                    this.f14906Y0.setOnCancelListener(this.f14897P0);
                    this.f14906Y0.setOnDismissListener(this.f14898Q0);
                    this.f14910c1 = true;
                } else {
                    this.f14906Y0 = null;
                }
                this.f14904W0 = false;
            } catch (Throwable th) {
                this.f14904W0 = false;
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void H(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, @androidx.annotation.P Bundle bundle) {
        Bundle bundle2;
        super.H(layoutInflater, viewGroup, bundle);
        if (this.f15026m0 == null && this.f14906Y0 != null && bundle != null && (bundle2 = bundle.getBundle(f14888d1)) != null) {
            this.f14906Y0.onRestoreInstanceState(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.N
    public AbstractC0891i b() {
        return new e(super.b());
    }

    public void dismiss() {
        n0(false, false);
    }

    public void dismissAllowingStateLoss() {
        n0(true, false);
    }

    @androidx.annotation.P
    public Dialog getDialog() {
        return this.f14906Y0;
    }

    public boolean getShowsDialog() {
        return this.f14902U0;
    }

    @d0
    public int getTheme() {
        return this.f14900S0;
    }

    public boolean isCancelable() {
        return this.f14901T0;
    }

    @androidx.annotation.P
    View o0(int i4) {
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    @Deprecated
    public void onActivityCreated(@androidx.annotation.P Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onAttach(@androidx.annotation.N Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().l(this.f14905X0);
        if (!this.f14909b1) {
            this.f14908a1 = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@androidx.annotation.N DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onCreate(@androidx.annotation.P Bundle bundle) {
        boolean z3;
        super.onCreate(bundle);
        this.f14895N0 = new Handler();
        if (this.f15016c0 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f14902U0 = z3;
        if (bundle != null) {
            this.f14899R0 = bundle.getInt(f14889e1, 0);
            this.f14900S0 = bundle.getInt(f14890f1, 0);
            this.f14901T0 = bundle.getBoolean(f14891g1, true);
            this.f14902U0 = bundle.getBoolean(f14892h1, this.f14902U0);
            this.f14903V0 = bundle.getInt(f14893i1, -1);
        }
    }

    @androidx.annotation.N
    @androidx.annotation.K
    public Dialog onCreateDialog(@androidx.annotation.P Bundle bundle) {
        if (FragmentManager.S0(3)) {
            Log.d(FragmentManager.f15087P, "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            this.f14907Z0 = true;
            dialog.setOnDismissListener(null);
            this.f14906Y0.dismiss();
            if (!this.f14908a1) {
                onDismiss(this.f14906Y0);
            }
            this.f14906Y0 = null;
            this.f14910c1 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onDetach() {
        super.onDetach();
        if (!this.f14909b1 && !this.f14908a1) {
            this.f14908a1 = true;
        }
        getViewLifecycleOwnerLiveData().p(this.f14905X0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@androidx.annotation.N DialogInterface dialogInterface) {
        if (!this.f14907Z0) {
            if (FragmentManager.S0(3)) {
                Log.d(FragmentManager.f15087P, "onDismiss called for DialogFragment " + this);
            }
            n0(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.N
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.P Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f14902U0 && !this.f14904W0) {
            q0(bundle);
            if (FragmentManager.S0(2)) {
                Log.d(FragmentManager.f15087P, "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f14906Y0;
            if (dialog != null) {
                return onGetLayoutInflater.cloneInContext(dialog.getContext());
            }
            return onGetLayoutInflater;
        }
        if (FragmentManager.S0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f14902U0) {
                Log.d(FragmentManager.f15087P, "mShowsDialog = false: " + str);
            } else {
                Log.d(FragmentManager.f15087P, "mCreatingDialog = true: " + str);
            }
        }
        return onGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onSaveInstanceState(@androidx.annotation.N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(f14894j1, false);
            bundle.putBundle(f14888d1, onSaveInstanceState);
        }
        int i4 = this.f14899R0;
        if (i4 != 0) {
            bundle.putInt(f14889e1, i4);
        }
        int i5 = this.f14900S0;
        if (i5 != 0) {
            bundle.putInt(f14890f1, i5);
        }
        boolean z3 = this.f14901T0;
        if (!z3) {
            bundle.putBoolean(f14891g1, z3);
        }
        boolean z4 = this.f14902U0;
        if (!z4) {
            bundle.putBoolean(f14892h1, z4);
        }
        int i6 = this.f14903V0;
        if (i6 != -1) {
            bundle.putInt(f14893i1, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            this.f14907Z0 = false;
            dialog.show();
            View decorView = this.f14906Y0.getWindow().getDecorView();
            s0.b(decorView, this);
            u0.b(decorView, this);
            androidx.savedstate.g.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.K
    public void onViewStateRestored(@androidx.annotation.P Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f14906Y0 != null && bundle != null && (bundle2 = bundle.getBundle(f14888d1)) != null) {
            this.f14906Y0.onRestoreInstanceState(bundle2);
        }
    }

    boolean p0() {
        return this.f14910c1;
    }

    @androidx.annotation.N
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z3) {
        this.f14901T0 = z3;
        Dialog dialog = this.f14906Y0;
        if (dialog != null) {
            dialog.setCancelable(z3);
        }
    }

    public void setShowsDialog(boolean z3) {
        this.f14902U0 = z3;
    }

    public void setStyle(int i4, @d0 int i5) {
        if (FragmentManager.S0(2)) {
            Log.d(FragmentManager.f15087P, "Setting style and theme for DialogFragment " + this + " to " + i4 + ", " + i5);
        }
        this.f14899R0 = i4;
        if (i4 == 2 || i4 == 3) {
            this.f14900S0 = R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.f14900S0 = i5;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@androidx.annotation.N Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.P String str) {
        this.f14908a1 = false;
        this.f14909b1 = true;
        F q4 = fragmentManager.q();
        q4.Q(true);
        q4.k(this, str);
        q4.q();
    }

    public void showNow(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.P String str) {
        this.f14908a1 = false;
        this.f14909b1 = true;
        F q4 = fragmentManager.q();
        q4.Q(true);
        q4.k(this, str);
        q4.s();
    }

    public int show(@androidx.annotation.N F f4, @androidx.annotation.P String str) {
        this.f14908a1 = false;
        this.f14909b1 = true;
        f4.k(this, str);
        this.f14907Z0 = false;
        int q4 = f4.q();
        this.f14903V0 = q4;
        return q4;
    }

    public DialogFragment(@androidx.annotation.I int i4) {
        super(i4);
        this.f14896O0 = new a();
        this.f14897P0 = new b();
        this.f14898Q0 = new c();
        this.f14899R0 = 0;
        this.f14900S0 = 0;
        this.f14901T0 = true;
        this.f14902U0 = true;
        this.f14903V0 = -1;
        this.f14905X0 = new d();
        this.f14910c1 = false;
    }
}
