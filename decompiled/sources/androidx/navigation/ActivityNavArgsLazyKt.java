package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class ActivityNavArgsLazyKt {
    @androidx.annotation.K
    public static final /* synthetic */ <Args extends InterfaceC0936m> C0937n<Args> a(final Activity activity) {
        kotlin.jvm.internal.F.p(activity, "<this>");
        kotlin.jvm.internal.F.y(4, "Args");
        return new C0937n<>(kotlin.jvm.internal.N.d(InterfaceC0936m.class), new X2.a<Bundle>() { // from class: androidx.navigation.ActivityNavArgsLazyKt$navArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Bundle n() {
                Bundle bundle;
                Intent intent = activity.getIntent();
                if (intent == null) {
                    bundle = null;
                } else {
                    Activity activity2 = activity;
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        bundle = extras;
                    } else {
                        throw new IllegalStateException("Activity " + activity2 + " has null extras in " + intent);
                    }
                }
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Activity " + activity + " has a null Intent");
            }
        });
    }
}
