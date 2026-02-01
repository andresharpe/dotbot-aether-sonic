package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
/* loaded from: classes.dex */
public class v {

    /* loaded from: classes.dex */
    class a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RadioGroup.OnCheckedChangeListener f14072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14073b;

        a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f14072a = onCheckedChangeListener;
            this.f14073b = oVar;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i4) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f14072a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i4);
            }
            this.f14073b.a();
        }
    }

    @InterfaceC0879d({"android:checkedButton"})
    public static void a(RadioGroup radioGroup, int i4) {
        if (i4 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i4);
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
