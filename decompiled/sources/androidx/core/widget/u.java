package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.P;

/* loaded from: classes.dex */
public interface u {
    @P
    ColorStateList getSupportButtonTintList();

    @P
    PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@P ColorStateList colorStateList);

    void setSupportButtonTintMode(@P PorterDuff.Mode mode);
}
