package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

@W(30)
/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f31933a = "h";

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static ResourcesLoader a(@N Context context, @N Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] i4 = i.i(context, map);
            Log.i(f31933a, "Table created, length: " + i4.length);
            if (i4.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    try {
                        fileOutputStream.write(i4);
                        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                        try {
                            g.a();
                            ResourcesLoader a4 = f.a();
                            loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                            a4.addProvider(loadFromTable);
                            if (dup != null) {
                                dup.close();
                            }
                            fileOutputStream.close();
                            if (fileDescriptor != null) {
                                Os.close(fileDescriptor);
                            }
                            return a4;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        } catch (Exception e4) {
            Log.e(f31933a, "Failed to create the ColorResourcesTableCreator.", e4);
            return null;
        }
    }
}
