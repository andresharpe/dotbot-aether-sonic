package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.emoji2.text.g;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f14577a;

    /* renamed from: b, reason: collision with root package name */
    private g.f f14578b;

    /* JADX INFO: Access modifiers changed from: private */
    @W(19)
    /* loaded from: classes.dex */
    public static class a extends g.f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<TextView> f14579a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference<d> f14580b;

        a(TextView textView, d dVar) {
            this.f14579a = new WeakReference(textView);
            this.f14580b = new WeakReference(dVar);
        }

        private boolean c(@P TextView textView, @P InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.g.f
        public void b() {
            CharSequence text;
            CharSequence u3;
            super.b();
            TextView textView = this.f14579a.get();
            if (!c(textView, this.f14580b.get()) || !textView.isAttachedToWindow() || text == (u3 = androidx.emoji2.text.g.b().u((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(u3);
            int selectionEnd = Selection.getSelectionEnd(u3);
            textView.setText(u3);
            if (u3 instanceof Spannable) {
                d.b((Spannable) u3, selectionStart, selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(@N TextView textView) {
        this.f14577a = textView;
    }

    private g.f a() {
        if (this.f14578b == null) {
            this.f14578b = new a(this.f14577a, this);
        }
        return this.f14578b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Spannable spannable, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            Selection.setSelection(spannable, i4, i5);
        } else if (i4 >= 0) {
            Selection.setSelection(spannable, i4);
        } else if (i5 >= 0) {
            Selection.setSelection(spannable, i5);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        if (this.f14577a.isInEditMode()) {
            return charSequence;
        }
        int f4 = androidx.emoji2.text.g.b().f();
        if (f4 != 0) {
            if (f4 != 1) {
                if (f4 != 3) {
                    return charSequence;
                }
            } else {
                if ((i7 != 0 || i6 != 0 || spanned.length() != 0 || charSequence != this.f14577a.getText()) && charSequence != null) {
                    if (i4 != 0 || i5 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i4, i5);
                    }
                    return androidx.emoji2.text.g.b().v(charSequence, 0, charSequence.length());
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.g.b().y(a());
        return charSequence;
    }
}
