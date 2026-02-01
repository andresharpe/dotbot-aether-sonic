package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.appcompat.app.DialogInterfaceC0586d;
import androidx.fragment.app.DialogFragment;
import androidx.preference.DialogPreference;

/* loaded from: classes.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: s1, reason: collision with root package name */
    protected static final String f16760s1 = "key";

    /* renamed from: t1, reason: collision with root package name */
    private static final String f16761t1 = "PreferenceDialogFragment.title";

    /* renamed from: u1, reason: collision with root package name */
    private static final String f16762u1 = "PreferenceDialogFragment.positiveText";

    /* renamed from: v1, reason: collision with root package name */
    private static final String f16763v1 = "PreferenceDialogFragment.negativeText";

    /* renamed from: w1, reason: collision with root package name */
    private static final String f16764w1 = "PreferenceDialogFragment.message";

    /* renamed from: x1, reason: collision with root package name */
    private static final String f16765x1 = "PreferenceDialogFragment.layout";

    /* renamed from: y1, reason: collision with root package name */
    private static final String f16766y1 = "PreferenceDialogFragment.icon";

    /* renamed from: k1, reason: collision with root package name */
    private DialogPreference f16767k1;

    /* renamed from: l1, reason: collision with root package name */
    private CharSequence f16768l1;

    /* renamed from: m1, reason: collision with root package name */
    private CharSequence f16769m1;

    /* renamed from: n1, reason: collision with root package name */
    private CharSequence f16770n1;

    /* renamed from: o1, reason: collision with root package name */
    private CharSequence f16771o1;

    /* renamed from: p1, reason: collision with root package name */
    @I
    private int f16772p1;

    /* renamed from: q1, reason: collision with root package name */
    private BitmapDrawable f16773q1;

    /* renamed from: r1, reason: collision with root package name */
    private int f16774r1;

    /* JADX INFO: Access modifiers changed from: private */
    @W(30)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(@N Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void v0(@N Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            w0();
        }
    }

    public DialogPreference getPreference() {
        if (this.f16767k1 == null) {
            this.f16767k1 = (DialogPreference) ((DialogPreference.a) getTargetFragment()).findPreference(requireArguments().getString(f16760s1));
        }
        return this.f16767k1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@N DialogInterface dialogInterface, int i4) {
        this.f16774r1 = i4;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        androidx.savedstate.e targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) targetFragment;
            String string = requireArguments().getString(f16760s1);
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.findPreference(string);
                this.f16767k1 = dialogPreference;
                this.f16768l1 = dialogPreference.p1();
                this.f16769m1 = this.f16767k1.r1();
                this.f16770n1 = this.f16767k1.q1();
                this.f16771o1 = this.f16767k1.o1();
                this.f16772p1 = this.f16767k1.n1();
                Drawable m12 = this.f16767k1.m1();
                if (m12 != null && !(m12 instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(m12.getIntrinsicWidth(), m12.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    m12.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    m12.draw(canvas);
                    this.f16773q1 = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.f16773q1 = (BitmapDrawable) m12;
                return;
            }
            this.f16768l1 = bundle.getCharSequence(f16761t1);
            this.f16769m1 = bundle.getCharSequence(f16762u1);
            this.f16770n1 = bundle.getCharSequence(f16763v1);
            this.f16771o1 = bundle.getCharSequence(f16764w1);
            this.f16772p1 = bundle.getInt(f16765x1, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f16766y1);
            if (bitmap != null) {
                this.f16773q1 = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.DialogFragment
    @N
    public Dialog onCreateDialog(@P Bundle bundle) {
        this.f16774r1 = -2;
        DialogInterfaceC0586d.a s4 = new DialogInterfaceC0586d.a(requireContext()).K(this.f16768l1).h(this.f16773q1).C(this.f16769m1, this).s(this.f16770n1, this);
        View t02 = t0(requireContext());
        if (t02 != null) {
            s0(t02);
            s4.M(t02);
        } else {
            s4.n(this.f16771o1);
        }
        u0(s4);
        DialogInterfaceC0586d a4 = s4.a();
        if (r0()) {
            v0(a4);
        }
        return a4;
    }

    public abstract void onDialogClosed(boolean z3);

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@N DialogInterface dialogInterface) {
        boolean z3;
        super.onDismiss(dialogInterface);
        if (this.f16774r1 == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        onDialogClosed(z3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f16761t1, this.f16768l1);
        bundle.putCharSequence(f16762u1, this.f16769m1);
        bundle.putCharSequence(f16763v1, this.f16770n1);
        bundle.putCharSequence(f16764w1, this.f16771o1);
        bundle.putInt(f16765x1, this.f16772p1);
        BitmapDrawable bitmapDrawable = this.f16773q1;
        if (bitmapDrawable != null) {
            bundle.putParcelable(f16766y1, bitmapDrawable.getBitmap());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean r0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s0(@N View view) {
        int i4;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f16771o1;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i4 = 0;
            } else {
                i4 = 8;
            }
            if (findViewById.getVisibility() != i4) {
                findViewById.setVisibility(i4);
            }
        }
    }

    @P
    protected View t0(@N Context context) {
        int i4 = this.f16772p1;
        if (i4 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i4, (ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void u0(@N DialogInterfaceC0586d.a aVar) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected void w0() {
    }
}
