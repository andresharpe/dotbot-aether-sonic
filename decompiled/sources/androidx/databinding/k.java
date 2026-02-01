package androidx.databinding;

import android.view.View;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public abstract class k {
    @N
    public List<k> a() {
        return Collections.emptyList();
    }

    public abstract String b(int i4);

    public abstract ViewDataBinding c(l lVar, View view, int i4);

    public abstract ViewDataBinding d(l lVar, View[] viewArr, int i4);

    public abstract int e(String str);
}
