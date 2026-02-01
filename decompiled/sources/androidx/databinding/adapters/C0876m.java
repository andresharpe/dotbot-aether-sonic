package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;
import androidx.databinding.library.baseAdapters.b;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:year", type = DatePicker.class), @androidx.databinding.p(attribute = "android:month", type = DatePicker.class), @androidx.databinding.p(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
/* renamed from: androidx.databinding.adapters.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0876m {

    /* renamed from: androidx.databinding.adapters.m$b */
    /* loaded from: classes.dex */
    private static class b implements DatePicker.OnDateChangedListener {

        /* renamed from: E, reason: collision with root package name */
        DatePicker.OnDateChangedListener f14057E;

        /* renamed from: F, reason: collision with root package name */
        androidx.databinding.o f14058F;

        /* renamed from: G, reason: collision with root package name */
        androidx.databinding.o f14059G;

        /* renamed from: H, reason: collision with root package name */
        androidx.databinding.o f14060H;

        private b() {
        }

        public void a(DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
            this.f14057E = onDateChangedListener;
            this.f14058F = oVar;
            this.f14059G = oVar2;
            this.f14060H = oVar3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i4, int i5, int i6) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f14057E;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i4, i5, i6);
            }
            androidx.databinding.o oVar = this.f14058F;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f14059G;
            if (oVar2 != null) {
                oVar2.a();
            }
            androidx.databinding.o oVar3 = this.f14060H;
            if (oVar3 != null) {
                oVar3.a();
            }
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void a(DatePicker datePicker, int i4, int i5, int i6, DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
        if (i4 == 0) {
            i4 = datePicker.getYear();
        }
        if (i6 == 0) {
            i6 = datePicker.getDayOfMonth();
        }
        if (oVar == null && oVar2 == null && oVar3 == null) {
            datePicker.init(i4, i5, i6, onDateChangedListener);
            return;
        }
        b bVar = (b) r.a(datePicker, b.a.f14108b);
        if (bVar == null) {
            bVar = new b();
            r.b(datePicker, bVar, b.a.f14108b);
        }
        bVar.a(onDateChangedListener, oVar, oVar2, oVar3);
        datePicker.init(i4, i5, i6, bVar);
    }
}
