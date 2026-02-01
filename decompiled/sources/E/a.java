package E;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.harman.jbl.partybox.ui.party.b;

@Deprecated
/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f58a = "androidx.contentpager.content.wakelockid";

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f59b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private static int f60c = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra(f58a, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f59b;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f59b;
        synchronized (sparseArray) {
            try {
                int i4 = f60c;
                int i5 = i4 + 1;
                f60c = i5;
                if (i5 <= 0) {
                    f60c = 1;
                }
                intent.putExtra(f58a, i4);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService(L1.a.f1635p3)).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(b.f44883c);
                sparseArray.put(i4, newWakeLock);
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
