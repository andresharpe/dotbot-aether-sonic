package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.D;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
final class zzcb extends Thread {
    private static zzcb zza;
    private final LinkedBlockingQueue zzb;
    private volatile boolean zzc;
    private volatile boolean zzd;
    private volatile zzcc zze;
    private final Context zzf;

    private zzcb(Context context) {
        super("GAThread");
        this.zzb = new LinkedBlockingQueue();
        this.zzc = false;
        this.zzd = false;
        if (context != null) {
            this.zzf = context.getApplicationContext();
        } else {
            this.zzf = null;
        }
        start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcb zzb(Context context) {
        if (zza == null) {
            zza = new zzcb(context);
        }
        return zza;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    Runnable runnable = (Runnable) this.zzb.take();
                    if (!this.zzc) {
                        runnable.run();
                    }
                } catch (InterruptedException e4) {
                    zzdg.zzb.zzb(e4.toString());
                }
            } catch (Exception e5) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                e5.printStackTrace(printStream);
                printStream.flush();
                Log.e("GoogleTagManager", "Error on Google TagManager Thread: ".concat(new String(byteArrayOutputStream.toByteArray())));
                Log.e("GoogleTagManager", "Google TagManager is shutting down.");
                this.zzc = true;
            }
        }
    }

    public final void zze(Runnable runnable) {
        this.zzb.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final void zzf(String str, long j4) {
        this.zzb.add(new zzca(this, this, j4, str, null));
    }
}
