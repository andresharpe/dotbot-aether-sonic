package androidx.activity;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import androidx.annotation.W;
import kotlin.jvm.internal.F;

@W(26)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final b f4486a = new b();

    private b() {
    }

    public final void a(@l3.d Activity activity, @l3.d Rect hint) {
        F.p(activity, "activity");
        F.p(hint, "hint");
        activity.setPictureInPictureParams(new PictureInPictureParams.Builder().setSourceRectHint(hint).build());
    }
}
