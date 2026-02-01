package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* loaded from: classes.dex */
public interface P {
    boolean a(@androidx.annotation.N MenuItem menuItem);

    default void b(@androidx.annotation.N Menu menu) {
    }

    void c(@androidx.annotation.N Menu menu, @androidx.annotation.N MenuInflater menuInflater);

    default void d(@androidx.annotation.N Menu menu) {
    }
}
