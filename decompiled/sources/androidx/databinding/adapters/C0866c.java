package androidx.databinding.adapters;

import android.R;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.databinding.adapters.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0866c {
    @InterfaceC0879d({"android:entries"})
    public static <T> void a(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof t) {
                ((t) adapter).b(list);
                return;
            } else {
                absSpinner.setAdapter((SpinnerAdapter) new t(absSpinner.getContext(), list, R.layout.simple_spinner_item, R.layout.simple_spinner_dropdown_item, 0));
                return;
            }
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }

    @InterfaceC0879d({"android:entries"})
    public static <T extends CharSequence> void b(AbsSpinner absSpinner, T[] tArr) {
        if (tArr != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter != null && adapter.getCount() == tArr.length) {
                for (int i4 = 0; i4 < tArr.length; i4++) {
                    if (tArr[i4].equals(adapter.getItem(i4))) {
                    }
                }
                return;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), R.layout.simple_spinner_item, tArr);
            arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            absSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
            return;
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }
}
