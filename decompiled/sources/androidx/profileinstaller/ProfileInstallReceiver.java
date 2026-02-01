package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.profileinstaller.j;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @N
    public static final String f17296a = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* renamed from: b, reason: collision with root package name */
    @N
    public static final String f17297b = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* renamed from: c, reason: collision with root package name */
    @N
    public static final String f17298c = "androidx.profileinstaller.action.SKIP_FILE";

    /* renamed from: d, reason: collision with root package name */
    @N
    public static final String f17299d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* renamed from: e, reason: collision with root package name */
    @N
    private static final String f17300e = "EXTRA_SKIP_FILE_OPERATION";

    /* renamed from: f, reason: collision with root package name */
    @N
    private static final String f17301f = "WRITE_SKIP_FILE";

    /* renamed from: g, reason: collision with root package name */
    @N
    private static final String f17302g = "DELETE_SKIP_FILE";

    /* renamed from: h, reason: collision with root package name */
    @N
    private static final String f17303h = "EXTRA_BENCHMARK_OPERATION";

    /* renamed from: i, reason: collision with root package name */
    @N
    private static final String f17304i = "DROP_SHADER_CACHE";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements j.d {
        a() {
        }

        @Override // androidx.profileinstaller.j.d
        public void a(int i4, @P Object obj) {
            j.f17350h.a(i4, obj);
        }

        @Override // androidx.profileinstaller.j.d
        public void b(int i4, @P Object obj) {
            j.f17350h.b(i4, obj);
            ProfileInstallReceiver.this.setResultCode(i4);
        }
    }

    static void a(@N j.d dVar) {
        Process.sendSignal(Process.myPid(), 10);
        dVar.b(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@N Context context, @P Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f17296a.equals(action)) {
            j.n(context, new g(), new a(), true);
            return;
        }
        if (f17298c.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f17300e);
                if (f17301f.equals(string)) {
                    j.o(context, new g(), new a());
                    return;
                } else {
                    if (f17302g.equals(string)) {
                        j.d(context, new g(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (f17297b.equals(action)) {
            a(new a());
            return;
        }
        if (f17299d.equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString(f17303h);
            a aVar = new a();
            if (f17304i.equals(string2)) {
                androidx.profileinstaller.a.b(context, aVar);
            } else {
                aVar.b(16, null);
            }
        }
    }
}
