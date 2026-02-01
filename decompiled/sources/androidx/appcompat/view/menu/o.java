package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public interface a {
        void c(boolean z3, char c4);

        boolean f();

        boolean g();

        j getItemData();

        void h(j jVar, int i4);

        void setCheckable(boolean z3);

        void setChecked(boolean z3);

        void setEnabled(boolean z3);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void e(g gVar);

    int getWindowAnimations();
}
