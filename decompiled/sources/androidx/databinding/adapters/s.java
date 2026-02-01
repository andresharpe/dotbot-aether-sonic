package androidx.databinding.adapters;

import android.widget.NumberPicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @androidx.databinding.g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:value", type = NumberPicker.class)})
/* loaded from: classes.dex */
public class s {

    /* loaded from: classes.dex */
    class a implements NumberPicker.OnValueChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NumberPicker.OnValueChangeListener f14062a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14063b;

        a(NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
            this.f14062a = onValueChangeListener;
            this.f14063b = oVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i4, int i5) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f14062a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i4, i5);
            }
            this.f14063b.a();
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, oVar));
        }
    }

    @InterfaceC0879d({"android:value"})
    public static void b(NumberPicker numberPicker, int i4) {
        if (numberPicker.getValue() != i4) {
            numberPicker.setValue(i4);
        }
    }
}
