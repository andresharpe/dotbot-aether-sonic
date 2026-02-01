package androidx.startup;

import android.content.Context;
import androidx.annotation.N;
import java.util.List;

/* loaded from: classes.dex */
public interface b<T> {
    @N
    T a(@N Context context);

    @N
    List<Class<? extends b<?>>> dependencies();
}
