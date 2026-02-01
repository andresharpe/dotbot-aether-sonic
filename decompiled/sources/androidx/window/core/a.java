package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f20724a = new a();

    private a() {
    }

    @Override // androidx.window.core.f
    public void a(@l3.d String tag, @l3.d String message) {
        F.p(tag, "tag");
        F.p(message, "message");
        Log.d(tag, message);
    }
}
