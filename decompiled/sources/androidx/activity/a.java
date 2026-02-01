package androidx.activity;

import android.view.View;
import androidx.annotation.W;
import kotlin.jvm.internal.F;

@W(19)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f4485a = new a();

    private a() {
    }

    public final boolean a(@l3.d View view) {
        F.p(view, "view");
        return view.isAttachedToWindow();
    }
}
