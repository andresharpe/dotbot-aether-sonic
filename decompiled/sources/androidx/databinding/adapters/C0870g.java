package androidx.databinding.adapters;

import android.widget.CalendarView;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:date", type = CalendarView.class)})
/* renamed from: androidx.databinding.adapters.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0870g {

    /* renamed from: androidx.databinding.adapters.g$a */
    /* loaded from: classes.dex */
    class a implements CalendarView.OnDateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CalendarView.OnDateChangeListener f14053a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f14054b;

        a(CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
            this.f14053a = onDateChangeListener;
            this.f14054b = oVar;
        }

        @Override // android.widget.CalendarView.OnDateChangeListener
        public void onSelectedDayChange(CalendarView calendarView, int i4, int i5, int i6) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f14053a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i4, i5, i6);
            }
            this.f14054b.a();
        }
    }

    @InterfaceC0879d({"android:date"})
    public static void a(CalendarView calendarView, long j4) {
        if (calendarView.getDate() != j4) {
            calendarView.setDate(j4);
        }
    }

    @InterfaceC0879d(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void b(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new a(onDateChangeListener, oVar));
        }
    }
}
