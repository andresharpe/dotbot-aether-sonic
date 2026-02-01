package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.P;

/* loaded from: classes.dex */
public interface v {
    @P
    ColorStateList getSupportCompoundDrawablesTintList();

    @P
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@P ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@P PorterDuff.Mode mode);
}
