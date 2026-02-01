package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface w {
    @P
    ColorStateList getSupportImageTintList();

    @P
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@P ColorStateList colorStateList);

    void setSupportImageTintMode(@P PorterDuff.Mode mode);
}
