package I2;

import android.app.Activity;
import com.spotify.sdk.android.auth.c;
import com.spotify.sdk.android.auth.d;

/* loaded from: classes2.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private b f1087a;

    @Override // com.spotify.sdk.android.auth.c
    public boolean a(Activity activity, d dVar) {
        b bVar = new b(activity, dVar);
        this.f1087a = bVar;
        return bVar.d();
    }

    @Override // com.spotify.sdk.android.auth.c
    public void stop() {
        b bVar = this.f1087a;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // com.spotify.sdk.android.auth.c
    public void b(c.a aVar) {
    }
}
