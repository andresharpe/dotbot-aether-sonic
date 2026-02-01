package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @androidx.databinding.g(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checked", type = CompoundButton.class)})
/* renamed from: androidx.databinding.adapters.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0874k {

    /* renamed from: androidx.databinding.adapters.k$a */
    /* loaded from: classes.dex */
    class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f14055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14056b;

        a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f14055a = onCheckedChangeListener;
            this.f14056b = oVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f14055a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
            }
            this.f14056b.a();
        }
    }

    @InterfaceC0879d({"android:checked"})
    public static void a(CompoundButton compoundButton, boolean z3) {
        if (compoundButton.isChecked() != z3) {
            compoundButton.setChecked(z3);
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
