package com.harman.log;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.lang.Thread;

/* loaded from: classes2.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final String f47574c = "b";

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f47575a;

    /* renamed from: b, reason: collision with root package name */
    private Context f47576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            e.b(b.this.f47576b, "Sorry，APP Handler Exception");
            Looper.loop();
        }
    }

    private boolean b(Throwable th) {
        if (th == null) {
            return false;
        }
        new a().start();
        d(th);
        return true;
    }

    private void d(Throwable th) {
        String property = System.getProperty("line.separator", "\r\n");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("====== Handler Exception? ======" + property);
        stringBuffer.append(property);
        stringBuffer.append("message:");
        stringBuffer.append(th.getMessage());
        stringBuffer.append(property);
        stringBuffer.append(Log.getStackTraceString(th));
        stringBuffer.append(property);
        f.b(f47574c, stringBuffer.toString());
    }

    public void c(Context context) {
        this.f47576b = context.getApplicationContext();
        this.f47575a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if (!b(th) && (uncaughtExceptionHandler = this.f47575a) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
