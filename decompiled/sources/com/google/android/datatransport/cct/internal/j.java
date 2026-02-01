package com.google.android.datatransport.cct.internal;

import androidx.annotation.N;
import com.google.auto.value.AutoValue;
import java.util.List;
import w1.InterfaceC2431a;

@AutoValue
@InterfaceC2431a
/* loaded from: classes.dex */
public abstract class j {
    @N
    public static j a(@N List<l> list) {
        return new d(list);
    }

    @N
    public static com.google.firebase.encoders.a b() {
        return new com.google.firebase.encoders.json.e().k(b.f27223b).l(true).j();
    }

    @InterfaceC2431a.InterfaceC0549a(name = "logRequest")
    @N
    public abstract List<l> c();
}
