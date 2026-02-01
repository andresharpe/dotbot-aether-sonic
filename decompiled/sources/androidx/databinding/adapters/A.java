package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.Switch;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC0879d;

@androidx.databinding.h({@androidx.databinding.g(attribute = "android:thumb", method = "setThumbDrawable", type = Switch.class), @androidx.databinding.g(attribute = "android:track", method = "setTrackDrawable", type = Switch.class)})
@TargetApi(14)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class A {
    @InterfaceC0879d({"android:switchTextAppearance"})
    public static void a(Switch r12, int i4) {
        r12.setSwitchTextAppearance(null, i4);
    }
}
