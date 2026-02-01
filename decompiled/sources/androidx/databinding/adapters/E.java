package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f14023a = Pattern.compile("\\s*,\\s*");

    /* renamed from: b, reason: collision with root package name */
    private static final int f14024b = 20;

    private static SparseBooleanArray a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : f14023a.split(charSequence)) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    sparseBooleanArray.put(parseInt, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    @InterfaceC0879d({"android:collapseColumns"})
    public static void b(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray a4 = a(charSequence);
        for (int i4 = 0; i4 < 20; i4++) {
            boolean z3 = a4.get(i4, false);
            if (z3 != tableLayout.isColumnCollapsed(i4)) {
                tableLayout.setColumnCollapsed(i4, z3);
            }
        }
    }

    @InterfaceC0879d({"android:shrinkColumns"})
    public static void c(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray a4 = a(charSequence);
        int size = a4.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = a4.keyAt(i4);
            boolean valueAt = a4.valueAt(i4);
            if (valueAt) {
                tableLayout.setColumnShrinkable(keyAt, valueAt);
            }
        }
    }

    @InterfaceC0879d({"android:stretchColumns"})
    public static void d(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray a4 = a(charSequence);
        int size = a4.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = a4.keyAt(i4);
            boolean valueAt = a4.valueAt(i4);
            if (valueAt) {
                tableLayout.setColumnStretchable(keyAt, valueAt);
            }
        }
    }
}
