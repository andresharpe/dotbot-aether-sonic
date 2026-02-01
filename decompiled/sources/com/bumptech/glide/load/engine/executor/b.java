package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26037a = "GlideRuntimeCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final String f26038b = "cpu[0-9]+";

    /* renamed from: c, reason: collision with root package name */
    private static final String f26039c = "/sys/devices/system/cpu/";

    /* loaded from: classes.dex */
    class a implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Pattern f26040a;

        a(Pattern pattern) {
            this.f26040a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f26040a.matcher(str).matches();
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int b() {
        File[] fileArr;
        int i4;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(f26039c).listFiles(new a(Pattern.compile(f26038b)));
        } catch (Throwable th) {
            try {
                if (Log.isLoggable(f26037a, 6)) {
                    Log.e(f26037a, "Failed to calculate accurate cpu count", th);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        if (fileArr != null) {
            i4 = fileArr.length;
        } else {
            i4 = 0;
        }
        return Math.max(1, i4);
    }
}
