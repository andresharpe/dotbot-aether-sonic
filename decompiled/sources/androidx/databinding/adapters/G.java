package androidx.databinding.adapters;

import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class G {

    /* loaded from: classes.dex */
    class a implements TimePicker.OnTimeChangedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TimePicker.OnTimeChangedListener f14033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14034b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14035c;

        a(TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
            this.f14033a = onTimeChangedListener;
            this.f14034b = oVar;
            this.f14035c = oVar2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i4, int i5) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f14033a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i4, i5);
            }
            androidx.databinding.o oVar = this.f14034b;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f14035c;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
    }

    @androidx.databinding.n(attribute = "android:hour")
    public static int a(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @androidx.databinding.n(attribute = "android:minute")
    public static int b(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @InterfaceC0879d({"android:hour"})
    public static void c(TimePicker timePicker, int i4) {
        if (timePicker.getHour() != i4) {
            timePicker.setHour(i4);
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
        if (oVar == null && oVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, oVar, oVar2));
        }
    }

    @InterfaceC0879d({"android:minute"})
    public static void e(TimePicker timePicker, int i4) {
        if (timePicker.getMinute() != i4) {
            timePicker.setMinute(i4);
        }
    }
}
