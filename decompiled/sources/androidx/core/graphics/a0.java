package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.core.provider.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12462a = "TypefaceCompatUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12463b = ".font";

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    private a0() {
    }

    public static void a(@androidx.annotation.P Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    public static ByteBuffer b(@androidx.annotation.N Context context, @androidx.annotation.N Resources resources, int i4) {
        File e4 = e(context);
        if (e4 == null) {
            return null;
        }
        try {
            if (!c(e4, resources, i4)) {
                return null;
            }
            return g(e4);
        } finally {
            e4.delete();
        }
    }

    public static boolean c(@androidx.annotation.N File file, @androidx.annotation.N Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean d4 = d(file, inputStream);
                a(inputStream);
                return d4;
            } catch (Throwable th) {
                th = th;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean d(@androidx.annotation.N File file, @androidx.annotation.N InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e(f12462a, "Error copying resource contents to temp file: " + e.getMessage());
            a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            a(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    @androidx.annotation.P
    public static File e(@androidx.annotation.N Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f12463b + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    public static ByteBuffer f(@androidx.annotation.N Context context, @androidx.annotation.P CancellationSignal cancellationSignal, @androidx.annotation.N Uri uri) {
        try {
            ParcelFileDescriptor a4 = a.a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a4 == null) {
                if (a4 != null) {
                    a4.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a4.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    a4.close();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    a4.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @androidx.annotation.P
    @androidx.annotation.W(19)
    private static ByteBuffer g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @androidx.annotation.N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.W(19)
    public static Map<Uri, ByteBuffer> h(@androidx.annotation.N Context context, @androidx.annotation.N h.c[] cVarArr, @androidx.annotation.P CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (h.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri d4 = cVar.d();
                if (!hashMap.containsKey(d4)) {
                    hashMap.put(d4, f(context, cancellationSignal, d4));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
