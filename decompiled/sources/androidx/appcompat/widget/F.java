package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface F {
    void d(Menu menu, n.a aVar);

    boolean f();

    void g();

    CharSequence getTitle();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    boolean m();

    void n(SparseArray<Parcelable> sparseArray);

    void o(int i4);

    void p();

    void q(SparseArray<Parcelable> sparseArray);

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setLogo(int i4);

    void setUiOptions(int i4);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
