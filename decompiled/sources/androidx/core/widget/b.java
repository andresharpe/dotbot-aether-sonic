package androidx.core.widget;

import android.os.Build;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean f13794a;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f13794a = z3;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@N int[] iArr, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i4);
}
