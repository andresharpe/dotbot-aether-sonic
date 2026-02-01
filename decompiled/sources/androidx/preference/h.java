package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
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
import androidx.preference.DialogPreference;

@Deprecated
/* loaded from: classes.dex */
public abstract class h extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: M, reason: collision with root package name */
    @Deprecated
    protected static final String f16873M = "key";

    /* renamed from: N, reason: collision with root package name */
    private static final String f16874N = "PreferenceDialogFragment.title";

    /* renamed from: O, reason: collision with root package name */
    private static final String f16875O = "PreferenceDialogFragment.positiveText";

    /* renamed from: P, reason: collision with root package name */
    private static final String f16876P = "PreferenceDialogFragment.negativeText";

    /* renamed from: Q, reason: collision with root package name */
    private static final String f16877Q = "PreferenceDialogFragment.message";

    /* renamed from: R, reason: collision with root package name */
    private static final String f16878R = "PreferenceDialogFragment.layout";

    /* renamed from: S, reason: collision with root package name */
    private static final String f16879S = "PreferenceDialogFragment.icon";

    /* renamed from: E, reason: collision with root package name */
    private DialogPreference f16880E;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f16881F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f16882G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f16883H;

    /* renamed from: I, reason: collision with root package name */
    private CharSequence f16884I;

    /* renamed from: J, reason: collision with root package name */
    @I
    private int f16885J;

    /* renamed from: K, reason: collision with root package name */
    private BitmapDrawable f16886K;

    /* renamed from: L, reason: collision with root package name */
    private int f16887L;

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

    @Deprecated
    public h() {
    }

    private void g(@N Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Deprecated
    public DialogPreference a() {
        if (this.f16880E == null) {
            this.f16880E = (DialogPreference) ((DialogPreference.a) getTargetFragment()).findPreference(getArguments().getString(f16873M));
        }
        return this.f16880E;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public void c(@N View view) {
        int i4;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.f16884I;
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
    @Deprecated
    protected View d(@N Context context) {
        int i4 = this.f16885J;
        if (i4 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i4, (ViewGroup) null);
    }

    @Deprecated
    public abstract void e(boolean z3);

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public void f(@N AlertDialog.Builder builder) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(@N DialogInterface dialogInterface, int i4) {
        this.f16887L = i4;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) targetFragment;
            String string = getArguments().getString(f16873M);
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.findPreference(string);
                this.f16880E = dialogPreference;
                this.f16881F = dialogPreference.p1();
                this.f16882G = this.f16880E.r1();
                this.f16883H = this.f16880E.q1();
                this.f16884I = this.f16880E.o1();
                this.f16885J = this.f16880E.n1();
                Drawable m12 = this.f16880E.m1();
                if (m12 != null && !(m12 instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(m12.getIntrinsicWidth(), m12.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    m12.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    m12.draw(canvas);
                    this.f16886K = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.f16886K = (BitmapDrawable) m12;
                return;
            }
            this.f16881F = bundle.getCharSequence(f16874N);
            this.f16882G = bundle.getCharSequence(f16875O);
            this.f16883H = bundle.getCharSequence(f16876P);
            this.f16884I = bundle.getCharSequence(f16877Q);
            this.f16885J = bundle.getInt(f16878R, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f16879S);
            if (bitmap != null) {
                this.f16886K = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // android.app.DialogFragment
    @N
    public Dialog onCreateDialog(@P Bundle bundle) {
        Activity activity = getActivity();
        this.f16887L = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f16881F).setIcon(this.f16886K).setPositiveButton(this.f16882G, this).setNegativeButton(this.f16883H, this);
        View d4 = d(activity);
        if (d4 != null) {
            c(d4);
            negativeButton.setView(d4);
        } else {
            negativeButton.setMessage(this.f16884I);
        }
        f(negativeButton);
        AlertDialog create = negativeButton.create();
        if (b()) {
            g(create);
        }
        return create;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@N DialogInterface dialogInterface) {
        boolean z3;
        super.onDismiss(dialogInterface);
        if (this.f16887L == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        e(z3);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@N Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f16874N, this.f16881F);
        bundle.putCharSequence(f16875O, this.f16882G);
        bundle.putCharSequence(f16876P, this.f16883H);
        bundle.putCharSequence(f16877Q, this.f16884I);
        bundle.putInt(f16878R, this.f16885J);
        BitmapDrawable bitmapDrawable = this.f16886K;
        if (bitmapDrawable != null) {
            bundle.putParcelable(f16879S, bitmapDrawable.getBitmap());
        }
    }
}
