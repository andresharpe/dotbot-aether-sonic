package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface t {
    @P
    ColorStateList getSupportCheckMarkTintList();

    @P
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@P ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@P PorterDuff.Mode mode);
}
