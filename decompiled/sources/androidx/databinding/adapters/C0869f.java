package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;
import androidx.databinding.adapters.C0868e;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.databinding.adapters.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0869f {

    /* renamed from: androidx.databinding.adapters.f$a */
    /* loaded from: classes.dex */
    class a implements AutoCompleteTextView.Validator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f14051a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f14052b;

        a(c cVar, b bVar) {
            this.f14051a = cVar;
            this.f14052b = bVar;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public CharSequence fixText(CharSequence charSequence) {
            b bVar = this.f14052b;
            if (bVar != null) {
                return bVar.fixText(charSequence);
            }
            return charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public boolean isValid(CharSequence charSequence) {
            c cVar = this.f14051a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    /* renamed from: androidx.databinding.adapters.f$b */
    /* loaded from: classes.dex */
    public interface b {
        CharSequence fixText(CharSequence charSequence);
    }

    /* renamed from: androidx.databinding.adapters.f$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean isValid(CharSequence charSequence);
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void a(AutoCompleteTextView autoCompleteTextView, C0868e.a aVar, C0868e.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new C0868e.b(aVar, cVar, null));
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void b(AutoCompleteTextView autoCompleteTextView, b bVar, c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new a(cVar, bVar));
        }
    }
}
