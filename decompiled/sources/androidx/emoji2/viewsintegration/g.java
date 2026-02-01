package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.emoji2.text.g;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
final class g implements TextWatcher {

    /* renamed from: E, reason: collision with root package name */
    private final EditText f14588E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f14589F;

    /* renamed from: G, reason: collision with root package name */
    private g.f f14590G;

    /* renamed from: H, reason: collision with root package name */
    private int f14591H = Integer.MAX_VALUE;

    /* renamed from: I, reason: collision with root package name */
    private int f14592I = 0;

    /* renamed from: J, reason: collision with root package name */
    private boolean f14593J = true;

    /* JADX INFO: Access modifiers changed from: private */
    @W(19)
    /* loaded from: classes.dex */
    public static class a extends g.f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f14594a;

        a(EditText editText) {
            this.f14594a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.g.f
        public void b() {
            super.b();
            g.e(this.f14594a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(EditText editText, boolean z3) {
        this.f14588E = editText;
        this.f14589F = z3;
    }

    private g.f b() {
        if (this.f14590G == null) {
            this.f14590G = new a(this.f14588E);
        }
        return this.f14590G;
    }

    static void e(@P EditText editText, int i4) {
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.g.b().u(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean i() {
        if (this.f14593J && (this.f14589F || androidx.emoji2.text.g.n())) {
            return false;
        }
        return true;
    }

    int a() {
        return this.f14592I;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    int c() {
        return this.f14591H;
    }

    public boolean d() {
        return this.f14593J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(int i4) {
        this.f14592I = i4;
    }

    public void g(boolean z3) {
        if (this.f14593J != z3) {
            if (this.f14590G != null) {
                androidx.emoji2.text.g.b().C(this.f14590G);
            }
            this.f14593J = z3;
            if (z3) {
                e(this.f14588E, androidx.emoji2.text.g.b().f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i4) {
        this.f14591H = i4;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        if (!this.f14588E.isInEditMode() && !i() && i5 <= i6 && (charSequence instanceof Spannable)) {
            int f4 = androidx.emoji2.text.g.b().f();
            if (f4 != 0) {
                if (f4 != 1) {
                    if (f4 != 3) {
                        return;
                    }
                } else {
                    androidx.emoji2.text.g.b().x((Spannable) charSequence, i4, i4 + i6, this.f14591H, this.f14592I);
                    return;
                }
            }
            androidx.emoji2.text.g.b().y(b());
        }
    }
}
