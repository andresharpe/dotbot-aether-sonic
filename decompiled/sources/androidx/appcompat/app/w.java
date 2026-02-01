package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.N;
import androidx.appcompat.app.i;
import androidx.appcompat.app.w;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    static final String f5002a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* renamed from: b, reason: collision with root package name */
    static final String f5003b = "application_locales";

    /* renamed from: c, reason: collision with root package name */
    static final String f5004c = "locales";

    /* renamed from: d, reason: collision with root package name */
    static final String f5005d = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* renamed from: e, reason: collision with root package name */
    static final String f5006e = "AppLocalesStorageHelper";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: E, reason: collision with root package name */
        private final Object f5007E = new Object();

        /* renamed from: F, reason: collision with root package name */
        final Queue<Runnable> f5008F = new ArrayDeque();

        /* renamed from: G, reason: collision with root package name */
        final Executor f5009G;

        /* renamed from: H, reason: collision with root package name */
        Runnable f5010H;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Executor executor) {
            this.f5009G = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f5007E) {
                try {
                    Runnable poll = this.f5008F.poll();
                    this.f5010H = poll;
                    if (poll != null) {
                        this.f5009G.execute(poll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f5007E) {
                try {
                    this.f5008F.add(new Runnable() { // from class: androidx.appcompat.app.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.a.this.b(runnable);
                        }
                    });
                    if (this.f5010H == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@N Context context, @N String str) {
        if (str.equals("")) {
            context.deleteFile(f5002a);
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput(f5002a, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, f5004c);
                    newSerializer.attribute(null, f5003b, str);
                    newSerializer.endTag(null, f5004c);
                    newSerializer.endDocument();
                    Log.d(f5006e, "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                Log.w(f5006e, "Storing App Locales : Failed to persist app-locales: " + str, e4);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w(f5006e, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", f5002a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r2.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        android.util.Log.d(androidx.appcompat.app.w.f5006e, "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r9.deleteFile(androidx.appcompat.app.w.f5002a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals(androidx.appcompat.app.w.f5004c) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, androidx.appcompat.app.w.f5003b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    @androidx.annotation.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(@androidx.annotation.N android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L76
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L70
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r1, r9)
            goto L6f
        L6c:
            r9.deleteFile(r0)
        L6f:
            return r2
        L70:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L75
        L75:
            throw r9
        L76:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.w.b(android.content.Context):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, f5005d);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (i.t().j()) {
                    String b4 = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        i.b.b(systemService, i.a.a(b4));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
