package g1;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.N;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.b;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2057a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f50553a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.play.core.review.a f50554b;

    public C2057a(Context context) {
        this.f50553a = context;
    }

    @Override // com.google.android.play.core.review.b
    @N
    public AbstractC1770k<Void> a(@N Activity activity, @N com.google.android.play.core.review.a aVar) {
        if (aVar != this.f50554b) {
            return C1773n.f(new ReviewException(-2));
        }
        return C1773n.g(null);
    }

    @Override // com.google.android.play.core.review.b
    @N
    public AbstractC1770k<com.google.android.play.core.review.a> b() {
        com.google.android.play.core.review.a c4 = com.google.android.play.core.review.a.c(PendingIntent.getBroadcast(this.f50553a, 0, new Intent(), 67108864), false);
        this.f50554b = c4;
        return C1773n.g(c4);
    }
}
